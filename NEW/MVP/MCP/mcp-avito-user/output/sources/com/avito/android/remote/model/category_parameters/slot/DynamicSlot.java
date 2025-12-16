package com.avito.android.remote.model.category_parameters.slot;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.category_parameters.ObservableSlot;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DynamicSlot.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "Lcom/avito/android/remote/model/category_parameters/ObservableSlot;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DynamicSlot extends ObservableSlot {

    /* compiled from: DynamicSlot.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onParametersUpdated(@k DynamicSlot dynamicSlot) {
            ObservableSlot.DefaultImpls.onParametersUpdated(dynamicSlot);
        }

        public static void setValueChangesListener(@k DynamicSlot dynamicSlot, @k l<? super EditableParameter<?>, G0> lVar) {
            ObservableSlot.DefaultImpls.setValueChangesListener(dynamicSlot, lVar);
        }
    }
}
