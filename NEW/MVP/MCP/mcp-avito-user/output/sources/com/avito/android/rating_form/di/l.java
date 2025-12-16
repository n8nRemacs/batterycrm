package com.avito.android.rating_form.di;

import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.RatingFormStepProgressInteractor;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormModule_ProvideRatingFormStepProgressTypeFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<RatingFormStepProgressInteractor.RatingFormStepProgressType> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f248130a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Boolean> f248131b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f248130a = lVar;
        this.f248131b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RatingFormArguments ratingFormArguments = (RatingFormArguments) this.f248130a.f393949a;
        boolean zBooleanValue = this.f248131b.get().booleanValue();
        h.f248117a.getClass();
        return ratingFormArguments instanceof RatingFormArguments.RatingModelArguments ? RatingFormStepProgressInteractor.RatingFormStepProgressType.f247918b : ((ratingFormArguments instanceof RatingFormArguments.RatingSellerArguments) && zBooleanValue) ? RatingFormStepProgressInteractor.RatingFormStepProgressType.f247919c : RatingFormStepProgressInteractor.RatingFormStepProgressType.f247920d;
    }
}
