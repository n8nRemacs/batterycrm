package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: AvitoApplicationModule_ProvideOrientationTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C1 implements dagger.internal.h<com.avito.android.analytics.Y> {

    /* renamed from: a, reason: collision with root package name */
    public final B1 f143864a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.S f143865b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f143866c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f143867d;

    public C1(B1 b12, com.avito.android.S s5, dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f143864a = b12;
        this.f143865b = s5;
        this.f143866c = fVar;
        this.f143867d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f143865b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f143866c.get();
        Application application = (Application) this.f143867d.f393949a;
        this.f143864a.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[28];
        if (((Boolean) p12.f67434t.a().invoke()).booleanValue()) {
            return new com.avito.android.analytics.Y(interfaceC28373a, application.getResources().getConfiguration());
        }
        return null;
    }
}
