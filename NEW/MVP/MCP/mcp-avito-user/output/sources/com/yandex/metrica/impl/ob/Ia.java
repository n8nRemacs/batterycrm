package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;
import java.util.List;

/* loaded from: classes7.dex */
public class Ia implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Aa f378283a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38801fb f378284b;

    public Ia() {
        this(new Aa(), new C38801fb(30));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.j, Vm> fromModel(@j.N Xa xa2) {
        int iA2;
        C38979mf.j jVar = new C38979mf.j();
        Na<C38979mf.a, Vm> naFromModel = this.f378283a.fromModel(xa2.f379899a);
        jVar.f381086a = naFromModel.f378989a;
        C38838gn<List<Sa>, Xm> c38838gnA = this.f378284b.a((List) xa2.f379900b);
        if (A2.b(c38838gnA.f380668a)) {
            iA2 = 0;
        } else {
            jVar.f381087b = new C38979mf.a[c38838gnA.f380668a.size()];
            iA2 = 0;
            for (int i12 = 0; i12 < c38838gnA.f380668a.size(); i12++) {
                Na<C38979mf.a, Vm> naFromModel2 = this.f378283a.fromModel(c38838gnA.f380668a.get(i12));
                jVar.f381087b[i12] = naFromModel2.f378989a;
                iA2 += naFromModel2.f378990b.a();
            }
        }
        return new Na<>(jVar, Um.a(naFromModel, c38838gnA, new Um(iA2)));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ia(@j.N Aa aa2, @j.N C38801fb c38801fb) {
        this.f378283a = aa2;
        this.f378284b = c38801fb;
    }
}
