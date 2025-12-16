package com.avito.android.imv_cars_details.presentation.items.text_block_item;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsTextBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/text_block_item/d;", "LTV0/d;", "Lcom/avito/android/imv_cars_details/presentation/items/text_block_item/f;", "Lcom/avito/android/imv_cars_details/presentation/items/text_block_item/ImvCarsDetailsTextBlockItem;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<f, ImvCarsDetailsTextBlockItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<WM.a> f170236b;

    @Inject
    public d(@k l41.g<WM.a> gVar) {
        this.f170236b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ImvCarsDetailsTextBlockItem imvCarsDetailsTextBlockItem = (ImvCarsDetailsTextBlockItem) aVar;
        fVar.u20(imvCarsDetailsTextBlockItem.f170228c, imvCarsDetailsTextBlockItem.f170229d, imvCarsDetailsTextBlockItem.f170230e);
        fVar.gZ(new c(this));
    }
}
