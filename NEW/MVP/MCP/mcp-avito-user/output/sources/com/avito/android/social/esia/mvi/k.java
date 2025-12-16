package com.avito.android.social.esia.mvi;

import Yw0.InterfaceC18344d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final b f284410a;

    /* renamed from: b, reason: collision with root package name */
    public final m f284411b;

    /* renamed from: c, reason: collision with root package name */
    public final h f284412c;

    public k(b bVar, m mVar, h hVar) {
        this.f284410a = bVar;
        this.f284411b = mVar;
        this.f284412c = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f284410a.get();
        this.f284411b.getClass();
        return new j("Esia", InterfaceC18344d.c.f19752a, new i(aVar, new l(), (g) this.f284412c.get()));
    }
}
