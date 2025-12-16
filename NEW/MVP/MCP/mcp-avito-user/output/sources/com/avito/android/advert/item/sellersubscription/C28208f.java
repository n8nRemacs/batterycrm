package com.avito.android.advert.item.sellersubscription;

import Ca.AbstractC13232a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSellerSubscriptionPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/f;", "Lcom/avito/android/advert/item/sellersubscription/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.sellersubscription.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28208f implements InterfaceC28205c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<AbstractC13232a> f79741b;

    @Inject
    public C28208f(@Y61.k l41.g<AbstractC13232a> gVar) {
        this.f79741b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem = (AdvertDetailsSellerSubscriptionItem) aVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        hVar.zJ(new C28206d(hVar, cVar));
        cVar.b(hVar.E3().t0(new C28207e(advertDetailsSellerSubscriptionItem, this)));
        SellerSubscriptionState sellerSubscriptionState = advertDetailsSellerSubscriptionItem.f79665d;
        if (sellerSubscriptionState != null) {
            hVar.Cp(sellerSubscriptionState);
        }
    }
}
