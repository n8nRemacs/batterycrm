package com.avito.android.publish.slots.delivery_seller;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_seller.DeliverySellerSlot;
import i31.InterfaceC41220a;
import kotlin.Metadata;

/* compiled from: DeliverySellerSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_seller/a;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_seller/DeliverySellerSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends j<DeliverySellerSlot> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeliverySellerSlot f243552b;

    @i31.c
    public a(@InterfaceC41220a @k DeliverySellerSlot deliverySellerSlot) {
        this.f243552b = deliverySellerSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243552b;
    }
}
