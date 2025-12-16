package com.avito.android.remote.model.category_parameters.slot.auto_group_block.car_body_condition;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.GroupBlockSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodySide;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodySidePoint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GroupBodyConditionBlockActiveSlotIdProvider.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/car_body_condition/GroupBodyConditionBlockActiveSlotIdProvider;", "Lcom/avito/android/remote/model/category_parameters/slot/GroupSlotActiveIdProvider;", "()V", "findActiveSlotId", "", "parameterSlot", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "activeFieldId", "categoryParameters", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupBodyConditionBlockActiveSlotIdProvider implements GroupSlotActiveIdProvider {
    @Inject
    public GroupBodyConditionBlockActiveSlotIdProvider() {
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider
    @l
    public String findActiveSlotId(@k Slot<?> parameterSlot, @k String activeFieldId, @l CategoryParameters categoryParameters) {
        CategoryPublishStep.Params fillParametersStepConfig;
        List<String> fields;
        SlotWidget<CarBodyConditionSlotConfig> widget;
        CarBodyConditionSlotConfig carBodyConditionSlotConfig;
        List<CarBodySide> sides;
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
            ParameterSlot parameterSlotFindParameterHolder = categoryParameters != null ? categoryParameters.findParameterHolder((String) it.next()) : null;
            CarBodyConditionSlot carBodyConditionSlot = parameterSlotFindParameterHolder instanceof CarBodyConditionSlot ? (CarBodyConditionSlot) parameterSlotFindParameterHolder : null;
            if (carBodyConditionSlot != null && (widget = carBodyConditionSlot.getWidget()) != null && (carBodyConditionSlotConfig = (CarBodyConditionSlotConfig) widget.getConfig()) != null && (sides = carBodyConditionSlotConfig.getSides()) != null) {
                List<CarBodySide> list2 = sides;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        List<CarBodySidePoint> points = ((CarBodySide) it2.next()).getPoints();
                        if (!(points instanceof Collection) || !points.isEmpty()) {
                            Iterator<T> it3 = points.iterator();
                            while (it3.hasNext()) {
                                List<String> params = ((CarBodySidePoint) it3.next()).getParams();
                                if (!(params instanceof Collection) || !params.isEmpty()) {
                                    Iterator<T> it4 = params.iterator();
                                    while (it4.hasNext()) {
                                        if (L.f((String) it4.next(), activeFieldId)) {
                                            return parameterSlot.getId();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
