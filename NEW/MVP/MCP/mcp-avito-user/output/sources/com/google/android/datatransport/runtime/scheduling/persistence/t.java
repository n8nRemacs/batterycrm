package com.google.android.datatransport.runtime.scheduling.persistence;

import javax.inject.Provider;

/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: classes10.dex */
public final class t implements com.google.android.datatransport.runtime.dagger.internal.g<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.e f343271a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.f f343272b;

    /* renamed from: c, reason: collision with root package name */
    public final j f343273c;

    /* renamed from: d, reason: collision with root package name */
    public final w f343274d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<String> f343275e;

    public t(com.google.android.datatransport.runtime.time.e eVar, com.google.android.datatransport.runtime.time.f fVar, j jVar, w wVar, Provider provider) {
        this.f343271a = eVar;
        this.f343272b = fVar;
        this.f343273c = jVar;
        this.f343274d = wVar;
        this.f343275e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f343271a.getClass();
        com.google.android.datatransport.runtime.time.i iVar = new com.google.android.datatransport.runtime.time.i();
        this.f343272b.getClass();
        return new s(iVar, new com.google.android.datatransport.runtime.time.g(), (e) this.f343273c.get(), (v) this.f343274d.get(), this.f343275e);
    }
}
