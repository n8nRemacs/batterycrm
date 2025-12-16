package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "", "messageCountInDb", "apply", "(J)Ljava/lang/Object;", "com/avito/android/messenger/conversation/mvi/messages/Y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32151o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f193043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.b f193044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f193045d;

    public C32151o(int i12, C32141e.b bVar, C32141e c32141e) {
        this.f193043b = c32141e;
        this.f193044c = bVar;
        this.f193045d = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        MessengerUserHashInfo messengerUserHashInfo = this.f193044c.f192921d;
        C32141e c32141e = this.f193043b;
        int i12 = this.f193045d;
        return new InterfaceC32129a.c.C5680c(C32141e.me(c32141e, messengerUserHashInfo, i12), new InterfaceC32129a.b.c(jLongValue >= ((long) i12), null, 2, null), i12, true);
    }
}
