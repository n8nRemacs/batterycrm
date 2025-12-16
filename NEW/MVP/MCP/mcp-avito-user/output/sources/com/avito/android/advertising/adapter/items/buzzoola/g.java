package com.avito.android.advertising.adapter.items.buzzoola;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaListBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/g;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/d;", "Lcom/avito/android/advertising/adapter/items/buzzoola/BuzzoolaDirectBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements TV0.b<com.avito.android.advertising.ui.buzzoola.d, BuzzoolaDirectBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f87302a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.e> f87303b = new g.a<>(R.layout.buzzoola_list_ad, a.f87304l);

    /* compiled from: BuzzoolaListBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f87304l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.e invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            com.avito.android.advertising.ui.buzzoola.e eVar = new com.avito.android.advertising.ui.buzzoola.e(view, AdStyle.f88541f);
            com.avito.android.advertising.ui.buzzoola.b bVar = eVar.f88583b;
            bVar.getClass();
            e.a.g(bVar);
            eVar.C80(1.0f, true);
            return eVar;
        }
    }

    @Inject
    public g(@Y61.k i iVar) {
        this.f87302a = iVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87302a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.e> b() {
        return this.f87303b;
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
            if (!buzzoolaDirectBannerItem.getDisplayType().isInformative() && buzzoolaDirectBannerItem.getAdViewType() == AdViewType.f86908b) {
                return true;
            }
        }
        return false;
    }
}
