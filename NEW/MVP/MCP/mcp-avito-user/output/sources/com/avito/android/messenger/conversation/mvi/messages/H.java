package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "", "messageCountInDb", "apply", "(J)Ljava/lang/Object;", "com/avito/android/messenger/conversation/mvi/messages/Y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.c f192059c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c.C5680c f192062f;

    public H(C32141e c32141e, C32141e.c cVar, int i12, int i13, InterfaceC32129a.c.C5680c c5680c) {
        this.f192058b = c32141e;
        this.f192059c = cVar;
        this.f192060d = i12;
        this.f192061e = i13;
        this.f192062f = c5680c;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        io.reactivex.rxjava3.core.z zVarMe = C32141e.me(this.f192058b, this.f192059c.f192929d, this.f192060d);
        int i12 = this.f192061e;
        return InterfaceC32129a.c.C5680c.a(this.f192062f, zVarMe, new InterfaceC32129a.b.c(jLongValue >= ((long) i12), null, 2, null), i12, 8);
    }
}
