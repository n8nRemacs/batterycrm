package com.avito.android.remote.model.category_parameters.base;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditableParameter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0015\u0010\u0007J'\u0010\u0018\u001a\u00020\u00102\u0016\u0010\u0017\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00100\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010\"\u001a\u0004\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0007\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u00100\u001a\u0004\u0018\u00018\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R(\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\u000f\u001a\u0004\u0018\u00018\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010+\"\u0004\b2\u0010-¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "T", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/HasError;", "Lcom/avito/android/remote/model/category_parameters/base/BaseEditableParameter;", "Lcom/avito/android/remote/model/category_parameters/base/ObservableParameter;", "<init>", "()V", "newValue", "", "proceedValue", "(Ljava/lang/Object;)Z", "", "getSelectedParameterTitle", "()Ljava/lang/String;", "value", "Lkotlin/G0;", "setSelectedParameterTitle", "(Ljava/lang/String;)V", "hasValue", "()Z", "onParamChanged", "Lkotlin/Function1;", "listener", "setValueChangesListener", "(LY41/l;)V", "oldValue", "areValuesTheSame", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "valueChangesListener", "LY41/l;", "_selectedParameterTitle", "Ljava/lang/String;", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "error", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "getError", "()Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "setError", "(Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;)V", "getError$annotations", "Ljava/lang/Object;", "getOldValue", "()Ljava/lang/Object;", "setOldValue", "(Ljava/lang/Object;)V", "get_value", "set_value", "_value", "getValue", "setValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class EditableParameter<T> extends CategoryParameter implements HasError, BaseEditableParameter<T>, ObservableParameter {

    @k
    private String _selectedParameterTitle = "";

    @l
    private HasError.Error error;

    @l
    private T oldValue;

    @l
    private Y41.l<? super EditableParameter<?>, G0> valueChangesListener;

    private final boolean proceedValue(T newValue) {
        T t12 = get_value();
        set_value(newValue);
        if (areValuesTheSame(t12, newValue)) {
            return false;
        }
        return t12 != null || hasValue();
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void applyPretendResult(@l PretendErrorValue pretendErrorValue) {
        HasError.DefaultImpls.applyPretendResult(this, pretendErrorValue);
    }

    public boolean areValuesTheSame(@l T oldValue, @l T newValue) {
        return L.f(oldValue, newValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void clearError() {
        HasError.DefaultImpls.clearError(this);
    }

    @l
    public HasError.Error getError() {
        return this.error;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    public AttributedText getErrorMessage() {
        return HasError.DefaultImpls.getErrorMessage((HasError) this);
    }

    @l
    public final T getOldValue() {
        return this.oldValue;
    }

    @k
    /* renamed from: getSelectedParameterTitle, reason: from getter */
    public final String get_selectedParameterTitle() {
        return this._selectedParameterTitle;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public final T getValue() {
        return get_value();
    }

    @l
    public abstract T get_value();

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public boolean hasError() {
        return HasError.DefaultImpls.hasError(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public boolean hasErrorMessage() {
        return HasError.DefaultImpls.hasErrorMessage(this);
    }

    public boolean hasValue() {
        return getValue() != null;
    }

    public final void onParamChanged() {
        Y41.l<? super EditableParameter<?>, G0> lVar = this.valueChangesListener;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    public void setError(@l HasError.Error error) {
        this.error = error;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void setErrorMessage(@l String str) {
        HasError.DefaultImpls.setErrorMessage(this, str);
    }

    public final void setOldValue(@l T t12) {
        this.oldValue = t12;
    }

    public final void setSelectedParameterTitle(@k String value) {
        this._selectedParameterTitle = value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    public final void setValue(@l T t12) {
        if (proceedValue(t12)) {
            onParamChanged();
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> listener) {
        this.valueChangesListener = listener;
    }

    public abstract void set_value(@l T t12);

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    /* renamed from: getErrorMessage */
    public String mo56getErrorMessage() {
        return HasError.DefaultImpls.m57getErrorMessage((HasError) this);
    }

    public static /* synthetic */ void getError$annotations() {
    }
}
