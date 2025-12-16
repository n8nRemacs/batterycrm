package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes10.dex */
public final class w implements com.google.android.datatransport.runtime.dagger.internal.g<v> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.dagger.internal.j f343282a;

    /* renamed from: b, reason: collision with root package name */
    public final g f343283b;

    /* renamed from: c, reason: collision with root package name */
    public final i f343284c;

    public w(com.google.android.datatransport.runtime.dagger.internal.j jVar, g gVar, i iVar) {
        this.f343282a = jVar;
        this.f343283b = gVar;
        this.f343284c = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f343282a.f343133a;
        this.f343283b.getClass();
        this.f343284c.getClass();
        return new v(context, Integer.valueOf(v.f343278e).intValue(), "com.google.android.datatransport.events");
    }
}
