package com.huawei.hms.framework.common;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes7.dex */
public class CreateFileUtil {
    public static void deleteSecure(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        Logger.w("CreateFileUtil", "deleteSecure exception");
    }

    public static String getCacheDirPath(Context context) {
        return context == null ? "" : ContextCompat.getProtectedStorageContext(context).getCacheDir().getPath();
    }

    public static String getCanonicalPath(String str) {
        try {
            return newFile(str).getCanonicalPath();
        } catch (IOException e12) {
            Logger.w("CreateFileUtil", "the canonicalPath has IOException", e12);
            return str;
        } catch (SecurityException e13) {
            Logger.w("CreateFileUtil", "the canonicalPath has securityException", e13);
            return str;
        } catch (Exception e14) {
            Logger.w("CreateFileUtil", "the canonicalPath has other Exception", e14);
            return str;
        }
    }

    @Deprecated
    public static boolean isPVersion() {
        return EmuiUtil.isUpPVersion();
    }

    public static File newFile(String str) {
        if (str == null) {
            return null;
        }
        return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible("com.huawei.libcore.io.ExternalStorageFile")) ? new ExternalStorageFile(str) : new File(str);
    }

    public static FileInputStream newFileInputStream(String str) throws FileNotFoundException {
        if (str != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible("com.huawei.libcore.io.ExternalStorageFileInputStream")) ? new ExternalStorageFileInputStream(str) : new FileInputStream(str);
        }
        Logger.w("CreateFileUtil", "newFileInputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static FileOutputStream newFileOutputStream(File file) throws FileNotFoundException {
        if (file != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible("com.huawei.libcore.io.ExternalStorageFileOutputStream")) ? new ExternalStorageFileOutputStream(file) : new FileOutputStream(file);
        }
        Logger.e("CreateFileUtil", "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static RandomAccessFile newRandomAccessFile(String str, String str2) throws FileNotFoundException {
        if (str != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible("com.huawei.libcore.io.ExternalStorageRandomAccessFile")) ? new ExternalStorageRandomAccessFile(str, str2) : new RandomAccessFile(str, str2);
        }
        Logger.w("CreateFileUtil", "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static void deleteSecure(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        deleteSecure(newFile(str));
    }
}
