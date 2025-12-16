package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.step.RatingFormStepArguments;
import javax.inject.Provider;

/* compiled from: RatingFormStepReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249534a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f249535b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.rating_form.l f249536c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f249537d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f249538e;

    public B(Provider provider, dagger.internal.l lVar, com.avito.android.rating_form.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f249534a = provider;
        this.f249535b = lVar;
        this.f249536c = lVar2;
        this.f249537d = lVar3;
        this.f249538e = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f249534a.get(), (RatingFormStepArguments) this.f249535b.f393949a, (com.avito.android.rating_form.i) this.f249536c.get(), (com.avito.android.deep_linking.links.w) this.f249537d.f393949a, (com.avito.android.deep_linking.links.x) this.f249538e.f393949a);
    }
}
