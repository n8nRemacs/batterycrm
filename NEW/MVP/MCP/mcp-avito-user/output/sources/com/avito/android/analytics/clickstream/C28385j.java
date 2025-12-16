package com.avito.android.analytics.clickstream;

import android.app.Application;

/* compiled from: ClickStreamCommonModule_ProvideFileStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28385j implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f89806a;

    public C28385j(dagger.internal.l lVar) {
        this.f89806a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f89806a.f393949a;
        C28379d c28379d = C28379d.f89781a;
        return new com.avito.android.analytics.inhouse_transport.f("clickstream", application);
    }
}
