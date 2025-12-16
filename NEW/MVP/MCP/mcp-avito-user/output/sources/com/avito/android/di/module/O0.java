package com.avito.android.di.module;

/* compiled from: AppMetricaParamsModule_ProvideAppMetricaAdditionalInfoSendingEnabledFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class O0 implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final M0 f144085a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.S f144086b;

    public O0(M0 m02, com.avito.android.S s5) {
        this.f144085a = m02;
        this.f144086b = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f144086b.get();
        this.f144085a.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[56];
        Boolean bool = (Boolean) p12.f67387Q.a().invoke();
        bool.getClass();
        return bool;
    }
}
