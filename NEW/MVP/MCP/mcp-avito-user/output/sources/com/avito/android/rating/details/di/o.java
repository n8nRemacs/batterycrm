package com.avito.android.rating.details.di;

import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.details.converter.A;
import com.avito.android.rating.details.converter.C34169a;
import com.avito.android.rating.details.converter.C34170b;
import com.avito.android.rating.details.converter.E;
import com.avito.android.rating.details.converter.F;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingDetailsModule_ProvideRatingDetailsReviewConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<com.avito.android.rating.details.converter.y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f247005a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A> f247006b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.rating.details.converter.q> f247007c;

    /* renamed from: d, reason: collision with root package name */
    public final u f247008d;

    public o(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f247005a = lVar;
        this.f247006b = provider;
        this.f247007c = provider2;
        this.f247008d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        RatingDetailsArguments ratingDetailsArguments = (RatingDetailsArguments) this.f247005a.f393949a;
        A a12 = this.f247006b.get();
        com.avito.android.rating.details.converter.q qVar = this.f247007c.get();
        com.avito.android.rating.details.converter.u uVar = (com.avito.android.rating.details.converter.u) this.f247008d.get();
        e.f246981a.getClass();
        if (ratingDetailsArguments instanceof RatingDetailsArguments.UserRating) {
            return new E(a12, uVar, qVar);
        }
        if (ratingDetailsArguments instanceof RatingDetailsArguments.PublicProfileRating) {
            return new C34170b(uVar, qVar);
        }
        if (ratingDetailsArguments instanceof RatingDetailsArguments.UserReviews) {
            return new F(a12, uVar, qVar);
        }
        if (ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews) {
            return new C34169a(uVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
