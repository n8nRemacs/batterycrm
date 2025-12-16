package com.avito.android.favorites.adapter.banner;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.promo.p;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.vertical_main.SalesPromoWidget;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SalesPromoItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/banner/e;", "Lcom/avito/android/favorites/adapter/banner/d;", "a", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f156538b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.favorites.adapter.promo.a f156539c;

    /* compiled from: SalesPromoItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/favorites/adapter/banner/e$a;", "", "<init>", "()V", "", "FROM_PAGE", "Ljava/lang/String;", "TARGET_PAGE", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k p pVar, @k com.avito.android.favorites.adapter.promo.a aVar) {
        this.f156538b = pVar;
        this.f156539c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        SalesPromoItem salesPromoItem = (SalesPromoItem) aVar;
        Q q12 = new Q("target_page", hVar.w(salesPromoItem.f156526d));
        SalesPromoWidget.AnalyticalParams analyticalParams = salesPromoItem.f156534l;
        LinkedHashMap linkedHashMapC = C35755b0.c(P0.g(q12, new Q("from_page", analyticalParams != null ? analyticalParams.getFromPage() : null)));
        hVar.R(salesPromoItem.f156527e);
        hVar.M(salesPromoItem.f156528f);
        DeepLink deepLink = salesPromoItem.f156530h;
        if (deepLink != null) {
            hVar.z00(new f(this, deepLink, linkedHashMapC));
        }
        UniversalImage universalImage = salesPromoItem.f156533k;
        if (universalImage != null) {
            hVar.Qs(universalImage);
        } else {
            String str = salesPromoItem.f156532j;
            if (str != null) {
                hVar.yB(str);
            } else {
                UniversalColor universalColor = salesPromoItem.f156531i;
                if (universalColor != null) {
                    hVar.wM(universalColor);
                }
            }
        }
        this.f156539c.O(new ParametrizedEvent(12265, 1, linkedHashMapC));
    }
}
