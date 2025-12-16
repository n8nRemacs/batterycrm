package com.avito.android.remote.model.category_parameters.slot.delivery_return_policy_block;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
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
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryReturnPolicyBlockSlot.kt */
@s0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0018B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy_block/DeliveryReturnPolicyBlockSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy_block/DeliveryReturnPolicyBlockSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy_block/DeliveryReturnPolicyBlockSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy_block/DeliveryReturnPolicyBlockSlotValue;)V", "Ljava/util/ArrayList;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lkotlin/collections/ArrayList;", "initParameters", "()Ljava/util/ArrayList;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy_block/DeliveryReturnPolicyBlockSlotValue;)V", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "charParameter", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryReturnPolicyBlockSlot extends SlotWithValue<DeliveryReturnPolicyBlockSlotConfig, DeliveryReturnPolicyBlockSlotValue> implements DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<DeliveryReturnPolicyBlockSlot> CREATOR;

    static {
        DeliveryReturnPolicyBlockSlot$Companion$CREATOR$1 deliveryReturnPolicyBlockSlot$Companion$CREATOR$1 = DeliveryReturnPolicyBlockSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliveryReturnPolicyBlockSlot$Companion$CREATOR$1);
    }

    public DeliveryReturnPolicyBlockSlot(@k String str, @k String str2, @k SlotWidget<DeliveryReturnPolicyBlockSlotConfig> slotWidget, @l DeliveryReturnPolicyBlockSlotValue deliveryReturnPolicyBlockSlotValue) {
        super(str, str2, slotWidget, deliveryReturnPolicyBlockSlotValue);
    }

    public static /* synthetic */ CharParameter charParameter$default(DeliveryReturnPolicyBlockSlot deliveryReturnPolicyBlockSlot, String str, String str2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        return deliveryReturnPolicyBlockSlot.charParameter(str, str2);
    }

    @k
    public final CharParameter charParameter(@k String id2, @l String value) {
        return new CharParameter(id2, "", true, false, null, null, null, value, null, null, null, null, null, null, null, null, null, null, 262000, null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliveryReturnPolicyBlockSlotConfig>) slotWidget, (DeliveryReturnPolicyBlockSlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        DynamicSlot.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        DynamicSlot.DefaultImpls.setValueChangesListener(this, lVar);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public ArrayList<ParameterSlot> initParameters() {
        return C42745f0.j(charParameter$default(this, "returnPolicy", null, 2, null));
    }

    public void initWidget(@k SlotWidget<DeliveryReturnPolicyBlockSlotConfig> widget, @l DeliveryReturnPolicyBlockSlotValue value) {
        Object next;
        Iterator<T> it = getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), "returnPolicy")) {
                    break;
                }
            }
        }
        CharParameter charParameter = next instanceof CharParameter ? (CharParameter) next : null;
        if (charParameter == null) {
            return;
        }
        charParameter.set_value(value != null ? value.getReturnPolicy() : null);
    }
}
