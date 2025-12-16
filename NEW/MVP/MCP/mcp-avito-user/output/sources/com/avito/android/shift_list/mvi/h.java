package com.avito.android.shift_list.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShiftListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f281065a;

    /* renamed from: b, reason: collision with root package name */
    public final u f281066b;

    public h(u uVar, Provider provider) {
        this.f281065a = provider;
        this.f281066b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f281065a.get(), (com.avito.android.shift_list.domain.a) this.f281066b.get());
    }
}
