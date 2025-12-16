package com.avito.android.di.module;

import android.content.Context;
import com.avito.android.util.InterfaceC35745a5;
import fg0.InterfaceC40418b;
import fg0.InterfaceC40420d;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: BuildDependenciesModule_ProvideHmsPushTokenProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.i2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30068i2 implements dagger.internal.h<Set<InterfaceC40420d>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144342a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f144343b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144344c;

    public C30068i2(dagger.internal.l lVar, C30102l3 c30102l3, Provider provider) {
        this.f144342a = lVar;
        this.f144343b = c30102l3;
        this.f144344c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40418b interfaceC40418b = (InterfaceC40418b) this.f144342a.f393949a;
        Context context = (Context) this.f144343b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144344c.get();
        C29980a2.f144226a.getClass();
        Set<InterfaceC40420d> setA = interfaceC40418b.a(context, interfaceC35745a5);
        dagger.internal.t.d(setA);
        return setA;
    }
}
