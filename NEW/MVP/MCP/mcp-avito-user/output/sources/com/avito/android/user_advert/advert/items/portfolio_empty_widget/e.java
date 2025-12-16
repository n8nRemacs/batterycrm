package com.avito.android.user_advert.advert.items.portfolio_empty_widget;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.OnClickListener;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetails.Portfolio.PortfolioAction f309794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f309795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f309796c;

    public /* synthetic */ e(MyAdvertDetails.Portfolio.PortfolioAction portfolioAction, f fVar, a aVar) {
        this.f309794a = portfolioAction;
        this.f309795b = fVar;
        this.f309796c = aVar;
    }

    @Override // com.avito.android.remote.model.text.OnClickListener
    public final void onClick() {
        MyAdvertDetailsActivity myAdvertDetailsActivity;
        DeepLink uri = this.f309794a.getUri();
        if (uri == null || (myAdvertDetailsActivity = this.f309795b.f309797b) == null) {
            return;
        }
        String str = this.f309796c.f309789d;
        InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
        if (interfaceC35426j0 == null) {
            interfaceC35426j0 = null;
        }
        interfaceC35426j0.v0(uri, str);
    }
}
