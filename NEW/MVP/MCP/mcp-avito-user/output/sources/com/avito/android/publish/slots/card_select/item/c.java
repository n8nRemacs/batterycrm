package com.avito.android.publish.slots.card_select.item;

import Ze0.InterfaceC19549c;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CardSelectSlotItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f243143a;

    /* renamed from: b, reason: collision with root package name */
    public final u f243144b;

    public c(u uVar, Provider provider) {
        this.f243143a = provider;
        this.f243144b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f243143a.get(), (InterfaceC19549c) this.f243144b.get());
    }
}
