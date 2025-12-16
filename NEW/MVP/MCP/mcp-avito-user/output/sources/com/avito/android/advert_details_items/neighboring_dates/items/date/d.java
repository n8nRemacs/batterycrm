package com.avito.android.advert_details_items.neighboring_dates.items.date;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NeighboringDatesChipPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/items/date/d;", "LTV0/d;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/date/f;", "Lcom/avito/android/advert_details_items/neighboring_dates/items/NeighboringDatesItem$NeighboringDatesChipItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, NeighboringDatesItem.NeighboringDatesChipItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_details_items.neighboring_dates.tools.d f84944b;

    @Inject
    public d(@k com.avito.android.advert_details_items.neighboring_dates.tools.d dVar) {
        this.f84944b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        NeighboringDatesItem.NeighboringDatesChipItem neighboringDatesChipItem = (NeighboringDatesItem.NeighboringDatesChipItem) aVar;
        fVar.r(neighboringDatesChipItem.f84925e);
        fVar.yf(neighboringDatesChipItem.f84928h);
        fVar.a(new c(this, neighboringDatesChipItem));
    }
}
