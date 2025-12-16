package com.avito.android.advertising.adapter.items.adstub.profile_promo_gallery;

import Y61.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ob.InterfaceC44739c;

/* compiled from: LoadingProfilePromoGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/profile_promo_gallery/h;", "Lcom/avito/android/advertising/adapter/items/adstub/profile_promo_gallery/g;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44739c> f86982b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.android.advertising.adapter.items.adstub.a> f86983c = C42745f0.U(new com.avito.android.advertising.adapter.items.adstub.a(0), new com.avito.android.advertising.adapter.items.adstub.a(1), new com.avito.android.advertising.adapter.items.adstub.a(2));

    @Inject
    public h(@k h31.e<InterfaceC44739c> eVar) {
        this.f86982b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a aVar2 = (com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a) eVar;
        aVar2.setTitle("");
        aVar2.Gl(this.f86983c, null);
    }
}
