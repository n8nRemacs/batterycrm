package com.avito.android.advert.item.select.booking;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoSelectBookingPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/select/booking/d;", "LTV0/d;", "Lcom/avito/android/advert/item/select/booking/f;", "Lcom/avito/android/advert/item/select/booking/AutoSelectBookingItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, AutoSelectBookingItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f79377b;

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f79377b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).ZZ(((AutoSelectBookingItem) aVar).f79369g, new c(this));
    }
}
