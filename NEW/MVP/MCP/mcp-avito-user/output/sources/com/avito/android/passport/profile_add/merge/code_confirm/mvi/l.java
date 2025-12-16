package com.avito.android.passport.profile_add.merge.code_confirm.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity.CodeConfirmInternalAction;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CodeConfirmReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lb60/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements u<CodeConfirmInternalAction, b60.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f212771b;

    @Inject
    public l(@N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f212771b = interfaceC35945t1;
    }

    @Override // com.avito.android.arch.mvi.u
    public final b60.c a(CodeConfirmInternalAction codeConfirmInternalAction, b60.c cVar) {
        CodeConfirmInternalAction codeConfirmInternalAction2 = codeConfirmInternalAction;
        b60.c cVar2 = cVar;
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.SetPhoneNumber) {
            return b60.c.a(cVar2, this.f212771b.a(((CodeConfirmInternalAction.SetPhoneNumber) codeConfirmInternalAction2).f212754b), null, false, 6);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.ClearValidationError) {
            return b60.c.a(cVar2, null, null, false, 5);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.CodeConfirming) {
            return b60.c.a(cVar2, null, null, true, 3);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.LocalCodeValidationError) {
            return b60.c.a(cVar2, null, com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0]), false, 5);
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.BackCodeValidationError) {
            String str = ((CodeConfirmInternalAction.BackCodeValidationError) codeConfirmInternalAction2).f212747b;
            return b60.c.a(cVar2, null, str != null ? com.avito.android.printable_text.b.f(str) : null, false, 1);
        }
        if (codeConfirmInternalAction2.equals(CodeConfirmInternalAction.CodeConfirmed.f212749b) ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.UnknownError ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.OpenDeepLink ? true : codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.UnknownServerError) {
            return b60.c.a(cVar2, null, null, false, 3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
