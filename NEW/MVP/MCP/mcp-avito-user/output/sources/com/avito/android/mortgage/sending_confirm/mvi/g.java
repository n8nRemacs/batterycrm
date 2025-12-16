package com.avito.android.mortgage.sending_confirm.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import m10.InterfaceC43860b;

/* compiled from: SendingConfirmOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lm10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements t<SendingConfirmInternalAction, InterfaceC43860b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43860b b(SendingConfirmInternalAction sendingConfirmInternalAction) {
        SendingConfirmInternalAction sendingConfirmInternalAction2 = sendingConfirmInternalAction;
        if (sendingConfirmInternalAction2 instanceof SendingConfirmInternalAction.LegalSendingFailed) {
            return new InterfaceC43860b.C11813b(((SendingConfirmInternalAction.LegalSendingFailed) sendingConfirmInternalAction2).f203574b);
        }
        if (sendingConfirmInternalAction2 instanceof SendingConfirmInternalAction.LegalSendingCompleted) {
            return InterfaceC43860b.a.f414259a;
        }
        return null;
    }
}
