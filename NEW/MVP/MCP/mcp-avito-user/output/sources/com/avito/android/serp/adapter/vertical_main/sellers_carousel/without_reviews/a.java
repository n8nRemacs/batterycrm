package com.avito.android.serp.adapter.vertical_main.sellers_carousel.without_reviews;

import Oi0.C14700d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import bs0.InterfaceC25701b;
import bs0.InterfaceC25702c;
import com.avito.android.R;
import com.avito.android.remote.model.vertical_main.SellersCarouselWidget;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.SellersCarouselWidgetItem;
import com.avito.konveyor.adapter.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellersCarouselWithoutReviewsWidgetBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/without_reviews/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/without_reviews/e;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/SellersCarouselWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<e, SellersCarouselWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f273211a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f273212b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f273213c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView.l f273214d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f273215e = new g.a<>(R.layout.sellers_carousel_without_reviews_widget, new C8108a());

    /* compiled from: SellersCarouselWithoutReviewsWidgetBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/without_reviews/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/without_reviews/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.sellers_carousel.without_reviews.a$a, reason: collision with other inner class name */
    public static final class C8108a extends N implements p<ViewGroup, View, e> {
        public C8108a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new e(view, aVar.f273212b, aVar.f273213c, aVar.f273214d);
        }
    }

    @Inject
    public a(@k c cVar, @InterfaceC25701b @k h hVar, @InterfaceC25701b @k C14700d c14700d, @k @InterfaceC25702c RecyclerView.l lVar) {
        this.f273211a = cVar;
        this.f273212b = hVar;
        this.f273213c = c14700d;
        this.f273214d = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273211a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f273215e;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof SellersCarouselWidgetItem) {
            if (((SellersCarouselWidgetItem) aVar).f273154f == SellersCarouselWidget.Template.NO_REVIEWS) {
                return true;
            }
        }
        return false;
    }
}
