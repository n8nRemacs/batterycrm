package com.avito.android.legal_request.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.legal_request.mvi.entity.LegalRequestInternalAction;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import sR.InterfaceC48099b;

/* compiled from: LegalRequestOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/legal_request/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "LsR/b;", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements t<LegalRequestInternalAction, InterfaceC48099b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48099b b(LegalRequestInternalAction legalRequestInternalAction) {
        LegalRequestInternalAction legalRequestInternalAction2 = legalRequestInternalAction;
        if (legalRequestInternalAction2 instanceof LegalRequestInternalAction.HandleBeduinAction) {
            return new InterfaceC48099b.a(((LegalRequestInternalAction.HandleBeduinAction) legalRequestInternalAction2).f175270b);
        }
        if (legalRequestInternalAction2 instanceof LegalRequestInternalAction.HandleBeduinEvent) {
            BeduinOneTimeEvent beduinOneTimeEvent = ((LegalRequestInternalAction.HandleBeduinEvent) legalRequestInternalAction2).f175271b;
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar) {
                return new InterfaceC48099b.g((BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent);
            }
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.b) {
                return new InterfaceC48099b.c(((BeduinOneTimeEvent.b) beduinOneTimeEvent).f176281a);
            }
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                return new InterfaceC48099b.C12617b(((BeduinOneTimeEvent.a) beduinOneTimeEvent).f176280a);
            }
            if (!(beduinOneTimeEvent instanceof BeduinOneTimeEvent.d) && !(beduinOneTimeEvent instanceof BeduinOneTimeEvent.c)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
