package com.avito.android.analytics.clickstream;

import com.avito.android.InterfaceC32896n;
import javax.inject.Provider;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamCommonModule_ProvideInMemoryClickStreamEventStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28387l implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.v<EventOuterClass.Event>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32896n> f89813a;

    public C28387l(Provider<InterfaceC32896n> provider) {
        this.f89813a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC32896n interfaceC32896n = this.f89813a.get();
        C28379d c28379d = C28379d.f89781a;
        return new com.avito.android.analytics.inhouse_transport.v(interfaceC32896n.e().invoke().booleanValue() ? 30 : 100);
    }
}
