package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.messenger.conversation.mvi.message_suggests.C32120b;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSuggestsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$b;", "channelInfo", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "", "apply", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$b;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32123e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32120b f191975b;

    public C32123e(C32120b c32120b) {
        this.f191975b = c32120b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32120b.C5674b c5674b = (C32120b.C5674b) obj;
        MessengerUserHashInfo messengerUserHashInfo = c5674b.f191962a;
        if (C43066x.K(messengerUserHashInfo.f430682d)) {
            return io.reactivex.rxjava3.core.z.c0(new Q(c5674b, Boolean.TRUE));
        }
        C32120b c32120b = this.f191975b;
        return c32120b.f191949d.a(c32120b.f191946a, messengerUserHashInfo).D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(new C32122d(c5674b)).m0(io.reactivex.rxjava3.internal.functions.a.g(new Q(c5674b, Boolean.TRUE)));
    }
}
