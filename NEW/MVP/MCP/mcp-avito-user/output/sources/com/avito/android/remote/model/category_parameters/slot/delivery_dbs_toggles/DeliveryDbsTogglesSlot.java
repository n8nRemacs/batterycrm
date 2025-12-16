package com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryDbsTogglesSlot.kt */
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlotValue;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Lkotlin/G0;", "onParametersUpdated", "()V", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlotValue;)V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryDbsTogglesSlot extends SlotWithValue<DeliveryDbsTogglesSlotConfig, DeliveryDbsTogglesSlotValue> {

    @f
    @k
    public static final Parcelable.Creator<DeliveryDbsTogglesSlot> CREATOR;

    @k
    public static final String DELIVERY_CDBS = "deliveryCdbs";

    @k
    public static final String DELIVERY_DBS = "deliveryDbs";

    @k
    public static final String DELIVERY_RDBS = "deliveryDbsCourier";

    static {
        DeliveryDbsTogglesSlot$Companion$CREATOR$1 deliveryDbsTogglesSlot$Companion$CREATOR$1 = DeliveryDbsTogglesSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliveryDbsTogglesSlot$Companion$CREATOR$1);
    }

    public DeliveryDbsTogglesSlot(@k String str, @k String str2, @k SlotWidget<DeliveryDbsTogglesSlotConfig> slotWidget, @l DeliveryDbsTogglesSlotValue deliveryDbsTogglesSlotValue) {
        super(str, str2, slotWidget, deliveryDbsTogglesSlotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        BooleanParameter dbs = ((DeliveryDbsTogglesSlotConfig) getWidget().getConfig()).getDbs();
        if ((dbs != null ? dbs.get_value() : null) == null) {
            dbs = null;
        }
        BooleanParameter rdbs = ((DeliveryDbsTogglesSlotConfig) getWidget().getConfig()).getRdbs();
        if ((rdbs != null ? rdbs.get_value() : null) == null) {
            rdbs = null;
        }
        BooleanParameter cdbs = ((DeliveryDbsTogglesSlotConfig) getWidget().getConfig()).getCdbs();
        return C42756l.B(new BooleanParameter[]{dbs, rdbs, (cdbs != null ? cdbs.get_value() : null) != null ? cdbs : null});
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliveryDbsTogglesSlotConfig>) slotWidget, (DeliveryDbsTogglesSlotValue) slotValue);
    }

    public void initWidget(@k SlotWidget<DeliveryDbsTogglesSlotConfig> widget, @l DeliveryDbsTogglesSlotValue value) {
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig = (DeliveryDbsTogglesSlotConfig) widget.getConfig();
        BooleanParameter dbs = deliveryDbsTogglesSlotConfig.getDbs();
        if (dbs != null) {
            dbs.set_value(value != null ? value.getDbs() : null);
        }
        BooleanParameter rdbs = deliveryDbsTogglesSlotConfig.getRdbs();
        if (rdbs != null) {
            rdbs.set_value(value != null ? value.getRdbs() : null);
        }
        BooleanParameter cdbs = deliveryDbsTogglesSlotConfig.getCdbs();
        if (cdbs == null) {
            return;
        }
        cdbs.setValue(value != null ? value.getCdbs() : null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
