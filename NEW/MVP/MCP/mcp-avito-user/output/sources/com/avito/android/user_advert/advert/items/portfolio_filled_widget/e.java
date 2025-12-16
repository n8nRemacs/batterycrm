package com.avito.android.user_advert.advert.items.portfolio_filled_widget;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioFilledWidgetItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/items/portfolio_filled_widget/e;", "Lcom/avito/android/user_advert/advert/items/portfolio_filled_widget/d;", "<init>", "()V", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309811b;

    /* compiled from: PortfolioFilledWidgetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/items/portfolio_filled_widget/e$a;", "", "<init>", "()V", "", "ALL_PROJECTS_ACTION_TYPE", "Ljava/lang/String;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        i iVar = (i) eVar;
        com.avito.android.user_advert.advert.items.portfolio_filled_widget.a aVar2 = (com.avito.android.user_advert.advert.items.portfolio_filled_widget.a) aVar;
        iVar.Vg(aVar2);
        MyAdvertDetails.Portfolio.FilledPortfolio filledPortfolio = aVar2.f309805c;
        String description = filledPortfolio.getDescription();
        if (description != null) {
            iVar.n(description);
        }
        Iterator<T> it = filledPortfolio.getActions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((MyAdvertDetails.Portfolio.PortfolioAction) next).getActionType(), "Button")) {
                    break;
                }
            }
        }
        MyAdvertDetails.Portfolio.PortfolioAction portfolioAction = (MyAdvertDetails.Portfolio.PortfolioAction) next;
        if (portfolioAction != null) {
            if (filledPortfolio.getDescription() != null) {
                iVar.gq(portfolioAction.getTitle(), new f(portfolioAction, this, aVar2));
            }
            iVar.nl(new g(this, aVar2), filledPortfolio.getToggleState());
        }
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_filled_widget.d
    public final void c0() {
        this.f309811b = null;
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_filled_widget.d
    public final void y2(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309811b = myAdvertDetailsActivity;
    }
}
