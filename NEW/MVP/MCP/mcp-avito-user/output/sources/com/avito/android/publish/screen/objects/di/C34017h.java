package com.avito.android.publish.screen.objects.di;

import com.avito.android.blueprints.input.C28877b;
import com.avito.android.blueprints.input.C28878c;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: ObjectFillFormItemsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.screen.objects.di.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34017h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C34014e f239870a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.A f239871b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.switcher.a> f239872c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.switcher.a> f239873d;

    /* renamed from: e, reason: collision with root package name */
    public final C28878c f239874e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.chips.b> f239875f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.blueprints.chips_multiselect.b f239876g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radiogroup.a> f239877h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.radiogroup.a> f239878i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.header.b> f239879j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.publish.slots.imv.item.b f239880k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.generate_text_buttons.item.a> f239881l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.blueprint.input.b f239882m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.blueprint.chips.single.c f239883n;

    /* renamed from: o, reason: collision with root package name */
    public final com.avito.android.blueprint.chips.multiple.b f239884o;

    public C34017h(C34014e c34014e, dagger.internal.A a12, Provider provider, Provider provider2, C28878c c28878c, Provider provider3, com.avito.android.blueprints.chips_multiselect.b bVar, Provider provider4, Provider provider5, Provider provider6, com.avito.android.publish.slots.imv.item.b bVar2, Provider provider7, com.avito.android.blueprint.input.b bVar3, com.avito.android.blueprint.chips.single.c cVar, com.avito.android.blueprint.chips.multiple.b bVar4) {
        this.f239870a = c34014e;
        this.f239871b = a12;
        this.f239872c = provider;
        this.f239873d = provider2;
        this.f239874e = c28878c;
        this.f239875f = provider3;
        this.f239876g = bVar;
        this.f239877h = provider4;
        this.f239878i = provider5;
        this.f239879j = provider6;
        this.f239880k = bVar2;
        this.f239881l = provider7;
        this.f239882m = bVar3;
        this.f239883n = cVar;
        this.f239884o = bVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f239871b.get();
        com.avito.android.blueprints.switcher.a aVar = this.f239872c.get();
        com.avito.android.blueprint.switcher.a aVar2 = this.f239873d.get();
        C28877b c28877b = (C28877b) this.f239874e.get();
        com.avito.android.blueprints.chips.b bVar = this.f239875f.get();
        com.avito.android.blueprints.chips_multiselect.a aVar3 = (com.avito.android.blueprints.chips_multiselect.a) this.f239876g.get();
        com.avito.android.blueprints.radiogroup.a aVar4 = this.f239877h.get();
        com.avito.android.blueprint.radiogroup.a aVar5 = this.f239878i.get();
        com.avito.android.blueprints.publish.header.b bVar2 = this.f239879j.get();
        com.avito.android.publish.slots.imv.item.a aVar6 = (com.avito.android.publish.slots.imv.item.a) this.f239880k.get();
        com.avito.android.publish.slots.generate_text_buttons.item.a aVar7 = this.f239881l.get();
        com.avito.android.blueprint.input.a aVar8 = (com.avito.android.blueprint.input.a) this.f239882m.get();
        com.avito.android.blueprint.chips.single.b bVar3 = (com.avito.android.blueprint.chips.single.b) this.f239883n.get();
        com.avito.android.blueprint.chips.multiple.a aVar9 = (com.avito.android.blueprint.chips.multiple.a) this.f239884o.get();
        this.f239870a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(c28877b);
        c10493a.b(aVar3);
        c10493a.b(bVar2);
        c10493a.b(aVar6);
        c10493a.b(aVar7);
        c10493a.b(aVar8);
        c10493a.b(bVar3);
        c10493a.b(aVar9);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
