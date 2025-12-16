package com.avito.android.publish.slots.delivery_subsidies;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlot;
import i31.InterfaceC41220a;
import kotlin.Metadata;

/* compiled from: DeliverySubsidiesSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_subsidies/a;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidiesSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends j<DeliverySubsidiesSlot> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeliverySubsidiesSlot f243555b;

    @i31.c
    public a(@InterfaceC41220a @k DeliverySubsidiesSlot deliverySubsidiesSlot) {
        this.f243555b = deliverySubsidiesSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243555b;
    }
}
