package com.avito.android.advert_details_items.search_suggests;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.advert.item.Z0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import t3.InterfaceC48489u;
import u3.l;

/* compiled from: AdvertDetailsSearchSuggestsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/search_suggests/e;", "Lcom/avito/android/advert_details_items/search_suggests/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f85522b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f85523c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Z0 f85524d;

    @Inject
    public e(@k com.avito.android.advert_core.analytics.a aVar, @InterfaceC48489u @k l<SimpleTestGroupWithNone> lVar) {
        this.f85522b = aVar;
        this.f85523c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertDetailsSearchSuggestsItem advertDetailsSearchSuggestsItem = (AdvertDetailsSearchSuggestsItem) aVar;
        this.f85523c.b();
        List<AdvertDetailsSearchSuggestItem> list = advertDetailsSearchSuggestsItem.f85513e;
        List<AdvertDetailsSearchSuggestItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            gVar.setVisible(false);
            return;
        }
        gVar.setVisible(true);
        gVar.setTitle(advertDetailsSearchSuggestsItem.f85512d);
        gVar.L3(new d(this), list);
        this.f85522b.Y6(advertDetailsSearchSuggestsItem.f85514f, advertDetailsSearchSuggestsItem.f85515g);
    }

    @Override // com.avito.android.advert_details_items.search_suggests.c
    public final void c0() {
        this.f85524d = null;
    }

    @Override // com.avito.android.advert_details_items.search_suggests.c
    public final void w4(@k Z0 z02) {
        this.f85524d = z02;
    }
}
