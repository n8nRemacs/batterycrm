package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlin.collections.C42784z0;

/* compiled from: SuggestInstitutesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final g f292067a;

    /* renamed from: b, reason: collision with root package name */
    public final r f292068b;

    /* renamed from: c, reason: collision with root package name */
    public final p f292069c;

    /* renamed from: d, reason: collision with root package name */
    public final i f292070d;

    public l(g gVar, r rVar, p pVar, i iVar) {
        this.f292067a = gVar;
        this.f292068b = rVar;
        this.f292069c = pVar;
        this.f292070d = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f292067a.get();
        this.f292068b.getClass();
        q qVar = new q();
        o oVar = (o) this.f292069c.get();
        return new k("SuggestInstitutes", new s(C42784z0.f406748b), new j(fVar, qVar, (h) this.f292070d.get(), oVar));
    }
}
