package com.avito.android.rating_form.step.di;

import com.avito.android.rating_form.step.RatingFormStepFragment;
import dagger.internal.x;
import dagger.internal.y;
import java.lang.ref.WeakReference;

/* compiled from: RatingFormStepModule_ProvideFragmentWeakReferenceFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<WeakReference<RatingFormStepFragment>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f249288a;

    public j(dagger.internal.l lVar) {
        this.f249288a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        RatingFormStepFragment ratingFormStepFragment = (RatingFormStepFragment) this.f249288a.f393949a;
        e.f249279a.getClass();
        return new WeakReference(ratingFormStepFragment);
    }
}
