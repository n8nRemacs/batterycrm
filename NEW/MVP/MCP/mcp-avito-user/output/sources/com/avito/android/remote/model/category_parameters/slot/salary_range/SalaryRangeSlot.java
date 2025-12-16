package com.avito.android.remote.model.category_parameters.slot.salary_range;

import X41.f;
import Y41.l;
import Y61.k;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithoutState;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SalaryRangeSlot.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/salary_range/SalaryRangeSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/salary_range/SalaryRangeSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithoutState;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "Lkotlin/G0;", "onParametersUpdated", "()V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SalaryRangeSlot extends Slot<SalaryRangeSlotConfig> implements SlotWithoutState {

    @f
    @k
    public static final Parcelable.Creator<SalaryRangeSlot> CREATOR;

    static {
        SalaryRangeSlot$Companion$CREATOR$1 salaryRangeSlot$Companion$CREATOR$1 = SalaryRangeSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(salaryRangeSlot$Companion$CREATOR$1);
    }

    public SalaryRangeSlot(@k String str, @k String str2, @k SlotWidget<SalaryRangeSlotConfig> slotWidget) {
        super(str, str2, slotWidget);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return SlotWithoutState.DefaultImpls.initParameters(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k l<? super EditableParameter<?>, G0> lVar) {
        SlotWithoutState.DefaultImpls.setValueChangesListener(this, lVar);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
