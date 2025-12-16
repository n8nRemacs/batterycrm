package androidx.media3.common;

import aZ0.InterfaceC19845a;
import android.os.Bundle;
import androidx.media3.common.util.C23114e;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.H1;
import com.google.common.collect.O4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import v61.InterfaceC49173d;

/* compiled from: TrackSelectionParameters.java */
/* loaded from: classes.dex */
public class U implements InterfaceC23096j {

    /* renamed from: B, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final U f47456B = new U(new a());

    /* renamed from: C, reason: collision with root package name */
    public static final String f47457C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f47458D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f47459E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f47460F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f47461G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f47462H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f47463I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f47464J;

    /* renamed from: K, reason: collision with root package name */
    public static final String f47465K;

    /* renamed from: L, reason: collision with root package name */
    public static final String f47466L;

    /* renamed from: M, reason: collision with root package name */
    public static final String f47467M;

    /* renamed from: N, reason: collision with root package name */
    public static final String f47468N;

    /* renamed from: O, reason: collision with root package name */
    public static final String f47469O;

    /* renamed from: P, reason: collision with root package name */
    public static final String f47470P;

    /* renamed from: Q, reason: collision with root package name */
    public static final String f47471Q;

    /* renamed from: R, reason: collision with root package name */
    public static final String f47472R;

    /* renamed from: S, reason: collision with root package name */
    public static final String f47473S;

    /* renamed from: T, reason: collision with root package name */
    public static final String f47474T;

    /* renamed from: U, reason: collision with root package name */
    public static final String f47475U;

    /* renamed from: V, reason: collision with root package name */
    public static final String f47476V;

    /* renamed from: W, reason: collision with root package name */
    public static final String f47477W;

    /* renamed from: X, reason: collision with root package name */
    public static final String f47478X;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f47479Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final String f47480Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f47481a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f47482b0;

    /* renamed from: A, reason: collision with root package name */
    public final H1<Integer> f47483A;

    /* renamed from: b, reason: collision with root package name */
    public final int f47484b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47485c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47487e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47488f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47489g;

    /* renamed from: h, reason: collision with root package name */
    public final int f47490h;

    /* renamed from: i, reason: collision with root package name */
    public final int f47491i;

    /* renamed from: j, reason: collision with root package name */
    public final int f47492j;

    /* renamed from: k, reason: collision with root package name */
    public final int f47493k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f47494l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC37401r1<String> f47495m;

    /* renamed from: n, reason: collision with root package name */
    public final int f47496n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC37401r1<String> f47497o;

    /* renamed from: p, reason: collision with root package name */
    public final int f47498p;

    /* renamed from: q, reason: collision with root package name */
    public final int f47499q;

    /* renamed from: r, reason: collision with root package name */
    public final int f47500r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC37401r1<String> f47501s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC37401r1<String> f47502t;

    /* renamed from: u, reason: collision with root package name */
    public final int f47503u;

    /* renamed from: v, reason: collision with root package name */
    public final int f47504v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f47505w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f47506x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f47507y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC37412t1<Q, T> f47508z;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47457C = Integer.toString(1, 36);
        f47458D = Integer.toString(2, 36);
        f47459E = Integer.toString(3, 36);
        f47460F = Integer.toString(4, 36);
        f47461G = Integer.toString(5, 36);
        f47462H = Integer.toString(6, 36);
        f47463I = Integer.toString(7, 36);
        f47464J = Integer.toString(8, 36);
        f47465K = Integer.toString(9, 36);
        f47466L = Integer.toString(10, 36);
        f47467M = Integer.toString(11, 36);
        f47468N = Integer.toString(12, 36);
        f47469O = Integer.toString(13, 36);
        f47470P = Integer.toString(14, 36);
        f47471Q = Integer.toString(15, 36);
        f47472R = Integer.toString(16, 36);
        f47473S = Integer.toString(17, 36);
        f47474T = Integer.toString(18, 36);
        f47475U = Integer.toString(19, 36);
        f47476V = Integer.toString(20, 36);
        f47477W = Integer.toString(21, 36);
        f47478X = Integer.toString(22, 36);
        f47479Y = Integer.toString(23, 36);
        f47480Z = Integer.toString(24, 36);
        f47481a0 = Integer.toString(25, 36);
        f47482b0 = Integer.toString(26, 36);
    }

    @androidx.media3.common.util.J
    public U(a aVar) {
        this.f47484b = aVar.f47509a;
        this.f47485c = aVar.f47510b;
        this.f47486d = aVar.f47511c;
        this.f47487e = aVar.f47512d;
        this.f47488f = aVar.f47513e;
        this.f47489g = aVar.f47514f;
        this.f47490h = aVar.f47515g;
        this.f47491i = aVar.f47516h;
        this.f47492j = aVar.f47517i;
        this.f47493k = aVar.f47518j;
        this.f47494l = aVar.f47519k;
        this.f47495m = aVar.f47520l;
        this.f47496n = aVar.f47521m;
        this.f47497o = aVar.f47522n;
        this.f47498p = aVar.f47523o;
        this.f47499q = aVar.f47524p;
        this.f47500r = aVar.f47525q;
        this.f47501s = aVar.f47526r;
        this.f47502t = aVar.f47527s;
        this.f47503u = aVar.f47528t;
        this.f47504v = aVar.f47529u;
        this.f47505w = aVar.f47530v;
        this.f47506x = aVar.f47531w;
        this.f47507y = aVar.f47532x;
        this.f47508z = AbstractC37412t1.c(aVar.f47533y);
        this.f47483A = H1.v(aVar.f47534z);
    }

    public a a() {
        a aVar = new a();
        aVar.d(this);
        return aVar;
    }

    public boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        U u12 = (U) obj;
        return this.f47484b == u12.f47484b && this.f47485c == u12.f47485c && this.f47486d == u12.f47486d && this.f47487e == u12.f47487e && this.f47488f == u12.f47488f && this.f47489g == u12.f47489g && this.f47490h == u12.f47490h && this.f47491i == u12.f47491i && this.f47494l == u12.f47494l && this.f47492j == u12.f47492j && this.f47493k == u12.f47493k && this.f47495m.equals(u12.f47495m) && this.f47496n == u12.f47496n && this.f47497o.equals(u12.f47497o) && this.f47498p == u12.f47498p && this.f47499q == u12.f47499q && this.f47500r == u12.f47500r && this.f47501s.equals(u12.f47501s) && this.f47502t.equals(u12.f47502t) && this.f47503u == u12.f47503u && this.f47504v == u12.f47504v && this.f47505w == u12.f47505w && this.f47506x == u12.f47506x && this.f47507y == u12.f47507y && this.f47508z.equals(u12.f47508z) && this.f47483A.equals(u12.f47483A);
    }

    public int hashCode() {
        return this.f47483A.hashCode() + ((this.f47508z.hashCode() + ((((((((((((this.f47502t.hashCode() + ((this.f47501s.hashCode() + ((((((((this.f47497o.hashCode() + ((((this.f47495m.hashCode() + ((((((((((((((((((((((this.f47484b + 31) * 31) + this.f47485c) * 31) + this.f47486d) * 31) + this.f47487e) * 31) + this.f47488f) * 31) + this.f47489g) * 31) + this.f47490h) * 31) + this.f47491i) * 31) + (this.f47494l ? 1 : 0)) * 31) + this.f47492j) * 31) + this.f47493k) * 31)) * 31) + this.f47496n) * 31)) * 31) + this.f47498p) * 31) + this.f47499q) * 31) + this.f47500r) * 31)) * 31)) * 31) + this.f47503u) * 31) + this.f47504v) * 31) + (this.f47505w ? 1 : 0)) * 31) + (this.f47506x ? 1 : 0)) * 31) + (this.f47507y ? 1 : 0)) * 31)) * 31);
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f47462H, this.f47484b);
        bundle.putInt(f47463I, this.f47485c);
        bundle.putInt(f47464J, this.f47486d);
        bundle.putInt(f47465K, this.f47487e);
        bundle.putInt(f47466L, this.f47488f);
        bundle.putInt(f47467M, this.f47489g);
        bundle.putInt(f47468N, this.f47490h);
        bundle.putInt(f47469O, this.f47491i);
        bundle.putInt(f47470P, this.f47492j);
        bundle.putInt(f47471Q, this.f47493k);
        bundle.putBoolean(f47472R, this.f47494l);
        bundle.putStringArray(f47473S, (String[]) this.f47495m.toArray(new String[0]));
        bundle.putInt(f47481a0, this.f47496n);
        bundle.putStringArray(f47457C, (String[]) this.f47497o.toArray(new String[0]));
        bundle.putInt(f47458D, this.f47498p);
        bundle.putInt(f47474T, this.f47499q);
        bundle.putInt(f47475U, this.f47500r);
        bundle.putStringArray(f47476V, (String[]) this.f47501s.toArray(new String[0]));
        bundle.putStringArray(f47459E, (String[]) this.f47502t.toArray(new String[0]));
        bundle.putInt(f47460F, this.f47503u);
        bundle.putInt(f47482b0, this.f47504v);
        bundle.putBoolean(f47461G, this.f47505w);
        bundle.putBoolean(f47477W, this.f47506x);
        bundle.putBoolean(f47478X, this.f47507y);
        bundle.putParcelableArrayList(f47479Y, C23114e.b(this.f47508z.values()));
        bundle.putIntArray(f47480Z, com.google.common.primitives.l.g(this.f47483A));
        return bundle;
    }

    /* compiled from: TrackSelectionParameters.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f47509a;

        /* renamed from: b, reason: collision with root package name */
        public int f47510b;

        /* renamed from: c, reason: collision with root package name */
        public int f47511c;

        /* renamed from: d, reason: collision with root package name */
        public int f47512d;

        /* renamed from: e, reason: collision with root package name */
        public int f47513e;

        /* renamed from: f, reason: collision with root package name */
        public int f47514f;

        /* renamed from: g, reason: collision with root package name */
        public int f47515g;

        /* renamed from: h, reason: collision with root package name */
        public int f47516h;

        /* renamed from: i, reason: collision with root package name */
        public int f47517i;

        /* renamed from: j, reason: collision with root package name */
        public int f47518j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f47519k;

        /* renamed from: l, reason: collision with root package name */
        public AbstractC37401r1<String> f47520l;

        /* renamed from: m, reason: collision with root package name */
        public int f47521m;

        /* renamed from: n, reason: collision with root package name */
        public AbstractC37401r1<String> f47522n;

        /* renamed from: o, reason: collision with root package name */
        public int f47523o;

        /* renamed from: p, reason: collision with root package name */
        public int f47524p;

        /* renamed from: q, reason: collision with root package name */
        public int f47525q;

        /* renamed from: r, reason: collision with root package name */
        public AbstractC37401r1<String> f47526r;

        /* renamed from: s, reason: collision with root package name */
        public AbstractC37401r1<String> f47527s;

        /* renamed from: t, reason: collision with root package name */
        public int f47528t;

        /* renamed from: u, reason: collision with root package name */
        public int f47529u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f47530v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f47531w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f47532x;

        /* renamed from: y, reason: collision with root package name */
        public HashMap<Q, T> f47533y;

        /* renamed from: z, reason: collision with root package name */
        public HashSet<Integer> f47534z;

        @androidx.media3.common.util.J
        @Deprecated
        public a() {
            this.f47509a = Integer.MAX_VALUE;
            this.f47510b = Integer.MAX_VALUE;
            this.f47511c = Integer.MAX_VALUE;
            this.f47512d = Integer.MAX_VALUE;
            this.f47517i = Integer.MAX_VALUE;
            this.f47518j = Integer.MAX_VALUE;
            this.f47519k = true;
            this.f47520l = AbstractC37401r1.C();
            this.f47521m = 0;
            this.f47522n = AbstractC37401r1.C();
            this.f47523o = 0;
            this.f47524p = Integer.MAX_VALUE;
            this.f47525q = Integer.MAX_VALUE;
            this.f47526r = AbstractC37401r1.C();
            this.f47527s = AbstractC37401r1.C();
            this.f47528t = 0;
            this.f47529u = 0;
            this.f47530v = false;
            this.f47531w = false;
            this.f47532x = false;
            this.f47533y = new HashMap<>();
            this.f47534z = new HashSet<>();
        }

        public static AbstractC37401r1<String> e(String[] strArr) {
            O4<Object> o42 = AbstractC37401r1.f359977c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            for (String str : strArr) {
                str.getClass();
                aVar.g(androidx.media3.common.util.M.G(str));
            }
            return aVar.i();
        }

        @InterfaceC19845a
        public void a(T t12) {
            this.f47533y.put(t12.f47454b, t12);
        }

        public U b() {
            return new U(this);
        }

        @InterfaceC19845a
        public a c() {
            this.f47533y.clear();
            return this;
        }

        @InterfaceC49173d
        public final void d(U u12) {
            this.f47509a = u12.f47484b;
            this.f47510b = u12.f47485c;
            this.f47511c = u12.f47486d;
            this.f47512d = u12.f47487e;
            this.f47513e = u12.f47488f;
            this.f47514f = u12.f47489g;
            this.f47515g = u12.f47490h;
            this.f47516h = u12.f47491i;
            this.f47517i = u12.f47492j;
            this.f47518j = u12.f47493k;
            this.f47519k = u12.f47494l;
            this.f47520l = u12.f47495m;
            this.f47521m = u12.f47496n;
            this.f47522n = u12.f47497o;
            this.f47523o = u12.f47498p;
            this.f47524p = u12.f47499q;
            this.f47525q = u12.f47500r;
            this.f47526r = u12.f47501s;
            this.f47527s = u12.f47502t;
            this.f47528t = u12.f47503u;
            this.f47529u = u12.f47504v;
            this.f47530v = u12.f47505w;
            this.f47531w = u12.f47506x;
            this.f47532x = u12.f47507y;
            this.f47534z = new HashSet<>(u12.f47483A);
            this.f47533y = new HashMap<>(u12.f47508z);
        }

        @InterfaceC19845a
        public a f(int i12, int i13) {
            this.f47517i = i12;
            this.f47518j = i13;
            this.f47519k = true;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @androidx.media3.common.util.J
        public a(Bundle bundle) {
            AbstractC37401r1 abstractC37401r1A;
            String str = U.f47462H;
            U u12 = U.f47456B;
            this.f47509a = bundle.getInt(str, u12.f47484b);
            this.f47510b = bundle.getInt(U.f47463I, u12.f47485c);
            this.f47511c = bundle.getInt(U.f47464J, u12.f47486d);
            this.f47512d = bundle.getInt(U.f47465K, u12.f47487e);
            this.f47513e = bundle.getInt(U.f47466L, u12.f47488f);
            this.f47514f = bundle.getInt(U.f47467M, u12.f47489g);
            this.f47515g = bundle.getInt(U.f47468N, u12.f47490h);
            this.f47516h = bundle.getInt(U.f47469O, u12.f47491i);
            this.f47517i = bundle.getInt(U.f47470P, u12.f47492j);
            this.f47518j = bundle.getInt(U.f47471Q, u12.f47493k);
            this.f47519k = bundle.getBoolean(U.f47472R, u12.f47494l);
            this.f47520l = AbstractC37401r1.w((String[]) com.google.common.base.D.a(bundle.getStringArray(U.f47473S), new String[0]));
            this.f47521m = bundle.getInt(U.f47481a0, u12.f47496n);
            this.f47522n = e((String[]) com.google.common.base.D.a(bundle.getStringArray(U.f47457C), new String[0]));
            this.f47523o = bundle.getInt(U.f47458D, u12.f47498p);
            this.f47524p = bundle.getInt(U.f47474T, u12.f47499q);
            this.f47525q = bundle.getInt(U.f47475U, u12.f47500r);
            this.f47526r = AbstractC37401r1.w((String[]) com.google.common.base.D.a(bundle.getStringArray(U.f47476V), new String[0]));
            this.f47527s = e((String[]) com.google.common.base.D.a(bundle.getStringArray(U.f47459E), new String[0]));
            this.f47528t = bundle.getInt(U.f47460F, u12.f47503u);
            this.f47529u = bundle.getInt(U.f47482b0, u12.f47504v);
            this.f47530v = bundle.getBoolean(U.f47461G, u12.f47505w);
            this.f47531w = bundle.getBoolean(U.f47477W, u12.f47506x);
            this.f47532x = bundle.getBoolean(U.f47478X, u12.f47507y);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(U.f47479Y);
            if (parcelableArrayList == null) {
                abstractC37401r1A = AbstractC37401r1.C();
            } else {
                abstractC37401r1A = C23114e.a(T.f47453f, parcelableArrayList);
            }
            this.f47533y = new HashMap<>();
            for (int i12 = 0; i12 < abstractC37401r1A.size(); i12++) {
                T t12 = (T) abstractC37401r1A.get(i12);
                this.f47533y.put(t12.f47454b, t12);
            }
            int[] iArr = (int[]) com.google.common.base.D.a(bundle.getIntArray(U.f47480Z), new int[0]);
            this.f47534z = new HashSet<>();
            for (int i13 : iArr) {
                this.f47534z.add(Integer.valueOf(i13));
            }
        }
    }
}
