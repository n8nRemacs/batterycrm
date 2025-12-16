package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.messenger.conversation.mvi.common.a;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MessageSuggestsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;)Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class v extends N implements Y41.l<MessageSuggestsView.b, MessageSuggestsView.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f192016l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32119a.b f192017m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, InterfaceC32119a.b bVar) {
        super(1);
        this.f192016l = tVar;
        this.f192017m = bVar;
    }

    @Override // Y41.l
    public final MessageSuggestsView.b invoke(MessageSuggestsView.b bVar) {
        MessageSuggestsView.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof MessageSuggestsView.b.C5670b;
        InterfaceC32119a.b bVar3 = this.f192017m;
        t tVar = this.f192016l;
        if (!z12 || !tVar.f192000X.e(a.InterfaceC5627a.C5628a.f190147a)) {
            boolean z13 = bVar2 instanceof MessageSuggestsView.b.d;
            if (z13 && tVar.f192000X.e(a.InterfaceC5627a.C5628a.f190147a)) {
                return new MessageSuggestsView.b.d(bVar3.f191942a, t.me(tVar, bVar3.f191943b), !bVar3.f191944c);
            }
            if ((!z13 || tVar.f192000X.e(a.InterfaceC5627a.C5628a.f190147a)) && !(bVar2 instanceof MessageSuggestsView.b.c)) {
                return bVar2;
            }
            return new MessageSuggestsView.b.c(bVar3.f191942a, t.me(tVar, bVar3.f191943b), !bVar3.f191944c);
        }
        tVar.f192002Z.b();
        List<MessageSuggest> list = bVar3.f191943b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((MessageSuggest) it.next()).getId()));
        }
        List<MessageSuggest> list2 = bVar3.f191943b;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            RawJson intent = ((MessageSuggest) it2.next()).getIntent();
            String value = intent != null ? intent.getValue() : null;
            if (value != null) {
                arrayList2.add(value);
            }
        }
        tVar.f192006d0.c(new com.avito.android.messenger.conversation.analytics.i(tVar.f192005c0, arrayList, arrayList2, bVar3.f191944c, null, 16, null));
        return new MessageSuggestsView.b.d(bVar3.f191942a, t.me(tVar, list2), !bVar3.f191944c);
    }
}
