package com.avito.android.rating_form.step.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: RatingFormStepModule_ProvideItemPresentersSet$_avito_rating_form_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.checkBox.h> f249311a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.description.e> f249312b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.header.d> f249313c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.multiLineInput.d> f249314d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.select.d> f249315e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.singleLineInput.d> f249316f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.stars.e> f249317g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.photo_picker.e> f249318h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.file_picker.h> f249319i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.item.chips.d> f249320j;

    public m(Provider<com.avito.android.rating_form.item.checkBox.h> provider, Provider<com.avito.android.rating_form.item.description.e> provider2, Provider<com.avito.android.rating_form.item.header.d> provider3, Provider<com.avito.android.rating_form.item.multiLineInput.d> provider4, Provider<com.avito.android.rating_form.item.select.d> provider5, Provider<com.avito.android.rating_form.item.singleLineInput.d> provider6, Provider<com.avito.android.rating_form.item.stars.e> provider7, Provider<com.avito.android.rating_form.item.photo_picker.e> provider8, Provider<com.avito.android.rating_form.item.file_picker.h> provider9, Provider<com.avito.android.rating_form.item.chips.d> provider10) {
        this.f249311a = provider;
        this.f249312b = provider2;
        this.f249313c = provider3;
        this.f249314d = provider4;
        this.f249315e = provider5;
        this.f249316f = provider6;
        this.f249317g = provider7;
        this.f249318h = provider8;
        this.f249319i = provider9;
        this.f249320j = provider10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_form.item.checkBox.h hVar = this.f249311a.get();
        com.avito.android.rating_form.item.description.e eVar = this.f249312b.get();
        com.avito.android.rating_form.item.header.d dVar = this.f249313c.get();
        com.avito.android.rating_form.item.multiLineInput.d dVar2 = this.f249314d.get();
        com.avito.android.rating_form.item.select.d dVar3 = this.f249315e.get();
        com.avito.android.rating_form.item.singleLineInput.d dVar4 = this.f249316f.get();
        com.avito.android.rating_form.item.stars.e eVar2 = this.f249317g.get();
        com.avito.android.rating_form.item.photo_picker.e eVar3 = this.f249318h.get();
        com.avito.android.rating_form.item.file_picker.h hVar2 = this.f249319i.get();
        com.avito.android.rating_form.item.chips.d dVar5 = this.f249320j.get();
        e.f249279a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{hVar, eVar, dVar, dVar2, dVar3, dVar4, eVar2, eVar3, hVar2, dVar5});
        t.d(setL0);
        return setL0;
    }
}
