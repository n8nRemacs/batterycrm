package com.avito.android.advert.item.equipmentsTile;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsEquipmentsTileResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/equipmentsTile/k;", "Lcom/avito/android/advert/item/equipmentsTile/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f75349a;

    @Inject
    public k(@Y61.k Resources resources) {
        this.f75349a = resources;
    }

    @Override // com.avito.android.advert.item.equipmentsTile.j
    public final int a() {
        return this.f75349a.getDimensionPixelOffset(R.dimen.advert_details_equipment_tile_horizontal_padding);
    }
}
