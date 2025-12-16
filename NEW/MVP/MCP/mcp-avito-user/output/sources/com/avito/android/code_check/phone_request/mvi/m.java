package com.avito.android.code_check.phone_request.mvi;

import Ro.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.code_check.phone_request.mvi.entity.PhoneRequestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PhoneRequestOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "LRo/b;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements t<PhoneRequestInternalAction, Ro.b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ro.b b(PhoneRequestInternalAction phoneRequestInternalAction) {
        PhoneRequestInternalAction phoneRequestInternalAction2 = phoneRequestInternalAction;
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.ShowUserDialog) {
            return new b.g(((PhoneRequestInternalAction.ShowUserDialog) phoneRequestInternalAction2).f119116b);
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.ToastMessage) {
            ((PhoneRequestInternalAction.ToastMessage) phoneRequestInternalAction2).getClass();
            return new b.f();
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.UnknownError) {
            PhoneRequestInternalAction.UnknownError unknownError = (PhoneRequestInternalAction.UnknownError) phoneRequestInternalAction2;
            return new b.a(unknownError.f119117b, unknownError.f119118c, unknownError.f119119d);
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.Navigate) {
            return new b.c(((PhoneRequestInternalAction.Navigate) phoneRequestInternalAction2).f119112b);
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.Requested) {
            com.avito.android.code_check_public.a aVar = ((PhoneRequestInternalAction.Requested) phoneRequestInternalAction2).f119114b;
            return aVar != null ? new b.c(aVar) : b.C0979b.f14626a;
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.PhoneValidationError) {
            return new b.d(((PhoneRequestInternalAction.PhoneValidationError) phoneRequestInternalAction2).f119113b);
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.SetPhone) {
            return new b.e(((PhoneRequestInternalAction.SetPhone) phoneRequestInternalAction2).f119115b);
        }
        if (phoneRequestInternalAction2 instanceof PhoneRequestInternalAction.PhoneRequesting ? true : phoneRequestInternalAction2.equals(PhoneRequestInternalAction.ClearValidationError.f119111b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
