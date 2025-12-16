package com.avito.android.publish.screen.step.request.publish.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f241940a;

    /* renamed from: b, reason: collision with root package name */
    public final p f241941b;

    /* renamed from: c, reason: collision with root package name */
    public final r f241942c;

    public n(k kVar, p pVar, r rVar) {
        this.f241940a = kVar;
        this.f241941b = pVar;
        this.f241942c = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f241940a.get();
        this.f241941b.getClass();
        o oVar = new o();
        this.f241942c.getClass();
        q qVar = new q();
        Le0.d.f10058e.getClass();
        return new m("PublishRequest", Le0.d.f10059f, new l(jVar, qVar, oVar));
    }
}
