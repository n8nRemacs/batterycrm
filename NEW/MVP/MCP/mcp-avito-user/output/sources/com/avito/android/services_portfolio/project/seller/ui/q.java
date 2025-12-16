package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kv0.InterfaceC43503b;
import kv0.d;

/* compiled from: PortfolioProjectSellerScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class q extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.pull_to_refresh.j f280337l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f280338m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f280339n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d.b f280340o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280341p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC43503b, G0> f280342q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f280343r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(com.akita.compose.component.pull_to_refresh.j jVar, boolean z12, Y41.a<G0> aVar, d.b bVar, com.avito.android.deeplink_handler.handler.composite.a aVar2, Y41.l<? super InterfaceC43503b, G0> lVar, int i12) {
        super(2);
        this.f280337l = jVar;
        this.f280338m = z12;
        this.f280339n = aVar;
        this.f280340o = bVar;
        this.f280341p = aVar2;
        this.f280342q = lVar;
        this.f280343r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f280343r | 1);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f280341p;
        Y41.l<InterfaceC43503b, G0> lVar = this.f280342q;
        r.b(this.f280337l, this.f280338m, this.f280339n, this.f280340o, aVar, lVar, a12, iA2);
        return G0.f406611a;
    }
}
