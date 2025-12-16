package com.avito.android.remote.model.category_parameters;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ObservableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.ParameterChangesListenerHolder;
import com.avito.android.remote.model.category_parameters.slot.ParameterHolder;
import com.avito.android.remote.model.category_parameters.slot.ParametersInitializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ObservableSlot.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\u00052\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00050\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ObservableSlot;", "Lcom/avito/android/remote/model/category_parameters/base/ObservableParameter;", "Lcom/avito/android/remote/model/category_parameters/slot/ParameterHolder;", "Lcom/avito/android/remote/model/category_parameters/slot/ParametersInitializer;", "Lcom/avito/android/remote/model/category_parameters/slot/ParameterChangesListenerHolder;", "Lkotlin/G0;", "onParametersUpdated", "()V", "Lkotlin/Function1;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "listener", "setValueChangesListener", "(LY41/l;)V", "setListenerForParams", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ObservableSlot extends ObservableParameter, ParameterHolder, ParametersInitializer, ParameterChangesListenerHolder {

    /* compiled from: ObservableSlot.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onParametersUpdated(@k ObservableSlot observableSlot) {
            setListenerForParams(observableSlot);
        }

        private static void setListenerForParams(ObservableSlot observableSlot) {
            l<EditableParameter<?>, G0> changesListener = observableSlot.getChangesListener();
            if (changesListener != null) {
                List<ParameterSlot> parameters = observableSlot.getParameters();
                ArrayList arrayList = new ArrayList();
                for (Object obj : parameters) {
                    if (obj instanceof ObservableParameter) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ObservableParameter) it.next()).setValueChangesListener(changesListener);
                }
            }
        }

        public static void setValueChangesListener(@k ObservableSlot observableSlot, @k l<? super EditableParameter<?>, G0> lVar) {
            observableSlot.setChangesListener(lVar);
            setListenerForParams(observableSlot);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    void onParametersUpdated();

    @Override // com.avito.android.remote.model.category_parameters.base.ObservableParameter
    void setValueChangesListener(@k l<? super EditableParameter<?>, G0> listener);
}
