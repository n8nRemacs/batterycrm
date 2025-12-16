package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MergedPretendPremoderationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f241827a;

    /* renamed from: b, reason: collision with root package name */
    public final f f241828b;

    /* renamed from: c, reason: collision with root package name */
    public final m f241829c;

    /* renamed from: d, reason: collision with root package name */
    public final o f241830d;

    public k(h hVar, f fVar, m mVar, o oVar) {
        this.f241827a = hVar;
        this.f241828b = fVar;
        this.f241829c = mVar;
        this.f241830d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f241827a.get();
        a aVar = (a) this.f241828b.get();
        this.f241829c.getClass();
        l lVar = new l();
        this.f241830d.getClass();
        n nVar = new n();
        Ke0.d.f9588d.getClass();
        return new j("MergedPretendPremoderation", Ke0.d.f9589e, new i(gVar, aVar, nVar, lVar));
    }
}
