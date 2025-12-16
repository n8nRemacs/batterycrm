package com.avito.android.remote.model.category_parameters.slot.delivery_cnc;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.DeliveryCncPropertiesParameter;
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

/* compiled from: DeliveryCncTogglesSlot.kt */
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/DeliveryCncTogglesSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/DeliveryCncTogglesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/DeliveryCncTogglesSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/DeliveryCncTogglesSlotValue;)V", "Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;", "generateDefaultCncProperties", "()Lcom/avito/android/remote/model/category_parameters/DeliveryCncPropertiesParameter$CncProperties;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/DeliveryCncTogglesSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "onParametersUpdated", "()V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryCncTogglesSlot extends SlotWithValue<DeliveryCncTogglesSlotConfig, DeliveryCncTogglesSlotValue> implements DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<DeliveryCncTogglesSlot> CREATOR;

    static {
        DeliveryCncTogglesSlot$Companion$CREATOR$1 deliveryCncTogglesSlot$Companion$CREATOR$1 = DeliveryCncTogglesSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliveryCncTogglesSlot$Companion$CREATOR$1);
    }

    public DeliveryCncTogglesSlot(@k String str, @k String str2, @k SlotWidget<DeliveryCncTogglesSlotConfig> slotWidget, @l DeliveryCncTogglesSlotValue deliveryCncTogglesSlotValue) {
        super(str, str2, slotWidget, deliveryCncTogglesSlotValue);
    }

    private final DeliveryCncPropertiesParameter.CncProperties generateDefaultCncProperties() {
        CncDaysRange daysRange = ((DeliveryCncTogglesSlotConfig) getWidget().getConfig()).getDaysRange();
        if ((daysRange != null ? daysRange.getDefaultMin() : null) == null || ((DeliveryCncTogglesSlotConfig) getWidget().getConfig()).getDaysRange().getDefaultMax() == null) {
            return null;
        }
        return new DeliveryCncPropertiesParameter.CncProperties(((DeliveryCncTogglesSlotConfig) getWidget().getConfig()).getDaysRange().getDefaultMin(), ((DeliveryCncTogglesSlotConfig) getWidget().getConfig()).getDaysRange().getDefaultMax(), null, null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        BooleanParameter cncToggle = ((DeliveryCncTogglesSlotConfig) getWidget().getConfig()).getCncToggle();
        DeliveryCncPropertiesParameter deliveryCncPropertiesParameter = null;
        if (cncToggle.get_value() == null) {
            cncToggle = null;
        }
        DeliveryCncPropertiesParameter cncParameter = ((DeliveryCncTogglesSlotConfig) getWidget().getConfig()).getCncParameter();
        if (cncParameter != null && ((DeliveryCncTogglesSlotConfig) getWidget().getConfig()).getCncToggle().get_value() != null) {
            deliveryCncPropertiesParameter = cncParameter;
        }
        return C42756l.B(new ParameterSlot[]{cncToggle, deliveryCncPropertiesParameter});
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliveryCncTogglesSlotConfig>) slotWidget, (DeliveryCncTogglesSlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        DynamicSlot.DefaultImpls.setValueChangesListener(this, lVar);
    }

    public void initWidget(@k SlotWidget<DeliveryCncTogglesSlotConfig> widget, @l DeliveryCncTogglesSlotValue value) {
        DeliveryCncPropertiesParameter.CncProperties cncPropertiesGenerateDefaultCncProperties;
        DeliveryCncTogglesSlotConfig deliveryCncTogglesSlotConfig = (DeliveryCncTogglesSlotConfig) widget.getConfig();
        deliveryCncTogglesSlotConfig.getCncToggle().set_value(value != null ? value.getDeliveryCnc() : null);
        DeliveryCncPropertiesParameter cncParameter = deliveryCncTogglesSlotConfig.getCncParameter();
        if (cncParameter == null) {
            return;
        }
        if (value == null || (cncPropertiesGenerateDefaultCncProperties = value.getCncPropertiesValue()) == null) {
            cncPropertiesGenerateDefaultCncProperties = generateDefaultCncProperties();
        }
        cncParameter.set_value(cncPropertiesGenerateDefaultCncProperties);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
