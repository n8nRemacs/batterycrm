package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Base64;

/* loaded from: classes8.dex */
public final class j71 {
    @j.P
    public static String a(@j.N Context context, @j.N String str) {
        v11 v11VarA = q21.b().a(context);
        qs qsVarI = v11VarA != null ? v11VarA.i() : null;
        if (qsVarI == null) {
            return null;
        }
        byte[] bArrA = new rg0(qsVarI.b(), qsVarI.a()).a(str.getBytes());
        if (bArrA == null) {
            return null;
        }
        try {
            return Base64.encodeToString(bArrA, 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
