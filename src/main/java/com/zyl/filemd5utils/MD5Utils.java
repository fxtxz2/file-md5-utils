package com.zyl.filemd5utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * md5工具类
 * 参考http://blog.csdn.net/guolin_blog/article/details/28863651
 * @author zyl
 *
 */
public class MD5Utils {
    /**
     * 把图片的URL传入到这个方法中，就可以得到对应的key了
     * @param key 图片的URL
     * @return 就可以得到对应的key
     */
    public static String hashKeyForDisk(String key) {
        String cacheKey;
        try {
            final MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(key.getBytes());
            cacheKey = bytesToHexString(mDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            cacheKey = String.valueOf(key.hashCode());
        }
        return cacheKey;
    }

    private static String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            String hex = Integer.toHexString(0xFF & aByte);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}
