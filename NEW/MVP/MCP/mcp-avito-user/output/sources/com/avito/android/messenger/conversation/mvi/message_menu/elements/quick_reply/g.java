package com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: QuickReplyTextProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/quick_reply/g;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/quick_reply/f;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements f {
    @Inject
    public g() {
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.f
    @l
    public final String a(@k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        if (dVar.getF191619c()) {
            com.avito.android.messenger.conversation.mvi.message_menu.h f191618b = dVar.getF191618b();
            if (L.f(f191618b.f191746a.f430682d, f191618b.f191749d)) {
                if (dVar instanceof d.h) {
                    return ((d.h) dVar).f191607c;
                }
                if (dVar instanceof d.g) {
                    return ((d.g) dVar).f191601c;
                }
                if (dVar instanceof d.C5661d ? true : dVar instanceof d.e ? true : dVar instanceof d.c ? true : dVar instanceof d.b ? true : dVar instanceof d.f ? true : dVar instanceof d.a ? true : dVar instanceof d.i ? true : dVar instanceof d.j) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
