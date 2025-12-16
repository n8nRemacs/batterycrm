package com.avito.android.analytics.clickstream;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamCommonModule_ProvideOnDiskClickStreamEventStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28390o implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.x<EventOuterClass.Event>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.inhouse_transport.e> f89819a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.inhouse_transport.l> f89820b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f89821c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f89822d;

    public C28390o(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f89819a = provider;
        this.f89820b = provider2;
        this.f89821c = uVar;
        this.f89822d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.inhouse_transport.e eVar = this.f89819a.get();
        com.avito.android.analytics.inhouse_transport.l lVar = this.f89820b.get();
        com.avito.android.analytics.inhouse_transport.c cVar = (com.avito.android.analytics.inhouse_transport.c) this.f89821c.get();
        InterfaceC35863o4 interfaceC35863o4 = this.f89822d.get();
        C28379d c28379d = C28379d.f89781a;
        return new com.avito.android.analytics.inhouse_transport.x(eVar, lVar, cVar, interfaceC35863o4);
    }
}
