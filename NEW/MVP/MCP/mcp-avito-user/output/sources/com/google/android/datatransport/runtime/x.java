package com.google.android.datatransport.runtime;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes10.dex */
public final class x implements com.google.android.datatransport.runtime.dagger.internal.g<v> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.e f343297a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.f f343298b;

    /* renamed from: c, reason: collision with root package name */
    public final FX0.d f343299c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.j f343300d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.l f343301e;

    public x(com.google.android.datatransport.runtime.time.e eVar, com.google.android.datatransport.runtime.time.f fVar, FX0.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.j jVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.l lVar) {
        this.f343297a = eVar;
        this.f343298b = fVar;
        this.f343299c = dVar;
        this.f343300d = jVar;
        this.f343301e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f343297a.getClass();
        com.google.android.datatransport.runtime.time.i iVar = new com.google.android.datatransport.runtime.time.i();
        this.f343298b.getClass();
        return new v(iVar, new com.google.android.datatransport.runtime.time.g(), (FX0.e) this.f343299c.get(), (com.google.android.datatransport.runtime.scheduling.jobscheduling.i) this.f343300d.get(), (com.google.android.datatransport.runtime.scheduling.jobscheduling.k) this.f343301e.get());
    }
}
