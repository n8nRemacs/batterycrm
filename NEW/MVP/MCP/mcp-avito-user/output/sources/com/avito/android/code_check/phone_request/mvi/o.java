package com.avito.android.code_check.phone_request.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.code_check.phone_request.mvi.entity.PhoneRequestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PhoneRequestReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "LRo/c;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements u<PhoneRequestInternalAction, Ro.c> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ro.c a(PhoneRequestInternalAction phoneRequestInternalAction, Ro.c cVar) {
        PhoneRequestInternalAction phoneRequestInternalAction2 = phoneRequestInternalAction;
        Ro.c cVar2 = cVar;
        if (phoneRequestInternalAction2.equals(PhoneRequestInternalAction.ClearValidationError.f119111b)) {
            return Ro.c.a(cVar2, false, null, 5);
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.PhoneRequesting) {
            return Ro.c.a(cVar2, true, null, 4);
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.PhoneValidationError) {
            return Ro.c.a(cVar2, false, ((PhoneRequestInternalAction.PhoneValidationError) phoneRequestInternalAction2).f119113b, 4);
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.SetPhone) {
            return cVar2;
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.UnknownError ? true : phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.ToastMessage ? true : phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.Navigate ? true : phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.ShowUserDialog ? true : phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.Requested) {
            return Ro.c.a(cVar2, false, null, 6);
        }
        throw new NoWhenBranchMatchedException();
    }
}
