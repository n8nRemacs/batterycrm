package com.avito.android.user_advert.advert.items.portfolio_filled_widget;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioFilledWidgetItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetails.Portfolio.PortfolioAction f309812l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f309813m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f309814n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MyAdvertDetails.Portfolio.PortfolioAction portfolioAction, e eVar, a aVar) {
        super(0);
        this.f309812l = portfolioAction;
        this.f309813m = eVar;
        this.f309814n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MyAdvertDetailsActivity myAdvertDetailsActivity;
        DeepLink uri = this.f309812l.getUri();
        if (uri != null && (myAdvertDetailsActivity = this.f309813m.f309811b) != null) {
            String str = this.f309814n.f309806d;
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.G1(uri, str);
        }
        return G0.f406611a;
    }
}
