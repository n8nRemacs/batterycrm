package com.avito.android.messenger.conversation.mvi.message_suggests;

import Oq.InterfaceC14725a;
import arrow.core.AbstractC23662a;
import com.avito.android.C30277e1;
import com.avito.android.messenger.MessageSuggestsLoadingException;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.messenger.conversation.mvi.message_suggests.t;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: MessageSuggestsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/a;", "", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/a$b;", "eitherErrorOrSuggests", "Lkotlin/G0;", "accept", "(Larrow/core/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f192022b;

    public z(t tVar) {
        this.f192022b = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        AbstractC23662a abstractC23662a = (AbstractC23662a) obj;
        boolean z12 = abstractC23662a instanceof AbstractC23662a.c;
        t tVar = this.f192022b;
        if (z12) {
            InterfaceC32119a.b bVar = (InterfaceC32119a.b) ((AbstractC23662a.c) abstractC23662a).f56269b;
            tVar.le().s(!bVar.f191943b.isEmpty() ? new t.d(null, null, new v(tVar, bVar), 3, null) : new t.b(tVar));
        } else {
            if (!(abstractC23662a instanceof AbstractC23662a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable th2 = (Throwable) ((AbstractC23662a.b) abstractC23662a).f56268b;
            C30277e1 c30277e1 = tVar.f192007e0;
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[69];
            if (((Boolean) c30277e1.f145032p0.a().invoke()).booleanValue()) {
                tVar.le().s(new t.b(tVar));
            }
            InterfaceC14725a.C0808a.a(tVar.f192012j0, new MessageSuggestsLoadingException("Failed to load message suggests", th2), null, 6);
            tVar.f192002Z.a();
        }
    }
}
