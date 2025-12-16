package com.avito.android.beduin.common.component.input.single_line;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin_models.BeduinModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import qj.InterfaceC47406a;

/* compiled from: BeduinSingleLineInputModelPreparer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/input/single_line/c;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/input/single_line/SingleLineInputModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC47406a<SingleLineInputModel> {
    @Inject
    public c() {
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        SingleLineInputModel singleLineInputModelCopy$default = (SingleLineInputModel) beduinModel;
        if (singleLineInputModelCopy$default.getTextVersion() == null) {
            singleLineInputModelCopy$default = SingleLineInputModel.copy$default(singleLineInputModelCopy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION), null, null, null, null, null, null, null, null, null, null, 33538047, null);
        }
        SingleLineInputModel singleLineInputModelCopy$default2 = singleLineInputModelCopy$default;
        if (singleLineInputModelCopy$default2.getShowErrorMessage() == null) {
            singleLineInputModelCopy$default2 = SingleLineInputModel.copy$default(singleLineInputModelCopy$default2, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(singleLineInputModelCopy$default2.getErrorMessage() != null), null, null, null, null, null, null, null, null, null, null, null, null, 33550335, null);
        }
        SingleLineInputModel singleLineInputModel = singleLineInputModelCopy$default2;
        return singleLineInputModel.getShowRightIcon() == null ? SingleLineInputModel.copy$default(singleLineInputModel, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(C43066x.K(singleLineInputModel.getText())), null, null, null, null, null, null, 33292287, null) : singleLineInputModel;
    }
}
