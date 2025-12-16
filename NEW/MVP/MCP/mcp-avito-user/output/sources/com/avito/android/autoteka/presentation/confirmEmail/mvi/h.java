package com.avito.android.autoteka.presentation.confirmEmail.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaConfirmEmailFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f97266a;

    /* renamed from: b, reason: collision with root package name */
    public final e f97267b;

    /* renamed from: c, reason: collision with root package name */
    public final j f97268c;

    /* renamed from: d, reason: collision with root package name */
    public final l f97269d;

    public h(c cVar, e eVar, j jVar, l lVar) {
        this.f97266a = cVar;
        this.f97267b = eVar;
        this.f97268c = jVar;
        this.f97269d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f97266a.get();
        this.f97267b.getClass();
        d dVar = new d();
        this.f97268c.getClass();
        i iVar = new i();
        this.f97269d.getClass();
        k kVar = new k();
        Jf.d.f9091c.getClass();
        return new g("AutotekaConfirmEmail", Jf.d.f9092d, new f(bVar, dVar, iVar, kVar));
    }
}
