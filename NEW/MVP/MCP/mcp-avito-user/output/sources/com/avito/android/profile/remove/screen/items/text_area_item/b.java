package com.avito.android.profile.remove.screen.items.text_area_item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TextAreaBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f224144a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f224145b;

    public b(u uVar, Provider provider) {
        this.f224144a = uVar;
        this.f224145b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f224144a.get(), this.f224145b.get());
    }
}
