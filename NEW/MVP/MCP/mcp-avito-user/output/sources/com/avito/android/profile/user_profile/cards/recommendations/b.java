package com.avito.android.profile.user_profile.cards.recommendations;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecommendationsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/recommendations/b;", "LTV0/b;", "Lcom/avito/android/profile/user_profile/cards/recommendations/i;", "Lcom/avito/android/profile/user_profile/cards/CardItem$RecommendationsItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<i, CardItem.RecommendationsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f225281a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f225282b;

    /* compiled from: RecommendationsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/user_profile/cards/recommendations/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/user_profile/cards/recommendations/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.util.text.a f225283l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.util.text.a aVar) {
            super(2);
            this.f225283l = aVar;
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view, this.f225283l);
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f225281a = dVar;
        this.f225282b = new g.a<>(R.layout.profile_item_recommendations, new a(aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f225281a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f225282b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof CardItem.RecommendationsItem;
    }
}
