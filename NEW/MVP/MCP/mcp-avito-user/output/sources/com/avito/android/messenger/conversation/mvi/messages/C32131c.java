package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "apply", "(I)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32131c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.a f192163c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c f192164d;

    public C32131c(InterfaceC32129a.c cVar, C32141e.a aVar, C32141e c32141e) {
        this.f192162b = c32141e;
        this.f192163c = aVar;
        this.f192164d = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).intValue();
        C32141e.a aVar = this.f192163c;
        MessengerUserHashInfo messengerUserHashInfo = aVar.f192917d;
        C32141e c32141e = this.f192162b;
        return c32141e.f192902V.x(c32141e.f192907a0, messengerUserHashInfo).r(new C32130b(this.f192164d, aVar, c32141e));
    }
}
