package com.avito.android.remote.model.category_parameters.slot.iac_devices;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.DynamicSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IacDevicesSlot.kt */
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlotValue;)V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IacDevicesSlot extends SlotWithValue<IacDevicesSlotConfig, IacDevicesSlotValue> implements DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<IacDevicesSlot> CREATOR;

    @k
    public static final String IAC_PRO_CHOSEN_WIDGET_ID = "iacProChosen";

    @k
    public static final String IAC_UPDATED_BY_PRO_WIDGET_ID = "iacUpdatedByPro";

    @k
    public static final String SELECT_DEVICES_WIDGET_ID = "iacDevices";

    static {
        IacDevicesSlot$Companion$CREATOR$1 iacDevicesSlot$Companion$CREATOR$1 = IacDevicesSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(iacDevicesSlot$Companion$CREATOR$1);
    }

    public IacDevicesSlot(@k String str, @k String str2, @k SlotWidget<IacDevicesSlotConfig> slotWidget, @l IacDevicesSlotValue iacDevicesSlotValue) {
        super(str, str2, slotWidget, iacDevicesSlotValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        ArrayList arrayList = new ArrayList();
        Object[] objArr = 0 == true ? 1 : 0;
        arrayList.add(new MultiselectParameter(SELECT_DEVICES_WIDGET_ID, "", true, false, null, null, null, null, null, C42784z0.f406748b, null, null, null, null, objArr, null, null, null, null, null, false, null, 4193344, null));
        Boolean bool = Boolean.FALSE;
        arrayList.add(new BooleanParameter(IAC_UPDATED_BY_PRO_WIDGET_ID, "", true, false, null, null, null, null, null, null, null, bool, null, false, 12288, null));
        Boolean iacForPro = ((IacDevicesSlotConfig) getWidget().getConfig()).getIacForPro();
        Boolean bool2 = Boolean.TRUE;
        if (L.f(iacForPro, bool2) && L.f(((IacDevicesSlotConfig) getWidget().getConfig()).getIacProUser(), bool2)) {
            arrayList.add(new BooleanParameter(IAC_PRO_CHOSEN_WIDGET_ID, "", false, false, null, null, null, null, null, null, null, bool, null, false, 12288, null));
        }
        return arrayList;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<IacDevicesSlotConfig>) slotWidget, (IacDevicesSlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        DynamicSlot.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        DynamicSlot.DefaultImpls.setValueChangesListener(this, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public void initWidget(@k SlotWidget<IacDevicesSlotConfig> widget, @l IacDevicesSlotValue value) {
        Object next;
        Object next2;
        BooleanParameter next3;
        Iterator it = getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), SELECT_DEVICES_WIDGET_ID)) {
                    break;
                }
            }
        }
        MultiselectParameter multiselectParameter = next instanceof MultiselectParameter ? (MultiselectParameter) next : null;
        if (multiselectParameter != null) {
            multiselectParameter.set_value2(value != null ? value.getDevices() : null);
        }
        Iterator it2 = getParameters().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (L.f(((ParameterSlot) next2).getId(), IAC_PRO_CHOSEN_WIDGET_ID)) {
                    break;
                }
            }
        }
        BooleanParameter booleanParameter = next2 instanceof BooleanParameter ? (BooleanParameter) next2 : null;
        if (booleanParameter != null) {
            booleanParameter.set_value(value != null ? value.getIacProChosen() : null);
        }
        Iterator it3 = getParameters().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = 0;
                break;
            } else {
                next3 = it3.next();
                if (L.f(((ParameterSlot) next3).getId(), IAC_UPDATED_BY_PRO_WIDGET_ID)) {
                    break;
                }
            }
        }
        BooleanParameter booleanParameter2 = next3 instanceof BooleanParameter ? next3 : null;
        if (booleanParameter2 == null) {
            return;
        }
        booleanParameter2.set_value(((IacDevicesSlotConfig) widget.getConfig()).getIacProUser());
    }
}
