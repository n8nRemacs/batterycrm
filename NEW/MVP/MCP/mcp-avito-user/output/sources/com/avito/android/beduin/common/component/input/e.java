package com.avito.android.beduin.common.component.input;

import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import oj.InterfaceC44784a;

/* compiled from: InputParametersExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/input/e;", "Loj/a;", "Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC44784a<BeduinInputModel> {
    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinInputModel beduinInputModel = (BeduinInputModel) beduinModel;
        return Collections.singletonMap(beduinInputModel.getId(), beduinInputModel.getText());
    }
}
