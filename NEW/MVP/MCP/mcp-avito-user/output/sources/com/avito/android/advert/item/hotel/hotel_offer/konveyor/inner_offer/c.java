package com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.AdvertDetailsInnerOfferItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsInnerOfferBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/c;", "LTV0/b;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/l;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/AdvertDetailsInnerOfferItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.b<l, AdvertDetailsInnerOfferItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f76048a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f76049b = new g.a<>(R.layout.advert_details_hotel_inner_offer_item, a.f76050l);

    /* compiled from: AdvertDetailsInnerOfferBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f76050l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(view, d.f76051a);
        }
    }

    @Inject
    public c(@Y61.k j jVar) {
        this.f76048a = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f76048a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f76049b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AdvertDetailsInnerOfferItem) {
            if (((AdvertDetailsInnerOfferItem) aVar).f76033c == AdvertDetailsInnerOfferItem.Size.f76040b) {
                return true;
            }
        }
        return false;
    }
}
