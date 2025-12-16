package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes10.dex */
public final class l implements com.google.android.datatransport.runtime.dagger.internal.g<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.dagger.internal.j f343111a;

    /* renamed from: b, reason: collision with root package name */
    public final j f343112b;

    public l(com.google.android.datatransport.runtime.dagger.internal.j jVar, j jVar2) {
        this.f343111a = jVar;
        this.f343112b = jVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Context) this.f343111a.f343133a, (i) this.f343112b.get());
    }
}
