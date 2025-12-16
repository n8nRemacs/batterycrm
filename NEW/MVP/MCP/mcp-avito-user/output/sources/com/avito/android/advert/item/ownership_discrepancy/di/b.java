package com.avito.android.advert.item.ownership_discrepancy.di;

import Y61.k;
import com.avito.android.advert.item.ownership_discrepancy.AdvertDetailsOwnershipDiscrepancyBottomSheet;
import com.avito.android.advert.item.ownership_discrepancy.OwnershipDiscrepancyOpenParams;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import h31.d;
import kotlin.Metadata;

/* compiled from: OwnershipDiscrepancyComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/di/b;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: OwnershipDiscrepancyComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/di/b$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k InterfaceC30106l7 interfaceC30106l7, @k c cVar, @h31.b @k C28478k c28478k, @h31.b @k OwnershipDiscrepancyOpenParams ownershipDiscrepancyOpenParams);
    }

    void a(@k AdvertDetailsOwnershipDiscrepancyBottomSheet advertDetailsOwnershipDiscrepancyBottomSheet);
}
