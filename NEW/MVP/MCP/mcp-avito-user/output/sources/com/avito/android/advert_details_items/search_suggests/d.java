package com.avito.android.advert_details_items.search_suggests;

import Y41.l;
import com.avito.android.advert.item.Z0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsSearchSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/search_suggests/AdvertDetailsSearchSuggestItem;", "suggestItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_details_items/search_suggests/AdvertDetailsSearchSuggestItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<AdvertDetailsSearchSuggestItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f85521l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f85521l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(AdvertDetailsSearchSuggestItem advertDetailsSearchSuggestItem) {
        Z0 z02;
        AdvertDetailsSearchSuggestItem advertDetailsSearchSuggestItem2 = advertDetailsSearchSuggestItem;
        e eVar = this.f85521l;
        eVar.f85522b.k0(advertDetailsSearchSuggestItem2.f85508g, advertDetailsSearchSuggestItem2.f85507f, advertDetailsSearchSuggestItem2.f85509h);
        DeepLink deepLink = advertDetailsSearchSuggestItem2.f85506e;
        if (deepLink != null && (z02 = eVar.f85524d) != null) {
            z02.g(null, deepLink, null);
        }
        return G0.f406611a;
    }
}
