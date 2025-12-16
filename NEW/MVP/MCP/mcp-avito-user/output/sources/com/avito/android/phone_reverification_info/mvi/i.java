package com.avito.android.phone_reverification_info.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import y70.InterfaceC50077b;

/* compiled from: PhoneReverificationInfoOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "Ly70/b;", "<init>", "()V", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<PhoneReverificationInfoInternalAction, InterfaceC50077b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50077b b(PhoneReverificationInfoInternalAction phoneReverificationInfoInternalAction) {
        PhoneReverificationInfoInternalAction phoneReverificationInfoInternalAction2 = phoneReverificationInfoInternalAction;
        if (phoneReverificationInfoInternalAction2.equals(PhoneReverificationInfoInternalAction.FinishWithCancel.f216162b)) {
            return InterfaceC50077b.a.f442945a;
        }
        if (!(phoneReverificationInfoInternalAction2 instanceof PhoneReverificationInfoInternalAction.InitialContent)) {
            if (phoneReverificationInfoInternalAction2.equals(PhoneReverificationInfoInternalAction.FinishWithRouteToProfile.f216163b)) {
                return InterfaceC50077b.C12888b.f442946a;
            }
            if (phoneReverificationInfoInternalAction2 instanceof PhoneReverificationInfoInternalAction.FinishWithSuccess) {
                return new InterfaceC50077b.c(((PhoneReverificationInfoInternalAction.FinishWithSuccess) phoneReverificationInfoInternalAction2).f216164b);
            }
            if (!phoneReverificationInfoInternalAction2.equals(PhoneReverificationInfoInternalAction.LogoutLoading.f216167b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
