package com.avito.android.profile.pro.impl.screen.item.group.row;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProGroupRowBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f223310a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f223311b;

    public c(f fVar, Provider provider) {
        this.f223310a = fVar;
        this.f223311b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f223310a.get(), this.f223311b.get());
    }
}
