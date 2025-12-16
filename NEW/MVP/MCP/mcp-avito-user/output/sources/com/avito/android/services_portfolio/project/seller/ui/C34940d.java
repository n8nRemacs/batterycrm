package com.avito.android.services_portfolio.project.seller.ui;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PortfolioProjectSellerFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.services_portfolio.project.seller.ui.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34940d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PortfolioProjectSellerFragment f280316l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34940d(PortfolioProjectSellerFragment portfolioProjectSellerFragment) {
        super(2);
        this.f280316l = portfolioProjectSellerFragment;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            PortfolioProjectSellerFragment portfolioProjectSellerFragment = this.f280316l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) portfolioProjectSellerFragment.f280303t0.getValue(), androidx.compose.runtime.internal.r.c(-1741705761, new C34939c(portfolioProjectSellerFragment), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
