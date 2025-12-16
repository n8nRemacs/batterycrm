package com.avito.android.safedeal.delivery.order_cancellation.details.mvi;

import Dn0.InterfaceC13422b;
import com.avito.android.arch.mvi.t;
import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.entity.ReasonDetailsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReasonDetailsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "LDn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements t<ReasonDetailsInternalAction, InterfaceC13422b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13422b b(ReasonDetailsInternalAction reasonDetailsInternalAction) {
        ReasonDetailsInternalAction reasonDetailsInternalAction2 = reasonDetailsInternalAction;
        if (reasonDetailsInternalAction2 instanceof ReasonDetailsInternalAction.CloseScreen) {
            return InterfaceC13422b.a.f3441a;
        }
        if (reasonDetailsInternalAction2 instanceof ReasonDetailsInternalAction.ShowSnackbarError) {
            ReasonDetailsInternalAction.ShowSnackbarError showSnackbarError = (ReasonDetailsInternalAction.ShowSnackbarError) reasonDetailsInternalAction2;
            return new InterfaceC13422b.c(showSnackbarError.f256254b, showSnackbarError.f256255c);
        }
        if (reasonDetailsInternalAction2 instanceof ReasonDetailsInternalAction.OpenFbsScreen) {
            return InterfaceC13422b.C0192b.f3442a;
        }
        return null;
    }
}
