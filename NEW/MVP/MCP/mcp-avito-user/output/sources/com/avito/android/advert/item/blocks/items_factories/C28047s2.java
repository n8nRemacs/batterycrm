package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.icebreakers.IceBreakersItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ChatHistory;
import com.avito.android.remote.model.IceBreakers;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsIceBreakersItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/s2;", "Lcom/avito/android/advert/item/blocks/items_factories/r2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.s2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28047s2 implements InterfaceC28041r2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74024a;

    @Inject
    public C28047s2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74024a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28041r2
    @Y61.l
    public final IceBreakersItem a(@Y61.k AdvertDetails advertDetails) {
        List<ChatHistory.Message> messages;
        ChatHistory chatHistory = advertDetails.getChatHistory();
        boolean z12 = true;
        if (chatHistory != null && (messages = chatHistory.getMessages()) != null && (!messages.isEmpty())) {
            return null;
        }
        IceBreakers icebreakers = advertDetails.getIcebreakers();
        if (icebreakers == null || icebreakers.getTexts().isEmpty()) {
            return null;
        }
        boolean zF2 = kotlin.jvm.internal.L.f(advertDetails.getIsBrandingEnabled(), Boolean.TRUE);
        int iA2 = this.f74024a.a();
        if (!advertDetails.isRestyle() && !advertDetails.isRealtyRedesign()) {
            z12 = false;
        }
        return new IceBreakersItem(0L, null, icebreakers, z12, zF2, iA2, null, null, advertDetails.isServicesRedesign(), 195, null);
    }
}
