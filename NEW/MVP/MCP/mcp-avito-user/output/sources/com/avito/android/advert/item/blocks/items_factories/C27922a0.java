package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.creditinfo.buzzoola.BuzzoolaCreditBannerItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.credit_broker.CreditBannerProduct;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBuzzoollaCreditBannerItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/a0;", "Lcom/avito/android/advert/item/blocks/items_factories/Z;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.a0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27922a0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29640d f73905a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73906b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.creditinfo.buzzoola.k f73907c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f73908d;

    @Inject
    public C27922a0(@Y61.k C29640d c29640d, @Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.advert.item.creditinfo.buzzoola.k kVar, @C27710t.q boolean z12) {
        this.f73905a = c29640d;
        this.f73906b = jVar;
        this.f73907c = kVar;
        this.f73908d = z12;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.Z
    @Y61.l
    public final BuzzoolaCreditBannerItem a(@Y61.k AdvertDetails advertDetails) {
        if (advertDetails.getCreditInfo() == null || (!(advertDetails.getCreditInfo() instanceof CreditBannerProduct) && !this.f73908d)) {
            C29640d c29640d = this.f73905a;
            c29640d.getClass();
            kotlin.reflect.n<Object> nVar = C29640d.f132175X[11];
            if (((Boolean) c29640d.f132210m.a().invoke()).booleanValue()) {
                return null;
            }
        }
        return new BuzzoolaCreditBannerItem(0L, null, !advertDetails.isRedesign(), this.f73906b.a(), null, null, this.f73907c.getF74964d(), 51, null);
    }
}
