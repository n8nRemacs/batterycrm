package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C38979mf;
import java.util.Collections;

/* loaded from: classes7.dex */
public class Ra implements Fa {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Oa f379291a;

    public Ra() {
        this(new Oa());
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        C38979mf c38979mf = new C38979mf();
        c38979mf.f381055a = 1;
        c38979mf.f381056b = new C38979mf.q();
        Na<C38979mf.n, Vm> naFromModel = this.f379291a.fromModel(((C38776eb) obj).f380468b);
        c38979mf.f381056b.f381108a = naFromModel.f378989a;
        return Collections.singletonList(new Na(c38979mf, Um.a(naFromModel)));
    }

    @Override // com.yandex.metrica.impl.ob.Fa, com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ra(@j.N Oa oa2) {
        this.f379291a = oa2;
    }
}
