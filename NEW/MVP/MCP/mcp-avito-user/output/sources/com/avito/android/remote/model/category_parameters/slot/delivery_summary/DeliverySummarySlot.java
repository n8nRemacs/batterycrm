package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

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
import com.avito.android.remote.model.category_parameters.slot.SlotWithState;
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

/* compiled from: DeliverySummarySlot.kt */
@s0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u0019B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliverySummarySlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliverySummarySlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliverySummarySlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithState;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliverySummarySlotValue;)V", "Ljava/util/ArrayList;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lkotlin/collections/ArrayList;", "initParameters", "()Ljava/util/ArrayList;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliverySummarySlotValue;)V", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "charParameter", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliverySummarySlot extends SlotWithValue<DeliverySummarySlotConfig, DeliverySummarySlotValue> implements SlotWithState, DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<DeliverySummarySlot> CREATOR;

    static {
        DeliverySummarySlot$Companion$CREATOR$1 deliverySummarySlot$Companion$CREATOR$1 = DeliverySummarySlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliverySummarySlot$Companion$CREATOR$1);
    }

    public DeliverySummarySlot(@k String str, @k String str2, @k SlotWidget<DeliverySummarySlotConfig> slotWidget, @l DeliverySummarySlotValue deliverySummarySlotValue) {
        super(str, str2, slotWidget, deliverySummarySlotValue);
    }

    public static /* synthetic */ CharParameter charParameter$default(DeliverySummarySlot deliverySummarySlot, String str, String str2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        return deliverySummarySlot.charParameter(str, str2);
    }

    @k
    public final CharParameter charParameter(@k String id2, @l String value) {
        return new CharParameter(id2, "", true, false, null, null, null, value, null, null, null, null, null, null, null, null, null, null, 262000, null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliverySummarySlotConfig>) slotWidget, (DeliverySummarySlotValue) slotValue);
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
        return C42745f0.j(charParameter$default(this, DeliverySummarySlotKt.KEY_CPT_TOKEN, null, 2, null), charParameter$default(this, DeliverySummarySlotKt.ORIGINAL_PRICE, null, 2, null), charParameter$default(this, DeliverySummarySlotKt.PRICE_WITH_FEE, null, 2, null));
    }

    public void initWidget(@k SlotWidget<DeliverySummarySlotConfig> widget, @l DeliverySummarySlotValue value) {
        Object next;
        Object next2;
        Iterator<T> it = getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), DeliverySummarySlotKt.ORIGINAL_PRICE)) {
                    break;
                }
            }
        }
        CharParameter charParameter = next instanceof CharParameter ? (CharParameter) next : null;
        if (charParameter != null) {
            charParameter.set_value(value != null ? value.getOriginalPrice() : null);
        }
        Iterator<T> it2 = getParameters().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (L.f(((ParameterSlot) next2).getId(), DeliverySummarySlotKt.PRICE_WITH_FEE)) {
                    break;
                }
            }
        }
        CharParameter charParameter2 = next2 instanceof CharParameter ? (CharParameter) next2 : null;
        if (charParameter2 == null) {
            return;
        }
        charParameter2.set_value(value != null ? value.getPriceWithFee() : null);
    }
}
