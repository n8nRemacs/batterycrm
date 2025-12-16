package com.avito.android.motivation_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import v20.C49152c;

/* compiled from: MotivationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final e f206360a;

    /* renamed from: b, reason: collision with root package name */
    public final l f206361b;

    /* renamed from: c, reason: collision with root package name */
    public final n f206362c;

    /* renamed from: d, reason: collision with root package name */
    public final g f206363d;

    public j(e eVar, l lVar, n nVar, g gVar) {
        this.f206360a = eVar;
        this.f206361b = lVar;
        this.f206362c = nVar;
        this.f206363d = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f206360a.get();
        this.f206361b.getClass();
        return new i("MotivationScreen", new C49152c(null, null, null, null, null, null, null, null, null, null, null, false, false, false, 16383, null), new h(dVar, new k(), (m) this.f206362c.get(), (f) this.f206363d.get()));
    }
}
