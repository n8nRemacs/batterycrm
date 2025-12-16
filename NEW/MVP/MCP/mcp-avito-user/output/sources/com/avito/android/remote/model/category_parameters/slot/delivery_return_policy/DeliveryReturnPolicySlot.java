package com.avito.android.remote.model.category_parameters.slot.delivery_return_policy;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.DynamicSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;

/* compiled from: DeliveryReturnPolicySlot.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlotValue;)V", "onParametersUpdated", "()V", "", "getHasRadioConfigField", "()Z", "hasRadioConfigField", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryReturnPolicySlot extends SlotWithValue<DeliveryReturnPolicySlotConfig, DeliveryReturnPolicySlotValue> implements DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<DeliveryReturnPolicySlot> CREATOR;

    static {
        DeliveryReturnPolicySlot$Companion$CREATOR$1 deliveryReturnPolicySlot$Companion$CREATOR$1 = DeliveryReturnPolicySlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliveryReturnPolicySlot$Companion$CREATOR$1);
    }

    public DeliveryReturnPolicySlot(@k String str, @k String str2, @k SlotWidget<DeliveryReturnPolicySlotConfig> slotWidget, @l DeliveryReturnPolicySlotValue deliveryReturnPolicySlotValue) {
        super(str, str2, slotWidget, deliveryReturnPolicySlotValue);
    }

    public final boolean getHasRadioConfigField() {
        return ((DeliveryReturnPolicySlotConfig) getWidget().getConfig()).getReturnPolicyRadioField() != null;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        Object returnPolicyRadioField = ((DeliveryReturnPolicySlotConfig) getWidget().getConfig()).getReturnPolicyRadioField();
        if (returnPolicyRadioField == null) {
            returnPolicyRadioField = ((DeliveryReturnPolicySlotConfig) getWidget().getConfig()).getReturnPolicy();
        }
        return Collections.singletonList(returnPolicyRadioField);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliveryReturnPolicySlotConfig>) slotWidget, (DeliveryReturnPolicySlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        DynamicSlot.DefaultImpls.setValueChangesListener(this, lVar);
    }

    public void initWidget(@k SlotWidget<DeliveryReturnPolicySlotConfig> widget, @l DeliveryReturnPolicySlotValue value) {
        List<String> availablePolicies;
        setP0 = null;
        Set<String> setP0 = null;
        if (!getHasRadioConfigField()) {
            ((DeliveryReturnPolicySlotConfig) widget.getConfig()).getReturnPolicy().set_value(value != null ? value.getReturnPolicyToggle() : null);
            return;
        }
        SelectParameter.Flat returnPolicyRadioField = ((DeliveryReturnPolicySlotConfig) widget.getConfig()).getReturnPolicyRadioField();
        if (returnPolicyRadioField != null) {
            returnPolicyRadioField.set_value(value != null ? value.getReturnPolicy() : null);
        }
        DeliveryReturnPolicySlotConfig deliveryReturnPolicySlotConfig = (DeliveryReturnPolicySlotConfig) widget.getConfig();
        if (value != null && (availablePolicies = value.getAvailablePolicies()) != null) {
            setP0 = C42745f0.P0(availablePolicies);
        }
        if (setP0 == null) {
            setP0 = B0.f406639b;
        }
        deliveryReturnPolicySlotConfig.setAvailableRadioPolicyIds(setP0);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
