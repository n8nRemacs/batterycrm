package com.avito.android.rating_ui.badge_score;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingBadgeScoreItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/badge_score/g;", "Lcom/avito/android/rating_ui/badge_score/f;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<b> f249966b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<k> f249967c;

    @Inject
    public g(@Y61.k l41.g<b> gVar, @Y61.k l41.g<k> gVar2) {
        this.f249966b = gVar;
        this.f249967c = gVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        this.f249967c.accept(new k(aVar2));
        iVar.E(aVar2.getF78675h());
        iVar.e30(aVar2.getF78672e());
        iVar.MJ(aVar2.getF78673f());
        iVar.gp(aVar2.getF78671d());
        iVar.cN(new com.avito.android.publish.slots.delivery_addresses.f(14, aVar2, this));
    }
}
