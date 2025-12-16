package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* loaded from: classes10.dex */
public final class j implements com.google.android.datatransport.runtime.dagger.internal.g<e> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f343247a = new j();
    }

    public static j a() {
        return a.f343247a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.google.android.datatransport.runtime.scheduling.persistence.a aVar = e.f343243a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
