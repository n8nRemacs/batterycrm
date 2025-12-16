package com.avito.android.remote.model.category_parameters.slot.edit_category;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithoutState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EditCategorySlot.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0011B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0002\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/edit_category/EditCategorySlot;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/edit_category/EditCategorySlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithoutState;", "Lcom/avito/android/remote/model/category_parameters/base/HasError;", "id", "", "label", "widget", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "error", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "getError", "()Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "setError", "(Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;)V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EditCategorySlot extends Slot<EditCategorySlotConfig> implements SlotWithoutState, HasError {

    @f
    @k
    public static final Parcelable.Creator<EditCategorySlot> CREATOR;

    @l
    private HasError.Error error;

    static {
        EditCategorySlot$Companion$CREATOR$1 editCategorySlot$Companion$CREATOR$1 = EditCategorySlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(editCategorySlot$Companion$CREATOR$1);
    }

    public EditCategorySlot(@k String str, @k String str2, @k SlotWidget<EditCategorySlotConfig> slotWidget) {
        super(str, str2, slotWidget);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void applyPretendResult(@l PretendErrorValue pretendErrorValue) {
        HasError.DefaultImpls.applyPretendResult(this, pretendErrorValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void clearError() {
        HasError.DefaultImpls.clearError(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    public HasError.Error getError() {
        return this.error;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    public AttributedText getErrorMessage() {
        return HasError.DefaultImpls.getErrorMessage((HasError) this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public boolean hasError() {
        return HasError.DefaultImpls.hasError(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public boolean hasErrorMessage() {
        return HasError.DefaultImpls.hasErrorMessage(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return SlotWithoutState.DefaultImpls.initParameters(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        SlotWithoutState.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void setError(@l HasError.Error error) {
        this.error = error;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void setErrorMessage(@l String str) {
        HasError.DefaultImpls.setErrorMessage(this, str);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        SlotWithoutState.DefaultImpls.setValueChangesListener(this, lVar);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    /* renamed from: getErrorMessage */
    public String mo56getErrorMessage() {
        return HasError.DefaultImpls.m57getErrorMessage((HasError) this);
    }
}
