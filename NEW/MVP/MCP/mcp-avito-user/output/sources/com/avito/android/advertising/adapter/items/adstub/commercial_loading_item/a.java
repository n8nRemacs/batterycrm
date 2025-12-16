package com.avito.android.advertising.adapter.items.adstub.commercial_loading_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.CommercialLoadingItem;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommercialLoadingBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/commercial_loading_item/a;", "LTV0/b;", "LEb/c;", "Lcom/avito/android/advertising/CommercialLoadingItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<Eb.c, CommercialLoadingItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f86938a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BannerPageSource f86939b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<Eb.c> f86940c = new g.a<>(R.layout.not_load_ad_stub_big_media_x2_small, new C2590a());

    /* compiled from: CommercialLoadingBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LEb/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LEb/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.adstub.commercial_loading_item.a$a, reason: collision with other inner class name */
    public static final class C2590a extends N implements p<ViewGroup, View, Eb.c> {
        public C2590a() {
            super(2);
        }

        @Override // Y41.p
        public final Eb.c invoke(ViewGroup viewGroup, View view) {
            Eb.c cVar = new Eb.c(view, AdStyle.f88545j, null, 4, null);
            BannerPageSource bannerPageSource = a.this.f86939b;
            h.f88704a.getClass();
            View view2 = cVar.f4089b;
            h.a(view2, bannerPageSource);
            cVar.f4091d = h.f(view2.getResources(), bannerPageSource);
            return cVar;
        }
    }

    @Inject
    public a(@k c cVar, @k BannerPageSource bannerPageSource) {
        this.f86938a = cVar;
        this.f86939b = bannerPageSource;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86938a;
    }

    @Override // TV0.b
    @k
    public final g.a<Eb.c> b() {
        return this.f86940c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CommercialLoadingItem;
    }
}
