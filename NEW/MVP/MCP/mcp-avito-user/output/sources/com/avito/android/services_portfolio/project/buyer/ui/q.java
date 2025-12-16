package com.avito.android.services_portfolio.project.buyer.ui;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import iv0.C42119e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioProjectBuyerScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C42119e f280110l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280111m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C42119e c42119e, com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(0);
        this.f280110l = c42119e;
        this.f280111m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f280110l.f405388c;
        if (deepLink != null) {
            b.a.a(this.f280111m, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
