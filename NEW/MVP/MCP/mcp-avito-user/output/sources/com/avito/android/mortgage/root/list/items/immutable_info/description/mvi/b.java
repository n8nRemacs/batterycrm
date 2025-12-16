package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi;

import b10.C25388c;
import b10.InterfaceC25386a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImmutableInfoDescriptionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C25388c f202610a;

    public b(C25388c c25388c) {
        this.f202610a = c25388c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC25386a) this.f202610a.get());
    }
}
