package com.avito.android.multi_message_send.mvi;

import G20.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MultiMessageSendOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "LG20/c;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements com.avito.android.arch.mvi.t<MultiMessageSendInternalAction, G20.c> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final G20.c b(MultiMessageSendInternalAction multiMessageSendInternalAction) {
        MultiMessageSendInternalAction multiMessageSendInternalAction2 = multiMessageSendInternalAction;
        if (multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.ItemClicked) {
            if (((MultiMessageSendInternalAction.ItemClicked) multiMessageSendInternalAction2).f206759c) {
                return c.d.f6243a;
            }
            return null;
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.OnCloseClicked.f206763b)) {
            return c.a.f6240a;
        }
        if (multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.OnAnchorClicked) {
            return new c.C0330c(((MultiMessageSendInternalAction.OnAnchorClicked) multiMessageSendInternalAction2).f206762b);
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.SendSuccess.f206769b)) {
            return new c.b(false);
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.UserOnCooldown.f206770b)) {
            return new c.b(true);
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.SendError.f206768b)) {
            return c.f.f6245a;
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.ItemsForSendingNotChosen.f206760b)) {
            return c.e.f6244a;
        }
        return null;
    }
}
