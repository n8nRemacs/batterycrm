package com.avito.android.advert.item.safedeal;

import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$CombinedButtons;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class H extends kotlin.jvm.internal.N implements Y41.l<TrustFactorsComponent.CombinedButtons, TrustFactorsComponent.CombinedButtons> {

    /* renamed from: l, reason: collision with root package name */
    public static final H f78732l = new H();

    public H() {
        super(1);
    }

    @Override // Y41.l
    public final TrustFactorsComponent.CombinedButtons invoke(TrustFactorsComponent.CombinedButtons combinedButtons) {
        TrustFactorsComponent.CombinedButtons combinedButtons2 = combinedButtons;
        SafeDeal.Component.CombinedButtons combinedButtons3 = combinedButtons2.f84259b;
        return TrustFactorsComponent.CombinedButtons.a(combinedButtons2, SafeDeal.Component.CombinedButtons.a(combinedButtons3, null, SafeDeal.Component.CombinedButtons.CartButton.a(combinedButtons3.getCartButton(), null, SafeDeal.Component.CombinedButtons.CartButton.GoToCartButton.a(combinedButtons2.f84259b.getCartButton().getGoToCartButton(), Boolean.FALSE), 0, 0, 29), null, 55));
    }
}
