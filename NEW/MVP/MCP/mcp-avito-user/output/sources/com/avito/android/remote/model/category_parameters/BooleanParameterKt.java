package com.avito.android.remote.model.category_parameters;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: BooleanParameter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "", "value", "Lkotlin/G0;", "applyFormValue", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Ljava/lang/String;)V", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class BooleanParameterKt {
    public static final void applyFormValue(@k BooleanParameter booleanParameter, @l String str) {
        Boolean boolValueOf;
        if (str != null) {
            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(str) || str.equals("1"));
        } else {
            boolValueOf = null;
        }
        if (L.f(booleanParameter.getValue(), boolValueOf)) {
            return;
        }
        booleanParameter.setValue(boolValueOf);
        booleanParameter.setError(null);
    }
}
