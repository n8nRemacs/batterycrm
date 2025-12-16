package com.avito.android.remote.model.category_parameters.slot.group_inlined_block_slot;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GroupInlinedBlockActiveSlotIdProvider.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/group_inlined_block_slot/GroupInlinedBlockActiveSlotIdProvider;", "Lcom/avito/android/remote/model/category_parameters/slot/GroupSlotActiveIdProvider;", "()V", "findActiveSlotId", "", "parameterSlot", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "activeFieldId", "categoryParameters", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupInlinedBlockActiveSlotIdProvider implements GroupSlotActiveIdProvider {
    @Inject
    public GroupInlinedBlockActiveSlotIdProvider() {
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider
    @l
    public String findActiveSlotId(@k Slot<?> parameterSlot, @k String activeFieldId, @l CategoryParameters categoryParameters) {
        List<ParameterSlot> parameters = parameterSlot.getParameters();
        if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (L.f(((ParameterSlot) it.next()).getId(), activeFieldId)) {
                    return parameterSlot.getId();
                }
            }
        }
        return null;
    }
}
