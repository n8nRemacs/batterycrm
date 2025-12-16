package com.avito.android.remote.model.category_parameters.slot.sleeping_places;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
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
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SleepingPlacesSlot.kt */
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesSlotValue;)V", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SleepingPlacesSlot extends SlotWithValue<SleepingPlacesSlotConfig, SleepingPlacesSlotValue> implements DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<SleepingPlacesSlot> CREATOR;

    static {
        SleepingPlacesSlot$Companion$CREATOR$1 sleepingPlacesSlot$Companion$CREATOR$1 = SleepingPlacesSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(sleepingPlacesSlot$Companion$CREATOR$1);
    }

    public SleepingPlacesSlot(@k String str, @k String str2, @k SlotWidget<SleepingPlacesSlotConfig> slotWidget, @l SleepingPlacesSlotValue sleepingPlacesSlotValue) {
        super(str, str2, slotWidget, sleepingPlacesSlotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return C42745f0.V(((SleepingPlacesSlotConfig) getWidget().getConfig()).getSelectedBedTypes());
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<SleepingPlacesSlotConfig>) slotWidget, (SleepingPlacesSlotValue) slotValue);
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
    public void initWidget(@k SlotWidget<SleepingPlacesSlotConfig> widget, @l SleepingPlacesSlotValue value) {
        List<ParameterSlot> params;
        Object next;
        List<ParameterSlot> params2;
        Object next2;
        ObjectsParameter objectsParameter;
        ArrayList arrayList;
        List<SelectedBedType> selectedBedTypes;
        if (((SleepingPlacesSlotConfig) widget.getConfig()).getSelectedBedTypes() == null || (params = ((SleepingPlacesSlotConfig) widget.getConfig()).getSelectedBedTypes().getParams()) == null) {
            return;
        }
        Iterator<T> it = params.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next instanceof SelectParameter.Flat) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof SelectParameter.Flat)) {
            next = null;
        }
        SelectParameter.Flat flat = (SelectParameter.Flat) next;
        if (flat == null || (params2 = ((SleepingPlacesSlotConfig) widget.getConfig()).getSelectedBedTypes().getParams()) == null) {
            return;
        }
        Iterator<T> it2 = params2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (next2 instanceof IntParameter) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        if (!(next2 instanceof IntParameter)) {
            next2 = null;
        }
        IntParameter intParameter = (IntParameter) next2;
        if (intParameter == null) {
            return;
        }
        ObjectsParameter selectedBedTypes2 = ((SleepingPlacesSlotConfig) widget.getConfig()).getSelectedBedTypes();
        if (value == null || (selectedBedTypes = value.getSelectedBedTypes()) == null) {
            objectsParameter = selectedBedTypes2;
            arrayList = null;
        } else {
            ArrayList<Q> arrayList2 = new ArrayList();
            Iterator<T> it3 = selectedBedTypes.iterator();
            while (it3.hasNext()) {
                Integer id2 = ((SelectedBedType) it3.next()).getId();
                Q q12 = id2 != null ? new Q(id2.toString(), Long.valueOf(r6.getAmount())) : null;
                if (q12 != null) {
                    arrayList2.add(q12);
                }
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            for (Q q13 : arrayList2) {
                String str = (String) q13.f406619b;
                long jLongValue = ((Number) q13.f406620c).longValue();
                ArrayList arrayList4 = arrayList3;
                ObjectsParameter objectsParameter2 = selectedBedTypes2;
                SelectParameter.Flat flatCopy = flat.copy((33554431 & 1) != 0 ? flat.id : null, (33554431 & 2) != 0 ? flat.title : null, (33554431 & 4) != 0 ? flat.subtitle : null, (33554431 & 8) != 0 ? flat.required : false, (33554431 & 16) != 0 ? flat.immutable : false, (33554431 & 32) != 0 ? flat.motivation : null, (33554431 & 64) != 0 ? flat.updatesForm : null, (33554431 & 128) != 0 ? flat.updatesObjectForm : null, (33554431 & 256) != 0 ? flat._value : null, (33554431 & 512) != 0 ? flat.chosenValue : null, (33554431 & 1024) != 0 ? flat._values : null, (33554431 & 2048) != 0 ? flat.displaying : null, (33554431 & 4096) != 0 ? flat.placeholder : null, (33554431 & 8192) != 0 ? flat.attributeId : null, (33554431 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? flat.availableOptions : null, (33554431 & 32768) != 0 ? flat.isEnabled : null, (33554431 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? flat.visible : null, (33554431 & 131072) != 0 ? flat.phantom : null, (33554431 & 262144) != 0 ? flat.resetValue : null, (33554431 & 524288) != 0 ? flat._hasSuggest : null, (33554431 & 1048576) != 0 ? flat.displayTitle : null, (33554431 & 2097152) != 0 ? flat.defaultValue : null, (33554431 & 4194304) != 0 ? flat.resetAreaOnChange : false, (33554431 & 8388608) != 0 ? flat.widget : null, (33554431 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? flat.constraints : null);
                if (!L.f(flatCopy.getValue(), str)) {
                    flatCopy.setValue(str);
                    flatCopy.setError(null);
                }
                IntParameter intParameterCopy = intParameter.copy((32766 & 1) != 0 ? intParameter.id : null, (32766 & 2) != 0 ? intParameter.title : null, (32766 & 4) != 0 ? intParameter.required : false, (32766 & 8) != 0 ? intParameter.immutable : false, (32766 & 16) != 0 ? intParameter.motivation : null, (32766 & 32) != 0 ? intParameter.updatesForm : null, (32766 & 64) != 0 ? intParameter.hint : null, (32766 & 128) != 0 ? intParameter._value : null, (32766 & 256) != 0 ? intParameter.constraints : null, (32766 & 512) != 0 ? intParameter.displayingOptions : null, (32766 & 1024) != 0 ? intParameter.placeholder : null, (32766 & 2048) != 0 ? intParameter.button : null, (32766 & 4096) != 0 ? intParameter.visible : null, (32766 & 8192) != 0 ? intParameter.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? intParameter.widget : null);
                Long lValueOf = Long.valueOf(jLongValue);
                if (!L.f(intParameterCopy.getValue(), lValueOf)) {
                    intParameterCopy.setValue(lValueOf);
                    intParameterCopy.setError(null);
                }
                arrayList4.add(C42745f0.U(flatCopy, intParameterCopy));
                arrayList3 = arrayList4;
                selectedBedTypes2 = objectsParameter2;
            }
            objectsParameter = selectedBedTypes2;
            arrayList = arrayList3;
        }
        objectsParameter.set_value((List<? extends List<? extends ParameterSlot>>) arrayList);
    }
}
