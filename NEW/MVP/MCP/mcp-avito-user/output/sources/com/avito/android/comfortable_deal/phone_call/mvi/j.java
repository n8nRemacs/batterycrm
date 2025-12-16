package com.avito.android.comfortable_deal.phone_call.mvi;

import Zp.InterfaceC19584b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneCallOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "LZp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<PhoneCallInternalAction, InterfaceC19584b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC19584b b(PhoneCallInternalAction phoneCallInternalAction) {
        PhoneCallInternalAction phoneCallInternalAction2 = phoneCallInternalAction;
        if (phoneCallInternalAction2 instanceof PhoneCallInternalAction.OpenCallScreen) {
            return new InterfaceC19584b.a(((PhoneCallInternalAction.OpenCallScreen) phoneCallInternalAction2).f122499b);
        }
        return null;
    }
}
