package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public class B0 {
    @j.P
    public File a(@j.N Context context, @j.N String str) {
        int i12 = X21.a.f18568a;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null) {
            return null;
        }
        return new File(noBackupFilesDir, str);
    }

    @j.P
    public String b(@j.N Context context, @j.N String str) {
        int i12 = X21.a.f18568a;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null) {
            return null;
        }
        return noBackupFilesDir.getAbsolutePath() + "/" + str;
    }

    @j.P
    public File c(@j.N Context context) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, "persist.yndx.metrica.db.dir");
            if (!(objInvoke instanceof String)) {
                objInvoke = null;
            }
            str = (String) objInvoke;
        } catch (Exception unused) {
        }
        if (str == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str, context.getPackageName());
        try {
            file.mkdirs();
            return file;
        } catch (Exception unused2) {
            return null;
        }
    }

    @j.P
    public File a(@j.P File file, @j.N String str) {
        if (file == null) {
            return null;
        }
        return b(file.getAbsoluteFile(), str);
    }

    @j.P
    public File b(@j.N Context context) {
        return a(context, "YandexMetricaNativeCrashes");
    }

    @j.P
    public File a(@j.N Context context) {
        File parentFile;
        if (A2.a(24)) {
            parentFile = context.getDataDir();
        } else {
            File filesDir = context.getFilesDir();
            parentFile = filesDir == null ? null : filesDir.getParentFile();
        }
        if (parentFile == null) {
            return null;
        }
        File file = new File(parentFile, "lib");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @j.P
    public File b(@j.P File file, @j.N String str) {
        if (file == null) {
            return null;
        }
        return new File(file, str);
    }
}
