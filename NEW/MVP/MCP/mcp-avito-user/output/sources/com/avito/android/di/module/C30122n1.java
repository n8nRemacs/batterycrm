package com.avito.android.di.module;

import com.avito.android.C34161r;
import com.avito.android.di.component.InterfaceC29905l;
import com.avito.android.enabler.RemoteFeaturesDecorator;
import com.avito.android.util.InterfaceC35950u;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: AvitoAppBuildVariantFeaturesModule_ProvideAvitoFeaturesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.n1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30122n1 implements dagger.internal.h<C34161r> {

    /* renamed from: a, reason: collision with root package name */
    public final C30111m1 f144465a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144466b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f144467c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f144468d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.A f144469e;

    /* renamed from: f, reason: collision with root package name */
    public final X f144470f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f144471g;

    public C30122n1(C30111m1 c30111m1, dagger.internal.l lVar, Provider provider, dagger.internal.l lVar2, dagger.internal.A a12, X x12, dagger.internal.u uVar) {
        this.f144465a = c30111m1;
        this.f144466b = lVar;
        this.f144467c = provider;
        this.f144468d = lVar2;
        this.f144469e = a12;
        this.f144470f = x12;
        this.f144471g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144466b.f393949a;
        InterfaceC35950u interfaceC35950u = this.f144467c.get();
        Set set = (Set) this.f144469e.get();
        RemoteFeaturesDecorator remoteFeaturesDecorator = (RemoteFeaturesDecorator) this.f144470f.get();
        com.avito.android.analytics.features.a aVar = (com.avito.android.analytics.features.a) this.f144471g.get();
        this.f144465a.getClass();
        return interfaceC29905l.i(interfaceC35950u, set, remoteFeaturesDecorator, aVar);
    }
}
