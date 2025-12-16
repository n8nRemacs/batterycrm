package com.avito.android.remote.model.category_parameters.slot;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.DynamicSlot;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SlotWithoutState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/SlotWithoutState;", "Lcom/avito/android/remote/model/category_parameters/slot/ParametersInitializer;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Lkotlin/G0;", "onParametersUpdated", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SlotWithoutState extends ParametersInitializer, DynamicSlot {
    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    List<ParameterSlot> initParameters();

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    void onParametersUpdated();

    /* compiled from: SlotWithoutState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @k
        public static List<ParameterSlot> initParameters(@k SlotWithoutState slotWithoutState) {
            return C42784z0.f406748b;
        }

        public static void setValueChangesListener(@k SlotWithoutState slotWithoutState, @k l<? super EditableParameter<?>, G0> lVar) {
            DynamicSlot.DefaultImpls.setValueChangesListener(slotWithoutState, lVar);
        }

        public static void onParametersUpdated(@k SlotWithoutState slotWithoutState) {
        }
    }
}
