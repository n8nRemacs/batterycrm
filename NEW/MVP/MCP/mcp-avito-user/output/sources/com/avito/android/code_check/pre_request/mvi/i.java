package com.avito.android.code_check.pre_request.mvi;

import So.InterfaceC15208a;
import com.avito.android.arch.mvi.t;
import com.avito.android.code_check.pre_request.mvi.entity.PreRequestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PreRequestOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "LSo/a;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements t<PreRequestInternalAction, InterfaceC15208a> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15208a b(PreRequestInternalAction preRequestInternalAction) {
        PreRequestInternalAction preRequestInternalAction2 = preRequestInternalAction;
        if (preRequestInternalAction2 instanceof PreRequestInternalAction.Navigate) {
            return new InterfaceC15208a.c(((PreRequestInternalAction.Navigate) preRequestInternalAction2).f119208b);
        }
        if (preRequestInternalAction2 instanceof PreRequestInternalAction.Requested) {
            com.avito.android.code_check_public.a aVar = ((PreRequestInternalAction.Requested) preRequestInternalAction2).f119209b;
            return aVar != null ? new InterfaceC15208a.c(aVar) : InterfaceC15208a.b.f15148a;
        }
        if (preRequestInternalAction2 instanceof PreRequestInternalAction.ShowUserDialog) {
            return new InterfaceC15208a.e(((PreRequestInternalAction.ShowUserDialog) preRequestInternalAction2).f119210b);
        }
        if (preRequestInternalAction2 instanceof PreRequestInternalAction.ToastMessage) {
            ((PreRequestInternalAction.ToastMessage) preRequestInternalAction2).getClass();
            return new InterfaceC15208a.d();
        }
        if (preRequestInternalAction2 instanceof PreRequestInternalAction.UnknownError) {
            PreRequestInternalAction.UnknownError unknownError = (PreRequestInternalAction.UnknownError) preRequestInternalAction2;
            return new InterfaceC15208a.C1034a(unknownError.f119211b, unknownError.f119212c, unknownError.f119213d);
        }
        if (preRequestInternalAction2 instanceof PreRequestInternalAction.Loading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
