package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.util.List;

/* loaded from: classes8.dex */
final class em0 implements vj0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final pk0 f385005a;

    public em0(@j.N ko1 ko1Var) {
        this.f385005a = new pk0(ko1Var);
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public final void a(@j.N Context context, @j.N uj0 uj0Var, @j.N w20 w20Var, @j.N com.yandex.mobile.ads.nativeads.j jVar, @j.N ok0 ok0Var, @j.N ek0 ek0Var) {
        NativeAd nativeAdA;
        List<nj0> listE = uj0Var.c().e();
        if (listE == null || listE.isEmpty()) {
            nativeAdA = null;
        } else if (listE.size() > 1) {
            nativeAdA = jVar.a(context, uj0Var, w20Var, ok0Var);
        } else {
            nativeAdA = this.f385005a.a(context, uj0Var, w20Var, jVar, ok0Var, listE.get(0));
        }
        if (nativeAdA != null) {
            ek0Var.a(nativeAdA);
        } else {
            ek0Var.a(i5.f386309a);
        }
    }
}
