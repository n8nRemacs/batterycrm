package com.avito.android.marketplace;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lY.C43701a;

/* compiled from: FinanceMarketplaceActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FinanceMarketplaceActivity f185884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FinanceMarketplaceActivity financeMarketplaceActivity) {
        super(0);
        this.f185884l = financeMarketplaceActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        FinanceMarketplaceWebViewAction financeMarketplaceWebViewAction;
        DeepLink deeplink;
        FinanceMarketplaceActivity financeMarketplaceActivity = this.f185884l;
        financeMarketplaceActivity.setResult(0);
        InterfaceC28373a interfaceC28373a = financeMarketplaceActivity.f185853q;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new C43701a(financeMarketplaceActivity.a2().f185870c, financeMarketplaceActivity.a2().f185872e, financeMarketplaceActivity.a2().f185871d, financeMarketplaceActivity.a2().f185869b));
        List<FinanceMarketplaceWebViewAction> list = financeMarketplaceActivity.a2().f185880m;
        if (list != null && (financeMarketplaceWebViewAction = list.get(0)) != null && (deeplink = financeMarketplaceWebViewAction.getDeeplink()) != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = financeMarketplaceActivity.f185857u;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deeplink, null, null, 6);
        }
        financeMarketplaceActivity.finish();
        return G0.f406611a;
    }
}
