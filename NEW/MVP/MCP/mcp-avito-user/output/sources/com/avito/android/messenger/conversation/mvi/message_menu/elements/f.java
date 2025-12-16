package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: LinkHintElementProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/f;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.messenger.conversation.mvi.message_menu.c {
    @Inject
    public f() {
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        String str;
        if (dVar instanceof d.c) {
            str = ((d.c) dVar).f191578d;
        } else if (dVar instanceof d.C5661d) {
            str = ((d.C5661d) dVar).f191584c;
        } else if (dVar instanceof d.e) {
            str = ((d.e) dVar).f191590c;
        } else {
            if (!(dVar instanceof d.b ? true : dVar instanceof d.f ? true : dVar instanceof d.h ? true : dVar instanceof d.g ? true : dVar instanceof d.a ? true : dVar instanceof d.i ? true : dVar instanceof d.j)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (str != null) {
            return new AbstractC32118b.c(H.k(".(?!$)", str, "$0\u200b"));
        }
        return null;
    }
}
