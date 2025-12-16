package com.avito.android.search.filter.adapter.switcher_with_hint;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: SwitcherWithHintItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262619a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f262620b;

    public c(u uVar, Provider provider) {
        this.f262619a = uVar;
        this.f262620b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f262619a.get(), this.f262620b.get());
    }
}
