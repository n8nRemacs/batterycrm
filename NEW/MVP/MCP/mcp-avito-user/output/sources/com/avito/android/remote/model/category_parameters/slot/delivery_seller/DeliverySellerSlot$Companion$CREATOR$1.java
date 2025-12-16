package com.avito.android.remote.model.category_parameters.slot.delivery_seller;

import Y41.l;
import Y61.k;
import android.os.Parcel;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlotValue;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliverySellerSlot.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_seller/DeliverySellerSlot;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliverySellerSlot$Companion$CREATOR$1 extends N implements l<Parcel, DeliverySellerSlot> {
    public static final DeliverySellerSlot$Companion$CREATOR$1 INSTANCE = new DeliverySellerSlot$Companion$CREATOR$1();

    public DeliverySellerSlot$Companion$CREATOR$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final DeliverySellerSlot invoke(@k Parcel parcel) {
        return new DeliverySellerSlot(parcel.readString(), parcel.readString(), (SlotWidget) parcel.readParcelable(SlotWidget.class.getClassLoader()), (DeliverySellerSlotValue) parcel.readParcelable(DeliveryReturnPolicySlotValue.class.getClassLoader()));
    }
}
