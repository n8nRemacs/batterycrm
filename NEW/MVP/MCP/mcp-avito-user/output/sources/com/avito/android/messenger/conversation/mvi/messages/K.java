package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "", "messageCountInDb", "apply", "(J)Ljava/lang/Object;", "com/avito/android/messenger/conversation/mvi/messages/Y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class K<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c.C5680c f192071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f192072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C32141e f192073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C32141e.c f192074e;

    public K(InterfaceC32129a.c.C5680c c5680c, C32141e.c cVar, C32141e c32141e, Integer num) {
        this.f192071b = c5680c;
        this.f192072c = num;
        this.f192073d = c32141e;
        this.f192074e = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC32129a.c.C5680c c5680c = this.f192071b;
        int i12 = c5680c.f192129c;
        if (jLongValue <= i12) {
            return InterfaceC32129a.c.C5680c.a(c5680c, null, new InterfaceC32129a.b.c(false, null, 2, null), 0, 13);
        }
        Integer num = this.f192072c;
        int iIntValue = i12 + (num != null ? num.intValue() : 100);
        return InterfaceC32129a.c.C5680c.a(c5680c, C32141e.me(this.f192073d, this.f192074e.f192929d, iIntValue), new InterfaceC32129a.b.c(jLongValue >= ((long) iIntValue), null, 2, null), iIntValue, 8);
    }
}
