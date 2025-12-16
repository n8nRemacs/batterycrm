package com.avito.android.messenger.conversation.mvi.quick_replies;

import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: QuickRepliesPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "oldState", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;)Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<d.a, d.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.b f194109l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a.b bVar) {
        super(1);
        this.f194109l = bVar;
    }

    @Override // Y41.l
    public final d.a invoke(d.a aVar) {
        d.a aVar2 = aVar;
        if (!(aVar2 instanceof d.a.b.InterfaceC5745a.C5747b)) {
            return aVar2;
        }
        d.a.b.InterfaceC5745a.C5747b c5747b = (d.a.b.InterfaceC5745a.C5747b) aVar2;
        a.b bVar = c5747b.f194095b;
        a.b bVar2 = this.f194109l;
        return !L.f(bVar2, bVar) ? new d.a.b.InterfaceC5745a.C5747b(c5747b.f194094a, bVar2) : aVar2;
    }
}
