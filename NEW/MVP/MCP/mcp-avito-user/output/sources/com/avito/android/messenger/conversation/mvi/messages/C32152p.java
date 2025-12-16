package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32152p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f193048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f193049c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C32141e.b f193050d;

    public C32152p(C32141e c32141e, Integer num, C32141e.b bVar) {
        this.f193048b = c32141e;
        this.f193049c = num;
        this.f193050d = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32141e c32141e = this.f193048b;
        c32141e.f192916j0.accept((Throwable) obj);
        Integer num = this.f193049c;
        int iIntValue = num != null ? num.intValue() : 100;
        C32141e.b bVar = this.f193050d;
        return c32141e.f192902V.x(c32141e.f192907a0, bVar.f192921d).r(new C32151o(iIntValue, bVar, c32141e));
    }
}
