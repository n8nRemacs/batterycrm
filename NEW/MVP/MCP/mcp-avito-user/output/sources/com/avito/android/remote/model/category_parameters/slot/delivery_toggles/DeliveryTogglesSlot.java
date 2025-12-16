package com.avito.android.remote.model.category_parameters.slot.delivery_toggles;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.DynamicSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryTogglesSlot.kt */
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_toggles/DeliveryTogglesSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_toggles/DeliveryTogglesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_toggles/DeliveryTogglesSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_toggles/DeliveryTogglesSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_toggles/DeliveryTogglesSlotValue;)V", "onParametersUpdated", "()V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryTogglesSlot extends SlotWithValue<DeliveryTogglesSlotConfig, DeliveryTogglesSlotValue> implements DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<DeliveryTogglesSlot> CREATOR;

    @k
    public static final String DELIVERY_COURIER = "deliveryCourier";

    @k
    public static final String DELIVERY_POSTAMAT = "deliveryPostamat";

    @k
    public static final String DELIVERY_PVZ = "deliveryPvz";

    static {
        DeliveryTogglesSlot$Companion$CREATOR$1 deliveryTogglesSlot$Companion$CREATOR$1 = DeliveryTogglesSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliveryTogglesSlot$Companion$CREATOR$1);
    }

    public DeliveryTogglesSlot(@k String str, @k String str2, @k SlotWidget<DeliveryTogglesSlotConfig> slotWidget, @l DeliveryTogglesSlotValue deliveryTogglesSlotValue) {
        super(str, str2, slotWidget, deliveryTogglesSlotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        BooleanParameter pvz = ((DeliveryTogglesSlotConfig) getWidget().getConfig()).getPvz();
        if (pvz.get_value() == null) {
            pvz = null;
        }
        BooleanParameter postamat = ((DeliveryTogglesSlotConfig) getWidget().getConfig()).getPostamat();
        if (postamat == null || postamat.get_value() == null) {
            postamat = null;
        }
        BooleanParameter courier = ((DeliveryTogglesSlotConfig) getWidget().getConfig()).getCourier();
        return C42756l.B(new BooleanParameter[]{pvz, postamat, courier.get_value() != null ? courier : null});
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliveryTogglesSlotConfig>) slotWidget, (DeliveryTogglesSlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        DynamicSlot.DefaultImpls.setValueChangesListener(this, lVar);
    }

    public void initWidget(@k SlotWidget<DeliveryTogglesSlotConfig> widget, @l DeliveryTogglesSlotValue value) {
        ((DeliveryTogglesSlotConfig) widget.getConfig()).getPvz().set_value(value != null ? value.getPvz() : null);
        ((DeliveryTogglesSlotConfig) widget.getConfig()).getCourier().set_value(value != null ? value.getCourier() : null);
        BooleanParameter postamat = ((DeliveryTogglesSlotConfig) widget.getConfig()).getPostamat();
        if (postamat == null) {
            return;
        }
        postamat.set_value(value != null ? value.getPostamat() : null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
