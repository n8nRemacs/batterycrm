package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.voice.A;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: VoiceMessageClickInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/A$a$a;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/persistence/messenger/Q1;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/voice/A$a$a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f195038b;

    public D(E e12) {
        this.f195038b = e12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        A.a.C5762a c5762a = (A.a.C5762a) obj;
        E e12 = this.f195038b;
        InterfaceC32024m interfaceC32024m = e12.f195045b0;
        LocalMessage localMessage = c5762a.f195032a;
        return com.avito.android.util.rx3.arrow.b.a(interfaceC32024m.p(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage))).B0(B.f195035b).K(new C(e12, c5762a));
    }
}
