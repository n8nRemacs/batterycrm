package com.avito.android.publish.view;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BasicParameterClickListenerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f245635a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245636b;

    /* renamed from: c, reason: collision with root package name */
    public final u f245637c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f245635a = provider;
        this.f245636b = uVar;
        this.f245637c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f245635a.get(), (com.avito.android.details.j) this.f245636b.get(), (com.avito.android.deep_linking.x) this.f245637c.get());
    }
}
