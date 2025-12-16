package com.avito.android.advert.item.chat_history;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ChatHistory;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChatHistoryPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/chat_history/e;", "Lcom/avito/android/advert/item/chat_history/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f74256b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f74257c;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.advert_core.analytics.a aVar2) {
        this.f74256b = aVar;
        this.f74257c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ChatHistoryItem chatHistoryItem = (ChatHistoryItem) aVar;
        ChatHistory chatHistory = chatHistoryItem.f74243d;
        gVar.xQ(chatHistory);
        gVar.FN(new d(this, chatHistoryItem));
        this.f74257c.x3(chatHistory.getChannelId());
    }
}
