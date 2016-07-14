[![bintray](https://api.bintray.com/packages/zyl/maven/file-md5-utils/images/download.svg)](https://bintray.com/zyl/maven/file-md5-utils/_latestVersion)
# file-md5-utils
主要用于Lru缓存图片文件时，需要根据图片下载URL生成保存key。参考了[Android DiskLruCache完全解析，硬盘缓存的最佳方案](http://blog.csdn.net/guolin_blog/article/details/28863651)
>hashKeyForDisk()方法，并把图片的URL传入到这个方法中，就可以得到对应的key了。

# 使用方法
`String key = MD5Utils.hashKeyForDisk(url);`  
url：表示图片的URl；  
key：生成的key，从缓存中获取图片需要再使用。

# Gradle引入
`compile 'com.zyl.filemd5utils:filemd5utils:0.0.2'`
