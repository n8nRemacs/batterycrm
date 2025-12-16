package com.avito.android.email.email_update.mvi;

import Fy.InterfaceC13854b;
import com.avito.android.arch.mvi.t;
import com.avito.android.email.email_update.mvi.entity.EmailUpdateInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EmailUpdateOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/email/email_update/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "LFy/b;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements t<EmailUpdateInternalAction, InterfaceC13854b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13854b b(EmailUpdateInternalAction emailUpdateInternalAction) {
        EmailUpdateInternalAction emailUpdateInternalAction2 = emailUpdateInternalAction;
        if (emailUpdateInternalAction2 instanceof EmailUpdateInternalAction.EmailUpdateFailed) {
            return new InterfaceC13854b.a(((EmailUpdateInternalAction.EmailUpdateFailed) emailUpdateInternalAction2).f147225b);
        }
        return null;
    }
}
