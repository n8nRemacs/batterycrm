package com.avito.android.evidence_request.details.di;

import com.avito.android.blueprints.input.C28877b;
import com.avito.android.blueprints.input.C28878c;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsItemsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.select.a> f148391a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radiogroup.a> f148392b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.radiogroup.a> f148393c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.switcher.a> f148394d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.switcher.a> f148395e;

    /* renamed from: f, reason: collision with root package name */
    public final C28878c f148396f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.evidence_request.details.params.disclaimer.b f148397g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.evidence_request.details.headerDescription.b f148398h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.evidence_request.details.files.view.b f148399i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.blueprint.input.b f148400j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.blueprint.select.b f148401k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.blueprint.address.b f148402l;

    public m(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, C28878c c28878c, com.avito.android.evidence_request.details.params.disclaimer.b bVar, com.avito.android.evidence_request.details.headerDescription.b bVar2, com.avito.android.evidence_request.details.files.view.b bVar3, com.avito.android.blueprint.input.b bVar4, com.avito.android.blueprint.select.b bVar5, com.avito.android.blueprint.address.b bVar6) {
        this.f148391a = provider;
        this.f148392b = provider2;
        this.f148393c = provider3;
        this.f148394d = provider4;
        this.f148395e = provider5;
        this.f148396f = c28878c;
        this.f148397g = bVar;
        this.f148398h = bVar2;
        this.f148399i = bVar3;
        this.f148400j = bVar4;
        this.f148401k = bVar5;
        this.f148402l = bVar6;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.blueprints.select.a aVar = this.f148391a.get();
        com.avito.android.blueprints.radiogroup.a aVar2 = this.f148392b.get();
        com.avito.android.blueprint.radiogroup.a aVar3 = this.f148393c.get();
        com.avito.android.blueprints.switcher.a aVar4 = this.f148394d.get();
        com.avito.android.blueprint.switcher.a aVar5 = this.f148395e.get();
        C28877b c28877b = (C28877b) this.f148396f.get();
        com.avito.android.evidence_request.details.params.disclaimer.a aVar6 = (com.avito.android.evidence_request.details.params.disclaimer.a) this.f148397g.get();
        com.avito.android.evidence_request.details.headerDescription.a aVar7 = (com.avito.android.evidence_request.details.headerDescription.a) this.f148398h.get();
        com.avito.android.evidence_request.details.files.view.a aVar8 = (com.avito.android.evidence_request.details.files.view.a) this.f148399i.get();
        com.avito.android.blueprint.input.a aVar9 = (com.avito.android.blueprint.input.a) this.f148400j.get();
        com.avito.android.blueprint.select.a aVar10 = (com.avito.android.blueprint.select.a) this.f148401k.get();
        com.avito.android.blueprint.address.a aVar11 = (com.avito.android.blueprint.address.a) this.f148402l.get();
        f.f148378a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar8);
        c10493a.b(c28877b);
        c10493a.b(aVar6);
        c10493a.b(aVar7);
        c10493a.b(aVar9);
        c10493a.b(aVar10);
        c10493a.b(aVar11);
        return c10493a.a();
    }
}
