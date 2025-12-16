package com.avito.android.rating_form;

import com.avito.android.rating_form.RatingFormStepProgressInteractor;
import javax.inject.Provider;

/* compiled from: RatingFormStepProgressInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<y> f249772a;

    /* renamed from: b, reason: collision with root package name */
    public final u f249773b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.rating_form.di.l f249774c;

    public x(Provider provider, u uVar, com.avito.android.rating_form.di.l lVar) {
        this.f249772a = provider;
        this.f249773b = uVar;
        this.f249774c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f249772a.get(), (s) this.f249773b.get(), (RatingFormStepProgressInteractor.RatingFormStepProgressType) this.f249774c.get());
    }
}
