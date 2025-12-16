package com.avito.android.profile.pro.impl.screen.item.geo_banner;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.profile.pro.impl.screen.item.geo_banner.g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileProGeoBannerItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/a;", "LTV0/b;", "Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/g;", "Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/ProfileProGeoBannerItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class a implements TV0.b<g, ProfileProGeoBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f223270a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f223271b;

    /* compiled from: ProfileProGeoBannerItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.pro.impl.screen.item.geo_banner.a$a, reason: collision with other inner class name */
    public static final class C6757a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g.a f223272l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6757a(g.a aVar) {
            super(2);
            this.f223272l = aVar;
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return this.f223272l.a(view);
        }
    }

    @Inject
    public a(@k c cVar, @k g.a aVar) {
        this.f223270a = cVar;
        this.f223271b = new g.a<>(R.layout.item_profile_pro_geo_banner, new C6757a(aVar));
    }

    @Override // TV0.b
    @k
    public final TV0.d<g, ProfileProGeoBannerItem> a() {
        return this.f223270a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f223271b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ProfileProGeoBannerItem;
    }
}
