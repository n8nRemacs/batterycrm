package com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.DynamicSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithState;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlotConfig;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySummaryEditSlot.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0012B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/DeliverySummaryEditSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliverySummarySlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithState;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "id", "", "label", "widget", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "charParameter", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "value", "initParameters", "Ljava/util/ArrayList;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lkotlin/collections/ArrayList;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliverySummaryEditSlot extends Slot<DeliverySummarySlotConfig> implements SlotWithState, DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<DeliverySummaryEditSlot> CREATOR;

    static {
        DeliverySummaryEditSlot$Companion$CREATOR$1 deliverySummaryEditSlot$Companion$CREATOR$1 = DeliverySummaryEditSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliverySummaryEditSlot$Companion$CREATOR$1);
    }

    public DeliverySummaryEditSlot(@k String str, @k String str2, @k SlotWidget<DeliverySummarySlotConfig> slotWidget) {
        super(str, str2, slotWidget);
    }

    public static /* synthetic */ CharParameter charParameter$default(DeliverySummaryEditSlot deliverySummaryEditSlot, String str, String str2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        return deliverySummaryEditSlot.charParameter(str, str2);
    }

    @k
    public final CharParameter charParameter(@k String id2, @l String value) {
        return new CharParameter(id2, "", true, false, null, null, null, value, null, null, null, null, null, null, null, null, null, null, 262000, null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithState
    @k
    public List<ParameterSlot> getState() {
        return SlotWithState.DefaultImpls.getState(this);
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
        return C42745f0.j(charParameter$default(this, DeliverySummaryEditSlotKt.KEY_CPT_EDIT_TOKEN, null, 2, null));
    }
}
