package com.avito.android.profile_settings_basic.mvi;

/* compiled from: BasicProfileSettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final n f228906a;

    /* renamed from: b, reason: collision with root package name */
    public final l f228907b;

    /* renamed from: c, reason: collision with root package name */
    public final s f228908c;

    /* renamed from: d, reason: collision with root package name */
    public final y f228909d;

    public q(n nVar, l lVar, s sVar, y yVar) {
        this.f228906a = nVar;
        this.f228907b = lVar;
        this.f228908c = sVar;
        this.f228909d = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f228906a.get();
        j jVar = (j) this.f228907b.get();
        this.f228908c.getClass();
        r rVar = new r();
        this.f228909d.getClass();
        x xVar = new x();
        Qb0.d.f13905e.getClass();
        return new p("BasicProfileSettings", Qb0.d.f13906f, new o(mVar, jVar, xVar, rVar));
    }
}
