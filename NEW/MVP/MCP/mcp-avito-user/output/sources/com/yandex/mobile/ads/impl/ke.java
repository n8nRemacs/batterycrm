package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.adjust.sdk.Constants;

/* loaded from: classes8.dex */
public final class ke {
    @j.P
    public static String a(@j.N String str) {
        try {
            return new String(Base64.decode(str.getBytes(), 0), Constants.ENCODING);
        } catch (Exception unused) {
            return null;
        }
    }

    @j.N
    public static String a(@j.N byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 0), Constants.ENCODING);
        } catch (Exception unused) {
            return new String(bArr);
        }
    }
}
