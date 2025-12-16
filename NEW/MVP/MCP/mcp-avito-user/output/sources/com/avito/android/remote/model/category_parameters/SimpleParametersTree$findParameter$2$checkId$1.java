package com.avito.android.remote.model.category_parameters;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ParametersTree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "checkId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SimpleParametersTree$findParameter$2$checkId$1 extends N implements p<ParameterSlot, String, ParameterSlot> {
    final /* synthetic */ q<ParameterSlot, String, ParameterSlot, ParameterSlot> $comparator;
    final /* synthetic */ ParameterSlot $parameter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleParametersTree$findParameter$2$checkId$1(q<? super ParameterSlot, ? super String, ? super ParameterSlot, ? extends ParameterSlot> qVar, ParameterSlot parameterSlot) {
        super(2);
        this.$comparator = qVar;
        this.$parameter = parameterSlot;
    }

    @Override // Y41.p
    @l
    public final ParameterSlot invoke(@l ParameterSlot parameterSlot, @k String str) {
        return this.$comparator.invoke(parameterSlot, str, this.$parameter);
    }
}
