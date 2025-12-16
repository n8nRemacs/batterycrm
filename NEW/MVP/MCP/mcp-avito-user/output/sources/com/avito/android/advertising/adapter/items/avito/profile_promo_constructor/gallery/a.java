package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.gallery;

import TV0.g;
import Y41.p;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.ProfilePromoConstructorParamSet;
import com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.d;
import com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.h;
import com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.i;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.ui.AdStyle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfilePromoConstructorGalleryItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/gallery/a;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/h;", "Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<h, ProfilePromoBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f87200a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f87201b = new g.a<>(R.layout.ad_profile_promo_constructor_gallery_item, C2598a.f87202l);

    /* compiled from: ProfilePromoConstructorGalleryItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.gallery.a$a, reason: collision with other inner class name */
    public static final class C2598a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2598a f87202l = new C2598a();

        public C2598a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            AdStyle adStyle = AdStyle.f88537b;
            i iVar = new i(view2);
            View view3 = iVar.f87204c;
            if (view3 != null) {
                b.a(view3);
            }
            iVar.f87205d.a(ProfilePromoConstructorParamSet.f87172e.f87175b);
            view2.requestLayout();
            return iVar;
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f87200a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87200a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f87201b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ProfilePromoBannerItem;
    }
}
