package com.avito.android.beduin.common.component.selectStringParameters;

import com.avito.android.beduin.network.model.SelectValue;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import oj.InterfaceC44784a;

/* compiled from: SelectStringParametersExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/selectStringParameters/f;", "Loj/a;", "Lcom/avito/android/beduin/common/component/selectStringParameters/BeduinSelectStringParametersModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC44784a<BeduinSelectStringParametersModel> {
    @Inject
    public f() {
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        SelectValue selectValue = ((BeduinSelectStringParametersModel) beduinModel).f102400g;
        Map<String, String> parameters = selectValue != null ? selectValue.getParameters() : null;
        return parameters == null ? P0.c() : parameters;
    }
}
