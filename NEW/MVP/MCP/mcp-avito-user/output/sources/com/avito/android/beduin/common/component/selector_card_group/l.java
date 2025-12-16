package com.avito.android.beduin.common.component.selector_card_group;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinToastAction;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import javax.inject.Inject;
import kotlin.Metadata;
import qj.InterfaceC47406a;

/* compiled from: BeduinSelectorCardGroupPreparer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/l;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements InterfaceC47406a<BeduinSelectorCardGroupModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102554a;

    @Inject
    public l(@Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f102554a = interfaceC15523b;
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinSelectorCardGroupModel beduinSelectorCardGroupModel = (BeduinSelectorCardGroupModel) beduinModel;
        if (!beduinSelectorCardGroupModel.f102519b) {
            return beduinSelectorCardGroupModel;
        }
        if (beduinSelectorCardGroupModel.getErrorMessage() != null) {
            this.f102554a.o(new BeduinToastAction(BeduinComponentTheme.AVITO_LOOK_AND_FEEL, BeduinToastAction.Style.ERROR, beduinSelectorCardGroupModel.getErrorMessage(), null, null, null, null, null, null, null, 1008, null));
        }
        return BeduinSelectorCardGroupModel.a(beduinSelectorCardGroupModel, null, null, null, null, false, false, 49151);
    }
}
