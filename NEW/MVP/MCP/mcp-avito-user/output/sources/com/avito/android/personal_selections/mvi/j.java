package com.avito.android.personal_selections.mvi;

import com.avito.android.personal_selections.mvi.entity.PersonalSelectionsItemState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalSelectionsItemFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f215831a;

    /* renamed from: b, reason: collision with root package name */
    public final n f215832b;

    /* renamed from: c, reason: collision with root package name */
    public final g f215833c;

    public j(dagger.internal.l lVar, n nVar, g gVar) {
        this.f215831a = lVar;
        this.f215832b = nVar;
        this.f215833c = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f215831a.f393949a;
        this.f215832b.getClass();
        m mVar = new m();
        f fVar = (f) this.f215833c.get();
        String str = "PersonalSelectionsItemFeature:" + aVar.f215797a;
        PersonalSelectionsItemState.f215816c.getClass();
        return new i(str, PersonalSelectionsItemState.f215817d, new h(fVar, mVar));
    }
}
