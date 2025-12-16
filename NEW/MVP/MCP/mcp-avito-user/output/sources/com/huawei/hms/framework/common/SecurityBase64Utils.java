package com.huawei.hms.framework.common;

import android.util.Base64;

/* loaded from: classes7.dex */
public class SecurityBase64Utils {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f363472a = false;

    public static boolean a() throws ClassNotFoundException {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass("com.huawei.secure.android.common.util.SafeBase64");
            synchronized (StringUtils.class) {
                f363472a = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static byte[] decode(String str, int i12) {
        if (!f363472a && !a()) {
            try {
                return Base64.decode(str, i12);
            } catch (Exception unused) {
                return new byte[0];
            }
        }
        try {
            return Base64.decode(str, i12);
        } catch (Exception e12) {
            e12.getMessage();
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i12) {
        if (!f363472a && !a()) {
            try {
                return Base64.encodeToString(bArr, i12);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return Base64.encodeToString(bArr, i12);
        } catch (Exception e12) {
            e12.getMessage();
            return "";
        }
    }
}
