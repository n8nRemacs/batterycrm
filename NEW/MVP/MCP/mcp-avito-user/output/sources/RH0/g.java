package RH0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerItemCloseWithPortfolioUxFeedbackStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRH0/g;", "LRH0/f;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f14261a;

    @Inject
    public g(@k l lVar) {
        this.f14261a = lVar;
    }

    @Override // RH0.f
    public final boolean a() {
        return this.f14261a.getBoolean("seller_item_close_with_portfolio_shown_key", true);
    }

    @Override // RH0.f
    public final void b() {
        this.f14261a.putBoolean("seller_item_close_with_portfolio_shown_key", false);
    }
}
