package com.avito.android.buy_with_delivery;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.constructor_advert.ui.serp.constructor.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AsyncBuyWithDeliveryPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/buy_with_delivery/b;", "Lcom/avito/android/buy_with_delivery/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.buy_with_delivery.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f108795a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f108796b;

    /* compiled from: AsyncBuyWithDeliveryPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/buy_with_delivery/b$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AsyncBuyWithDeliveryItem f108797a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final com.avito.android.constructor_advert.ui.serp.constructor.a f108798b;

        public a(@l AsyncBuyWithDeliveryItem asyncBuyWithDeliveryItem, @l com.avito.android.constructor_advert.ui.serp.constructor.a aVar) {
            this.f108797a = asyncBuyWithDeliveryItem;
            this.f108798b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f108797a, aVar.f108797a) && L.f(this.f108798b, aVar.f108798b);
        }

        public final int hashCode() {
            AsyncBuyWithDeliveryItem asyncBuyWithDeliveryItem = this.f108797a;
            int iHashCode = (asyncBuyWithDeliveryItem == null ? 0 : asyncBuyWithDeliveryItem.hashCode()) * 31;
            com.avito.android.constructor_advert.ui.serp.constructor.a aVar = this.f108798b;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "LoadingPair(item=" + this.f108797a + ", itemView=" + this.f108798b + ')';
        }
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f108795a = aVar;
    }

    @Override // com.avito.android.buy_with_delivery.a
    public final void a(@k SerpConstructorAdvertItem serpConstructorAdvertItem, @k n nVar) {
        nVar.Jw(serpConstructorAdvertItem.getBuyWithDeliveryLoadingState());
        a aVar = this.f108796b;
        if (aVar == null) {
            return;
        }
        AsyncBuyWithDeliveryItem asyncBuyWithDeliveryItem = aVar.f108797a;
        if (L.f(asyncBuyWithDeliveryItem, serpConstructorAdvertItem)) {
            this.f108796b = new a(asyncBuyWithDeliveryItem, nVar);
        }
    }

    @Override // com.avito.android.buy_with_delivery.a
    public final void b(@k DeepLink deepLink, @k AsyncBuyWithDeliveryItem asyncBuyWithDeliveryItem, @l com.avito.android.constructor_advert.ui.serp.constructor.a aVar) {
        this.f108796b = new a(asyncBuyWithDeliveryItem, aVar);
        b.a.a(this.f108795a, deepLink, "CONSTRUCTOR_SNIPPET_BUY_WITH_DELIVERY_LINK", null, 4);
    }
}
