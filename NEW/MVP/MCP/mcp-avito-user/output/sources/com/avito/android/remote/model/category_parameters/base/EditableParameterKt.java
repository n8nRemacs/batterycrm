package com.avito.android.remote.model.category_parameters.base;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: EditableParameter.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aE\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\n\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"T", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "newValue", "Lkotlin/Function1;", "parser", "Lkotlin/G0;", "applyParsedValue", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;Ljava/lang/String;LY41/l;)V", "value", "applyValue", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;Ljava/lang/Object;)V", "applyPureValue", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class EditableParameterKt {
    public static final <T> void applyParsedValue(@k EditableParameter<T> editableParameter, @l String str, @k Y41.l<? super String, ? extends T> lVar) {
        if (str == null || str.length() == 0) {
            if (L.f(editableParameter.getValue(), null)) {
                return;
            }
            editableParameter.setValue(null);
            editableParameter.setError(null);
            return;
        }
        try {
            T tInvoke = lVar.invoke(str);
            if (L.f(editableParameter.getValue(), tInvoke)) {
                return;
            }
            editableParameter.setValue(tInvoke);
            editableParameter.setError(null);
        } catch (NumberFormatException unused) {
        }
    }

    public static final <T> void applyPureValue(@k EditableParameter<T> editableParameter, @l T t12) {
        if (L.f(editableParameter.get_value(), t12)) {
            return;
        }
        editableParameter.set_value(t12);
        editableParameter.setError(null);
    }

    public static final <T> void applyValue(@k EditableParameter<T> editableParameter, @l T t12) {
        if (L.f(editableParameter.getValue(), t12)) {
            return;
        }
        editableParameter.setValue(t12);
        editableParameter.setError(null);
    }
}
