package com.avito.android.services_portfolio.project.buyer.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import iv0.AbstractC42117c;
import iv0.InterfaceC42115a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PortfolioProjectBuyerScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.pull_to_refresh.j f280102l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f280103m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f280104n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC42117c.b f280105o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC42115a, G0> f280106p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f280107q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.akita.compose.component.pull_to_refresh.j jVar, boolean z12, Y41.a<G0> aVar, AbstractC42117c.b bVar, Y41.l<? super InterfaceC42115a, G0> lVar, int i12) {
        super(2);
        this.f280102l = jVar;
        this.f280103m = z12;
        this.f280104n = aVar;
        this.f280105o = bVar;
        this.f280106p = lVar;
        this.f280107q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f280107q | 1);
        AbstractC42117c.b bVar = this.f280105o;
        Y41.l<InterfaceC42115a, G0> lVar = this.f280106p;
        s.b(this.f280102l, this.f280103m, this.f280104n, bVar, lVar, a12, iA2);
        return G0.f406611a;
    }
}
