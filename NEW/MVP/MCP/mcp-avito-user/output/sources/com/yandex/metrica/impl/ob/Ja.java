package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C38979mf;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Ja implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ha f378571a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ia f378572b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Da f378573c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Ka f378574d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38937kn f378575e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C38937kn f378576f;

    public Ja() {
        this(new Ha(), new Ia(), new Da(), new Ka(), new C38937kn(100), new C38937kn(1000));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na<C38979mf.k, Vm> fromModel(@j.N Ya ya2) {
        Na<C38979mf.d, Vm> naFromModel;
        Na<C38979mf.i, Vm> naFromModel2;
        Na<C38979mf.j, Vm> naFromModel3;
        Na<C38979mf.j, Vm> naFromModel4;
        C38979mf.k kVar = new C38979mf.k();
        C38838gn<String, Vm> c38838gnA = this.f378575e.a(ya2.f379957a);
        kVar.f381088a = C38689b.b(c38838gnA.f380668a);
        C38838gn<String, Vm> c38838gnA2 = this.f378576f.a(ya2.f379958b);
        kVar.f381089b = C38689b.b(c38838gnA2.f380668a);
        List<String> list = ya2.f379959c;
        Na<C38979mf.l[], Vm> naFromModel5 = null;
        if (list != null) {
            naFromModel = this.f378573c.fromModel(list);
            kVar.f381090c = naFromModel.f378989a;
        } else {
            naFromModel = null;
        }
        Map<String, String> map = ya2.f379960d;
        if (map != null) {
            naFromModel2 = this.f378571a.fromModel(map);
            kVar.f381091d = naFromModel2.f378989a;
        } else {
            naFromModel2 = null;
        }
        Xa xa2 = ya2.f379961e;
        if (xa2 != null) {
            naFromModel3 = this.f378572b.fromModel(xa2);
            kVar.f381092e = naFromModel3.f378989a;
        } else {
            naFromModel3 = null;
        }
        Xa xa3 = ya2.f379962f;
        if (xa3 != null) {
            naFromModel4 = this.f378572b.fromModel(xa3);
            kVar.f381093f = naFromModel4.f378989a;
        } else {
            naFromModel4 = null;
        }
        List<String> list2 = ya2.f379963g;
        if (list2 != null) {
            naFromModel5 = this.f378574d.fromModel(list2);
            kVar.f381094g = naFromModel5.f378989a;
        }
        return new Na<>(kVar, Um.a(c38838gnA, c38838gnA2, naFromModel, naFromModel2, naFromModel3, naFromModel4, naFromModel5));
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public Ja(@j.N Ha ha2, @j.N Ia ia2, @j.N Da da2, @j.N Ka ka2, @j.N C38937kn c38937kn, @j.N C38937kn c38937kn2) {
        this.f378571a = ha2;
        this.f378572b = ia2;
        this.f378573c = da2;
        this.f378574d = ka2;
        this.f378575e = c38937kn;
        this.f378576f = c38937kn2;
    }
}
