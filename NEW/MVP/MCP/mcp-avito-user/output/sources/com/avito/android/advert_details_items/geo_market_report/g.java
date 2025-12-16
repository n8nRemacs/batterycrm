package com.avito.android.advert_details_items.geo_market_report;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsGeoMarketReportView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/geo_market_report/g;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ButtonAction f84787a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g f84788b;

    public g(@l ButtonAction buttonAction, @k com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g gVar) {
        this.f84787a = buttonAction;
        this.f84788b = gVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f84787a, gVar.f84787a) && this.f84788b.equals(gVar.f84788b);
    }

    public final int hashCode() {
        ButtonAction buttonAction = this.f84787a;
        return this.f84788b.hashCode() + ((buttonAction == null ? 0 : buttonAction.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "ButtonInfoWithListener(button=" + this.f84787a + ", clickListener=" + this.f84788b + ')';
    }
}
