package com.avito.android.rating_form.step.di;

import com.avito.android.rating_form.step.RatingFormStepArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormStepModule_ProvideIsModalFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f249289a;

    public k(dagger.internal.l lVar) {
        this.f249289a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        RatingFormStepArguments ratingFormStepArguments = (RatingFormStepArguments) this.f249289a.f393949a;
        e.f249279a.getClass();
        return Boolean.valueOf(ratingFormStepArguments.f249119g);
    }
}
