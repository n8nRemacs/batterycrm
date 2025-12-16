package com.avito.android.user_advert.advert.items.portfolio_empty_widget;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioEmptyWidgetItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/portfolio_empty_widget/f;", "Lcom/avito/android/user_advert/advert/items/portfolio_empty_widget/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309797b;

    @Inject
    public f() {
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_empty_widget.d
    public final void E2(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309797b = myAdvertDetailsActivity;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object obj;
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.kL(aVar2);
        Iterator<T> it = aVar2.f309788c.getActions().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            MyAdvertDetails.Portfolio.PortfolioAction portfolioAction = (MyAdvertDetails.Portfolio.PortfolioAction) next;
            if (L.f(portfolioAction != null ? portfolioAction.getActionType() : null, "Button")) {
                obj = next;
                break;
            }
        }
        MyAdvertDetails.Portfolio.PortfolioAction portfolioAction2 = (MyAdvertDetails.Portfolio.PortfolioAction) obj;
        if (portfolioAction2 != null) {
            iVar.PV(portfolioAction2.getTitle(), new e(portfolioAction2, this, aVar2));
        }
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_empty_widget.d
    public final void c0() {
        this.f309797b = null;
    }
}
