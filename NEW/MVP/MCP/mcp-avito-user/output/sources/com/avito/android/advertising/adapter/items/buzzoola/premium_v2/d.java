package com.avito.android.advertising.adapter.items.buzzoola.premium_v2;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPremiumV2BigBorderlessBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/d;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium_v2/c;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/BuzzoolaPremiumV2BannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.b<com.avito.android.advertising.ui.buzzoola.premium_v2.c, BuzzoolaPremiumV2BannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f87456a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.premium_v2.j> f87457b = new g.a<>(R.layout.buzzoola_premium_v2, a.f87458l);

    /* compiled from: BuzzoolaPremiumV2BigBorderlessBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/premium_v2/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/premium_v2/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.premium_v2.j> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f87458l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.premium_v2.j invoke(ViewGroup viewGroup, View view) {
            com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
            com.avito.android.advertising.ui.buzzoola.premium_v2.j jVar = new com.avito.android.advertising.ui.buzzoola.premium_v2.j((ForegroundRelativeLayout) view, Float.MAX_VALUE, cVar, AdStyle.f88538c, new com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.c(new com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.f(1.3f, cVar), true), null, null, 96, null);
            RatioForegroundFrameLayout ratioForegroundFrameLayout = jVar.f88692j;
            v.b(ratioForegroundFrameLayout, R.dimen.ad_image_corner_radius);
            jVar.f88693k.f132066a.getLayoutParams().height = -1;
            ratioForegroundFrameLayout.setRatio(1.3f);
            return jVar;
        }
    }

    @Inject
    public d(@Y61.k f fVar) {
        this.f87456a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87456a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.premium_v2.j> b() {
        return this.f87457b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof BuzzoolaPremiumV2BannerItem;
    }
}
