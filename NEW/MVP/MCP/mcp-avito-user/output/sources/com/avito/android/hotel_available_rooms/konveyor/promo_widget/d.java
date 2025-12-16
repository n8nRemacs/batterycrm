package com.avito.android.hotel_available_rooms.konveyor.promo_widget;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelPromoWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/promo_widget/d;", "LTV0/d;", "Lcom/avito/android/hotel_available_rooms/konveyor/promo_widget/f;", "Lcom/avito/android/hotel_available_rooms/konveyor/promo_widget/HotelPromoWidgetItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<f, HotelPromoWidgetItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final GI.a f163057b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<JI.a, G0> f163058c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k GI.a aVar, @k l<? super JI.a, G0> lVar) {
        this.f163057b = aVar;
        this.f163058c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        HotelPromoWidgetItem hotelPromoWidgetItem = (HotelPromoWidgetItem) aVar;
        UniversalColor universalColor = hotelPromoWidgetItem.f163045c;
        if (universalColor != null) {
            fVar.v(universalColor);
        }
        fVar.w(hotelPromoWidgetItem.f163048f);
        fVar.q(hotelPromoWidgetItem.f163046d);
        fVar.M(hotelPromoWidgetItem.f163047e);
        fVar.pa(hotelPromoWidgetItem.f163049g, new c(hotelPromoWidgetItem, this));
        ParametrizedEvent parametrizedEvent = hotelPromoWidgetItem.f163050h;
        if (parametrizedEvent != null) {
            this.f163057b.q(parametrizedEvent);
        }
    }
}
