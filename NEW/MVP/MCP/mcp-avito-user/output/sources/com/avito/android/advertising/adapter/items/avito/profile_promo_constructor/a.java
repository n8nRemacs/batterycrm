package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import TV0.g;
import Y41.p;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.lib.util.v;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfilePromoConstructorGridBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/a;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/h;", "Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<h, ProfilePromoBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f87176a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advertising.a f87177b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<i> f87178c = new g.a<>(R.layout.ad_profile_promo_constructor, new C2597a());

    /* compiled from: ProfilePromoConstructorGridBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.a$a, reason: collision with other inner class name */
    public static final class C2597a extends N implements p<ViewGroup, View, i> {
        public C2597a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            a aVar = a.this;
            if (aVar.f87177b.a()) {
                AdStyle adStyle = AdStyle.f88537b;
            } else {
                AdStyle adStyle2 = AdStyle.f88537b;
            }
            i iVar = new i(view2);
            com.avito.android.advertising.a aVar2 = aVar.f87177b;
            if (aVar2.a()) {
                view2.setForeground(null);
                v.b(view2, R.dimen.ad_borderless_grid_image_radius);
                view2.setPadding(0, 0, 0, 0);
            }
            iVar.f87205d.a(aVar2.a() ? ProfilePromoConstructorParamSet.f87171d.f87175b : ProfilePromoConstructorParamSet.f87170c.f87175b);
            view2.requestLayout();
            return iVar;
        }
    }

    @Inject
    public a(@k d dVar, @k com.avito.android.advertising.a aVar) {
        this.f87176a = dVar;
        this.f87177b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87176a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f87178c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof ProfilePromoBannerItem) {
            ProfilePromoBannerItem profilePromoBannerItem = (ProfilePromoBannerItem) aVar;
            if (profilePromoBannerItem.getDisplayType().isGrid() && profilePromoBannerItem.getAdViewType() == AdViewType.f86909c) {
                return true;
            }
        }
        return false;
    }
}
