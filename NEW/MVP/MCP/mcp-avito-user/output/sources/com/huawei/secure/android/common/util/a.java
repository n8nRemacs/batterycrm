package com.huawei.secure.android.common.util;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f363739a = new String[256];

    static {
        for (char c12 = 0; c12 < 255; c12 = (char) (c12 + 1)) {
            if ((c12 < '0' || c12 > '9') && ((c12 < 'A' || c12 > 'Z') && (c12 < 'a' || c12 > 'z'))) {
                f363739a[c12] = Integer.toHexString(c12).intern();
            } else {
                f363739a[c12] = null;
            }
        }
    }
}
