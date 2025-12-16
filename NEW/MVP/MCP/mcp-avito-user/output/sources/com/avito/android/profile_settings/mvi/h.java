package com.avito.android.profile_settings.mvi;

import com.avito.android.profile_settings.mvi.entity.ProfileSettingsState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileSettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f228484a;

    /* renamed from: b, reason: collision with root package name */
    public final c f228485b;

    /* renamed from: c, reason: collision with root package name */
    public final j f228486c;

    /* renamed from: d, reason: collision with root package name */
    public final l f228487d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f228484a = eVar;
        this.f228485b = cVar;
        this.f228486c = jVar;
        this.f228487d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f228484a.get();
        b bVar = (b) this.f228485b.get();
        this.f228486c.getClass();
        i iVar = new i();
        k kVar = (k) this.f228487d.get();
        ProfileSettingsState.f228466f.getClass();
        return new g("ProfileSettings", ProfileSettingsState.f228467g, new f(dVar, bVar, kVar, iVar));
    }
}
