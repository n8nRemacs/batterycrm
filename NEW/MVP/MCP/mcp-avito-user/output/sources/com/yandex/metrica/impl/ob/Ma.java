package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;

/* loaded from: classes7.dex */
public class Ma implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Oa f378887a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38937kn f378888b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38937kn f378889c;

    public Ma() {
        this(new Oa(), new C38937kn(100), new C38937kn(2048));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.m, Vm> fromModel(@j.N C38676ab c38676ab) {
        Na<C38979mf.n, Vm> naFromModel;
        C38979mf.m mVar = new C38979mf.m();
        C38838gn<String, Vm> c38838gnA = this.f378888b.a(c38676ab.f380116a);
        mVar.f381097a = C38689b.b(c38838gnA.f380668a);
        C38838gn<String, Vm> c38838gnA2 = this.f378889c.a(c38676ab.f380117b);
        mVar.f381098b = C38689b.b(c38838gnA2.f380668a);
        C38701bb c38701bb = c38676ab.f380118c;
        if (c38701bb != null) {
            naFromModel = this.f378887a.fromModel(c38701bb);
            mVar.f381099c = naFromModel.f378989a;
        } else {
            naFromModel = null;
        }
        return new Na<>(mVar, Um.a(c38838gnA, c38838gnA2, naFromModel));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ma(@j.N Oa oa2, @j.N C38937kn c38937kn, @j.N C38937kn c38937kn2) {
        this.f378887a = oa2;
        this.f378888b = c38937kn;
        this.f378889c = c38937kn2;
    }
}
