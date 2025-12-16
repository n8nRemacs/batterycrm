package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoMergedLocation.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c.r f128040l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f128041m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f128042n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, G0> f128043o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f128044p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f128045q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f128046r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f128047s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C48709c.r rVar, String str, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f128040l = rVar;
        this.f128041m = str;
        this.f128042n = lVar;
        this.f128043o = lVar2;
        this.f128044p = lVar3;
        this.f128045q = aVar;
        this.f128046r = vVar;
        this.f128047s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128047s | 1);
        Y41.l<Float, G0> lVar = this.f128043o;
        Y41.l<DeepLink, G0> lVar2 = this.f128044p;
        B.a(this.f128040l, this.f128041m, this.f128042n, lVar, lVar2, this.f128045q, this.f128046r, a12, iA2);
        return G0.f406611a;
    }
}
