package com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews;

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

/* compiled from: SellerWithReviewsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/reviews/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/reviews/e;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/SellerItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<e, SellerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f273183a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<e> f273184b = new g.a<>(R.layout.sellers_carousel_list_item_with_reviews, C8106a.f273185l);

    /* compiled from: SellerWithReviewsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/reviews/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/reviews/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews.a$a, reason: collision with other inner class name */
    public static final class C8106a extends N implements p<ViewGroup, View, e> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8106a f273185l = new C8106a();

        public C8106a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            return new e(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f273183a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273183a;
    }

    @Override // TV0.b
    @k
    public final g.a<e> b() {
        return this.f273184b;
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
            if (((SellerItem) aVar).f273169j == SellersCarouselWidget.Template.WITH_REVIEWS) {
                return true;
            }
        }
        return false;
    }
}
