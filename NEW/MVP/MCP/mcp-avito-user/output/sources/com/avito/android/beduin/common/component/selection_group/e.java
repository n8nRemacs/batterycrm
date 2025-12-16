package com.avito.android.beduin.common.component.selection_group;

import com.avito.android.beduin.common.component.selection_group.BeduinSelectionGroupModel;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinModel;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import qj.InterfaceC47406a;

/* compiled from: BeduinSelectionGroupModelPreparer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/selection_group/e;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC47406a<BeduinSelectionGroupModel> {
    @Inject
    public e() {
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinSelectionGroupModel beduinSelectionGroupModel = (BeduinSelectionGroupModel) beduinModel;
        if (!(beduinSelectionGroupModel.getSelectionType() instanceof BeduinSelectionGroupModel.SelectionType.Single)) {
            throw new NoWhenBranchMatchedException();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C28809e.e(new c(linkedHashSet), beduinSelectionGroupModel.c());
        List<String> listD = beduinSelectionGroupModel.d();
        return BeduinSelectionGroupModel.a(beduinSelectionGroupModel, null, null, C28809e.c(new d(linkedHashSet, listD != null ? C42745f0.P0(listD) : null), beduinSelectionGroupModel.c()), 15);
    }
}
