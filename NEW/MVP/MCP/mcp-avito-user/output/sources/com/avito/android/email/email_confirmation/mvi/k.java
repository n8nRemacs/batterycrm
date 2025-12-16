package com.avito.android.email.email_confirmation.mvi;

import Ey.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EmailConfirmationReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/email/email_confirmation/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction;", "LEy/c;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements u<EmailConfirmationInternalAction, Ey.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ey.c a(EmailConfirmationInternalAction emailConfirmationInternalAction, Ey.c cVar) {
        EmailConfirmationInternalAction emailConfirmationInternalAction2 = emailConfirmationInternalAction;
        if (emailConfirmationInternalAction2 instanceof EmailConfirmationInternalAction.ConfirmationStarted) {
            return new Ey.c(c.b.C0268c.f4438a);
        }
        if (emailConfirmationInternalAction2 instanceof EmailConfirmationInternalAction.ConfirmationSuccessfullyFinished) {
            return new Ey.c(c.b.a.f4436a);
        }
        if (emailConfirmationInternalAction2 instanceof EmailConfirmationInternalAction.ConfirmationFailed) {
            return new Ey.c(c.b.C0267b.f4437a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
