package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: MessageSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;)Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class w extends N implements Y41.l<MessageSuggestsView.b, MessageSuggestsView.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f192018l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessageSuggestsView.SuggestItem f192019m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, MessageSuggestsView.SuggestItem suggestItem) {
        super(1);
        this.f192018l = tVar;
        this.f192019m = suggestItem;
    }

    @Override // Y41.l
    public final MessageSuggestsView.b invoke(MessageSuggestsView.b bVar) {
        MessageSuggestsView.b bVar2 = bVar;
        if (bVar2.equals(MessageSuggestsView.b.C5670b.f191933b)) {
            return MessageSuggestsView.b.a.f191932b;
        }
        if (!(bVar2 instanceof MessageSuggestsView.b.d)) {
            if (bVar2.equals(MessageSuggestsView.b.a.f191932b) ? true : bVar2 instanceof MessageSuggestsView.b.c) {
                return bVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        t tVar = this.f192018l;
        tVar.f192003a0.b();
        MessageSuggestsView.SuggestItem suggestItem = this.f192019m;
        tVar.f192006d0.c(new com.avito.android.messenger.conversation.analytics.f(tVar.f192005c0, suggestItem.f191928d, suggestItem.f191929e, ((MessageSuggestsView.b.d) bVar2).f191939d, null, 16, null));
        if (tVar.f192008f0.f439742a.f439749b.b()) {
            return bVar2;
        }
        tVar.f192009g0.postValue(C43066x.A0(suggestItem.f191927c).toString() + ' ');
        return bVar2;
    }
}
