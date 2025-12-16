package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;

/* loaded from: classes7.dex */
public class Aa implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ea f377765a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38937kn f377766b;

    public Aa() {
        this(new Ea(), new C38937kn(20));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.a, Vm> fromModel(@j.N Sa sa2) {
        C38979mf.a aVar = new C38979mf.a();
        aVar.f381063b = this.f377765a.fromModel(sa2.f379359a);
        C38838gn<String, Vm> c38838gnA = this.f377766b.a(sa2.f379360b);
        aVar.f381062a = C38689b.b(c38838gnA.f380668a);
        return new Na<>(aVar, Um.a(c38838gnA));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Aa(@j.N Ea ea2, @j.N C38937kn c38937kn) {
        this.f377765a = ea2;
        this.f377766b = c38937kn;
    }
}
