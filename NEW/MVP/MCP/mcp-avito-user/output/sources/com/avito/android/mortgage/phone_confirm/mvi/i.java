package com.avito.android.mortgage.phone_confirm.mvi;

import J00.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneConfirmOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "LJ00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<PhoneConfirmInternalAction, J00.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final J00.b b(PhoneConfirmInternalAction phoneConfirmInternalAction) {
        PhoneConfirmInternalAction phoneConfirmInternalAction2 = phoneConfirmInternalAction;
        if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.ConfirmationFailed) {
            return new b.C0501b(((PhoneConfirmInternalAction.ConfirmationFailed) phoneConfirmInternalAction2).f201641b);
        }
        if (phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.AccessCheckFailed) {
            return new b.C0501b(((PhoneConfirmInternalAction.AccessCheckFailed) phoneConfirmInternalAction2).f201634b);
        }
        if ((phoneConfirmInternalAction2 instanceof PhoneConfirmInternalAction.ConfirmationCompleted) && ((PhoneConfirmInternalAction.ConfirmationCompleted) phoneConfirmInternalAction2).f201639b) {
            return b.a.f8697a;
        }
        return null;
    }
}
