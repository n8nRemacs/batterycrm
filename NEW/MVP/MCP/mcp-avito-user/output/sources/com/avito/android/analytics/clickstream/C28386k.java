package com.avito.android.analytics.clickstream;

import javax.inject.Provider;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamCommonModule_ProvideHotSwapClickStreamEventStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28386k implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.inhouse_transport.v<EventOuterClass.Event>> f89808a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f89809b;

    public C28386k(dagger.internal.u uVar, Provider provider) {
        this.f89808a = provider;
        this.f89809b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f89809b));
        C28379d c28379d = C28379d.f89781a;
        return new com.avito.android.analytics.inhouse_transport.j(this.f89808a, eVarA);
    }
}
