package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi;

import b10.C25388c;
import b10.InterfaceC25386a;
import com.avito.android.mortgage.root.list.items.immutable_info.description.model.ImmutableInfoDescriptionArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImmutableInfoDescriptionBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f202613a;

    /* renamed from: b, reason: collision with root package name */
    public final C25388c f202614b;

    public d(l lVar, C25388c c25388c) {
        this.f202613a = lVar;
        this.f202614b = c25388c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((ImmutableInfoDescriptionArguments) this.f202613a.f393949a, (InterfaceC25386a) this.f202614b.get());
    }
}
