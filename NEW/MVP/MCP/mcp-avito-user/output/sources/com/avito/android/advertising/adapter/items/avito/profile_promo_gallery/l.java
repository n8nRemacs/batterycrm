package com.avito.android.advertising.adapter.items.avito.profile_promo_gallery;

import android.os.Parcelable;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoGalleryBannerItem;
import com.avito.android.advertising.di.v;
import com.avito.android.util.Kundle;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ProfilePromoGalleryPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/l;", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/h;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.kebab.f f87253b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f87254c;

    @Inject
    public l(@Y61.k com.avito.android.advertising.kebab.f fVar, @v @Y61.l Kundle kundle) {
        this.f87253b = fVar;
        this.f87254c = new LinkedHashMap();
        Map mapF = kundle != null ? kundle.f("PROFILE_PROMO_GALLERY_STATES") : null;
        this.f87254c = new LinkedHashMap(mapF == null ? P0.c() : mapF);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) eVar;
        ProfilePromoGalleryBannerItem profilePromoGalleryBannerItem = (ProfilePromoGalleryBannerItem) aVar;
        Iterator<ProfilePromoBannerItem> it = profilePromoGalleryBannerItem.getProfilePromoItems().iterator();
        long f272777l = 0;
        while (it.hasNext()) {
            f272777l = it.next().getF272777l() + (31 * f272777l);
        }
        String strValueOf = String.valueOf(f272777l);
        UV0.c cVar = new UV0.c(profilePromoGalleryBannerItem.getProfilePromoItems());
        com.avito.android.advertising.kebab.f fVar = this.f87253b;
        fVar.c(cVar);
        fVar.d(aVar2);
        com.avito.konveyor.item_visibility_tracker.b bVarMe = aVar2.Me();
        if (bVarMe != null) {
            ((com.avito.konveyor.item_visibility_tracker.d) bVarMe).c(cVar);
        }
        aVar2.setTitle(profilePromoGalleryBannerItem.getTitle());
        aVar2.Gl(profilePromoGalleryBannerItem.getProfilePromoItems(), (Parcelable) this.f87254c.get(strValueOf));
        aVar2.d(new i(new WeakReference(aVar2), this));
        aVar2.kO(new j(this, strValueOf));
        aVar2.bA(new k(profilePromoGalleryBannerItem));
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.premium.q
    public final void P6(@Y61.k Kundle kundle) {
        kundle.l("PROFILE_PROMO_GALLERY_STATES", this.f87254c);
    }
}
