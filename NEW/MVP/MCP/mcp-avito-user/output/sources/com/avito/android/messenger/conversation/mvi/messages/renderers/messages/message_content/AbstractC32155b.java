package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.Metadata;

/* compiled from: AbstractMessageFromAvitoContentRenderer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC32155b {
    @InterfaceC22132o
    @InterfaceC22181t
    public void a(@Y61.k T1.d dVar, @Y61.k Y41.l lVar, @Y61.k v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1748797899);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(dVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.f.a(com.avito.android.messenger.conversation.mvi.messages.utils.i.a(dVar), null, null, bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32154a(this, dVar, lVar, aVar, i12);
        }
    }

    @Y61.l
    public Y41.a b(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return null;
    }
}
