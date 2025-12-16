package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.c f192045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c.C5680c f192046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C32141e.c.a f192047e;

    public E(InterfaceC32129a.c.C5680c c5680c, C32141e.c.a aVar, C32141e.c cVar, C32141e c32141e) {
        this.f192044b = c32141e;
        this.f192045c = cVar;
        this.f192046d = c5680c;
        this.f192047e = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32141e c32141e = this.f192044b;
        c32141e.f192916j0.accept((Throwable) obj);
        C32141e.c cVar = this.f192045c;
        MessengerUserHashInfo messengerUserHashInfo = cVar.f192929d;
        return c32141e.f192902V.x(c32141e.f192907a0, messengerUserHashInfo).r(new D(this.f192046d, this.f192047e, cVar, c32141e));
    }
}
