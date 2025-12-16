package com.avito.android.evidence_request.mvi.evidence_details.di;

import com.avito.android.blueprints.input.C28877b;
import com.avito.android.blueprints.input.C28878c;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.select.a> f148953a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radiogroup.a> f148954b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.radiogroup.a> f148955c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.switcher.a> f148956d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.switcher.a> f148957e;

    /* renamed from: f, reason: collision with root package name */
    public final C28878c f148958f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.b f148959g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.b f148960h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.evidence_request.mvi.evidence_details.adapter.files.b f148961i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.blueprint.input.b f148962j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.blueprint.select.b f148963k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.blueprint.address.b f148964l;

    public o(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, C28878c c28878c, com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.b bVar, com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.b bVar2, com.avito.android.evidence_request.mvi.evidence_details.adapter.files.b bVar3, com.avito.android.blueprint.input.b bVar4, com.avito.android.blueprint.select.b bVar5, com.avito.android.blueprint.address.b bVar6) {
        this.f148953a = provider;
        this.f148954b = provider2;
        this.f148955c = provider3;
        this.f148956d = provider4;
        this.f148957e = provider5;
        this.f148958f = c28878c;
        this.f148959g = bVar;
        this.f148960h = bVar2;
        this.f148961i = bVar3;
        this.f148962j = bVar4;
        this.f148963k = bVar5;
        this.f148964l = bVar6;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.blueprints.select.a aVar = this.f148953a.get();
        com.avito.android.blueprints.radiogroup.a aVar2 = this.f148954b.get();
        com.avito.android.blueprint.radiogroup.a aVar3 = this.f148955c.get();
        com.avito.android.blueprints.switcher.a aVar4 = this.f148956d.get();
        com.avito.android.blueprint.switcher.a aVar5 = this.f148957e.get();
        C28877b c28877b = (C28877b) this.f148958f.get();
        com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.a aVar6 = (com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.a) this.f148959g.get();
        com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.a aVar7 = (com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.a) this.f148960h.get();
        com.avito.android.evidence_request.mvi.evidence_details.adapter.files.a aVar8 = (com.avito.android.evidence_request.mvi.evidence_details.adapter.files.a) this.f148961i.get();
        com.avito.android.blueprint.input.a aVar9 = (com.avito.android.blueprint.input.a) this.f148962j.get();
        com.avito.android.blueprint.select.a aVar10 = (com.avito.android.blueprint.select.a) this.f148963k.get();
        com.avito.android.blueprint.address.a aVar11 = (com.avito.android.blueprint.address.a) this.f148964l.get();
        d.f148929a.getClass();
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
