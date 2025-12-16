package com.avito.android.rating_form.step.dialog.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction;
import gh0.InterfaceC40683b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DialogOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "Lgh0/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements t<DialogInternalAction, InterfaceC40683b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40683b b(DialogInternalAction dialogInternalAction) {
        InterfaceC40683b dVar;
        DialogInternalAction dialogInternalAction2 = dialogInternalAction;
        if (dialogInternalAction2.equals(DialogInternalAction.CloseDialog.f249432b)) {
            return InterfaceC40683b.a.f396711a;
        }
        if (dialogInternalAction2 instanceof DialogInternalAction.OpenDeeplink) {
            dVar = new InterfaceC40683b.C11223b(((DialogInternalAction.OpenDeeplink) dialogInternalAction2).f249438b);
        } else if (dialogInternalAction2 instanceof DialogInternalAction.OpenUrl) {
            dVar = new InterfaceC40683b.c(((DialogInternalAction.OpenUrl) dialogInternalAction2).f249439b);
        } else {
            if (!(dialogInternalAction2 instanceof DialogInternalAction.ShowErrorToast)) {
                if (dialogInternalAction2 instanceof DialogInternalAction.StartAuthentication) {
                    return InterfaceC40683b.e.f396715a;
                }
                if (dialogInternalAction2 instanceof DialogInternalAction.Empty ? true : dialogInternalAction2 instanceof DialogInternalAction.Content ? true : dialogInternalAction2.equals(DialogInternalAction.ProceedSendAnyway.f249440b)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            dVar = new InterfaceC40683b.d(((DialogInternalAction.ShowErrorToast) dialogInternalAction2).f249441b);
        }
        return dVar;
    }
}
