package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
final class vb0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n20 f390844a;

    public vb0(@j.N n20 n20Var) {
        this.f390844a = n20Var;
    }

    @j.P
    public final rd0 a(@j.N Map<String, Bitmap> map, @j.P com.monetization.ads.mediation.nativeads.c cVar, @j.P com.monetization.ads.mediation.nativeads.d dVar) {
        ArrayList arrayList;
        b30 b30VarA = this.f390844a.a(map, cVar);
        rb0 rb0Var = dVar != null ? new rb0(null, 0.0f) : null;
        if (b30VarA != null) {
            arrayList = new ArrayList();
            arrayList.add(b30VarA);
        } else {
            arrayList = null;
        }
        if (b30VarA == null && rb0Var == null) {
            return null;
        }
        return new rd0(rb0Var, null, arrayList);
    }
}
