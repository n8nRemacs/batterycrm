package com.avito.android.advert.item.safedeal.trust_factors.badge_bar;

import TV0.g;
import Y41.q;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrustFactorsBadgeBarBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/a;", "LTV0/b;", "Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/g;", "Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/TrustFactorsBadgeBarItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<g, TrustFactorsBadgeBarItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f79034a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f79035b = new g.a<>(R.layout.advert_details_safedeal_badge_bar_item, com.avito.android.advert.item.safedeal.trust_factors.utils.c.a(C2331a.f79036l));

    /* compiled from: TrustFactorsBadgeBarBlueprint.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/safedeal/trust_factors/i;", "tooltipHelper", "Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;Lcom/avito/android/advert/item/safedeal/trust_factors/i;)Lcom/avito/android/advert/item/safedeal/trust_factors/badge_bar/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.trust_factors.badge_bar.a$a, reason: collision with other inner class name */
    public static final class C2331a extends N implements q<ViewGroup, View, i, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2331a f79036l = new C2331a();

        public C2331a() {
            super(3);
        }

        @Override // Y41.q
        public final g invoke(ViewGroup viewGroup, View view, i iVar) {
            return new g(view, iVar);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f79034a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f79034a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f79035b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof TrustFactorsBadgeBarItem;
    }
}
