package com.avito.android.body_condition_sheet.mvi;

import Nj.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BodyConditionSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f106910a;

    /* renamed from: b, reason: collision with root package name */
    public final g f106911b;

    /* renamed from: c, reason: collision with root package name */
    public final n f106912c;

    /* renamed from: d, reason: collision with root package name */
    public final p f106913d;

    public l(i iVar, g gVar, n nVar, p pVar) {
        this.f106910a = iVar;
        this.f106911b = gVar;
        this.f106912c = nVar;
        this.f106913d = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f106910a.get();
        this.f106911b.getClass();
        f fVar = new f();
        this.f106912c.getClass();
        m mVar = new m();
        this.f106913d.getClass();
        return new k("BodyConditionSheet", d.a.f11730a, new j(hVar, fVar, new o(), mVar));
    }
}
