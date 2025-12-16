package com.avito.android.di.module;

/* compiled from: CoreAnalyticsModule_ProvideDeviceIdFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.c3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30003c3 implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final C29981a3 f144244a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144245b;

    public C30003c3(C29981a3 c29981a3, dagger.internal.u uVar) {
        this.f144244a = c29981a3;
        this.f144245b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.H h12 = (com.avito.android.remote.H) this.f144245b.get();
        this.f144244a.getClass();
        String value = h12.getValue();
        dagger.internal.t.d(value);
        return value;
    }
}
