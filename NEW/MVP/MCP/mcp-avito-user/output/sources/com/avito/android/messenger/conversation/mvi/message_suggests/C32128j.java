package com.avito.android.messenger.conversation.mvi.message_suggests;

import arrow.core.AbstractC23662a;
import com.avito.android.messenger.conversation.mvi.message_suggests.C32120b;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessageSuggestsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c;", "command", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32128j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32120b f191982b;

    public C32128j(C32120b c32120b) {
        this.f191982b = c32120b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32120b.c cVar = (C32120b.c) obj;
        boolean zEquals = cVar.equals(C32120b.c.a.f191969a);
        C32120b c32120b = this.f191982b;
        if (zEquals) {
            com.jakewharton.rxrelay3.b<AbstractC23662a<Throwable, InterfaceC32119a.b>> bVar = c32120b.f191952g;
            InterfaceC32119a.b.f191940e.getClass();
            bVar.accept(new AbstractC23662a.c(InterfaceC32119a.b.f191941f));
            return io.reactivex.rxjava3.core.z.c0(G0.f406611a);
        }
        if (!(cVar instanceof C32120b.c.C5675b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC47842z interfaceC47842z = c32120b.f191948c;
        LocalMessage localMessage = ((C32120b.c.C5675b) cVar).f191971b;
        return interfaceC47842z.getSellerSuggests(c32120b.f191946a, localMessage != null ? localMessage.getRemoteId() : null, null).r(new C32127i(c32120b, cVar)).u(new C32126h(c32120b, 0)).F();
    }
}
