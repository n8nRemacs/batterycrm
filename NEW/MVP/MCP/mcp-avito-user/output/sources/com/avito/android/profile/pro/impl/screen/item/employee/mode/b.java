package com.avito.android.profile.pro.impl.screen.item.employee.mode;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProEmployeeModeButtonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f223249a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f223250b;

    public b(f fVar, Provider provider) {
        this.f223249a = fVar;
        this.f223250b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f223249a.get(), this.f223250b.get());
    }
}
