package com.avito.android.di.module;

import Tj0.C15370a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.C34390u;
import com.avito.android.service.short_task.ShortTask;
import javax.inject.Provider;

/* compiled from: BuildDependenciesModule_ProvideDownloadUpdateTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.h2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30057h2 implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144308a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f144309b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f144310c;

    /* renamed from: d, reason: collision with root package name */
    public final C15370a f144311d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144312e;

    /* renamed from: f, reason: collision with root package name */
    public final C30156q2 f144313f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f144314g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.permissions.w f144315h;

    public C30057h2(dagger.internal.l lVar, Provider provider, dagger.internal.u uVar, C15370a c15370a, Provider provider2, C30156q2 c30156q2, dagger.internal.f fVar, com.avito.android.permissions.w wVar) {
        this.f144308a = lVar;
        this.f144309b = provider;
        this.f144310c = uVar;
        this.f144311d = c15370a;
        this.f144312e = provider2;
        this.f144313f = c30156q2;
        this.f144314g = fVar;
        this.f144315h = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Bw0.f fVar = (Bw0.f) this.f144308a.f393949a;
        com.avito.android.util.R0 r02 = this.f144309b.get();
        C34390u c34390u = (C34390u) this.f144310c.get();
        this.f144311d.getClass();
        com.avito.android.remote.config.b bVar = new com.avito.android.remote.config.b();
        com.avito.android.util.C c12 = this.f144312e.get();
        com.avito.android.silent_update.download.e eVar = (com.avito.android.silent_update.download.e) this.f144313f.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144314g.get();
        com.avito.android.permissions.u uVar = (com.avito.android.permissions.u) this.f144315h.get();
        C29980a2.f144226a.getClass();
        return fVar.a(r02, c34390u, bVar, c12, eVar, interfaceC28373a, uVar);
    }
}
