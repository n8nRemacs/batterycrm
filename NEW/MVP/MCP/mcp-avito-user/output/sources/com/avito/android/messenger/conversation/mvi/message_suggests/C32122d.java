package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.messenger.conversation.mvi.message_suggests.C32120b;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: MessageSuggestsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "suggestsEnabled", "Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$b;", "apply", "(Z)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32122d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32120b.C5674b f191974b;

    public C32122d(C32120b.C5674b c5674b) {
        this.f191974b = c5674b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return new Q(this.f191974b, bool);
    }
}
