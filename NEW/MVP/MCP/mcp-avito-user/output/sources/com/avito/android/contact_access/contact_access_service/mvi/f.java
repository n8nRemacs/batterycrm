package com.avito.android.contact_access.contact_access_service.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessServiceEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f125996a;

    public f(Provider<InterfaceC35741a1> provider) {
        this.f125996a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f125996a.get());
    }
}
