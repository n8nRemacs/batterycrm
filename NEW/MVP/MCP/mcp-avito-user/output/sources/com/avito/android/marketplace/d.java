package com.avito.android.marketplace;

import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import mY.InterfaceC44028a;

/* compiled from: FinanceMarketplaceActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FinanceMarketplaceActivity f185885b;

    public d(FinanceMarketplaceActivity financeMarketplaceActivity) {
        this.f185885b = financeMarketplaceActivity;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = FinanceMarketplaceActivity.f185844E;
        this.f185885b.b2().accept(new InterfaceC44028a.b((PowerWebViewStateChangeEvent) obj));
    }
}
