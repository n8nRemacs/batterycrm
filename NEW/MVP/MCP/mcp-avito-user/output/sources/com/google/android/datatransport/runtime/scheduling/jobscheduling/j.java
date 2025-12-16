package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes10.dex */
public final class j implements com.google.android.datatransport.runtime.dagger.internal.g<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.dagger.internal.j f343213a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.backends.e> f343214b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.d> f343215c;

    /* renamed from: d, reason: collision with root package name */
    public final FX0.i f343216d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Executor> f343217e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<GX0.a> f343218f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.e f343219g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.f f343220h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.c> f343221i;

    public j(com.google.android.datatransport.runtime.dagger.internal.j jVar, Provider provider, Provider provider2, FX0.i iVar, Provider provider3, Provider provider4, com.google.android.datatransport.runtime.time.e eVar, com.google.android.datatransport.runtime.time.f fVar, Provider provider5) {
        this.f343213a = jVar;
        this.f343214b = provider;
        this.f343215c = provider2;
        this.f343216d = iVar;
        this.f343217e = provider3;
        this.f343218f = provider4;
        this.f343219g = eVar;
        this.f343220h = fVar;
        this.f343221i = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f343213a.f343133a;
        com.google.android.datatransport.runtime.backends.e eVar = this.f343214b.get();
        com.google.android.datatransport.runtime.scheduling.persistence.d dVar = this.f343215c.get();
        m mVar = (m) this.f343216d.get();
        Executor executor = this.f343217e.get();
        GX0.a aVar = this.f343218f.get();
        this.f343219g.getClass();
        com.google.android.datatransport.runtime.time.i iVar = new com.google.android.datatransport.runtime.time.i();
        this.f343220h.getClass();
        return new i(context, eVar, dVar, mVar, executor, aVar, iVar, new com.google.android.datatransport.runtime.time.g(), this.f343221i.get());
    }
}
