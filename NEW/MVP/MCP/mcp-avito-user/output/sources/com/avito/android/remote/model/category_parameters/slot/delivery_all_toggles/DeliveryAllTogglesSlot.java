package com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles;

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

/* compiled from: DeliveryAllTogglesSlot.kt */
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesSlotValue;)V", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryAllTogglesSlot extends SlotWithValue<DeliveryAllTogglesConfig, DeliveryAllTogglesSlotValue> implements DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<DeliveryAllTogglesSlot> CREATOR;

    @k
    public static final String DELIVERY_CDBS = "deliveryCdbs";

    @k
    public static final String DELIVERY_COURIER = "deliveryCourier";

    @k
    public static final String DELIVERY_DBS = "deliveryDbs";

    @k
    public static final String DELIVERY_DBS_COURIER = "deliveryDbsCourier";

    @k
    public static final String DELIVERY_POSTAMAT = "deliveryPostamat";

    @k
    public static final String DELIVERY_PVZ = "deliveryPvz";

    @k
    public static final String RETURN_POLICY = "returnPolicy";

    static {
        DeliveryAllTogglesSlot$Companion$CREATOR$1 deliveryAllTogglesSlot$Companion$CREATOR$1 = DeliveryAllTogglesSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliveryAllTogglesSlot$Companion$CREATOR$1);
    }

    public DeliveryAllTogglesSlot(@k String str, @k String str2, @k SlotWidget<DeliveryAllTogglesConfig> slotWidget, @l DeliveryAllTogglesSlotValue deliveryAllTogglesSlotValue) {
        super(str, str2, slotWidget, deliveryAllTogglesSlotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        BooleanParameter pvz;
        BooleanParameter dbsField;
        BooleanParameter dbsCourierField;
        BooleanParameter courier;
        AllTogglesSettingsToggles toggles;
        BooleanParameter postamat;
        AllTogglesSettingsToggles toggles2;
        AllTogglesSettingsToggles toggles3;
        AllTogglesSettingsToggles toggles4;
        AllTogglesSettingsToggles toggles5;
        AllTogglesSettings settings = ((DeliveryAllTogglesConfig) getWidget().getConfig()).getSettings();
        BooleanParameter booleanParameter = null;
        if (settings == null || (toggles5 = settings.getToggles()) == null || (pvz = toggles5.getPvz()) == null || pvz.get_value() == null) {
            pvz = null;
        }
        AllTogglesSettings settings2 = ((DeliveryAllTogglesConfig) getWidget().getConfig()).getSettings();
        if (settings2 == null || (toggles4 = settings2.getToggles()) == null || (dbsField = toggles4.getDbsField()) == null || dbsField.get_value() == null) {
            dbsField = null;
        }
        AllTogglesSettings settings3 = ((DeliveryAllTogglesConfig) getWidget().getConfig()).getSettings();
        if (settings3 == null || (toggles3 = settings3.getToggles()) == null || (dbsCourierField = toggles3.getDbsCourierField()) == null || dbsCourierField.get_value() == null) {
            dbsCourierField = null;
        }
        AllTogglesSettings settings4 = ((DeliveryAllTogglesConfig) getWidget().getConfig()).getSettings();
        if (settings4 == null || (toggles2 = settings4.getToggles()) == null || (courier = toggles2.getCourier()) == null || courier.get_value() == null) {
            courier = null;
        }
        AllTogglesSettings settings5 = ((DeliveryAllTogglesConfig) getWidget().getConfig()).getSettings();
        if (settings5 != null && (toggles = settings5.getToggles()) != null && (postamat = toggles.getPostamat()) != null && postamat.get_value() != null) {
            booleanParameter = postamat;
        }
        return C42756l.B(new BooleanParameter[]{pvz, dbsField, dbsCourierField, courier, booleanParameter});
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliveryAllTogglesConfig>) slotWidget, (DeliveryAllTogglesSlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        DynamicSlot.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        DynamicSlot.DefaultImpls.setValueChangesListener(this, lVar);
    }

    public void initWidget(@k SlotWidget<DeliveryAllTogglesConfig> widget, @l DeliveryAllTogglesSlotValue value) {
        AllTogglesSettingsToggles toggles;
        AllTogglesSettingsToggles toggles2;
        AllTogglesSettingsToggles toggles3;
        AllTogglesSettingsToggles toggles4;
        AllTogglesSettingsToggles toggles5;
        AllTogglesSettings settings = ((DeliveryAllTogglesConfig) widget.getConfig()).getSettings();
        BooleanParameter pvz = (settings == null || (toggles5 = settings.getToggles()) == null) ? null : toggles5.getPvz();
        if (pvz != null) {
            pvz.set_value(value != null ? value.getPvz() : null);
        }
        AllTogglesSettings settings2 = ((DeliveryAllTogglesConfig) widget.getConfig()).getSettings();
        BooleanParameter dbsField = (settings2 == null || (toggles4 = settings2.getToggles()) == null) ? null : toggles4.getDbsField();
        if (dbsField != null) {
            dbsField.set_value(value != null ? value.getDbs() : null);
        }
        AllTogglesSettings settings3 = ((DeliveryAllTogglesConfig) widget.getConfig()).getSettings();
        BooleanParameter dbsCourierField = (settings3 == null || (toggles3 = settings3.getToggles()) == null) ? null : toggles3.getDbsCourierField();
        if (dbsCourierField != null) {
            dbsCourierField.set_value(value != null ? value.getDbsCourier() : null);
        }
        AllTogglesSettings settings4 = ((DeliveryAllTogglesConfig) widget.getConfig()).getSettings();
        BooleanParameter courier = (settings4 == null || (toggles2 = settings4.getToggles()) == null) ? null : toggles2.getCourier();
        if (courier != null) {
            courier.set_value(value != null ? value.getCourier() : null);
        }
        AllTogglesSettings settings5 = ((DeliveryAllTogglesConfig) widget.getConfig()).getSettings();
        BooleanParameter postamat = (settings5 == null || (toggles = settings5.getToggles()) == null) ? null : toggles.getPostamat();
        if (postamat == null) {
            return;
        }
        postamat.set_value(value != null ? value.getPostamat() : null);
    }
}
