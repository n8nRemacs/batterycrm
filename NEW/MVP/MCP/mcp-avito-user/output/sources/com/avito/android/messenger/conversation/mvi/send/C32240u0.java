package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessagePresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "interactorState", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.u0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32240u0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C32240u0<T, R> f194558b = new C32240u0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
        com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
        b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
        Channel channel = dVar != null ? dVar.f207035a : (T) null;
        String channelId = channel != null ? channel.getChannelId() : null;
        MessengerUserHashInfo messengerUserHashInfo = c5631a.f190236a;
        return (C43066x.K(messengerUserHashInfo.f430682d) || channelId == null || C43066x.K(channelId)) ? io.reactivex.rxjava3.internal.operators.observable.U.f403867b : io.reactivex.rxjava3.core.z.c0(new kotlin.Q(messengerUserHashInfo, channelId));
    }
}
