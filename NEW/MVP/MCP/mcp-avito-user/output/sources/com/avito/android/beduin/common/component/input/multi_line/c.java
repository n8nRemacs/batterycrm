package com.avito.android.beduin.common.component.input.multi_line;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin_models.BeduinModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import qj.InterfaceC47406a;

/* compiled from: BeduinMultilineInputModelPreparer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/input/multi_line/c;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/input/multi_line/MultiLineInputModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC47406a<MultiLineInputModel> {
    @Inject
    public c() {
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        MultiLineInputModel multiLineInputModelCopy$default = (MultiLineInputModel) beduinModel;
        if (multiLineInputModelCopy$default.getTextVersion() == null) {
            multiLineInputModelCopy$default = MultiLineInputModel.copy$default(multiLineInputModelCopy$default, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION), null, null, null, null, null, null, null, null, 1046527, null);
        }
        MultiLineInputModel multiLineInputModelCopy$default2 = multiLineInputModelCopy$default;
        if (multiLineInputModelCopy$default2.getShowErrorMessage() == null) {
            multiLineInputModelCopy$default2 = MultiLineInputModel.copy$default(multiLineInputModelCopy$default2, null, null, null, null, null, null, null, null, null, Boolean.valueOf(multiLineInputModelCopy$default2.getErrorMessage() != null), null, null, null, null, null, null, null, null, null, null, 1048063, null);
        }
        MultiLineInputModel multiLineInputModel = multiLineInputModelCopy$default2;
        return multiLineInputModel.getShowRightIcon() == null ? MultiLineInputModel.copy$default(multiLineInputModel, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(C43066x.K(multiLineInputModel.getText())), 524287, null) : multiLineInputModel;
    }
}
