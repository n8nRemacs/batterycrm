package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class cgg {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int e;
    public int f;
    public int g;
    public int h;
    public wg7 m;
    public wg7 n;
    public int o;
    public wg7 p;
    public int q;
    public int r;
    public int s;
    public wg7 t;
    public agg u;
    public wg7 v;
    public int w;
    public boolean x;
    public int y;
    public boolean z;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public boolean l = true;

    public cgg() {
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        this.m = zjdVar;
        this.n = zjdVar;
        this.o = 0;
        this.p = zjdVar;
        this.q = 0;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.t = zjdVar;
        this.u = agg.d;
        this.v = zjdVar;
        this.w = 0;
        this.x = true;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = new HashMap();
        this.E = new HashSet();
    }

    public static zjd e(String[] strArr) {
        tg7 tg7VarI = wg7.i();
        for (String str : strArr) {
            str.getClass();
            tg7VarI.a(zxg.V(str));
        }
        return tg7VarI.i();
    }

    public void a(xfg xfgVar) {
        this.D.put(xfgVar.a, xfgVar);
    }

    public egg b() {
        return new egg(this);
    }

    public cgg c() {
        this.D.clear();
        return this;
    }

    public final void d(egg eggVar) {
        this.a = eggVar.a;
        this.b = eggVar.b;
        this.c = eggVar.c;
        this.d = eggVar.d;
        this.e = eggVar.e;
        this.f = eggVar.f;
        this.g = eggVar.g;
        this.h = eggVar.h;
        this.i = eggVar.i;
        this.j = eggVar.j;
        this.k = eggVar.k;
        this.l = eggVar.l;
        this.m = eggVar.m;
        this.n = eggVar.n;
        this.o = eggVar.o;
        this.p = eggVar.p;
        this.q = eggVar.q;
        this.r = eggVar.r;
        this.s = eggVar.s;
        this.t = eggVar.t;
        this.u = eggVar.u;
        this.v = eggVar.v;
        this.w = eggVar.w;
        this.x = eggVar.x;
        this.y = eggVar.y;
        this.z = eggVar.z;
        this.A = eggVar.A;
        this.B = eggVar.B;
        this.C = eggVar.C;
        this.E = new HashSet(eggVar.E);
        this.D = new HashMap(eggVar.D);
    }
}
