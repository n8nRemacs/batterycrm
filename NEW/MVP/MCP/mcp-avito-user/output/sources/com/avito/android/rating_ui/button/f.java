package com.avito.android.rating_ui.button;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/button/f;", "Lcom/avito/android/rating_ui/button/d;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<a> f249995b;

    @Inject
    public f(@k l41.g<a> gVar) {
        this.f249995b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        BaseRatingButtonItem baseRatingButtonItem = (BaseRatingButtonItem) aVar;
        hVar.E(baseRatingButtonItem.c());
        hVar.sE(baseRatingButtonItem.getAction());
        hVar.R4(new e(this, baseRatingButtonItem));
        hVar.Xu(baseRatingButtonItem.getType());
    }
}
