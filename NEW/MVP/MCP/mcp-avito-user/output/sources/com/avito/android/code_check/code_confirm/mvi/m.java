package com.avito.android.code_check.code_confirm.mvi;

import Jo.InterfaceC14225b;
import com.avito.android.arch.mvi.t;
import com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CodeConfirmOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "LJo/b;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements t<CodeConfirmInternalAction, InterfaceC14225b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14225b b(CodeConfirmInternalAction codeConfirmInternalAction) {
        CodeConfirmInternalAction codeConfirmInternalAction2 = codeConfirmInternalAction;
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.Confirmed) {
            return new InterfaceC14225b.c(((CodeConfirmInternalAction.Confirmed) codeConfirmInternalAction2).f118714b);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.SetCode) {
            return new InterfaceC14225b.f(((CodeConfirmInternalAction.SetCode) codeConfirmInternalAction2).f118720b);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.Navigate) {
            return new InterfaceC14225b.e(((CodeConfirmInternalAction.Navigate) codeConfirmInternalAction2).f118717b);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.ShowToastMessage) {
            return new InterfaceC14225b.g(((CodeConfirmInternalAction.ShowToastMessage) codeConfirmInternalAction2).f118721b);
        }
        if (codeConfirmInternalAction2.equals(CodeConfirmInternalAction.DisableAutofill.f118715b)) {
            return InterfaceC14225b.a.f9138a;
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.ShowUserDialog) {
            return new InterfaceC14225b.h(((CodeConfirmInternalAction.ShowUserDialog) codeConfirmInternalAction2).f118722b);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.ServerCodeValidationError ? true : codeConfirmInternalAction2.equals(CodeConfirmInternalAction.RequestFocus.f118718b) ? true : codeConfirmInternalAction2.equals(CodeConfirmInternalAction.LocalCodeValidationError.f118716b)) {
            return InterfaceC14225b.d.f9143a;
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.UnknownError) {
            return new InterfaceC14225b.C0542b(((CodeConfirmInternalAction.UnknownError) codeConfirmInternalAction2).f118723b, null, null, 6, null);
        }
        if (codeConfirmInternalAction2.equals(CodeConfirmInternalAction.ClearValidationError.f118713b) ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.TrackContent ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.CodeConfirming) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
