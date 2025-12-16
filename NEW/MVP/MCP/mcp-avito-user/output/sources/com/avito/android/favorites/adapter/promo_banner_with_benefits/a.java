package com.avito.android.favorites.adapter.promo_banner_with_benefits;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromoBannerRecallWithBenefitsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/promo_banner_with_benefits/a;", "LTV0/b;", "Lcom/avito/android/favorites/adapter/promo_banner_with_benefits/j;", "Lcom/avito/android/favorites/adapter/promo_banner_with_benefits/PromoBannerRecallWithBenefitsItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<j, PromoBannerRecallWithBenefitsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f156728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f156729b = new g.a<>(R.layout.favorites_promo_with_benefits, C4594a.f156730l);

    /* compiled from: PromoBannerRecallWithBenefitsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/favorites/adapter/promo_banner_with_benefits/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/favorites/adapter/promo_banner_with_benefits/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.adapter.promo_banner_with_benefits.a$a, reason: collision with other inner class name */
    public static final class C4594a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4594a f156730l = new C4594a();

        public C4594a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view);
        }
    }

    @Inject
    public a(@Y61.k g gVar) {
        this.f156728a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f156728a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f156729b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof PromoBannerRecallWithBenefitsItem;
    }
}
