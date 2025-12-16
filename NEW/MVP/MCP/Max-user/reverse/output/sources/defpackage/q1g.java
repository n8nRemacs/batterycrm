package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import java.io.File;
import java.util.Locale;

/* loaded from: classes2.dex */
public class q1g {
    public static final bwf a0 = new bwf(new nte(28));
    public static i7g b0;
    public static final tcf c0;
    public static final hbd d0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final Integer V;
    public final Integer W;
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final sf3 f;
    public final yt0 g;
    public final yt0 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        tcf tcfVarA = ucf.a(null);
        c0 = tcfVarA;
        d0 = new hbd(tcfVarA);
    }

    public q1g(String str, String str2, boolean z, int i, String str3, sf3 sf3Var, yt0 yt0Var, yt0 yt0Var2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = sf3Var;
        this.g = yt0Var;
        this.h = yt0Var2;
        int i2 = sf3Var.v;
        this.i = zob.b(i2, 0.15f);
        this.j = z ? q5d.darkPopup : q5d.defaultPopup;
        this.k = sf3Var.a;
        this.l = sf3Var.b;
        this.m = sf3Var.c;
        this.n = sf3Var.e;
        this.o = sf3Var.f;
        this.p = sf3Var.Q;
        this.q = sf3Var.R;
        this.r = sf3Var.S;
        this.s = sf3Var.h;
        this.t = sf3Var.j;
        this.u = sf3Var.k;
        this.v = sf3Var.l;
        this.w = sf3Var.m;
        this.x = sf3Var.n;
        this.y = sf3Var.o;
        this.z = sf3Var.p;
        this.A = sf3Var.q;
        this.B = sf3Var.r;
        this.C = sf3Var.s;
        this.D = sf3Var.t;
        this.E = sf3Var.u;
        this.F = i2;
        this.G = sf3Var.w;
        this.H = sf3Var.x;
        this.I = sf3Var.y;
        this.J = sf3Var.z;
        this.K = sf3Var.A;
        this.L = sf3Var.B;
        this.M = sf3Var.C;
        this.N = sf3Var.D;
        this.O = sf3Var.E;
        this.P = sf3Var.F;
        this.Q = sf3Var.G;
        this.R = sf3Var.H;
        this.S = sf3Var.I;
        this.T = sf3Var.J;
        this.U = sf3Var.K;
        this.V = sf3Var.L;
        this.W = sf3Var.M;
        this.X = sf3Var.N;
        this.Y = sf3Var.O;
        this.Z = sf3Var.P;
    }

    public static final boolean b(String str, boolean z) {
        File file = new File(str);
        if (z && !file.isFile()) {
            return false;
        }
        if (!z || file.exists()) {
            return file.getName().toLowerCase(Locale.getDefault()).endsWith(".ttstyle");
        }
        return false;
    }

    public final RippleDrawable a() {
        return new RippleDrawable(ColorStateList.valueOf(this.i), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1g)) {
            return false;
        }
        q1g q1gVar = (q1g) obj;
        if (fni.a(this.a, q1gVar.a) && fni.a(this.b, q1gVar.b) && this.c == q1gVar.c && this.d == q1gVar.d && fni.a(this.e, q1gVar.e)) {
            return fni.a(this.f, q1gVar.f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + u45.e((a9h.b(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e);
    }
}
