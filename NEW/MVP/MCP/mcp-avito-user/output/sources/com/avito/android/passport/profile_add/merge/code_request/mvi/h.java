package com.avito.android.passport.profile_add.merge.code_request.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CodeRequestReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "Lc60/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements u<CodeRequestInternalAction, c60.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final c60.c a(CodeRequestInternalAction codeRequestInternalAction, c60.c cVar) {
        CodeRequestInternalAction codeRequestInternalAction2 = codeRequestInternalAction;
        c60.c cVar2 = cVar;
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.ClearValidationError) {
            return c60.c.a(cVar2, false, false, false, null, null, 0L, 47);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.EmptyPhoneValidationError) {
            return c60.c.a(cVar2, false, false, false, null, com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0]), 0L, 47);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.CodeRequesting) {
            return c60.c.a(cVar2, false, false, true, null, null, 0L, 43);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.CodeRequested) {
            return c60.c.a(cVar2, false, false, false, null, null, ((CodeRequestInternalAction.CodeRequested) codeRequestInternalAction2).f212873c, 11);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.RemotePhoneValidationError) {
            String str = ((CodeRequestInternalAction.RemotePhoneValidationError) codeRequestInternalAction2).f212879b;
            return c60.c.a(cVar2, false, false, false, null, str != null ? com.avito.android.printable_text.b.f(str) : null, 0L, 43);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.UnknownServerError ? true : codeRequestInternalAction2 instanceof CodeRequestInternalAction.UnknownError ? true : codeRequestInternalAction2 instanceof CodeRequestInternalAction.DeepLinkAction) {
            return c60.c.a(cVar2, false, false, false, null, null, 0L, 43);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.Loading) {
            return c60.c.a(cVar2, false, true, false, null, null, 0L, 60);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.ContentError) {
            return c60.c.a(cVar2, true, false, false, null, null, 0L, 62);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.ShowContent) {
            return c60.c.a(cVar2, false, false, false, ((CodeRequestInternalAction.ShowContent) codeRequestInternalAction2).f212880b, null, 0L, 52);
        }
        throw new NoWhenBranchMatchedException();
    }
}
