package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "", "messageCountInDb", "apply", "(J)Ljava/lang/Object;", "com/avito/android/messenger/conversation/mvi/messages/Y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32130b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c f192132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e f192133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C32141e.a f192134d;

    public C32130b(InterfaceC32129a.c cVar, C32141e.a aVar, C32141e c32141e) {
        this.f192132b = cVar;
        this.f192133c = c32141e;
        this.f192134d = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC32129a.c.C5680c c5680c = (InterfaceC32129a.c.C5680c) this.f192132b;
        boolean z12 = jLongValue >= ((long) c5680c.f192129c);
        if (z12 && (c5680c.f192128b instanceof InterfaceC32129a.b.C5677a)) {
            C32141e.a aVar = this.f192134d;
            this.f192133c.L4(aVar.f192917d, aVar.f192919f);
        }
        return InterfaceC32129a.c.C5680c.a(c5680c, null, new InterfaceC32129a.b.c(z12, null, 2, null), 0, 5);
    }
}
