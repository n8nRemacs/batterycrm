package com.avito.android.advertising.adapter.items.adstub;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.advertising.ui.AdStyle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RdsNotLoadAdStubNewBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/w;", "LTV0/b;", "LEb/c;", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w implements TV0.b<Eb.c, CommercialBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f86996a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<Eb.c> f86997b = new g.a<>(R.layout.rds_not_load_ad_stub, a.f86998l);

    /* compiled from: RdsNotLoadAdStubNewBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LEb/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LEb/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, Eb.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f86998l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Eb.c invoke(ViewGroup viewGroup, View view) {
            return new Eb.c(view, AdStyle.f88538c, null, 4, null);
        }
    }

    @Inject
    public w(@Y61.k s sVar) {
        this.f86996a = sVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86996a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<Eb.c> b() {
        return this.f86997b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof CommercialBannerItem) {
            CommercialBannerItem commercialBannerItem = (CommercialBannerItem) aVar;
            if (commercialBannerItem.getHasNotLoadedAd() && !commercialBannerItem.isProfilePromoGallery()) {
                return true;
            }
        }
        return false;
    }
}
