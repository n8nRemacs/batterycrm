package com.avito.android.mortgage_invite.client_form.mvi;

import U10.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.error.z;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApplicationClientFormOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "LU10/b;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements t<ApplicationClientFormInternalAction, U10.b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final U10.b b(ApplicationClientFormInternalAction applicationClientFormInternalAction) {
        ApplicationClientFormInternalAction applicationClientFormInternalAction2 = applicationClientFormInternalAction;
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.HandleDeeplink) {
            ApplicationClientFormInternalAction.HandleDeeplink handleDeeplink = (ApplicationClientFormInternalAction.HandleDeeplink) applicationClientFormInternalAction2;
            return new b.a(handleDeeplink.f205243b, handleDeeplink.f205244c);
        }
        if (applicationClientFormInternalAction2.equals(ApplicationClientFormInternalAction.ActionLoadingStarted.f205231b)) {
            return b.C1092b.f16102a;
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.ActionLoadingError) {
            return new b.f(com.avito.android.printable_text.b.f(z.k(((ApplicationClientFormInternalAction.ActionLoadingError) applicationClientFormInternalAction2).f205230b)));
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.OpenClientSearch) {
            return new b.c(((ApplicationClientFormInternalAction.OpenClientSearch) applicationClientFormInternalAction2).f205245b);
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.PhoneConfirmationRequired) {
            return new b.d(((ApplicationClientFormInternalAction.PhoneConfirmationRequired) applicationClientFormInternalAction2).f205246b);
        }
        if (applicationClientFormInternalAction2 instanceof ApplicationClientFormInternalAction.ScrollToItem) {
            return new b.e(((ApplicationClientFormInternalAction.ScrollToItem) applicationClientFormInternalAction2).f205248b);
        }
        return null;
    }
}
