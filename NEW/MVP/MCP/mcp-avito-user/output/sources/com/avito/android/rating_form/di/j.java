package com.avito.android.rating_form.di;

import com.avito.android.rating_form.RatingFormArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormModule_ProvideIsRedesignFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f248120a;

    public j(dagger.internal.l lVar) {
        this.f248120a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RatingFormArguments ratingFormArguments = (RatingFormArguments) this.f248120a.f393949a;
        h.f248117a.getClass();
        return Boolean.valueOf(ratingFormArguments instanceof RatingFormArguments.RatingSellerArguments);
    }
}
