package com.avito.android.phone_reverification_info.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PhoneReverificationInfoReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "Ly70/c;", "<init>", "()V", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<PhoneReverificationInfoInternalAction, y70.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final y70.c a(PhoneReverificationInfoInternalAction phoneReverificationInfoInternalAction, y70.c cVar) {
        PhoneReverificationInfoInternalAction phoneReverificationInfoInternalAction2 = phoneReverificationInfoInternalAction;
        y70.c cVar2 = cVar;
        if (phoneReverificationInfoInternalAction2.equals(PhoneReverificationInfoInternalAction.FinishWithCancel.f216162b) || (phoneReverificationInfoInternalAction2 instanceof PhoneReverificationInfoInternalAction.FinishWithSuccess)) {
            return cVar2;
        }
        if (phoneReverificationInfoInternalAction2 instanceof PhoneReverificationInfoInternalAction.InitialContent) {
            PhoneReverificationInfoInternalAction.InitialContent initialContent = (PhoneReverificationInfoInternalAction.InitialContent) phoneReverificationInfoInternalAction2;
            return new y70.c(initialContent.f216166c, initialContent.f216165b, false);
        }
        if (phoneReverificationInfoInternalAction2.equals(PhoneReverificationInfoInternalAction.FinishWithRouteToProfile.f216163b)) {
            return y70.c.a(cVar2, false);
        }
        if (phoneReverificationInfoInternalAction2.equals(PhoneReverificationInfoInternalAction.LogoutLoading.f216167b)) {
            return y70.c.a(cVar2, true);
        }
        throw new NoWhenBranchMatchedException();
    }
}
