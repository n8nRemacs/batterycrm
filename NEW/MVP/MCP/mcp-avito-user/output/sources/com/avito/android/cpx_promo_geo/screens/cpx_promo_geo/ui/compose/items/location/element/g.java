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
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f128123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f128124m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C48709c.x f128125n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p<A, Integer, com.akita.compose.foundation.p> f128126o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p<Float, Long, G0> f128127p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f128128q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f128129r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f128130s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C20644z c20644z, long j12, C48709c.x xVar, p pVar, p pVar2, boolean z12, String str, int i12) {
        super(2);
        this.f128123l = c20644z;
        this.f128124m = j12;
        this.f128125n = xVar;
        this.f128126o = pVar;
        this.f128127p = pVar2;
        this.f128128q = z12;
        this.f128129r = str;
        this.f128130s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128130s | 1);
        String str = this.f128129r;
        p<A, Integer, com.akita.compose.foundation.p> pVar = this.f128126o;
        p<Float, Long, G0> pVar2 = this.f128127p;
        j.b(this.f128123l, this.f128124m, this.f128125n, pVar, pVar2, this.f128128q, str, a12, iA2);
        return G0.f406611a;
    }
}
