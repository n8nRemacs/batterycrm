package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class igf implements ui8 {
    public final d1g X;
    public final kgf a;
    public final tef b;
    public final hwa c;
    public final j0e d;
    public final j0e o;

    public igf(kgf kgfVar, tef tefVar, hwa hwaVar, j0e j0eVar, j0e j0eVar2, d1g d1gVar) {
        this.a = kgfVar;
        this.b = tefVar;
        this.c = hwaVar;
        this.d = j0eVar;
        this.o = j0eVar2;
        this.X = d1gVar;
    }

    public static xff e(tff tffVar) {
        long j = tffVar.a;
        qff qffVar = new qff();
        qffVar.a = j;
        qffVar.b = tffVar.b;
        qffVar.c = tffVar.c;
        qffVar.d = tffVar.d;
        qffVar.e = tffVar.e;
        qffVar.f = tffVar.f;
        qffVar.g = tffVar.g;
        qffVar.h = tffVar.h;
        qffVar.i = tffVar.i;
        return new xff(qffVar);
    }

    public final lra a(long j) {
        int i = 7;
        r66 r66Var = new r66(3, new or8[]{new xr8(this.a.a(new long[]{j}), new vef(i), 0), new wr8(d(Collections.singletonList(Long.valueOf(j))), new vef(5), 1)});
        fgf fgfVar = new fgf(this);
        ifi.c(2, "prefetch");
        return new qra(new vk3(i, new p66(r66Var, fgfVar, 0)), 0).p(this.o);
    }

    public final m2f b(List list) {
        int i = 1;
        vr8 vr8Var = new vr8(new m2f(new hs8(this.a.a(jqi.c(list)), 0, new wk3(5, new hgf(0))), new egf(this, list, i), 0), new vef(8), 3);
        fgf fgfVar = new fgf(this);
        ifi.c(2, "bufferSize");
        return new vr8(vr8Var, fgfVar, i).s().h(new t9f(18, new c1g(list, new vef(6))));
    }

    @Override // defpackage.ui8
    public final void c() {
        wqi.c("igf", "clear: ", new Object[0]);
        azi.b(new ik3(this.a.a.w().h(new vef(12)), 2, new vef(11)).i(), pdf.e, new vef(4), new yl4(12));
    }

    public final u2f d(List list) {
        wqi.c("igf", "getStickersSetsFromNetwork: %s", list);
        int i = 3;
        wua wuaVar = new wua(3, jqi.c(list));
        hwa hwaVar = this.c;
        j0e j0eVar = this.d;
        k2f k2fVar = new k2f(new ora(new vr8(hwaVar.G(wuaVar, j0eVar).h(new kce(20, gu.class)).h(new vef(i)), new vef(8), i), new vef(this), 5).s(), new fgf(this), 1);
        d1g d1gVar = this.X;
        d1gVar.getClass();
        return k2fVar.j(new b1g(d1gVar, 2, 0)).m(j0eVar);
    }
}
