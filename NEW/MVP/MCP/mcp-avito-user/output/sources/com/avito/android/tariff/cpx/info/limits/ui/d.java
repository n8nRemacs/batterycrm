package com.avito.android.tariff.cpx.info.limits.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vB0.InterfaceC49191a;

/* compiled from: TariffCpxInfoLimitsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vB0.c f296631l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49191a, G0> f296632m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f296633n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f296634o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f296635p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f296636q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vB0.c cVar, Y41.l lVar, Y41.l lVar2, float f12, v.a aVar, int i12) {
        super(2);
        this.f296631l = cVar;
        this.f296632m = lVar;
        this.f296633n = lVar2;
        this.f296634o = f12;
        this.f296635p = aVar;
        this.f296636q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f296636q | 1);
        Y41.l<InterfaceC49191a, G0> lVar = this.f296632m;
        Y41.l<DeepLink, G0> lVar2 = this.f296633n;
        n.b(this.f296631l, lVar, lVar2, this.f296634o, this.f296635p, a12, iA2);
        return G0.f406611a;
    }
}
