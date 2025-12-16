package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.step.RatingFormStepArguments;
import javax.inject.Provider;

/* compiled from: RatingFormStepActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249658a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f249659b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f249660c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f249661d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.step.f> f249662e;

    public n(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f249658a = provider;
        this.f249659b = lVar;
        this.f249660c = provider2;
        this.f249661d = uVar;
        this.f249662e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f249658a.get(), (RatingFormStepArguments) this.f249659b.f393949a, this.f249660c.get(), (com.avito.android.rating_form.step.validations.o) this.f249661d.get(), this.f249662e.get());
    }
}
