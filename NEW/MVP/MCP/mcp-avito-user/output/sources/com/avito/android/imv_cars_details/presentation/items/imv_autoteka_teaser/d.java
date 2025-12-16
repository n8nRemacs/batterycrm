package com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser;

import com.avito.android.remote.imv_cars_details.models.ImvCarsDetailsAutotekaTeaser;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsAutotekaTeaserItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/d;", "LTV0/d;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/f;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_autoteka_teaser/ImvCarsDetailsAutotekaTeaserItem;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<f, ImvCarsDetailsAutotekaTeaserItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f170088b;

    @Inject
    public d(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f170088b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ImvCarsDetailsAutotekaTeaserItem imvCarsDetailsAutotekaTeaserItem = (ImvCarsDetailsAutotekaTeaserItem) aVar;
        ImvCarsDetailsAutotekaTeaser imvCarsDetailsAutotekaTeaser = imvCarsDetailsAutotekaTeaserItem.f170077c;
        fVar.R1(imvCarsDetailsAutotekaTeaser.getTitle());
        fVar.eb(imvCarsDetailsAutotekaTeaser.c());
        fVar.F70(imvCarsDetailsAutotekaTeaser.getReportLink(), new c(this, imvCarsDetailsAutotekaTeaserItem));
    }
}
