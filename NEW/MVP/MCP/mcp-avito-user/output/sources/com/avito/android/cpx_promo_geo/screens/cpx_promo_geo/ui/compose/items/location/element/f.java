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
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f128117l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C48709c.x f128118m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p<A, Integer, com.akita.compose.foundation.p> f128119n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, G0> f128120o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f128121p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f128122q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C20644z c20644z, C48709c.x xVar, p pVar, Y41.l lVar, boolean z12, int i12) {
        super(2);
        this.f128117l = c20644z;
        this.f128118m = xVar;
        this.f128119n = pVar;
        this.f128120o = lVar;
        this.f128121p = z12;
        this.f128122q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128122q | 1);
        p<A, Integer, com.akita.compose.foundation.p> pVar = this.f128119n;
        Y41.l<Float, G0> lVar = this.f128120o;
        j.a(this.f128117l, this.f128118m, pVar, lVar, this.f128121p, a12, iA2);
        return G0.f406611a;
    }
}
