package com.avito.android.rating_form.step.dialog.mvi;

import dagger.internal.x;
import dagger.internal.y;
import gh0.C40684c;

/* compiled from: DialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f249460a;

    /* renamed from: b, reason: collision with root package name */
    public final e f249461b;

    /* renamed from: c, reason: collision with root package name */
    public final m f249462c;

    /* renamed from: d, reason: collision with root package name */
    public final o f249463d;

    public k(h hVar, e eVar, m mVar, o oVar) {
        this.f249460a = hVar;
        this.f249461b = eVar;
        this.f249462c = mVar;
        this.f249463d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f249460a.get();
        d dVar = (d) this.f249461b.get();
        this.f249462c.getClass();
        l lVar = new l();
        this.f249463d.getClass();
        n nVar = new n();
        C40684c.f396716e.getClass();
        return new j("RatingFormDialog", C40684c.f396717f, new i(gVar, dVar, nVar, lVar));
    }
}
