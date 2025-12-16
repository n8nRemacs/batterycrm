package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Oa implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ha f379034a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Da f379035b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38937kn f379036c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38937kn f379037d;

    public Oa() {
        this(new Ha(), new Da(), new C38937kn(100), new C38937kn(1000));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.n, Vm> fromModel(@j.N C38701bb c38701bb) {
        Na<C38979mf.d, Vm> naFromModel;
        C38979mf.n nVar = new C38979mf.n();
        C38838gn<String, Vm> c38838gnA = this.f379036c.a(c38701bb.f380196a);
        nVar.f381100a = C38689b.b(c38838gnA.f380668a);
        List<String> list = c38701bb.f380197b;
        Na<C38979mf.i, Vm> naFromModel2 = null;
        if (list != null) {
            naFromModel = this.f379035b.fromModel(list);
            nVar.f381101b = naFromModel.f378989a;
        } else {
            naFromModel = null;
        }
        C38838gn<String, Vm> c38838gnA2 = this.f379037d.a(c38701bb.f380198c);
        nVar.f381102c = C38689b.b(c38838gnA2.f380668a);
        Map<String, String> map = c38701bb.f380199d;
        if (map != null) {
            naFromModel2 = this.f379034a.fromModel(map);
            nVar.f381103d = naFromModel2.f378989a;
        }
        return new Na<>(nVar, Um.a(c38838gnA, naFromModel, c38838gnA2, naFromModel2));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Oa(@j.N Ha ha2, @j.N Da da2, @j.N C38937kn c38937kn, @j.N C38937kn c38937kn2) {
        this.f379034a = ha2;
        this.f379035b = da2;
        this.f379036c = c38937kn;
        this.f379037d = c38937kn2;
    }
}
