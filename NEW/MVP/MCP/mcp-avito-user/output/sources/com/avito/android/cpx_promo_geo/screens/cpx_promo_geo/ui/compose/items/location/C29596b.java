package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoAutoLocation.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29596b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c.C48710a f128050l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f128051m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<String, Long, G0> f128052n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Float, Long, G0> f128053o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f128054p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f128055q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f128056r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f128057s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29596b(C48709c.C48710a c48710a, String str, Y41.p pVar, Y41.p pVar2, Y41.l lVar, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f128050l = c48710a;
        this.f128051m = str;
        this.f128052n = pVar;
        this.f128053o = pVar2;
        this.f128054p = lVar;
        this.f128055q = aVar;
        this.f128056r = vVar;
        this.f128057s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128057s | 1);
        Y41.p<Float, Long, G0> pVar = this.f128053o;
        Y41.l<DeepLink, G0> lVar = this.f128054p;
        h.a(this.f128050l, this.f128051m, this.f128052n, pVar, lVar, this.f128055q, this.f128056r, a12, iA2);
        return G0.f406611a;
    }
}
