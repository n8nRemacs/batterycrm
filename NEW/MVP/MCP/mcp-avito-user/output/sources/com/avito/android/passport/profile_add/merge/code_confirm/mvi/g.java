package com.avito.android.passport.profile_add.merge.code_confirm.mvi;

import androidx.compose.runtime.internal.P;
import b60.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity.CodeConfirmInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CodeConfirmEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lb60/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements t<CodeConfirmInternalAction, b60.b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final b60.b b(CodeConfirmInternalAction codeConfirmInternalAction) {
        b.a aVar;
        CodeConfirmInternalAction codeConfirmInternalAction2 = codeConfirmInternalAction;
        if (codeConfirmInternalAction2.equals(CodeConfirmInternalAction.CodeConfirmed.f212749b)) {
            return b.C1992b.f56914a;
        }
        if (codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.UnknownError) {
            aVar = new b.a(null, null, ((CodeConfirmInternalAction.UnknownError) codeConfirmInternalAction2).f212755b, 3, null);
        } else {
            if (!(codeConfirmInternalAction2 instanceof CodeConfirmInternalAction.UnknownServerError)) {
                return null;
            }
            CodeConfirmInternalAction.UnknownServerError unknownServerError = (CodeConfirmInternalAction.UnknownServerError) codeConfirmInternalAction2;
            aVar = new b.a(unknownServerError.f212757b.getMessage(), unknownServerError.f212757b, null, 4, null);
        }
        return aVar;
    }
}
