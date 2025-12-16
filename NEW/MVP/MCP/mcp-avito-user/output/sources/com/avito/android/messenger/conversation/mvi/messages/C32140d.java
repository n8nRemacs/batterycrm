package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32140d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c f192884c;

    public C32140d(C32141e c32141e, InterfaceC32129a.c cVar) {
        this.f192883b = c32141e;
        this.f192884c = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        this.f192883b.f192916j0.accept((Throwable) obj);
        return io.reactivex.rxjava3.core.I.q(this.f192884c);
    }
}
