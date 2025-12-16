package com.avito.android.profile.pro.impl.screen.item.recommendations;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileProRecommendationsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/recommendations/a;", "LTV0/b;", "Lcom/avito/android/profile/pro/impl/screen/item/recommendations/g;", "Lcom/avito/android/profile/pro/impl/screen/item/recommendations/ProfileProRecommendationsItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<g, ProfileProRecommendationsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f223413a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223414b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<j> f223415c = new g.a<>(R.layout.item_profile_pro_recommendations, new C6764a());

    /* compiled from: ProfileProRecommendationsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/pro/impl/screen/item/recommendations/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/pro/impl/screen/item/recommendations/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.pro.impl.screen.item.recommendations.a$a, reason: collision with other inner class name */
    public static final class C6764a extends N implements p<ViewGroup, View, j> {
        public C6764a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, a.this.f223414b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar) {
        this.f223413a = cVar;
        this.f223414b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f223413a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f223415c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ProfileProRecommendationsItem;
    }
}
