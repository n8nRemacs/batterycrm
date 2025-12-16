package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ScreenAnalyticsModule_ProvideNetworkTypeProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.n7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30128n7 implements dagger.internal.h<com.avito.android.analytics.H> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144477a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144478b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144479c;

    public C30128n7(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f144477a = lVar;
        this.f144478b = provider;
        this.f144479c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f144477a.f393949a;
        com.avito.android.util.C c12 = this.f144478b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144479c.get();
        C30117m7.f144399a.getClass();
        return new com.avito.android.analytics.J(application, c12, interfaceC35745a5, null, 8, null);
    }
}
