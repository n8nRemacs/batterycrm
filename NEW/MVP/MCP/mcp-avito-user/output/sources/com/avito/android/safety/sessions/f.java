package com.avito.android.safety.sessions;

import com.avito.android.remote.InterfaceC34243a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeleteSessionInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34243a1> f257938a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.remote.error.i f257939b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f257940c;

    public f(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f257938a = provider;
        this.f257939b = iVar;
        this.f257940c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.remote.error.f) this.f257939b.get(), this.f257940c.get(), dagger.internal.g.b(this.f257938a));
    }
}
