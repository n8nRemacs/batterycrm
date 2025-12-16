package com.avito.android.remote.model.category_parameters.slot;

import Y61.k;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SlotWithState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/SlotWithState;", "Lcom/avito/android/remote/model/category_parameters/slot/ParameterHolder;", "getState", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SlotWithState extends ParameterHolder {

    /* compiled from: SlotWithState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @k
        public static List<ParameterSlot> getState(@k SlotWithState slotWithState) {
            return slotWithState.getParameters();
        }
    }

    @k
    List<ParameterSlot> getState();
}
