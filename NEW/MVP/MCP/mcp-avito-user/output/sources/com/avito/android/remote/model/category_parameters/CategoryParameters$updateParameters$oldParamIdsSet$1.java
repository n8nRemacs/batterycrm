package com.avito.android.remote.model.category_parameters;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryParameters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CategoryParameters$updateParameters$oldParamIdsSet$1 extends N implements l<ParameterSlot, String> {
    public static final CategoryParameters$updateParameters$oldParamIdsSet$1 INSTANCE = new CategoryParameters$updateParameters$oldParamIdsSet$1();

    public CategoryParameters$updateParameters$oldParamIdsSet$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final String invoke(@k ParameterSlot parameterSlot) {
        return parameterSlot.getId();
    }
}
