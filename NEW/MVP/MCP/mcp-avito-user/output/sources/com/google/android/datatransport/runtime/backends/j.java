package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes10.dex */
public final class j implements com.google.android.datatransport.runtime.dagger.internal.g<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.dagger.internal.j f343103a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.e f343104b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.f f343105c;

    public j(com.google.android.datatransport.runtime.dagger.internal.j jVar, com.google.android.datatransport.runtime.time.e eVar, com.google.android.datatransport.runtime.time.f fVar) {
        this.f343103a = jVar;
        this.f343104b = eVar;
        this.f343105c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f343103a.f343133a;
        this.f343104b.getClass();
        com.google.android.datatransport.runtime.time.i iVar = new com.google.android.datatransport.runtime.time.i();
        this.f343105c.getClass();
        return new i(context, iVar, new com.google.android.datatransport.runtime.time.g());
    }
}
