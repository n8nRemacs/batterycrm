package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ie4 {
    public final q9b a;
    public final jrd b;
    public final bsd c;
    public final te8 d;
    public final csd e;
    public final gsd f;
    public final fsd g;
    public final enb h;
    public final w2h i;
    public final suf j;
    public final jwg k;
    public final bn9 l;
    public final n35 m;
    public final mni n;
    public final kc3 o;
    public final kgf p;
    public final zr5 q;
    public final kr5 r;
    public final ddd s;
    public final em4 t;
    public final wj u;

    public ie4(q9b q9bVar, yi5 yi5Var, a84 a84Var, m4e m4eVar, pb3 pb3Var, k18 k18Var, hwa hwaVar, lzf lzfVar, gk gkVar, k18 k18Var2, k18 k18Var3) {
        this.a = q9bVar;
        this.b = new jrd(q9bVar, k18Var2);
        this.c = new bsd(q9bVar, m4eVar, new sl7(lzfVar), k18Var, k18Var3);
        te8 te8Var = new te8();
        te8Var.a = q9bVar;
        te8Var.b = new bwf(new ffb(29, te8Var));
        te8Var.c = new bwf(k54.u0);
        this.d = te8Var;
        this.e = new csd(q9bVar);
        this.f = new gsd(q9bVar, yi5Var);
        this.g = new fsd(q9bVar);
        this.h = new enb(q9bVar);
        bn9 bn9Var = new bn9();
        bn9Var.a = q9bVar;
        this.l = bn9Var;
        this.m = new n35(q9bVar);
        this.k = new jwg(new bwf(new he4(q9bVar, 0)));
        this.i = new w2h(q9bVar);
        this.j = new suf(q9bVar);
        this.n = new mni();
        this.o = new kc3(16);
        this.p = new kgf(q9bVar);
        this.q = new zr5(q9bVar);
        this.r = new kr5(q9bVar);
        this.s = new ddd(q9bVar, pb3Var);
        this.t = new em4(q9bVar);
        this.u = new wj(hwaVar, q9bVar, pb3Var, lzfVar, gkVar, a84Var);
    }

    public final void a() {
        ((OneMeRoomDatabase) this.a.l()).c();
    }

    public final void b() {
        ((OneMeRoomDatabase) this.a.l()).k();
    }

    public final void c() {
        ((OneMeRoomDatabase) this.a.l()).q();
    }
}
