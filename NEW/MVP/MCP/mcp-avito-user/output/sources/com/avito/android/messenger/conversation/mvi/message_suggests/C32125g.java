package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.messenger.conversation.mvi.message_suggests.C32120b;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MessageSuggestsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$a;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32125g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32120b f191977b;

    public C32125g(C32120b c32120b) {
        this.f191977b = c32120b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32120b.a aVar = (C32120b.a) obj;
        if (aVar.f191961c) {
            C32120b.C5674b c5674b = aVar.f191959a;
            if (c5674b.f191966e && !c5674b.f191965d) {
                boolean z12 = c5674b.f191963b;
                C32120b c32120b = this.f191977b;
                LocalMessage localMessage = c5674b.f191968g;
                return (!z12 || (!aVar.f191960b && (!c32120b.f191956k.get() || localMessage == null || L.f(localMessage.getFromId(), localMessage.getUserId())))) ? (c5674b.f191964c && localMessage == null && c32120b.f191956k.get() && !c5674b.f191967f) ? io.reactivex.rxjava3.core.z.c0(new C32120b.c.C5675b(false, localMessage)) : U.f403867b : io.reactivex.rxjava3.core.z.c0(new C32120b.c.C5675b(true, localMessage));
            }
        }
        return io.reactivex.rxjava3.core.z.c0(C32120b.c.a.f191969a);
    }
}
