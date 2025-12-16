package com.avito.android.remote.model.category_parameters.slot.delivery_addresses;

import X41.f;
import Y41.l;
import Y61.k;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWithoutState;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: DeliveryAddressesSlot.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/DeliveryAddressesSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/DeliveryAddressesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/DeliveryAddressSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithoutState;", "", "id", "label", "values", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/DeliveryAddressSlotValue;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "value", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/DeliveryAddressSlotValue;)V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryAddressesSlot extends SlotWithValue<DeliveryAddressesSlotConfig, DeliveryAddressSlotValue> implements SlotWithoutState {

    @f
    @k
    public static final Parcelable.Creator<DeliveryAddressesSlot> CREATOR;

    static {
        DeliveryAddressesSlot$Companion$CREATOR$1 deliveryAddressesSlot$Companion$CREATOR$1 = DeliveryAddressesSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliveryAddressesSlot$Companion$CREATOR$1);
    }

    public DeliveryAddressesSlot(@k String str, @k String str2, @k DeliveryAddressSlotValue deliveryAddressSlotValue, @k SlotWidget<DeliveryAddressesSlotConfig> slotWidget) {
        super(str, str2, slotWidget, deliveryAddressSlotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return SlotWithoutState.DefaultImpls.initParameters(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliveryAddressesSlotConfig>) slotWidget, (DeliveryAddressSlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        SlotWithoutState.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k l<? super EditableParameter<?>, G0> lVar) {
        SlotWithoutState.DefaultImpls.setValueChangesListener(this, lVar);
    }

    public void initWidget(@k SlotWidget<DeliveryAddressesSlotConfig> widget, @Y61.l DeliveryAddressSlotValue value) {
        List<AddressInfo> addresses;
        List<AddressInfo> addresses2;
        AddressInfo addressInfo;
        DeliveryAddressesSlotConfig deliveryAddressesSlotConfig = (DeliveryAddressesSlotConfig) widget.getConfig();
        if (value == null || (addresses = value.getAddresses()) == null) {
            addresses = C42784z0.f406748b;
        }
        deliveryAddressesSlotConfig.setDeliveryAddresses(addresses);
        ((DeliveryAddressesSlotConfig) widget.getConfig()).setSelectedAddressId((value == null || (addresses2 = value.getAddresses()) == null || (addressInfo = (AddressInfo) C42745f0.E(addresses2)) == null) ? null : Integer.valueOf(addressInfo.getAddressId()));
    }
}
