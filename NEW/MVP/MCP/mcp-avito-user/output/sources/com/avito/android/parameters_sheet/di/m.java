package com.avito.android.parameters_sheet.di;

import com.avito.android.blueprints.input.C28877b;
import com.avito.android.blueprints.input.C28878c;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParametersListDialogModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.blueprints.chips.c f210774a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.blueprints.radiogroup.b f210775b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.blueprint.radiogroup.b f210776c;

    /* renamed from: d, reason: collision with root package name */
    public final C28878c f210777d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.blueprints.publish.infomation.item.b f210778e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.header.b> f210779f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.blueprints.chips_multiselect.b f210780g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.blueprint.multiselect.inline.b f210781h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.blueprints.publish.multiselect.inline.b f210782i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.blueprint.checkbox.b f210783j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.blueprints.publish.select.inline.b f210784k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.blueprints.withSuggestedOptions.c f210785l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.blueprint.input.b f210786m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.blueprint.chips.single.c f210787n;

    /* renamed from: o, reason: collision with root package name */
    public final com.avito.android.blueprint.chips.multiple.b f210788o;

    public m(com.avito.android.blueprints.chips.c cVar, com.avito.android.blueprints.radiogroup.b bVar, com.avito.android.blueprint.radiogroup.b bVar2, C28878c c28878c, com.avito.android.blueprints.publish.infomation.item.b bVar3, Provider provider, com.avito.android.blueprints.chips_multiselect.b bVar4, com.avito.android.blueprint.multiselect.inline.b bVar5, com.avito.android.blueprints.publish.multiselect.inline.b bVar6, com.avito.android.blueprint.checkbox.b bVar7, com.avito.android.blueprints.publish.select.inline.b bVar8, com.avito.android.blueprints.withSuggestedOptions.c cVar2, com.avito.android.blueprint.input.b bVar9, com.avito.android.blueprint.chips.single.c cVar3, com.avito.android.blueprint.chips.multiple.b bVar10) {
        this.f210774a = cVar;
        this.f210775b = bVar;
        this.f210776c = bVar2;
        this.f210777d = c28878c;
        this.f210778e = bVar3;
        this.f210779f = provider;
        this.f210780g = bVar4;
        this.f210781h = bVar5;
        this.f210782i = bVar6;
        this.f210783j = bVar7;
        this.f210784k = bVar8;
        this.f210785l = cVar2;
        this.f210786m = bVar9;
        this.f210787n = cVar3;
        this.f210788o = bVar10;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.blueprints.chips.b bVar = (com.avito.android.blueprints.chips.b) this.f210774a.get();
        com.avito.android.blueprints.radiogroup.a aVar = (com.avito.android.blueprints.radiogroup.a) this.f210775b.get();
        com.avito.android.blueprint.radiogroup.a aVar2 = (com.avito.android.blueprint.radiogroup.a) this.f210776c.get();
        C28877b c28877b = (C28877b) this.f210777d.get();
        com.avito.android.blueprints.publish.infomation.item.a aVar3 = (com.avito.android.blueprints.publish.infomation.item.a) this.f210778e.get();
        com.avito.android.blueprints.publish.header.b bVar2 = this.f210779f.get();
        com.avito.android.blueprints.chips_multiselect.a aVar4 = (com.avito.android.blueprints.chips_multiselect.a) this.f210780g.get();
        com.avito.android.blueprint.multiselect.inline.a aVar5 = (com.avito.android.blueprint.multiselect.inline.a) this.f210781h.get();
        com.avito.android.blueprints.publish.multiselect.inline.a aVar6 = (com.avito.android.blueprints.publish.multiselect.inline.a) this.f210782i.get();
        com.avito.android.blueprint.checkbox.a aVar7 = (com.avito.android.blueprint.checkbox.a) this.f210783j.get();
        com.avito.android.blueprints.publish.select.inline.a aVar8 = (com.avito.android.blueprints.publish.select.inline.a) this.f210784k.get();
        com.avito.android.blueprints.withSuggestedOptions.b bVar3 = (com.avito.android.blueprints.withSuggestedOptions.b) this.f210785l.get();
        com.avito.android.blueprint.input.a aVar9 = (com.avito.android.blueprint.input.a) this.f210786m.get();
        com.avito.android.blueprint.chips.single.b bVar4 = (com.avito.android.blueprint.chips.single.b) this.f210787n.get();
        com.avito.android.blueprint.chips.multiple.a aVar10 = (com.avito.android.blueprint.chips.multiple.a) this.f210788o.get();
        d.f210761a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(c28877b);
        c10493a.b(aVar3);
        c10493a.b(bVar2);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        c10493a.b(aVar8);
        c10493a.b(aVar7);
        c10493a.b(bVar3);
        c10493a.b(aVar9);
        c10493a.b(bVar4);
        c10493a.b(aVar10);
        return c10493a.a();
    }
}
