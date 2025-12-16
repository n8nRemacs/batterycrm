package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.Metadata;

/* compiled from: SendMessageInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.send.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32237t extends kotlin.jvm.internal.H implements Y41.l<LocalMessage, AbstractC41768a> {
    @Override // Y41.l
    public final AbstractC41768a invoke(LocalMessage localMessage) {
        return ((InterfaceC32024m) this.receiver).E(localMessage);
    }
}
