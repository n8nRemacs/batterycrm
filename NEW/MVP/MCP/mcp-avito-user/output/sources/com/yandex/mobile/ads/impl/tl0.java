package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class tl0 implements vj0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final pk0 f390224a;

    public tl0(@j.N ko1 ko1Var) {
        this.f390224a = new pk0(ko1Var);
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final void a(@j.N Context context, @j.N uj0 uj0Var, @j.N w20 w20Var, @j.N com.yandex.mobile.ads.nativeads.j jVar, @j.N ok0 ok0Var, @j.N ek0 ek0Var) {
        ArrayList arrayList = new ArrayList();
        List<nj0> listE = uj0Var.c().e();
        if (listE != null) {
            Iterator<nj0> it = listE.iterator();
            while (it.hasNext()) {
                com.yandex.mobile.ads.nativeads.h hVarA = this.f390224a.a(context, uj0Var, w20Var, jVar, ok0Var, it.next());
                if (hVarA != null) {
                    arrayList.add(hVarA);
                }
            }
        }
        if (arrayList.isEmpty()) {
            ek0Var.a(i5.f386309a);
        } else {
            ek0Var.a(arrayList);
        }
    }
}
