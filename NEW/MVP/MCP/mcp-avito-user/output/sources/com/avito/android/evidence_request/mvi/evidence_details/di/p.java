package com.avito.android.evidence_request.mvi.evidence_details.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: EvidenceDetailsModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.select.c> f148965a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radiogroup.c> f148966b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.radiogroup.c> f148967c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.switcher.b> f148968d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.switcher.c> f148969e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.input.d> f148970f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.c> f148971g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.c> f148972h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.input.c> f148973i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.select.c> f148974j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.u f148975k;

    public p(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f148965a = provider;
        this.f148966b = provider2;
        this.f148967c = provider3;
        this.f148968d = provider4;
        this.f148969e = provider5;
        this.f148970f = provider6;
        this.f148971g = provider7;
        this.f148972h = provider8;
        this.f148973i = provider9;
        this.f148974j = provider10;
        this.f148975k = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.select.c cVar = this.f148965a.get();
        com.avito.android.blueprints.radiogroup.c cVar2 = this.f148966b.get();
        com.avito.android.blueprint.radiogroup.c cVar3 = this.f148967c.get();
        com.avito.android.blueprints.switcher.b bVar = this.f148968d.get();
        com.avito.android.blueprint.switcher.c cVar4 = this.f148969e.get();
        com.avito.android.blueprints.input.d dVar = this.f148970f.get();
        com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.c cVar5 = this.f148971g.get();
        com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.c cVar6 = this.f148972h.get();
        com.avito.android.blueprint.input.c cVar7 = this.f148973i.get();
        com.avito.android.blueprint.select.c cVar8 = this.f148974j.get();
        com.avito.android.blueprint.address.c cVar9 = (com.avito.android.blueprint.address.c) this.f148975k.get();
        d.f148929a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{cVar, cVar2, cVar3, bVar, cVar4, dVar, cVar5, cVar6, cVar7, cVar8, cVar9});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
