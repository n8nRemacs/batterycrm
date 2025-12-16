package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.c f192064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c.C5680c f192067f;

    public I(C32141e c32141e, C32141e.c cVar, int i12, int i13, InterfaceC32129a.c.C5680c c5680c) {
        this.f192063b = c32141e;
        this.f192064c = cVar;
        this.f192065d = i12;
        this.f192066e = i13;
        this.f192067f = c5680c;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32141e c32141e = this.f192063b;
        c32141e.f192916j0.accept((Throwable) obj);
        C32141e.c cVar = this.f192064c;
        MessengerUserHashInfo messengerUserHashInfo = cVar.f192929d;
        return c32141e.f192902V.x(c32141e.f192907a0, messengerUserHashInfo).r(new H(c32141e, cVar, this.f192065d, this.f192066e, this.f192067f));
    }
}
