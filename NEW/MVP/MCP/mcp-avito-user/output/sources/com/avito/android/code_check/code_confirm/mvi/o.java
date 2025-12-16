package com.avito.android.code_check.code_confirm.mvi;

import Jo.C14226c;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CodeConfirmReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "LJo/c;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements u<CodeConfirmInternalAction, C14226c> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C14226c a(CodeConfirmInternalAction codeConfirmInternalAction, C14226c c14226c) {
        CodeConfirmInternalAction codeConfirmInternalAction2 = codeConfirmInternalAction;
        C14226c c14226c2 = c14226c;
        if (codeConfirmInternalAction2.equals(CodeConfirmInternalAction.ClearValidationError.f118713b)) {
            boolean z12 = c14226c2.f9149c;
            c14226c2.getClass();
            return new C14226c(null, z12);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.CodeConfirming) {
            return new C14226c(null, true);
        }
        if (codeConfirmInternalAction2.equals(CodeConfirmInternalAction.LocalCodeValidationError.f118716b)) {
            return new C14226c(com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0]), false);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.ServerCodeValidationError) {
            return new C14226c(((CodeConfirmInternalAction.ServerCodeValidationError) codeConfirmInternalAction2).f118719b, false);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.Navigate ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.ShowToastMessage ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.ShowUserDialog ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.Confirmed ? true : codeConfirmInternalAction2.equals(CodeConfirmInternalAction.RequestFocus.f118718b) ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.UnknownError) {
            PrintableText printableText = c14226c2.f9148b;
            c14226c2.getClass();
            return new C14226c(printableText, false);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.TrackContent ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.SetCode ? true : codeConfirmInternalAction2.equals(CodeConfirmInternalAction.DisableAutofill.f118715b)) {
            return c14226c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
