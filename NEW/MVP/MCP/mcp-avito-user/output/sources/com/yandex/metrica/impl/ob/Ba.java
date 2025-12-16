package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C38979mf;
import java.util.Collections;

/* loaded from: classes7.dex */
public class Ba implements Fa {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ca f377828a;

    public Ba() {
        this(new Ca());
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        Ta ta2 = (Ta) obj;
        C38979mf c38979mf = new C38979mf();
        c38979mf.f381059e = new C38979mf.b();
        Na<C38979mf.c, Vm> naFromModel = this.f377828a.fromModel(ta2.f379509c);
        c38979mf.f381059e.f381064a = naFromModel.f378989a;
        c38979mf.f381055a = ta2.f379508b;
        return Collections.singletonList(new Na(c38979mf, Um.a(naFromModel)));
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ba(@j.N Ca ca2) {
        this.f377828a = ca2;
    }
}
