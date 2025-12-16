package com.avito.android.parameters_sheet.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: ParametersListDialogModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radiogroup.c> f210789a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.input.d> f210790b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.infomation.item.d> f210791c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.header.e> f210792d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.multiselect.inline.c> f210793e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.multiselect.inline.c> f210794f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.select.inline.c> f210795g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.checkbox.c> f210796h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.withSuggestedOptions.d> f210797i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.input.c> f210798j;

    public n(Provider<com.avito.android.blueprints.radiogroup.c> provider, Provider<com.avito.android.blueprints.input.d> provider2, Provider<com.avito.android.blueprints.publish.infomation.item.d> provider3, Provider<com.avito.android.blueprints.publish.header.e> provider4, Provider<com.avito.android.blueprint.multiselect.inline.c> provider5, Provider<com.avito.android.blueprints.publish.multiselect.inline.c> provider6, Provider<com.avito.android.blueprints.publish.select.inline.c> provider7, Provider<com.avito.android.blueprint.checkbox.c> provider8, Provider<com.avito.android.blueprints.withSuggestedOptions.d> provider9, Provider<com.avito.android.blueprint.input.c> provider10) {
        this.f210789a = provider;
        this.f210790b = provider2;
        this.f210791c = provider3;
        this.f210792d = provider4;
        this.f210793e = provider5;
        this.f210794f = provider6;
        this.f210795g = provider7;
        this.f210796h = provider8;
        this.f210797i = provider9;
        this.f210798j = provider10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.radiogroup.c cVar = this.f210789a.get();
        com.avito.android.blueprints.input.d dVar = this.f210790b.get();
        com.avito.android.blueprints.publish.infomation.item.d dVar2 = this.f210791c.get();
        com.avito.android.blueprints.publish.header.e eVar = this.f210792d.get();
        com.avito.android.blueprint.multiselect.inline.c cVar2 = this.f210793e.get();
        com.avito.android.blueprints.publish.multiselect.inline.c cVar3 = this.f210794f.get();
        com.avito.android.blueprints.publish.select.inline.c cVar4 = this.f210795g.get();
        com.avito.android.blueprint.checkbox.c cVar5 = this.f210796h.get();
        com.avito.android.blueprints.withSuggestedOptions.d dVar3 = this.f210797i.get();
        com.avito.android.blueprint.input.c cVar6 = this.f210798j.get();
        d.f210761a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{cVar, dVar, dVar2, eVar, cVar2, cVar3, cVar4, cVar5, dVar3, cVar6});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
