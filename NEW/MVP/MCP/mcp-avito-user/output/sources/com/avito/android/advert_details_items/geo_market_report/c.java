package com.avito.android.advert_details_items.geo_market_report;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.GeoMarketReport;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsGeoMarketReportPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/geo_market_report/c;", "LTV0/d;", "Lcom/avito/android/advert_details_items/geo_market_report/e;", "Lcom/avito/android/advert_details_items/geo_market_report/AdvertDetailsGeoMarketReportItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<e, AdvertDetailsGeoMarketReportItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f84776b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f84777c;

    @Inject
    public c(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.advert_core.analytics.a aVar2) {
        this.f84776b = aVar;
        this.f84777c = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.avito.android.advert_details_items.geo_market_report.e] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ?? arrayList;
        ?? r52 = (e) eVar;
        GeoMarketReport geoMarketReport = ((AdvertDetailsGeoMarketReportItem) aVar).f84771g;
        r52.V3(geoMarketReport.getTitle());
        r52.eb(geoMarketReport.getInsights());
        List<ButtonAction> buttons = geoMarketReport.getButtons();
        if (buttons != null) {
            List<ButtonAction> list = buttons;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (ButtonAction buttonAction : list) {
                arrayList.add(new g(buttonAction, new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(19, buttonAction, this)));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        r52.dX(arrayList);
        this.f84777c.s3();
    }
}
