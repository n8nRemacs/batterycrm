package com.avito.android.messenger.conversation.mvi.quick_replies;

import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: QuickRepliesPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "oldState", "Lio/reactivex/rxjava3/core/I;", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;)Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<d.a, I<d.a>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f194108l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar) {
        super(1);
        this.f194108l = fVar;
    }

    @Override // Y41.l
    public final I<d.a> invoke(d.a aVar) {
        a.b bVar;
        d.a aVar2 = aVar;
        if (!(aVar2 instanceof d.a.b.InterfaceC5745a.C5747b) || (bVar = ((d.a.b.InterfaceC5745a.C5747b) aVar2).f194095b) == null) {
            return I.q(aVar2);
        }
        f fVar = this.f194108l;
        return fVar.f194100W.deleteQuickReply(bVar.f194073b).r(new g(aVar2, fVar)).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(4, fVar, aVar2));
    }
}
