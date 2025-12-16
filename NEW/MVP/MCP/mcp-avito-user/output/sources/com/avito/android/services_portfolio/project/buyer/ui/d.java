package com.avito.android.services_portfolio.project.buyer.ui;

import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PortfolioProjectBuyerFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PortfolioProjectBuyerFragment f280084l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PortfolioProjectBuyerFragment portfolioProjectBuyerFragment) {
        super(2);
        this.f280084l = portfolioProjectBuyerFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            PortfolioProjectBuyerFragment portfolioProjectBuyerFragment = this.f280084l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) portfolioProjectBuyerFragment.f280071t0.getValue(), androidx.compose.runtime.internal.r.c(-1667040963, new c(portfolioProjectBuyerFragment), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
