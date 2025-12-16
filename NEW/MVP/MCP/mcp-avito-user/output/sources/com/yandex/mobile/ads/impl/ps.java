package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ps {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final j71 f388940a = new j71();

    @Y61.k
    public final String a(@Y61.k Context context, @Y61.k String str) {
        v11 v11VarA = q21.b().a(context);
        if (v11VarA == null || !v11VarA.F()) {
            return str;
        }
        this.f388940a.getClass();
        String strA = j71.a(context, str);
        return strA == null ? str : strA;
    }
}
