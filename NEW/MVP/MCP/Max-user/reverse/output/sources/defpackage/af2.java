package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class af2 {
    public long A;
    public ArrayList B;
    public lf2 C;
    public if2 D;
    public String E;
    public l16 F;
    public int G;
    public String H;
    public List I;
    public int J;
    public ff2 K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public int Q;
    public int S;
    public qf2 T;
    public long U;
    public int V;
    public long W;
    public int X;
    public long Y;
    public long Z;
    public long a;
    public pf2 b;
    public long b0;
    public of2 c;
    public p3b c0;
    public long d;
    public long d0;
    public Map e;
    public long e0;
    public long f;
    public boolean f0;
    public String g;
    public Map g0;
    public String h;
    public long h0;
    public String i;
    public boolean i0;
    public long j;
    public long k;
    public long k0;
    public long l;
    public String l0;
    public int m;
    public long m0;
    public long n0;
    public hf2 o;
    public df2 p;
    public df2 q;
    public df2 r;
    public df2 s;
    public df2 t;
    public df2 u;
    public df2 v;
    public df2 w;
    public long x;
    public ArrayList y;
    public List z;
    public kf2 n = new kf2();
    public int o0 = 2;
    public us R = new us(0);
    public cs0 a0 = cs0.c;
    public mf2 j0 = null;

    public final void a(bf2 bf2Var) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(bf2Var);
    }

    public final List b() {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        return this.B;
    }

    public final Map c() {
        if (this.e == null) {
            this.e = new us(2);
        }
        return this.e;
    }

    public final void d(Map map) {
        if (map == null) {
            this.R = new us(2);
            return;
        }
        us usVar = new us(map.size());
        this.R = usVar;
        usVar.putAll(map);
    }
}
