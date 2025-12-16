package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.sync.K;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/K$c;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/sync/K$c;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.c f192038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c.C5680c f192039d;

    public C(C32141e c32141e, C32141e.c cVar, InterfaceC32129a.c.C5680c c5680c) {
        this.f192037b = c32141e;
        this.f192038c = cVar;
        this.f192039d = c5680c;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        K.c cVar = (K.c) obj;
        C32141e.c cVar2 = this.f192038c;
        MessengerUserHashInfo messengerUserHashInfo = cVar2.f192929d;
        C32141e c32141e = this.f192037b;
        return c32141e.f192902V.x(c32141e.f192907a0, messengerUserHashInfo).r(new B(this.f192039d, c32141e, cVar.f194605a, cVar.f194606b, cVar2));
    }
}
