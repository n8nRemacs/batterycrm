package com.avito.android.publish.slots.final_state_suggest.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FinalStateSuggestItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f243922a;

    /* renamed from: b, reason: collision with root package name */
    public final u f243923b;

    public c(u uVar, Provider provider) {
        this.f243922a = provider;
        this.f243923b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f243922a.get(), (com.avito.android.util.text.a) this.f243923b.get());
    }
}
