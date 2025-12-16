package com.avito.android.advertising.adapter.items.yandex;

import TV0.g;
import Y41.p;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.e;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: YandexBigBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/yandex/a;", "LTV0/b;", "LHb/d;", "Lcom/avito/android/advertising/adapter/items/yandex/YandexBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<Hb.d, YandexBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f87703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.e f87704b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87705c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<Hb.e> f87706d = new g.a<>(R.layout.yandex_ad, new C2605a());

    /* compiled from: YandexBigBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LHb/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LHb/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.yandex.a$a, reason: collision with other inner class name */
    public static final class C2605a extends N implements p<ViewGroup, View, Hb.e> {
        public C2605a() {
            super(2);
        }

        @Override // Y41.p
        public final Hb.e invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            a aVar = a.this;
            Hb.e eVar = new Hb.e(view2, aVar.f87705c.a() ? AdStyle.f88538c : AdStyle.f88537b);
            if (aVar.f87705c.a()) {
                eVar.Kw(R.dimen.ad_borderless_grid_image_radius);
                eVar.C80();
            } else {
                Hb.c cVar = eVar.f7329c;
                cVar.getClass();
                e.a.c(cVar);
            }
            com.avito.android.serp.e eVar2 = aVar.f87704b;
            eVar.B80(eVar2.getF273949a() / eVar2.getF273950b(), false);
            return eVar;
        }
    }

    @Inject
    public a(@Y61.k i iVar, @Y61.k com.avito.android.serp.e eVar, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87703a = iVar;
        this.f87704b = eVar;
        this.f87705c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87703a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<Hb.e> b() {
        return this.f87706d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof YandexBannerItem) {
            YandexBannerItem yandexBannerItem = (YandexBannerItem) aVar;
            if (yandexBannerItem.getBanner().f88499b.getAdType() != NativeAdType.MEDIA && !yandexBannerItem.getDisplayType().isInformative() && yandexBannerItem.getAdViewType() == AdViewType.f86910d) {
                return true;
            }
        }
        return false;
    }
}
