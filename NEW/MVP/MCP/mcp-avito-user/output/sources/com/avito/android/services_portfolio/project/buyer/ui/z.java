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
final class z extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C42119e f280150l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280151m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f280152n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C42119e c42119e, com.avito.android.deeplink_handler.handler.composite.a aVar, int i12) {
        super(2);
        this.f280150l = c42119e;
        this.f280151m = aVar;
        this.f280152n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f280152n | 1);
        s.d(this.f280150l, this.f280151m, a12, iA2);
        return G0.f406611a;
    }
}
