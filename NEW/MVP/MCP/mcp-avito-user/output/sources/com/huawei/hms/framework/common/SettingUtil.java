package com.huawei.hms.framework.common;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes7.dex */
public class SettingUtil {
    public static int getSecureInt(ContentResolver contentResolver, String str, int i12) {
        try {
            return Settings.Secure.getInt(contentResolver, str, i12);
        } catch (RuntimeException e12) {
            Logger.e("SettingUtil", "Settings Secure getInt throwFromSystemServer:", e12);
            return i12;
        }
    }

    public static int getSystemInt(ContentResolver contentResolver, String str, int i12) {
        try {
            return Settings.System.getInt(contentResolver, str, i12);
        } catch (RuntimeException e12) {
            Logger.e("SettingUtil", "Settings System getInt throwFromSystemServer:", e12);
            return i12;
        }
    }
}
