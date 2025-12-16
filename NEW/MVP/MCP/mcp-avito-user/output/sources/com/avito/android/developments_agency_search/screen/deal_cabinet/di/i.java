package com.avito.android.developments_agency_search.screen.deal_cabinet.di;

import com.avito.android.developments_agency_search.screen.deal_cabinet.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zO0.C50493b;
import zO0.InterfaceC50492a;

/* compiled from: DealCabinetModule_ProvideVisualRubricatorItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<com.avito.android.visual_rubricator.element.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50492a> f136983a;

    /* renamed from: b, reason: collision with root package name */
    public final j f136984b;

    public i(Provider provider, j jVar) {
        this.f136983a = provider;
        this.f136984b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50493b c50493bTi = ((a.b.k) this.f136983a).f136973a.Ti();
        com.avito.android.visual_rubricator.element.i iVar = (com.avito.android.visual_rubricator.element.i) this.f136984b.get();
        d.f136975a.getClass();
        return c50493bTi.a(iVar);
    }
}
