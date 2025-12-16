package com.avito.android.remote.model.category_parameters.slot.auto_group_block.contact;

import X41.f;
import Y41.l;
import Y61.k;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.DynamicSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithState;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: GroupContactSlot.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u000eB#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/contact/GroupContactSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/contact/GroupContactSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithState;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "id", "", "label", "widget", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "initParameters", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupContactSlot extends Slot<GroupContactSlotConfig> implements SlotWithState, DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<GroupContactSlot> CREATOR;

    static {
        GroupContactSlot$Companion$CREATOR$1 groupContactSlot$Companion$CREATOR$1 = GroupContactSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(groupContactSlot$Companion$CREATOR$1);
    }

    public GroupContactSlot(@k String str, @k String str2, @k SlotWidget<GroupContactSlotConfig> slotWidget) {
        super(str, str2, slotWidget);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithState
    @k
    public List<ParameterSlot> getState() {
        return SlotWithState.DefaultImpls.getState(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        DynamicSlot.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k l<? super EditableParameter<?>, G0> lVar) {
        DynamicSlot.DefaultImpls.setValueChangesListener(this, lVar);
    }
}
