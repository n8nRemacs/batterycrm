package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kv0.InterfaceC43503b;

/* compiled from: PortfolioProjectSellerScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class A extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv0.f f280280l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280281m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f280282n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(kv0.f fVar, com.avito.android.deeplink_handler.handler.composite.a aVar, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f280280l = fVar;
        this.f280281m = aVar;
        this.f280282n = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f280280l.f413290c;
        if (deepLink != null) {
            ((Y41.l) this.f280282n.getF42167b()).invoke(InterfaceC43503b.c.f413268a);
            b.a.a(this.f280281m, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
