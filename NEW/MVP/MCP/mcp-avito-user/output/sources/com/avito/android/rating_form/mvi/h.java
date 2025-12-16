package com.avito.android.rating_form.mvi;

import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f248777a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248778b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f248779c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f248780d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f248781e;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider, Provider provider2) {
        this.f248777a = provider;
        this.f248778b = lVar;
        this.f248779c = lVar2;
        this.f248780d = provider2;
        this.f248781e = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f248777a.get(), ((Boolean) this.f248778b.f393949a).booleanValue(), (RatingFormArguments) this.f248779c.f393949a, this.f248780d.get(), ((Boolean) this.f248781e.f393949a).booleanValue());
    }
}
