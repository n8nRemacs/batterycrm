package com.avito.android.profile.remove.screen.items.text;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f224134a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f224135b;

    public c(u uVar, Provider provider) {
        this.f224134a = uVar;
        this.f224135b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f224134a.get(), this.f224135b.get());
    }
}
