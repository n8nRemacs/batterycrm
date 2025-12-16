package com.avito.android.extended_profile_image_edit.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BannerImageEditFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f151099a;

    /* renamed from: b, reason: collision with root package name */
    public final i f151100b;

    /* renamed from: c, reason: collision with root package name */
    public final p f151101c;

    /* renamed from: d, reason: collision with root package name */
    public final r f151102d;

    public n(k kVar, i iVar, p pVar, r rVar) {
        this.f151099a = kVar;
        this.f151100b = iVar;
        this.f151101c = pVar;
        this.f151102d = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f151099a.get();
        g gVar = (g) this.f151100b.get();
        this.f151101c.getClass();
        o oVar = new o();
        q qVar = (q) this.f151102d.get();
        vA.d.f440505e.getClass();
        return new m("BannerImageEdit", vA.d.f440506f, new l(jVar, gVar, qVar, oVar));
    }
}
