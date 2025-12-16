package com.avito.android.di.module;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service.short_task.metrics.C34905a;
import com.avito.android.service.short_task.metrics.C34906b;
import com.avito.android.service.short_task.metrics.DarkThemeDetectionProvider;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.collections.C42745f0;

/* compiled from: SendMetricsModule_ProvideSendMetricsTaskDelegate$_avito_application_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M7 implements dagger.internal.h<com.avito.android.service.short_task.metrics.w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service.short_task.metrics.s f144065a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service.short_task.metrics.j f144066b;

    /* renamed from: c, reason: collision with root package name */
    public final C34906b f144067c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.service.short_task.metrics.l f144068d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f144069e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.service.short_task.metrics.p f144070f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.service.short_task.metrics.f f144071g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f144072h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144073i;

    public M7(com.avito.android.service.short_task.metrics.s sVar, com.avito.android.service.short_task.metrics.j jVar, C34906b c34906b, com.avito.android.service.short_task.metrics.l lVar, dagger.internal.u uVar, com.avito.android.service.short_task.metrics.p pVar, com.avito.android.service.short_task.metrics.f fVar, Provider provider, Provider provider2) {
        this.f144065a = sVar;
        this.f144066b = jVar;
        this.f144067c = c34906b;
        this.f144068d = lVar;
        this.f144069e = uVar;
        this.f144070f = pVar;
        this.f144071g = fVar;
        this.f144072h = provider;
        this.f144073i = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service.short_task.metrics.r rVar = (com.avito.android.service.short_task.metrics.r) this.f144065a.get();
        com.avito.android.service.short_task.metrics.h hVar = (com.avito.android.service.short_task.metrics.h) this.f144066b.get();
        C34905a c34905a = (C34905a) this.f144067c.get();
        com.avito.android.service.short_task.metrics.k kVar = (com.avito.android.service.short_task.metrics.k) this.f144068d.get();
        com.avito.android.service.short_task.metrics.g gVar = (com.avito.android.service.short_task.metrics.g) this.f144069e.get();
        com.avito.android.service.short_task.metrics.o oVar = (com.avito.android.service.short_task.metrics.o) this.f144070f.get();
        DarkThemeDetectionProvider darkThemeDetectionProvider = (DarkThemeDetectionProvider) this.f144071g.get();
        InterfaceC28373a interfaceC28373a = this.f144072h.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144073i.get();
        H7 h72 = H7.f143987a;
        return new com.avito.android.service.short_task.metrics.A(C42745f0.U(rVar, c34905a, hVar, kVar, gVar, oVar, darkThemeDetectionProvider), interfaceC28373a, interfaceC35745a5);
    }
}
