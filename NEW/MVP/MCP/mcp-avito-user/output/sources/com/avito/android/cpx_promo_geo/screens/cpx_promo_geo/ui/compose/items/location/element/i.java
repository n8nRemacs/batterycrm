package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location.element;

import Y41.p;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoSlider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f128134l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f128135m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C48709c.x f128136n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p<A, Integer, com.akita.compose.foundation.p> f128137o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p<Float, Long, G0> f128138p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, G0> f128139q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f128140r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f128141s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f128142t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C20644z c20644z, Long l12, C48709c.x xVar, p pVar, p pVar2, Y41.l lVar, boolean z12, String str, int i12) {
        super(2);
        this.f128134l = c20644z;
        this.f128135m = l12;
        this.f128136n = xVar;
        this.f128137o = pVar;
        this.f128138p = pVar2;
        this.f128139q = lVar;
        this.f128140r = z12;
        this.f128141s = str;
        this.f128142t = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128142t | 1);
        String str = this.f128141s;
        p<Float, Long, G0> pVar = this.f128138p;
        Y41.l<Float, G0> lVar = this.f128139q;
        j.c(this.f128134l, this.f128135m, this.f128136n, this.f128137o, pVar, lVar, this.f128140r, str, a12, iA2);
        return G0.f406611a;
    }
}
