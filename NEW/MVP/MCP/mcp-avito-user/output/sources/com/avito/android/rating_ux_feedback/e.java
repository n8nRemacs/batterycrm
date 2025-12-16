package com.avito.android.rating_ux_feedback;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingUxFeedbackDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f250492a;

    /* renamed from: b, reason: collision with root package name */
    public final u f250493b;

    public e(u uVar, Provider provider) {
        this.f250492a = provider;
        this.f250493b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f250492a.get(), (f) this.f250493b.get());
    }
}
