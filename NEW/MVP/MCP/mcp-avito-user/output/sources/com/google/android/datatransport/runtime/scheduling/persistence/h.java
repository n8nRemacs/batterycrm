package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* loaded from: classes10.dex */
public final class h implements com.google.android.datatransport.runtime.dagger.internal.g<String> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.dagger.internal.j f343245a;

    public h(com.google.android.datatransport.runtime.dagger.internal.j jVar) {
        this.f343245a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String packageName = ((Context) this.f343245a.f343133a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
