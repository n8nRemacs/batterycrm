package com.avito.android.advertising.adapter.items.buzzoola;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.e;
import com.avito.android.lib.util.v;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaGridBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/e;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/d;", "Lcom/avito/android/advertising/adapter/items/buzzoola/BuzzoolaDirectBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.b<com.avito.android.advertising.ui.buzzoola.d, BuzzoolaDirectBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f87296a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87297b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.e> f87298c = new g.a<>(R.layout.buzzoola_ad, new a());

    /* compiled from: BuzzoolaGridBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.e> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.e invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            e eVar = e.this;
            com.avito.android.advertising.ui.buzzoola.e eVar2 = new com.avito.android.advertising.ui.buzzoola.e(view2, eVar.f87297b.a() ? AdStyle.f88540e : AdStyle.f88539d);
            boolean zA2 = eVar.f87297b.a();
            com.avito.android.advertising.ui.buzzoola.b bVar = eVar2.f88583b;
            if (zA2) {
                View view3 = bVar.f88575s;
                if (view3 != null) {
                    v.b(view3, R.dimen.ad_borderless_grid_image_radius);
                }
                e.a.d(bVar);
                eVar2.B80();
            } else {
                bVar.getClass();
                e.a.i(bVar);
            }
            eVar2.C80(1.0f, false);
            return eVar2;
        }
    }

    @Inject
    public e(@Y61.k i iVar, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87296a = iVar;
        this.f87297b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87296a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.e> b() {
        return this.f87298c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof BuzzoolaDirectBannerItem) {
            BuzzoolaDirectBannerItem buzzoolaDirectBannerItem = (BuzzoolaDirectBannerItem) aVar;
            if (!buzzoolaDirectBannerItem.getDisplayType().isInformative() && buzzoolaDirectBannerItem.getAdViewType() == AdViewType.f86909c) {
                return true;
            }
        }
        return false;
    }
}
