package com.avito.android.edit_count_field.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.edit_count_field.mvi.entity.EditCountFieldInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import uy.C49127c;

/* compiled from: EditCountFieldReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "Luy/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<EditCountFieldInternalAction, C49127c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49127c a(EditCountFieldInternalAction editCountFieldInternalAction, C49127c c49127c) {
        EditCountFieldInternalAction editCountFieldInternalAction2 = editCountFieldInternalAction;
        C49127c c49127c2 = c49127c;
        if (editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.Error) {
            return C49127c.a(c49127c2, null, null, false, false, 47);
        }
        if (editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.IncorrectValuesError) {
            return C49127c.a(c49127c2, null, null, false, false, 47);
        }
        if (editCountFieldInternalAction2.equals(EditCountFieldInternalAction.Loading.f146644b)) {
            return C49127c.a(c49127c2, null, null, true, false, 47);
        }
        if (editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.SubmitSuccess) {
            return C49127c.a(c49127c2, null, null, false, false, 47);
        }
        if (editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.SetButtonEnabled) {
            return C49127c.a(c49127c2, null, null, false, ((EditCountFieldInternalAction.SetButtonEnabled) editCountFieldInternalAction2).f146645b, 31);
        }
        if (!(editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.SetCount)) {
            if (editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.SetValidationText) {
                return C49127c.a(c49127c2, null, ((EditCountFieldInternalAction.SetValidationText) editCountFieldInternalAction2).f146647b, false, false, 55);
            }
            throw new NoWhenBranchMatchedException();
        }
        Integer num = ((EditCountFieldInternalAction.SetCount) editCountFieldInternalAction2).f146646b;
        String string = num != null ? num.toString() : null;
        if (string == null) {
            string = "";
        }
        return C49127c.a(c49127c2, string, null, false, false, 62);
    }
}
