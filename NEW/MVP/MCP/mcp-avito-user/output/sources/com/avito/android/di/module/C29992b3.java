package com.avito.android.di.module;

import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.C28455g;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: CoreAnalyticsModule_ProvideAnalyticsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.b3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29992b3 implements dagger.internal.h<InterfaceC28373a> {

    /* renamed from: a, reason: collision with root package name */
    public final C29981a3 f144233a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.A f144234b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32896n> f144235c;

    public C29992b3(C29981a3 c29981a3, dagger.internal.A a12, Provider provider) {
        this.f144233a = c29981a3;
        this.f144234b = a12;
        this.f144235c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f144234b.get();
        InterfaceC32896n interfaceC32896n = this.f144235c.get();
        this.f144233a.getClass();
        return new C28455g(set, interfaceC32896n.o().invoke().booleanValue());
    }
}
