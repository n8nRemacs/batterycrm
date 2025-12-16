package com.avito.android.remote.model.category_parameters.slot.cpt_unswitchable_delivery;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithoutState;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CptUnswitchableDeliverySlot.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/cpt_unswitchable_delivery/CptUnswitchableDeliverySlot;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/cpt_unswitchable_delivery/CptUnswitchableDeliveryConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithoutState;", "id", "", "label", "widget", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "charParameter", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "value", "initParameters", "Ljava/util/ArrayList;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lkotlin/collections/ArrayList;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CptUnswitchableDeliverySlot extends Slot<CptUnswitchableDeliveryConfig> implements SlotWithoutState {

    @f
    @k
    public static final Parcelable.Creator<CptUnswitchableDeliverySlot> CREATOR;

    @k
    public static final String KEY_CPT_UNSWITCHABLE_DELIVERY_TOKEN = "cptUnswitchableDeliveryToken";

    static {
        CptUnswitchableDeliverySlot$Companion$CREATOR$1 cptUnswitchableDeliverySlot$Companion$CREATOR$1 = CptUnswitchableDeliverySlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(cptUnswitchableDeliverySlot$Companion$CREATOR$1);
    }

    public CptUnswitchableDeliverySlot(@k String str, @k String str2, @k SlotWidget<CptUnswitchableDeliveryConfig> slotWidget) {
        super(str, str2, slotWidget);
    }

    public static /* synthetic */ CharParameter charParameter$default(CptUnswitchableDeliverySlot cptUnswitchableDeliverySlot, String str, String str2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        return cptUnswitchableDeliverySlot.charParameter(str, str2);
    }

    @k
    public final CharParameter charParameter(@k String id2, @l String value) {
        return new CharParameter(id2, "", true, false, null, null, null, value, null, null, null, null, null, null, null, null, null, null, 262000, null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        SlotWithoutState.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        SlotWithoutState.DefaultImpls.setValueChangesListener(this, lVar);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public ArrayList<ParameterSlot> initParameters() {
        return C42745f0.j(charParameter$default(this, KEY_CPT_UNSWITCHABLE_DELIVERY_TOKEN, null, 2, null));
    }
}
