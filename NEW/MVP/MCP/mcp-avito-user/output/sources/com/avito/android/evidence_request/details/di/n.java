package com.avito.android.evidence_request.details.di;

import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: EvidenceDetailsItemsModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.select.c> f148403a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radiogroup.c> f148404b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.radiogroup.c> f148405c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.switcher.b> f148406d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.switcher.c> f148407e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.input.d> f148408f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.evidence_request.details.params.disclaimer.c> f148409g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.evidence_request.details.headerDescription.c> f148410h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.input.c> f148411i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.select.c> f148412j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.u f148413k;

    public n(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f148403a = provider;
        this.f148404b = provider2;
        this.f148405c = provider3;
        this.f148406d = provider4;
        this.f148407e = provider5;
        this.f148408f = provider6;
        this.f148409g = provider7;
        this.f148410h = provider8;
        this.f148411i = provider9;
        this.f148412j = provider10;
        this.f148413k = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.select.c cVar = this.f148403a.get();
        com.avito.android.blueprints.radiogroup.c cVar2 = this.f148404b.get();
        com.avito.android.blueprint.radiogroup.c cVar3 = this.f148405c.get();
        com.avito.android.blueprints.switcher.b bVar = this.f148406d.get();
        com.avito.android.blueprint.switcher.c cVar4 = this.f148407e.get();
        com.avito.android.blueprints.input.d dVar = this.f148408f.get();
        com.avito.android.evidence_request.details.params.disclaimer.c cVar5 = this.f148409g.get();
        com.avito.android.evidence_request.details.headerDescription.c cVar6 = this.f148410h.get();
        com.avito.android.blueprint.input.c cVar7 = this.f148411i.get();
        com.avito.android.blueprint.select.c cVar8 = this.f148412j.get();
        com.avito.android.blueprint.address.c cVar9 = (com.avito.android.blueprint.address.c) this.f148413k.get();
        f.f148378a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{cVar, cVar2, cVar3, bVar, cVar4, dVar, cVar5, cVar6, cVar7, cVar8, cVar9});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
