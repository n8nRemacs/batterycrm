package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;)Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class u extends N implements Y41.l<MessageSuggestsView.b, MessageSuggestsView.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f192015l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar) {
        super(1);
        this.f192015l = tVar;
    }

    @Override // Y41.l
    public final MessageSuggestsView.b invoke(MessageSuggestsView.b bVar) {
        MessageSuggestsView.b bVar2 = bVar;
        C30277e1 c30277e1 = this.f192015l.f192007e0;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[69];
        if (((Boolean) c30277e1.f145032p0.a().invoke()).booleanValue()) {
            return bVar2;
        }
        if ((bVar2 instanceof MessageSuggestsView.b.d) || (bVar2 instanceof MessageSuggestsView.b.c)) {
            return MessageSuggestsView.b.C5670b.f191933b;
        }
        if (bVar2 instanceof MessageSuggestsView.b.C5670b) {
            return bVar2;
        }
        boolean z12 = bVar2 instanceof MessageSuggestsView.b.a;
        return bVar2;
    }
}
