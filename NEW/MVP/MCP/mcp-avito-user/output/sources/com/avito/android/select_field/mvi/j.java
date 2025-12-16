package com.avito.android.select_field.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.select_field.mvi.entity.SelectFieldInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import sq0.C48401c;

/* compiled from: SelectFieldReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select_field/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "Lsq0/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements u<SelectFieldInternalAction, C48401c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C48401c a(SelectFieldInternalAction selectFieldInternalAction, C48401c c48401c) {
        SelectFieldInternalAction selectFieldInternalAction2 = selectFieldInternalAction;
        C48401c c48401c2 = c48401c;
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.Error) {
            return C48401c.a(c48401c2, null, false, 3);
        }
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.IncorrectValuesError) {
            return C48401c.a(c48401c2, null, false, 3);
        }
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.Loading) {
            return C48401c.a(c48401c2, null, true, 3);
        }
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.OpenSelector) {
            return c48401c2;
        }
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.SelectItem) {
            return C48401c.a(c48401c2, ((SelectFieldInternalAction.SelectItem) selectFieldInternalAction2).f267200b, false, 6);
        }
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.SubmitSuccess) {
            return C48401c.a(c48401c2, null, false, 3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
