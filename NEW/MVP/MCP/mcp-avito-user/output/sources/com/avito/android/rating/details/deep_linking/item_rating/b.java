package com.avito.android.rating.details.deep_linking.item_rating;

import Ju.AbstractC14250d;
import android.os.Bundle;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.deep_linking.ItemRatingsLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemRatingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bundle f246952l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f246953m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ItemRatingsLink f246954n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Bundle bundle, c cVar, ItemRatingsLink itemRatingsLink) {
        super(0);
        this.f246952l = bundle;
        this.f246953m = cVar;
        this.f246954n = itemRatingsLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ReviewsOpenPageFrom.f91254c.getClass();
        ReviewsOpenPageFrom reviewsOpenPageFromA = ReviewsOpenPageFrom.a.a(this.f246952l);
        c cVar = this.f246953m;
        ItemRatingsLink itemRatingsLink = this.f246954n;
        cVar.f246956g.R(cVar.f246955f.d(itemRatingsLink.f132846b, reviewsOpenPageFromA, itemRatingsLink.f132847c), com.avito.android.deeplink_handler.view.b.f134588l);
        cVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
