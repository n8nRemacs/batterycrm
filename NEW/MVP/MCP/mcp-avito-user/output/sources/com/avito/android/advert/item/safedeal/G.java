package com.avito.android.advert.item.safedeal;

import com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.QuantityChange;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/safedeal/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/safedeal/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class G<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28180h f78730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QuantityChange f78731c;

    public G(C28180h c28180h, QuantityChange quantityChange) {
        this.f78730b = c28180h;
        this.f78731c = quantityChange;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C28180h c28180h = this.f78730b;
        c28180h.f78833n.qe(((com.avito.android.remote.safedeal.a) obj).getQuantity());
        QuantityChange quantityChange = this.f78731c;
        c28180h.f78832m.b(c28180h.f78820a, new CartItemInfo(quantityChange.f79077c, Integer.valueOf(quantityChange.f79078d)));
    }
}
