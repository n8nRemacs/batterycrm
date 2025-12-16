package com.avito.android.rating.details.di;

import com.avito.android.rating.details.RatingDetailsArguments;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingDetailsModule_ProvideRatingDetailsIsReviewStatusRedesignFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f247003a;

    /* renamed from: b, reason: collision with root package name */
    public final WD.c f247004b;

    public n(dagger.internal.l lVar, WD.c cVar) {
        this.f247003a = lVar;
        this.f247004b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zA2;
        RatingDetailsArguments ratingDetailsArguments = (RatingDetailsArguments) this.f247003a.f393949a;
        WD.a aVar = (WD.a) this.f247004b.get();
        e.f246981a.getClass();
        if (ratingDetailsArguments instanceof RatingDetailsArguments.UserRating) {
            zA2 = aVar.b().f439742a.f439749b.a();
        } else if (ratingDetailsArguments instanceof RatingDetailsArguments.UserReviews) {
            zA2 = aVar.a().f439742a.f439749b.a();
        } else {
            if (!(ratingDetailsArguments instanceof RatingDetailsArguments.PublicProfileRating ? true : ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews)) {
                throw new NoWhenBranchMatchedException();
            }
            zA2 = false;
        }
        return Boolean.valueOf(zA2);
    }
}
