package com.avito.android.advert.item.chat_history;

import com.avito.android.advert_core.contactbar.SourceScreen;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChatHistoryPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f74254l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChatHistoryItem f74255m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ChatHistoryItem chatHistoryItem) {
        super(0);
        this.f74254l = eVar;
        this.f74255m = chatHistoryItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f74254l;
        SourceScreen sourceScreen = SourceScreen.f83145c;
        eVar.f74257c.a2();
        b.a.a(eVar.f74256b, new ChannelDetailsLink(this.f74255m.f74243d.getChannelId(), null, 2, null), null, null, 6);
        return G0.f406611a;
    }
}
