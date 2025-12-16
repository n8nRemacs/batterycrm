package defpackage;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rf2 {
    public final long A;
    public final List B;
    public final if2 C;
    public final int D;
    public final String E;
    public final List F;
    public final int G;
    public final ff2 H;
    public final String I;
    public final l16 J;
    public final lf2 K;
    public final long L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final long P;
    public final int Q;
    public final us R;
    public final int S;
    public final qf2 T;
    public final long U;
    public final int V;
    public final long W;
    public final int X;
    public final long Y;
    public final long Z;
    public final long a;
    public final long a0;
    public final pf2 b;
    public final cs0 b0;
    public final of2 c;
    public final p3b c0;
    public final long d;
    public final long d0;
    public final Map e;
    public final long e0;
    public final long f;
    public boolean f0;
    public final String g;
    public final long g0;
    public final String h;
    public final boolean h0;
    public final String i;
    public final long i0;
    public final long j;
    public final String j0;
    public final long k;
    public final Map k0;
    public final long l;
    public final mf2 l0;
    public final int m;
    public final long m0;
    public final kf2 n;
    public final long n0;
    public final hf2 o;
    public final int o0;
    public final df2 p;
    public final df2 q;
    public final df2 r;
    public final df2 s;
    public final df2 t;
    public final df2 u;
    public final df2 v;
    public final df2 w;
    public final long x;
    public final List y;
    public final List z;

    public rf2(af2 af2Var) {
        this.a = af2Var.a;
        pf2 pf2Var = af2Var.b;
        if (pf2Var == null) {
            this.b = pf2.a;
        } else {
            this.b = pf2Var;
        }
        of2 of2Var = af2Var.c;
        if (of2Var == null) {
            this.c = of2.a;
        } else {
            this.c = of2Var;
        }
        this.d = af2Var.d;
        Map map = af2Var.e;
        this.e = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f = af2Var.f;
        this.g = af2Var.g;
        this.h = af2Var.h;
        this.i = af2Var.i;
        this.j = af2Var.j;
        this.k = af2Var.k;
        this.l = af2Var.l;
        this.m = af2Var.m;
        kf2 kf2Var = af2Var.n;
        this.n = kf2Var != null ? kf2Var.b(true) : new kf2();
        this.o = af2Var.o;
        this.p = af2Var.p;
        this.q = af2Var.q;
        this.r = af2Var.r;
        this.s = af2Var.s;
        this.t = af2Var.t;
        this.u = af2Var.u;
        this.v = af2Var.v;
        this.w = af2Var.w;
        this.x = af2Var.x;
        ArrayList arrayList = af2Var.y;
        this.y = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        List list = af2Var.z;
        this.z = list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
        this.A = af2Var.A;
        ArrayList arrayList2 = af2Var.B;
        this.B = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST;
        this.C = af2Var.D;
        this.D = af2Var.G;
        this.E = af2Var.H;
        List list2 = af2Var.I;
        if (list2 == null) {
            this.F = Collections.EMPTY_LIST;
        } else {
            this.F = list2;
        }
        this.G = af2Var.J;
        ff2 ff2Var = af2Var.K;
        if (ff2Var == null) {
            this.H = ff2.l;
        } else {
            this.H = ff2Var;
        }
        this.o0 = af2Var.o0;
        this.I = af2Var.E;
        l16 l16Var = af2Var.F;
        this.J = l16Var == null ? l16.d : l16Var;
        this.K = af2Var.C;
        this.L = af2Var.L;
        this.M = af2Var.M;
        this.N = af2Var.N;
        this.O = af2Var.O;
        this.P = af2Var.P;
        this.Q = af2Var.Q;
        this.R = af2Var.R;
        this.S = af2Var.S;
        this.T = af2Var.T;
        this.U = af2Var.U;
        this.V = af2Var.V;
        this.W = af2Var.W;
        this.X = af2Var.X;
        this.Y = af2Var.Y;
        this.Z = af2Var.Z;
        this.b0 = af2Var.a0;
        this.a0 = af2Var.b0;
        this.c0 = af2Var.c0;
        this.d0 = af2Var.d0;
        this.e0 = af2Var.e0;
        this.f0 = af2Var.f0;
        this.k0 = af2Var.g0;
        this.g0 = af2Var.h0;
        this.h0 = af2Var.i0;
        this.l0 = af2Var.j0;
        this.i0 = af2Var.k0;
        this.j0 = af2Var.l0;
        this.m0 = af2Var.m0;
        this.n0 = af2Var.n0;
    }

    public final hf2 a() {
        hf2 hf2Var = this.o;
        return hf2Var != null ? hf2Var : hf2.h;
    }

    public final String b(il0 il0Var, hl0 hl0Var) {
        String str = this.h;
        if (URLUtil.isContentUrl(str) || URLUtil.isFileUrl(str)) {
            return str;
        }
        if (l8g.c(str)) {
            return null;
        }
        return xui.a(str, il0Var, hl0Var);
    }

    public final int c() {
        if (this.b == pf2.a) {
            return 2;
        }
        return this.D;
    }

    public final boolean d() {
        return this.b == pf2.a;
    }

    public final boolean e(long j) {
        if (this.a != 0 || this.b != pf2.a || this.d != j) {
            return false;
        }
        Map map = this.e;
        return map.size() == 1 && map.containsKey(Long.valueOf(j));
    }

    public final boolean f() {
        return (this.g0 == 0 || d()) ? false : true;
    }

    public final boolean g() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return this.c != of2.Y;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return this.a != 0;
        }
        throw new IllegalStateException("invalid chat type");
    }

    public final af2 h() {
        af2 af2Var = new af2();
        af2Var.a = this.a;
        af2Var.b = this.b;
        af2Var.c = this.c;
        af2Var.d = this.d;
        Map map = this.e;
        us usVar = new us(map.size());
        usVar.putAll(map);
        af2Var.e = usVar;
        af2Var.f = this.f;
        af2Var.g = this.g;
        af2Var.h = this.h;
        af2Var.i = this.i;
        af2Var.j = this.j;
        af2Var.k = this.k;
        af2Var.l = this.l;
        af2Var.m = this.m;
        af2Var.n = this.n.b(false);
        af2Var.o = this.o;
        af2Var.p = this.p;
        af2Var.q = this.q;
        af2Var.r = this.r;
        af2Var.s = this.s;
        af2Var.t = this.t;
        af2Var.u = this.u;
        af2Var.v = this.v;
        af2Var.w = this.w;
        af2Var.x = this.x;
        af2Var.y = new ArrayList(this.y);
        af2Var.z = new ArrayList(this.z);
        af2Var.A = this.A;
        af2Var.B = new ArrayList(this.B);
        af2Var.C = this.K;
        af2Var.D = this.C;
        af2Var.o0 = this.o0;
        af2Var.E = this.I;
        af2Var.F = this.J;
        af2Var.G = this.D;
        af2Var.H = this.E;
        af2Var.I = new ArrayList(this.F);
        af2Var.J = this.G;
        af2Var.K = this.H;
        af2Var.L = this.L;
        af2Var.M = this.M;
        af2Var.N = this.N;
        af2Var.O = this.O;
        af2Var.P = this.P;
        af2Var.Q = this.Q;
        af2Var.d(this.R);
        af2Var.S = this.S;
        af2Var.T = this.T;
        af2Var.U = this.U;
        af2Var.V = this.V;
        af2Var.W = this.W;
        af2Var.X = this.X;
        af2Var.Y = this.Y;
        af2Var.Z = this.Z;
        af2Var.a0 = this.b0;
        af2Var.b0 = this.a0;
        af2Var.c0 = this.c0;
        af2Var.d0 = this.d0;
        af2Var.e0 = this.e0;
        af2Var.f0 = this.f0;
        af2Var.g0 = this.k0;
        af2Var.i0 = this.h0;
        af2Var.j0 = this.l0;
        af2Var.h0 = this.g0;
        af2Var.k0 = this.i0;
        af2Var.l0 = this.j0;
        af2Var.m0 = this.m0;
        af2Var.n0 = this.n0;
        return af2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatData{serverId=");
        sb.append(this.a);
        sb.append(", type=");
        pf2 pf2Var = this.b;
        sb.append(pf2Var);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", participants={");
        pf2 pf2Var2 = pf2.a;
        Map map = this.e;
        sb.append(pf2Var == pf2Var2 ? l8g.e(map.keySet()) : Integer.valueOf(map.size()));
        sb.append("}, title='");
        sb.append(wqi.a() ? this.g : "*****");
        sb.append("', lastMessageId=");
        sb.append(this.j);
        sb.append(", lastEventTime=");
        sb.append(this.k);
        sb.append(", newMessages=");
        sb.append(this.m);
        sb.append(", lastPushMessage=");
        sb.append(this.l0);
        sb.append(", markedAsUnread=");
        sb.append(this.h0);
        sb.append(", chatSettings=");
        sb.append(this.o);
        sb.append(", lastReactionMessageId= ");
        sb.append(this.i0);
        sb.append(", lastReaction");
        return u45.l(sb, this.j0, '}');
    }
}
