package com.avito.android.analytics.clickstream;

import com.avito.android.di.module.C30214v6;

/* compiled from: ClickStreamCommonModule_ProvideClickStreamSettingsStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28382g implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.l> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f89802a;

    public C28382g(C30214v6 c30214v6) {
        this.f89802a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f89802a.get();
        C28379d c28379d = C28379d.f89781a;
        return new com.avito.android.analytics.inhouse_transport.n(lVar, "clickstream");
    }
}
