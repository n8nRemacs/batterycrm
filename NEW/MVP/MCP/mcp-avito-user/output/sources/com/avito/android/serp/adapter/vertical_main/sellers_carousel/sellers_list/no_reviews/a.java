package com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.vertical_main.SellersCarouselWidget;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.SellerItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerWithoutReviewsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/no_reviews/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/no_reviews/g;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/SellerItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<g, SellerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f273170a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f273171b = new g.a<>(R.layout.sellers_carousel_list_item_without_reviews, C8105a.f273172l);

    /* compiled from: SellerWithoutReviewsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/no_reviews/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/no_reviews/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews.a$a, reason: collision with other inner class name */
    public static final class C8105a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8105a f273172l = new C8105a();

        public C8105a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view);
        }
    }

    @Inject
    public a(@k e eVar) {
        this.f273170a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273170a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f273171b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof SellerItem) {
            if (((SellerItem) aVar).f273169j == SellersCarouselWidget.Template.NO_REVIEWS) {
                return true;
            }
        }
        return false;
    }
}
