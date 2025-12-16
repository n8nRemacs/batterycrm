package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: EventStoreModule_DbNameFactory.java */
/* loaded from: classes10.dex */
public final class g implements com.google.android.datatransport.runtime.dagger.internal.g<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f343244a = new g();
    }

    public static g a() {
        return a.f343244a;
    }

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        return "com.google.android.datatransport.events";
    }
}
