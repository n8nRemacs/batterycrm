package com.avito.android.analytics.clickstream;

import com.avito.android.analytics.clickstream.C28379d;

/* compiled from: ClickStreamCommonModule_ProvideInstantEventsFilters$_common_analytics_clickstream_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28389n implements dagger.internal.h<C28379d.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f89818a;

    public C28389n(dagger.internal.u uVar) {
        this.f89818a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.inhouse_transport.o oVar = (com.avito.android.analytics.inhouse_transport.o) this.f89818a.get();
        C28379d.f89781a.getClass();
        return new U(oVar);
    }
}
