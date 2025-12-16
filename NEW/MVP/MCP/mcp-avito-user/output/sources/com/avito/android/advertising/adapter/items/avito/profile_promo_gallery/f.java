package com.avito.android.advertising.adapter.items.avito.profile_promo_gallery;

import Ab.C13005a;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoGalleryBannerItem;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ProfilePromoGalleryBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/f;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/a;", "Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoGalleryBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.b<com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a, ProfilePromoGalleryBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f87236a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.d f87237b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f87238c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Ab.c f87239d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C13005a f87240e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g.a<AdProfilePromoGalleryViewHolderImpl> f87241f = new g.a<>(R.layout.ad_profile_promo_gallery, new a());

    /* compiled from: ProfilePromoGalleryBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/AdProfilePromoGalleryViewHolderImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<ViewGroup, View, AdProfilePromoGalleryViewHolderImpl> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AdProfilePromoGalleryViewHolderImpl invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            f fVar = f.this;
            List listSingletonList = Collections.singletonList(new com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.gallery.a(fVar.f87237b));
            com.avito.konveyor.item_visibility_tracker.b bVar = fVar.f87238c;
            return new AdProfilePromoGalleryViewHolderImpl(view2, listSingletonList, bVar.f() ? bVar.e() : null, C42745f0.U(fVar.f87239d, fVar.f87240e));
        }
    }

    @Inject
    public f(@Y61.k h hVar, @Y61.k com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.d dVar, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar, @Y61.k Ab.c cVar, @Y61.k C13005a c13005a) {
        this.f87236a = hVar;
        this.f87237b = dVar;
        this.f87238c = bVar;
        this.f87239d = cVar;
        this.f87240e = c13005a;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87236a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<AdProfilePromoGalleryViewHolderImpl> b() {
        return this.f87241f;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ProfilePromoGalleryBannerItem;
    }
}
