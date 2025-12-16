package com.avito.android.developments_agency_search.screen.deal_cabinet.di;

import com.avito.android.developments_agency_search.screen.deal_cabinet.di.a;
import com.avito.android.visual_rubricator.I;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zO0.InterfaceC50496e;

/* compiled from: DealCabinetModule_ProvideVisualRubricatorItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<com.avito.android.visual_rubricator.element.i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50496e> f136985a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f136986b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f136985a = provider;
        this.f136986b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC50496e interfaceC50496e = (InterfaceC50496e) ((a.b.l) this.f136985a).get();
        I i12 = (I) this.f136986b.f393949a;
        d.f136975a.getClass();
        com.avito.android.visual_rubricator.element.j jVarCreate = interfaceC50496e.create();
        jVarCreate.f327401b = i12;
        return jVarCreate;
    }
}
