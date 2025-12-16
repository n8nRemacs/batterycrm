package com.huawei.hms.base.ui;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: LogUtil.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f363442a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static void a(String str, String str2, boolean z12) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(str2, z12);
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(str2, false);
    }

    public static String a(String str, boolean z12) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z12) {
                sb2.append(a(str));
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i12 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (f363442a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i12 % 2 == 0) {
                    cCharAt = '*';
                }
                i12++;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }
}
