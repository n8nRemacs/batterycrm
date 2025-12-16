package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;

/* loaded from: classes7.dex */
public class Ca implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ja f377895a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ea f377896b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Ia f377897c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Ma f377898d;

    public Ca() {
        this(new Ja(), new Ea(), new Ia(), new Ma());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.c, Vm> fromModel(@j.N Ua ua2) {
        Na<C38979mf.m, Vm> naFromModel;
        C38979mf.c cVar = new C38979mf.c();
        Na<C38979mf.k, Vm> naFromModel2 = this.f377895a.fromModel(ua2.f379603a);
        cVar.f381065a = naFromModel2.f378989a;
        cVar.f381067c = this.f377896b.fromModel(ua2.f379604b);
        Na<C38979mf.j, Vm> naFromModel3 = this.f377897c.fromModel(ua2.f379605c);
        cVar.f381068d = naFromModel3.f378989a;
        C38676ab c38676ab = ua2.f379606d;
        if (c38676ab != null) {
            naFromModel = this.f377898d.fromModel(c38676ab);
            cVar.f381066b = naFromModel.f378989a;
        } else {
            naFromModel = null;
        }
        return new Na<>(cVar, Um.a(naFromModel2, naFromModel3, naFromModel));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ca(@j.N Ja ja2, @j.N Ea ea2, @j.N Ia ia2, @j.N Ma ma2) {
        this.f377895a = ja2;
        this.f377896b = ea2;
        this.f377897c = ia2;
        this.f377898d = ma2;
    }
}
