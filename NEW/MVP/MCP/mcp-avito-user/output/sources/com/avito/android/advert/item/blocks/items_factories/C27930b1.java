package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.disclaimer.AdvertDetailsDisclaimerItem;
import com.avito.android.advert.item.disclaimer.DisclaimerData;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertDisclaimer;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDisclaimerItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/b1;", "Lcom/avito/android/advert/item/blocks/items_factories/a1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.b1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27930b1 implements InterfaceC27923a1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73920a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f73921b;

    @Inject
    public C27930b1(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f73920a = jVar;
        this.f73921b = aVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27923a1
    @Y61.l
    public final AdvertDetailsDisclaimerItem a(@Y61.k AdvertDetails advertDetails) {
        AdvertDisclaimer disclaimer = advertDetails.getDisclaimer();
        if (disclaimer == null) {
            return null;
        }
        AttributedText header = disclaimer.getHeader();
        com.avito.android.util.text.a aVar = this.f73921b;
        CharSequence charSequenceB = header != null ? aVar.b(header) : null;
        AttributedText body = disclaimer.getBody();
        return new AdvertDetailsDisclaimerItem(0L, null, new DisclaimerData(charSequenceB, body != null ? aVar.b(body) : null), this.f73920a.a(), null, null, 51, null);
    }
}
