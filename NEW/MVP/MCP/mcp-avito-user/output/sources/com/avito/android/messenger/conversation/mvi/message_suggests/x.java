package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: MessageSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;)Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x extends N implements Y41.l<MessageSuggestsView.b, MessageSuggestsView.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f192020l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z12) {
        super(1);
        this.f192020l = z12;
    }

    @Override // Y41.l
    public final MessageSuggestsView.b invoke(MessageSuggestsView.b bVar) {
        MessageSuggestsView.b dVar;
        MessageSuggestsView.b bVar2 = bVar;
        if (bVar2.equals(MessageSuggestsView.b.a.f191932b)) {
            return bVar2;
        }
        boolean zEquals = bVar2.equals(MessageSuggestsView.b.C5670b.f191933b);
        boolean z12 = this.f192020l;
        List<MessageSuggestsView.SuggestItem> list = bVar2.f191931a;
        if (zEquals) {
            return z12 ? bVar2 : new MessageSuggestsView.b.c(null, list, false);
        }
        if (bVar2 instanceof MessageSuggestsView.b.d) {
            if (z12) {
                return bVar2;
            }
            MessageSuggestsView.b.d dVar2 = (MessageSuggestsView.b.d) bVar2;
            dVar = new MessageSuggestsView.b.c(dVar2.f191937b, list, dVar2.f191938c);
        } else {
            if (!(bVar2 instanceof MessageSuggestsView.b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z12) {
                return bVar2;
            }
            MessageSuggestsView.b.c cVar = (MessageSuggestsView.b.c) bVar2;
            dVar = new MessageSuggestsView.b.d(cVar.f191934b, list, cVar.f191935c);
        }
        return dVar;
    }
}
