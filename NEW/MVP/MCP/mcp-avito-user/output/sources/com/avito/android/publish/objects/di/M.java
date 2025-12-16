package com.avito.android.publish.objects.di;

import com.avito.android.blueprints.input.C28877b;
import com.avito.android.blueprints.input.C28878c;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class M implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.A f237620a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.switcher.a> f237621b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.switcher.a> f237622c;

    /* renamed from: d, reason: collision with root package name */
    public final C28878c f237623d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.chips.b> f237624e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.blueprints.chips_multiselect.b f237625f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radiogroup.a> f237626g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.radiogroup.a> f237627h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.header.b> f237628i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.publish.slots.imv.item.b f237629j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.generate_text_buttons.item.a> f237630k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.blueprint.input.b f237631l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.blueprint.chips.single.c f237632m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.blueprint.chips.multiple.b f237633n;

    /* renamed from: o, reason: collision with root package name */
    public final com.avito.android.blueprints.selector_card_group_bottom_sheet.g f237634o;

    public M(dagger.internal.A a12, Provider provider, Provider provider2, C28878c c28878c, Provider provider3, com.avito.android.blueprints.chips_multiselect.b bVar, Provider provider4, Provider provider5, Provider provider6, com.avito.android.publish.slots.imv.item.b bVar2, Provider provider7, com.avito.android.blueprint.input.b bVar3, com.avito.android.blueprint.chips.single.c cVar, com.avito.android.blueprint.chips.multiple.b bVar4, com.avito.android.blueprints.selector_card_group_bottom_sheet.g gVar) {
        this.f237620a = a12;
        this.f237621b = provider;
        this.f237622c = provider2;
        this.f237623d = c28878c;
        this.f237624e = provider3;
        this.f237625f = bVar;
        this.f237626g = provider4;
        this.f237627h = provider5;
        this.f237628i = provider6;
        this.f237629j = bVar2;
        this.f237630k = provider7;
        this.f237631l = bVar3;
        this.f237632m = cVar;
        this.f237633n = bVar4;
        this.f237634o = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f237620a.get();
        com.avito.android.blueprints.switcher.a aVar = this.f237621b.get();
        com.avito.android.blueprint.switcher.a aVar2 = this.f237622c.get();
        C28877b c28877b = (C28877b) this.f237623d.get();
        com.avito.android.blueprints.chips.b bVar = this.f237624e.get();
        com.avito.android.blueprints.chips_multiselect.a aVar3 = (com.avito.android.blueprints.chips_multiselect.a) this.f237625f.get();
        com.avito.android.blueprints.radiogroup.a aVar4 = this.f237626g.get();
        com.avito.android.blueprint.radiogroup.a aVar5 = this.f237627h.get();
        com.avito.android.blueprints.publish.header.b bVar2 = this.f237628i.get();
        com.avito.android.publish.slots.imv.item.a aVar6 = (com.avito.android.publish.slots.imv.item.a) this.f237629j.get();
        com.avito.android.publish.slots.generate_text_buttons.item.a aVar7 = this.f237630k.get();
        com.avito.android.blueprint.input.a aVar8 = (com.avito.android.blueprint.input.a) this.f237631l.get();
        com.avito.android.blueprint.chips.single.b bVar3 = (com.avito.android.blueprint.chips.single.b) this.f237632m.get();
        com.avito.android.blueprint.chips.multiple.a aVar9 = (com.avito.android.blueprint.chips.multiple.a) this.f237633n.get();
        com.avito.android.blueprints.selector_card_group_bottom_sheet.f fVar = (com.avito.android.blueprints.selector_card_group_bottom_sheet.f) this.f237634o.get();
        C33939w.f238031a.getClass();
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
        c10493a.b(fVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
