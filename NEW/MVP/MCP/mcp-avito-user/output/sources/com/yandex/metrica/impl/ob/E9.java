package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Sh;

/* loaded from: classes7.dex */
public class E9 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final F1 f378039a;

    public E9() {
        this(new C38957li());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.i fromModel(@j.N Sh sh2) {
        If.i iVar = new If.i();
        iVar.f378365d = sh2.f379395d;
        iVar.f378364c = sh2.f379394c;
        iVar.f378363b = sh2.f379393b;
        iVar.f378362a = sh2.f379392a;
        iVar.f378371j = sh2.f379396e;
        iVar.f378372k = sh2.f379397f;
        iVar.f378366e = sh2.f379405n;
        iVar.f378369h = sh2.f379409r;
        iVar.f378370i = sh2.f379410s;
        iVar.f378379r = sh2.f379406o;
        iVar.f378367f = sh2.f379407p;
        iVar.f378368g = sh2.f379408q;
        iVar.f378374m = sh2.f379399h;
        iVar.f378373l = sh2.f379398g;
        iVar.f378375n = sh2.f379400i;
        iVar.f378376o = sh2.f379401j;
        iVar.f378377p = sh2.f379403l;
        iVar.f378382u = sh2.f379404m;
        iVar.f378378q = sh2.f379402k;
        iVar.f378380s = sh2.f379411t;
        iVar.f378381t = sh2.f379412u;
        iVar.f378383v = sh2.f379413v;
        iVar.f378384w = sh2.f379414w;
        iVar.f378385x = this.f378039a.a(sh2.f379415x);
        return iVar;
    }

    @j.k0
    public E9(@j.N F1 f12) {
        this.f378039a = f12;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Sh toModel(@j.N If.i iVar) {
        return new Sh(new Sh.a().d(iVar.f378362a).p(iVar.f378370i).c(iVar.f378369h).q(iVar.f378379r).w(iVar.f378368g).v(iVar.f378367f).g(iVar.f378366e).f(iVar.f378365d).o(iVar.f378371j).j(iVar.f378372k).n(iVar.f378364c).m(iVar.f378363b).k(iVar.f378374m).l(iVar.f378373l).h(iVar.f378375n).t(iVar.f378376o).s(iVar.f378377p).u(iVar.f378382u).r(iVar.f378378q).a(iVar.f378380s).b(iVar.f378381t).i(iVar.f378383v).e(iVar.f378384w).a(this.f378039a.a(iVar.f378385x)));
    }
}
