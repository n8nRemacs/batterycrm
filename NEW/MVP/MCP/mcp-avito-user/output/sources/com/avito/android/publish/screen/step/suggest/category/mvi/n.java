package com.avito.android.publish.screen.step.suggest.category.mvi;

import com.avito.android.publish.screen.step.suggest.category.mvi.entity.SuggestCategoryState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestCategoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f242383a;

    /* renamed from: b, reason: collision with root package name */
    public final i f242384b;

    /* renamed from: c, reason: collision with root package name */
    public final p f242385c;

    /* renamed from: d, reason: collision with root package name */
    public final r f242386d;

    public n(k kVar, i iVar, p pVar, r rVar) {
        this.f242383a = kVar;
        this.f242384b = iVar;
        this.f242385c = pVar;
        this.f242386d = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f242383a.get();
        f fVar = (f) this.f242384b.get();
        this.f242385c.getClass();
        o oVar = new o();
        this.f242386d.getClass();
        q qVar = new q();
        SuggestCategoryState.f242361g.getClass();
        return new m("SuggestCategoryMvi", SuggestCategoryState.f242362h, new l(jVar, fVar, qVar, oVar));
    }
}
