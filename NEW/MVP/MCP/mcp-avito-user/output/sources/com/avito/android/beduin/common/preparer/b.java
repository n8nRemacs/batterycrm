package com.avito.android.beduin.common.preparer;

import com.avito.android.beduin.common.component.activate_group.BeduinAccordionGroupModel;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import qj.InterfaceC47406a;

/* compiled from: AccordionGroupModelPreparer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/preparer/b;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/activate_group/BeduinAccordionGroupModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC47406a<BeduinAccordionGroupModel> {
    @Inject
    public b() {
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinAccordionGroupModel beduinAccordionGroupModel = (BeduinAccordionGroupModel) beduinModel;
        Map<String, List<BeduinModelTransform>> onExpandTransforms = beduinAccordionGroupModel.isExpanded() ? beduinAccordionGroupModel.getOnExpandTransforms() : beduinAccordionGroupModel.getOnCollapseTransforms();
        if (onExpandTransforms == null || onExpandTransforms.isEmpty()) {
            return beduinAccordionGroupModel;
        }
        List<BeduinModel> headerChildren = beduinAccordionGroupModel.getHeaderChildren();
        return BeduinAccordionGroupModel.copy$default(beduinAccordionGroupModel, null, false, null, null, headerChildren != null ? C28809e.c(new a(onExpandTransforms), headerChildren) : null, null, null, 111, null);
    }
}
