package com.avito.android.rating_form.step;

import android.content.ContentResolver;
import com.avito.android.J0;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: RatingFormFileInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f249720a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f249721b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Vg0.d> f249722c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f249723d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249724e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f249725f;

    public n(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f249720a = lVar;
        this.f249721b = lVar2;
        this.f249722c = provider;
        this.f249723d = uVar;
        this.f249724e = provider2;
        this.f249725f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((RatingFormStepArguments) this.f249720a.f393949a, (ContentResolver) this.f249721b.f393949a, this.f249722c.get(), (J0) this.f249723d.get(), this.f249724e.get(), this.f249725f.get());
    }
}
