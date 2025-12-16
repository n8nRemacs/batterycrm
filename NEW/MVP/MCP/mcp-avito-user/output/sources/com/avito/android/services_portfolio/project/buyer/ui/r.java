package com.avito.android.services_portfolio.project.buyer.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import iv0.C42119e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PortfolioProjectBuyerScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class r extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C42119e f280112l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C42119e f280113m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280114n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f280115o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C42119e c42119e, C42119e c42119e2, com.avito.android.deeplink_handler.handler.composite.a aVar, int i12) {
        super(2);
        this.f280112l = c42119e;
        this.f280113m = c42119e2;
        this.f280114n = aVar;
        this.f280115o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f280115o | 1);
        C42119e c42119e = this.f280113m;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f280114n;
        s.c(this.f280112l, c42119e, aVar, a12, iA2);
        return G0.f406611a;
    }
}
