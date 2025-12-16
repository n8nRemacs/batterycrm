package com.avito.android.serp.adapter.seller_element.seller_pin;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.serp.adapter.seller_element.SellerPinItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import rn0.InterfaceC47690b;

/* compiled from: PinnedSellerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/seller_element/seller_pin/e;", "Lcom/avito/android/serp/adapter/seller_element/seller_pin/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f271710b;

    @Inject
    public e(@k h31.e<InterfaceC47690b> eVar) {
        this.f271710b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        List<SerpBadge> badges;
        g gVar = (g) eVar;
        SellerPinItem sellerPinItem = (SellerPinItem) aVar;
        SerpBadgeBar serpBadgeBar = sellerPinItem.f271698e;
        if (serpBadgeBar == null || (badges = serpBadgeBar.getBadges()) == null) {
            badges = C42784z0.f406748b;
        }
        gVar.c(new d(sellerPinItem, this));
        gVar.My(sellerPinItem.f271700g);
        gVar.P3(badges);
        gVar.setTitle(sellerPinItem.f271697d);
        gVar.EP(sellerPinItem.f271701h);
    }
}
