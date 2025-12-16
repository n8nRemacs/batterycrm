package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.icebreakers_redesign.IcebreakersRedesignItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ChatHistory;
import com.avito.android.remote.model.IceBreakers;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsIcebreakersRedesignItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/v2;", "Lcom/avito/android/advert/item/blocks/items_factories/u2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.v2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28065v2 implements InterfaceC28059u2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74044a;

    @Inject
    public C28065v2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74044a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28059u2
    @Y61.l
    public final IcebreakersRedesignItem a(@Y61.k AdvertDetails advertDetails) {
        IceBreakers icebreakers;
        List<ChatHistory.Message> messages;
        ChatHistory chatHistory = advertDetails.getChatHistory();
        if ((chatHistory != null && (messages = chatHistory.getMessages()) != null && (!messages.isEmpty())) || (icebreakers = advertDetails.getIcebreakers()) == null || icebreakers.getTexts().isEmpty()) {
            return null;
        }
        return new IcebreakersRedesignItem(0L, null, icebreakers, this.f74044a.a(), null, null, 51, null);
    }
}
