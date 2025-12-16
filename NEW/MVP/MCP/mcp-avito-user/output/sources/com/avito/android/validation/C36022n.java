package com.avito.android.validation;

import com.avito.android.payment.ParametersTree;
import com.avito.android.remote.model.IterableParameters;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.validation.n1;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocalPretendInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/n;", "Lcom/avito/android/validation/m;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36022n implements InterfaceC36020m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d1 f319399a;

    @Inject
    public C36022n(@Y61.k d1 d1Var) {
        this.f319399a = d1Var;
    }

    @Override // com.avito.android.validation.InterfaceC36020m
    @Y61.k
    public final PretendResult a(@Y61.k IterableParameters iterableParameters) {
        return c(iterableParameters);
    }

    @Override // com.avito.android.validation.InterfaceC36020m
    @Y61.k
    public final C41948f0 b(@Y61.k ParametersTree parametersTree) {
        return io.reactivex.rxjava3.core.z.W(new CallableC36032s0(1, this, parametersTree));
    }

    public final PretendResult c(IterableParameters iterableParameters) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z12 = true;
        for (ParameterSlot parameterSlot : iterableParameters) {
            if (parameterSlot instanceof EditableParameter) {
                n1 n1VarA = this.f319399a.a((EditableParameter) parameterSlot, iterableParameters, false);
                if (n1VarA instanceof n1.a.b) {
                    linkedHashMap.put(n1VarA.f319402a, new PretendErrorValue.Message(((n1.a.b) n1VarA).f319404c));
                    z12 = false;
                }
            }
        }
        return new PretendResult(z12, linkedHashMap);
    }
}
