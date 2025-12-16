package com.avito.android.help_center;

/* compiled from: HelpCenterUrlInterceptorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f161606a;

    public G(dagger.internal.u uVar) {
        this.f161606a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F((H) this.f161606a.get());
    }
}
