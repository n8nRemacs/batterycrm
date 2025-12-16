package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.domoteka_report_teaser.AdvertDetailsDomotekaReportTeaserItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.domoteka_report_teaser.DomotekaReportTeaser;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDomotekaReportTeaserItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/h1;", "Lcom/avito/android/advert/item/blocks/items_factories/g1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.h1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27972h1 implements InterfaceC27965g1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73962a;

    @Inject
    public C27972h1(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73962a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27965g1
    @Y61.l
    public final AdvertDetailsDomotekaReportTeaserItem a(@Y61.k AdvertDetails advertDetails) {
        DomotekaReportTeaser domotekaReportTeaser = advertDetails.getDomotekaReportTeaser();
        if (domotekaReportTeaser == null) {
            return null;
        }
        return new AdvertDetailsDomotekaReportTeaserItem(0L, null, null, null, this.f73962a.a(), domotekaReportTeaser.getTitle(), domotekaReportTeaser.getTheme(), domotekaReportTeaser.getInsights(), domotekaReportTeaser.getActions(), domotekaReportTeaser.getHint(), advertDetails.isRedesign(), 15, null);
    }
}
