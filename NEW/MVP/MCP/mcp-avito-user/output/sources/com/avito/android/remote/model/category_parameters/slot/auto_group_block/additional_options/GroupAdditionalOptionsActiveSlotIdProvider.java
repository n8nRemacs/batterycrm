package com.avito.android.remote.model.category_parameters.slot.auto_group_block.additional_options;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.GroupBlockSlotConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GroupAdditionalOptionsActiveSlotIdProvider.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/additional_options/GroupAdditionalOptionsActiveSlotIdProvider;", "Lcom/avito/android/remote/model/category_parameters/slot/GroupSlotActiveIdProvider;", "()V", "findActiveSlotId", "", "parameterSlot", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "activeFieldId", "categoryParameters", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupAdditionalOptionsActiveSlotIdProvider implements GroupSlotActiveIdProvider {
    @Inject
    public GroupAdditionalOptionsActiveSlotIdProvider() {
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider
    @l
    public String findActiveSlotId(@k Slot<?> parameterSlot, @k String activeFieldId, @l CategoryParameters categoryParameters) {
        CategoryPublishStep.Params fillParametersStepConfig;
        List<String> fields;
        SlotConfig config = parameterSlot.getWidget().getConfig();
        GroupBlockSlotConfig groupBlockSlotConfig = config instanceof GroupBlockSlotConfig ? (GroupBlockSlotConfig) config : null;
        if (groupBlockSlotConfig == null || (fillParametersStepConfig = groupBlockSlotConfig.getFillParametersStepConfig()) == null || (fields = fillParametersStepConfig.getFields()) == null) {
            return null;
        }
        List<String> list = fields;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (L.f((String) it.next(), activeFieldId)) {
                return parameterSlot.getId();
            }
        }
        return null;
    }
}
