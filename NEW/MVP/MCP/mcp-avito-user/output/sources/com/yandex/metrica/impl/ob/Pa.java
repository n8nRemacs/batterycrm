package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C38979mf;
import java.util.Collections;

/* loaded from: classes7.dex */
public class Pa implements Fa {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Oa f379160a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ja f379161b;

    public Pa() {
        this(new Oa(), new Ja());
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        C38726cb c38726cb = (C38726cb) obj;
        C38979mf c38979mf = new C38979mf();
        c38979mf.f381055a = 2;
        c38979mf.f381057c = new C38979mf.o();
        Na<C38979mf.n, Vm> naFromModel = this.f379160a.fromModel(c38726cb.f380309c);
        c38979mf.f381057c.f381105b = naFromModel.f378989a;
        Na<C38979mf.k, Vm> naFromModel2 = this.f379161b.fromModel(c38726cb.f380308b);
        c38979mf.f381057c.f381104a = naFromModel2.f378989a;
        return Collections.singletonList(new Na(c38979mf, Um.a(naFromModel, naFromModel2)));
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Pa(@j.N Oa oa2, @j.N Ja ja2) {
        this.f379160a = oa2;
        this.f379161b = ja2;
    }
}
