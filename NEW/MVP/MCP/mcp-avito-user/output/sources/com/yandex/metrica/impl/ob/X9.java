package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C39081qi;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class X9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    private L9 f379878a = new L9();

    /* renamed from: b, reason: collision with root package name */
    private W9 f379879b = new W9();

    /* renamed from: c, reason: collision with root package name */
    private Q9 f379880c = new Q9();

    /* renamed from: d, reason: collision with root package name */
    private S9 f379881d = new S9();

    /* renamed from: e, reason: collision with root package name */
    private E9 f379882e = new E9();

    /* renamed from: f, reason: collision with root package name */
    private O9 f379883f = new O9();

    /* renamed from: g, reason: collision with root package name */
    private Z9 f379884g = new Z9();

    /* renamed from: h, reason: collision with root package name */
    private U9 f379885h = new U9();

    /* renamed from: i, reason: collision with root package name */
    private J9 f379886i = new J9();

    /* renamed from: j, reason: collision with root package name */
    private C38750da f379887j = new C38750da();

    /* renamed from: k, reason: collision with root package name */
    private C38725ca f379888k = new C38725ca();

    /* renamed from: l, reason: collision with root package name */
    private C39143t9 f379889l = new C39143t9();

    /* renamed from: m, reason: collision with root package name */
    private C38675aa f379890m = new C38675aa();

    /* renamed from: n, reason: collision with root package name */
    private C39215w9 f379891n = new C39215w9();

    /* renamed from: o, reason: collision with root package name */
    private A9 f379892o = new A9();

    /* renamed from: p, reason: collision with root package name */
    private C39119s9 f379893p = new C39119s9();

    /* renamed from: q, reason: collision with root package name */
    private B9 f379894q = new B9();

    /* renamed from: r, reason: collision with root package name */
    private C9 f379895r = new C9();

    /* renamed from: s, reason: collision with root package name */
    private C39263y9 f379896s = new C39263y9();

    /* renamed from: t, reason: collision with root package name */
    private Y9 f379897t = new Y9();

    /* renamed from: u, reason: collision with root package name */
    private N9 f379898u = new N9();

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        C39081qi c39081qi = (C39081qi) obj;
        If r02 = new If();
        r02.f378290C = c39081qi.f381593G;
        r02.f378291D = c39081qi.f381594H;
        r02.f378322l = new If.k[c39081qi.f381627s.size()];
        Iterator<C39026oc> it = c39081qi.f381627s.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            r02.f378322l[i13] = this.f379878a.fromModel(it.next());
            i13++;
        }
        String str = c39081qi.f381609a;
        if (str != null) {
            r02.f378311a = str;
        }
        String str2 = c39081qi.f381610b;
        if (str2 != null) {
            r02.f378335y = str2;
        }
        String str3 = c39081qi.f381611c;
        if (str3 != null) {
            r02.f378336z = str3;
        }
        List<String> list = c39081qi.f381618j;
        if (list != null) {
            r02.f378317g = (String[]) list.toArray(new String[list.size()]);
        }
        List<String> list2 = c39081qi.f381619k;
        if (list2 != null) {
            r02.f378318h = (String[]) list2.toArray(new String[list2.size()]);
        }
        List<String> list3 = c39081qi.f381612d;
        if (list3 != null) {
            r02.f378313c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List<String> list4 = c39081qi.f381617i;
        if (list4 != null) {
            r02.f378316f = (String[]) list4.toArray(new String[list4.size()]);
        }
        List<String> list5 = c39081qi.f381620l;
        if (list5 != null) {
            r02.f378330t = (String[]) list5.toArray(new String[list5.size()]);
        }
        List<String> list6 = c39081qi.f381621m;
        if (list6 != null) {
            r02.f378319i = (String[]) list6.toArray(new String[list6.size()]);
        }
        Map<String, List<String>> map = c39081qi.f381622n;
        if (map != null) {
            r02.f378320j = this.f379896s.fromModel(map);
        }
        C38758di c38758di = c39081qi.f381628t;
        if (c38758di != null) {
            r02.f378323m = this.f379879b.fromModel(c38758di);
        }
        C38683ai c38683ai = c39081qi.f381587A;
        if (c38683ai != null) {
            this.f379880c.getClass();
            If.n nVar = new If.n();
            nVar.f378426a = c38683ai.f380131a;
            nVar.f378427b = c38683ai.f380132b;
            r02.f378293F = nVar;
        }
        String str4 = c39081qi.f381623o;
        if (str4 != null) {
            r02.f378325o = str4;
        }
        String str5 = c39081qi.f381613e;
        if (str5 != null) {
            r02.f378314d = str5;
        }
        String str6 = c39081qi.f381614f;
        if (str6 != null) {
            r02.f378315e = str6;
        }
        String str7 = c39081qi.f381615g;
        if (str7 != null) {
            r02.f378288A = str7;
        }
        String str8 = c39081qi.f381616h;
        if (str8 != null) {
            r02.f378289B = str8;
        }
        r02.f378321k = this.f379882e.fromModel(c39081qi.f381626r);
        String str9 = c39081qi.f381624p;
        if (str9 != null) {
            r02.f378326p = str9;
        }
        String str10 = c39081qi.f381625q;
        if (str10 != null) {
            r02.f378327q = str10;
        }
        r02.f378328r = c39081qi.f381631w;
        r02.f378312b = c39081qi.f381629u;
        r02.f378332v = c39081qi.f381630v;
        RetryPolicyConfig retryPolicyConfig = c39081qi.f381591E;
        r02.f378295H = retryPolicyConfig.f382439a;
        r02.f378296I = retryPolicyConfig.f382440b;
        List<C38708bi> list7 = c39081qi.f381632x;
        if (list7 != null) {
            If.o[] oVarArr = new If.o[list7.size()];
            Iterator<C38708bi> it2 = list7.iterator();
            while (it2.hasNext()) {
                oVarArr[i12] = this.f379881d.fromModel(it2.next());
                i12++;
            }
            r02.f378324n = oVarArr;
        }
        String str11 = c39081qi.f381633y;
        if (str11 != null) {
            r02.f378329s = str11;
        }
        List<String> list8 = c39081qi.f381603Q;
        r02.f378304Q = (String[]) list8.toArray(new String[list8.size()]);
        List<Bd> list9 = c39081qi.f381588B;
        if (list9 != null) {
            r02.f378333w = this.f379883f.fromModel(list9);
        }
        C38733ci c38733ci = c39081qi.f381589C;
        if (c38733ci != null) {
            r02.f378334x = this.f379885h.fromModel(c38733ci);
        }
        C39152ti c39152ti = c39081qi.f381634z;
        if (c39152ti != null) {
            this.f379884g.getClass();
            If.s sVar = new If.s();
            sVar.f378453a = c39152ti.f381894a;
            r02.f378331u = sVar;
        }
        r02.f378292E = c39081qi.f381595I;
        Zh zh2 = c39081qi.f381590D;
        if (zh2 != null) {
            this.f379886i.getClass();
            If.j jVar = new If.j();
            jVar.f378386a = zh2.f380013a;
            r02.f378294G = jVar;
        }
        C39227wl c39227wl = c39081qi.f381596J;
        if (c39227wl != null) {
            r02.f378297J = this.f379887j.fromModel(c39227wl);
        }
        C38861hl c38861hl = c39081qi.f381597K;
        if (c38861hl != null) {
            r02.f378299L = this.f379888k.fromModel(c38861hl);
        }
        C38861hl c38861hl2 = c39081qi.f381598L;
        if (c38861hl2 != null) {
            r02.f378300M = this.f379888k.fromModel(c38861hl2);
        }
        C38861hl c38861hl3 = c39081qi.f381599M;
        if (c38861hl3 != null) {
            r02.f378298K = this.f379888k.fromModel(c38861hl3);
        }
        C38864i c38864i = c39081qi.f381600N;
        if (c38864i != null) {
            this.f379889l.getClass();
            If.b bVar = new If.b();
            bVar.f378342a = c38864i.f380750a;
            bVar.f378343b = c38864i.f380751b;
            r02.f378305R = bVar;
        }
        C39176ui c39176ui = c39081qi.f381592F;
        if (c39176ui != null) {
            r02.f378301N = this.f379890m.fromModel(c39176ui);
        }
        Ph ph2 = c39081qi.f381601O;
        if (ph2 != null) {
            r02.f378302O = this.f379891n.fromModel(ph2);
        }
        r02.f378303P = this.f379892o.fromModel(c39081qi.f381602P);
        Oh oh2 = c39081qi.f381604R;
        if (oh2 != null) {
            r02.f378306S = this.f379893p.fromModel(oh2);
        }
        C39206w0 c39206w0 = c39081qi.f381605S;
        if (c39206w0 != null) {
            this.f379894q.getClass();
            If.g gVar = new If.g();
            gVar.f378356a = c39206w0.a();
            r02.f378308U = gVar;
        }
        Uh uh2 = c39081qi.f381606T;
        if (uh2 != null) {
            r02.f378307T = this.f379895r.fromModel(uh2);
        }
        Y9 y92 = this.f379897t;
        C39128si c39128si = c39081qi.f381607U;
        y92.getClass();
        If.r rVar = new If.r();
        rVar.f378452a = c39128si.a();
        r02.f378309V = rVar;
        r02.f378310W = this.f379898u.fromModel(c39081qi.f381608V);
        return r02;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        If r92 = (If) obj;
        C39081qi.b bVarA = new C39081qi.b(this.f379882e.toModel(r92.f378321k)).k(r92.f378311a).c(r92.f378335y).d(r92.f378336z).e(r92.f378325o).f(r92.f378314d).i(Arrays.asList(r92.f378313c)).e(Arrays.asList(r92.f378316f)).b(Arrays.asList(r92.f378318h)).c(Arrays.asList(r92.f378317g)).i(r92.f378315e).j(r92.f378288A).a(r92.f378289B).a(Arrays.asList(r92.f378330t)).g(Arrays.asList(r92.f378319i)).h(r92.f378326p).g(r92.f378327q).c(r92.f378328r).c(r92.f378312b).a(r92.f378332v);
        If.o[] oVarArr = r92.f378324n;
        ArrayList arrayList = new ArrayList(oVarArr.length);
        int i12 = 0;
        for (If.o oVar : oVarArr) {
            arrayList.add(this.f379881d.toModel(oVar));
        }
        C39081qi.b bVarA2 = bVarA.j(arrayList).b(r92.f378290C).a(r92.f378291D).b(r92.f378329s).b(r92.f378292E).a(new RetryPolicyConfig(r92.f378295H, r92.f378296I)).f(Arrays.asList(r92.f378304Q)).a(this.f379896s.toModel(r92.f378320j));
        if (r92.f378322l != null) {
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                If.k[] kVarArr = r92.f378322l;
                if (i12 >= kVarArr.length) {
                    break;
                }
                arrayList2.add(this.f379878a.toModel(kVarArr[i12]));
                i12++;
            }
            bVarA2.d(arrayList2);
        }
        If.q qVar = r92.f378323m;
        if (qVar != null) {
            bVarA2.a(this.f379879b.toModel(qVar));
        }
        If.n nVar = r92.f378293F;
        if (nVar != null) {
            this.f379880c.getClass();
            bVarA2.a(new C38683ai(nVar.f378426a, nVar.f378427b));
        }
        If.m[] mVarArr = r92.f378333w;
        if (mVarArr != null) {
            bVarA2.h(this.f379883f.toModel(mVarArr));
        }
        If.p pVar = r92.f378334x;
        if (pVar != null) {
            bVarA2.a(this.f379885h.toModel(pVar));
        }
        If.s sVar = r92.f378331u;
        if (sVar != null) {
            bVarA2.a(this.f379884g.toModel(sVar));
        }
        If.j jVar = r92.f378294G;
        if (jVar != null) {
            bVarA2.a(this.f379886i.toModel(jVar));
        }
        If.w wVar = r92.f378297J;
        if (wVar != null) {
            bVarA2.a(this.f379887j.toModel(wVar));
        }
        If.v vVar = r92.f378299L;
        if (vVar != null) {
            bVarA2.b(this.f379888k.toModel(vVar));
        }
        If.v vVar2 = r92.f378300M;
        if (vVar2 != null) {
            bVarA2.c(this.f379888k.toModel(vVar2));
        }
        If.v vVar3 = r92.f378298K;
        if (vVar3 != null) {
            bVarA2.a(this.f379888k.toModel(vVar3));
        }
        If.b bVar = r92.f378305R;
        if (bVar != null) {
            bVarA2.a(this.f379889l.toModel(bVar));
        }
        If.t tVar = r92.f378301N;
        if (tVar != null) {
            bVarA2.a(this.f379890m.toModel(tVar));
        }
        If.c cVar = r92.f378302O;
        if (cVar != null) {
            bVarA2.a(this.f379891n.toModel(cVar));
        }
        If.f fVar = r92.f378303P;
        if (fVar != null) {
            bVarA2.a(this.f379892o.a(fVar));
        }
        If.a aVar = r92.f378306S;
        if (aVar != null) {
            bVarA2.a(this.f379893p.toModel(aVar));
        }
        If.h hVar = r92.f378307T;
        if (hVar != null) {
            bVarA2.a(this.f379895r.toModel(hVar));
        }
        If.g gVar = r92.f378308U;
        if (gVar != null) {
            bVarA2.a(this.f379894q.toModel(gVar));
        }
        If.r rVar = r92.f378309V;
        if (rVar != null) {
            bVarA2.a(this.f379897t.toModel(rVar));
        }
        bVarA2.b(this.f379898u.toModel(r92.f378310W));
        return bVarA2.a();
    }
}
