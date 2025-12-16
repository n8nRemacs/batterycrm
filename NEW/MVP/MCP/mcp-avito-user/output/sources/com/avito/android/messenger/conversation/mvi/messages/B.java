package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "", "messageCountInDb", "apply", "(J)Ljava/lang/Object;", "com/avito/android/messenger/conversation/mvi/messages/Y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class B<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c.C5680c f192032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e f192033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f192035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C32141e.c f192036f;

    public B(InterfaceC32129a.c.C5680c c5680c, C32141e c32141e, int i12, boolean z12, C32141e.c cVar) {
        this.f192032b = c5680c;
        this.f192033c = c32141e;
        this.f192034d = i12;
        this.f192035e = z12;
        this.f192036f = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC32129a.c.C5680c c5680c = this.f192032b;
        int i12 = c5680c.f192129c;
        if (jLongValue <= i12) {
            return InterfaceC32129a.c.C5680c.a(c5680c, null, new InterfaceC32129a.b.c(false, Boolean.FALSE), 0, 13);
        }
        C32141e c32141e = this.f192033c;
        c32141e.getClass();
        int iNe = (C32141e.ne(this.f192034d, null) * 100) + i12;
        long j12 = iNe;
        return InterfaceC32129a.c.C5680c.a(c5680c, c32141e.f192902V.Y(j12, c32141e.f192907a0, this.f192036f.f192929d), new InterfaceC32129a.b.c(jLongValue >= j12, Boolean.valueOf(this.f192035e)), iNe, 8);
    }
}
