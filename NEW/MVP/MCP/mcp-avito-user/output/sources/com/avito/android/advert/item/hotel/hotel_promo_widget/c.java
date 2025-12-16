package com.avito.android.advert.item.hotel.hotel_promo_widget;

import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.ButtonAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: AdvertHotelPromoWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertHotelPromoWidgetItem f76219l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f76220m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, d dVar) {
        super(0);
        this.f76219l = advertHotelPromoWidgetItem;
        this.f76220m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink;
        ButtonAction buttonAction = this.f76219l.f76212k;
        if (buttonAction != null && (deeplink = buttonAction.getDeeplink()) != null) {
            b.a.a(this.f76220m.f76221b, deeplink, null, C22777e.b(new Q("DeepLinkNavigationSource", null)), 2);
        }
        return G0.f406611a;
    }
}
