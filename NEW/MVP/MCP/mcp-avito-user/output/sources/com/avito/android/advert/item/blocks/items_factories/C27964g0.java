package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.chat_history.ChatHistoryItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ChatHistory;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsChatHistoryItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/g0;", "Lcom/avito/android/advert/item/blocks/items_factories/f0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.g0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27964g0 implements InterfaceC27957f0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73954a;

    @Inject
    public C27964g0(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73954a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27957f0
    @Y61.l
    public final ChatHistoryItem a(@Y61.k AdvertDetails advertDetails) {
        ChatHistory chatHistory = advertDetails.getChatHistory();
        if (chatHistory == null || chatHistory.getMessages().isEmpty()) {
            return null;
        }
        return new ChatHistoryItem(0L, null, chatHistory, advertDetails.isRestyle(), this.f73954a.a(), null, null, 99, null);
    }
}
