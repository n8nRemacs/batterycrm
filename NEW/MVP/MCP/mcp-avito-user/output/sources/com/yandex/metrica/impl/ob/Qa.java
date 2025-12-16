package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C38979mf;
import java.util.Collections;

/* loaded from: classes7.dex */
public class Qa implements Fa {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ja f379253a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ma f379254b;

    public Qa() {
        this(new Ja(), new Ma());
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        Na<C38979mf.m, Vm> naFromModel;
        C38751db c38751db = (C38751db) obj;
        C38979mf c38979mf = new C38979mf();
        c38979mf.f381055a = 3;
        c38979mf.f381058d = new C38979mf.p();
        Na<C38979mf.k, Vm> naFromModel2 = this.f379253a.fromModel(c38751db.f380365b);
        c38979mf.f381058d.f381106a = naFromModel2.f378989a;
        C38676ab c38676ab = c38751db.f380366c;
        if (c38676ab != null) {
            naFromModel = this.f379254b.fromModel(c38676ab);
            c38979mf.f381058d.f381107b = naFromModel.f378989a;
        } else {
            naFromModel = null;
        }
        return Collections.singletonList(new Na(c38979mf, Um.a(naFromModel2, naFromModel)));
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Qa(@j.N Ja ja2, @j.N Ma ma2) {
        this.f379253a = ja2;
        this.f379254b = ma2;
    }
}
