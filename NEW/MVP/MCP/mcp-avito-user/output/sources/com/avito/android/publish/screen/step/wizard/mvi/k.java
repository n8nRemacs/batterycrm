package com.avito.android.publish.screen.step.wizard.mvi;

import com.avito.android.publish.screen.step.wizard.mvi.entity.WizardState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WizardFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f242552a;

    /* renamed from: b, reason: collision with root package name */
    public final e f242553b;

    /* renamed from: c, reason: collision with root package name */
    public final m f242554c;

    /* renamed from: d, reason: collision with root package name */
    public final o f242555d;

    public k(h hVar, e eVar, m mVar, o oVar) {
        this.f242552a = hVar;
        this.f242553b = eVar;
        this.f242554c = mVar;
        this.f242555d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f242552a.get();
        d dVar = (d) this.f242553b.get();
        this.f242554c.getClass();
        l lVar = new l();
        this.f242555d.getClass();
        n nVar = new n();
        WizardState.f242529f.getClass();
        return new j("Wizard", WizardState.f242530g, new i(gVar, dVar, nVar, lVar));
    }
}
