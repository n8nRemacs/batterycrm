package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.step.RatingFormStepArguments;
import javax.inject.Provider;

/* compiled from: RatingFormStepBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249699a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f249700b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.photo_picker.m> f249701c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.rating_form.l f249702d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f249703e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.j> f249704f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f249705g;

    public t(Provider provider, dagger.internal.l lVar, Provider provider2, com.avito.android.rating_form.l lVar2, Provider provider3, Provider provider4, dagger.internal.u uVar) {
        this.f249699a = provider;
        this.f249700b = lVar;
        this.f249701c = provider2;
        this.f249702d = lVar2;
        this.f249703e = provider3;
        this.f249704f = provider4;
        this.f249705g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f249699a.get(), (RatingFormStepArguments) this.f249700b.f393949a, this.f249701c.get(), (com.avito.android.rating_form.i) this.f249702d.get(), this.f249703e.get(), this.f249704f.get(), (com.avito.android.rating_form.step.f) this.f249705g.get());
    }
}
