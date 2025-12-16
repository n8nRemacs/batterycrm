package androidx.media3.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.common.BinderC23095i;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23113d;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42154j;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PlayerInfo.java */
/* loaded from: classes.dex */
class D1 implements InterfaceC23096j {

    /* renamed from: G, reason: collision with root package name */
    public static final D1 f51936G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f51937H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f51938I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f51939J;

    /* renamed from: K, reason: collision with root package name */
    public static final String f51940K;

    /* renamed from: L, reason: collision with root package name */
    public static final String f51941L;

    /* renamed from: M, reason: collision with root package name */
    public static final String f51942M;

    /* renamed from: N, reason: collision with root package name */
    public static final String f51943N;

    /* renamed from: O, reason: collision with root package name */
    public static final String f51944O;

    /* renamed from: P, reason: collision with root package name */
    public static final String f51945P;

    /* renamed from: Q, reason: collision with root package name */
    public static final String f51946Q;

    /* renamed from: R, reason: collision with root package name */
    public static final String f51947R;

    /* renamed from: S, reason: collision with root package name */
    public static final String f51948S;

    /* renamed from: T, reason: collision with root package name */
    public static final String f51949T;

    /* renamed from: U, reason: collision with root package name */
    public static final String f51950U;

    /* renamed from: V, reason: collision with root package name */
    public static final String f51951V;

    /* renamed from: W, reason: collision with root package name */
    public static final String f51952W;

    /* renamed from: X, reason: collision with root package name */
    public static final String f51953X;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f51954Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final String f51955Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f51956a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f51957b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final String f51958c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final String f51959d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final String f51960e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final String f51961f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final String f51962g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final String f51963h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final String f51964i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final String f51965j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final String f51966k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final String f51967l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final C23228i f51968m0;

    /* renamed from: A, reason: collision with root package name */
    public final androidx.media3.common.B f51969A;

    /* renamed from: B, reason: collision with root package name */
    public final long f51970B;

    /* renamed from: C, reason: collision with root package name */
    public final long f51971C;

    /* renamed from: D, reason: collision with root package name */
    public final long f51972D;

    /* renamed from: E, reason: collision with root package name */
    public final androidx.media3.common.V f51973E;

    /* renamed from: F, reason: collision with root package name */
    public final androidx.media3.common.U f51974F;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final PlaybackException f51975b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51976c;

    /* renamed from: d, reason: collision with root package name */
    public final N1 f51977d;

    /* renamed from: e, reason: collision with root package name */
    public final H.k f51978e;

    /* renamed from: f, reason: collision with root package name */
    public final H.k f51979f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51980g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.common.G f51981h;

    /* renamed from: i, reason: collision with root package name */
    public final int f51982i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f51983j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.media3.common.P f51984k;

    /* renamed from: l, reason: collision with root package name */
    public final int f51985l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.media3.common.X f51986m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.media3.common.B f51987n;

    /* renamed from: o, reason: collision with root package name */
    public final float f51988o;

    /* renamed from: p, reason: collision with root package name */
    public final C23091e f51989p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.media3.common.text.b f51990q;

    /* renamed from: r, reason: collision with root package name */
    public final C23104o f51991r;

    /* renamed from: s, reason: collision with root package name */
    public final int f51992s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f51993t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f51994u;

    /* renamed from: v, reason: collision with root package name */
    public final int f51995v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f51996w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f51997x;

    /* renamed from: y, reason: collision with root package name */
    public final int f51998y;

    /* renamed from: z, reason: collision with root package name */
    public final int f51999z;

    /* compiled from: PlayerInfo.java */
    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public long f52000A;

        /* renamed from: B, reason: collision with root package name */
        public long f52001B;

        /* renamed from: C, reason: collision with root package name */
        public long f52002C;

        /* renamed from: D, reason: collision with root package name */
        public androidx.media3.common.V f52003D;

        /* renamed from: E, reason: collision with root package name */
        public androidx.media3.common.U f52004E;

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public PlaybackException f52005a;

        /* renamed from: b, reason: collision with root package name */
        public int f52006b;

        /* renamed from: c, reason: collision with root package name */
        public N1 f52007c;

        /* renamed from: d, reason: collision with root package name */
        public H.k f52008d;

        /* renamed from: e, reason: collision with root package name */
        public H.k f52009e;

        /* renamed from: f, reason: collision with root package name */
        public int f52010f;

        /* renamed from: g, reason: collision with root package name */
        public androidx.media3.common.G f52011g;

        /* renamed from: h, reason: collision with root package name */
        public int f52012h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f52013i;

        /* renamed from: j, reason: collision with root package name */
        public androidx.media3.common.P f52014j;

        /* renamed from: k, reason: collision with root package name */
        public int f52015k;

        /* renamed from: l, reason: collision with root package name */
        public androidx.media3.common.X f52016l;

        /* renamed from: m, reason: collision with root package name */
        public androidx.media3.common.B f52017m;

        /* renamed from: n, reason: collision with root package name */
        public float f52018n;

        /* renamed from: o, reason: collision with root package name */
        public C23091e f52019o;

        /* renamed from: p, reason: collision with root package name */
        public androidx.media3.common.text.b f52020p;

        /* renamed from: q, reason: collision with root package name */
        public C23104o f52021q;

        /* renamed from: r, reason: collision with root package name */
        public int f52022r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f52023s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f52024t;

        /* renamed from: u, reason: collision with root package name */
        public int f52025u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f52026v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f52027w;

        /* renamed from: x, reason: collision with root package name */
        public int f52028x;

        /* renamed from: y, reason: collision with root package name */
        public int f52029y;

        /* renamed from: z, reason: collision with root package name */
        public androidx.media3.common.B f52030z;

        public a(D1 d12) {
            this.f52005a = d12.f51975b;
            this.f52006b = d12.f51976c;
            this.f52007c = d12.f51977d;
            this.f52008d = d12.f51978e;
            this.f52009e = d12.f51979f;
            this.f52010f = d12.f51980g;
            this.f52011g = d12.f51981h;
            this.f52012h = d12.f51982i;
            this.f52013i = d12.f51983j;
            this.f52014j = d12.f51984k;
            this.f52015k = d12.f51985l;
            this.f52016l = d12.f51986m;
            this.f52017m = d12.f51987n;
            this.f52018n = d12.f51988o;
            this.f52019o = d12.f51989p;
            this.f52020p = d12.f51990q;
            this.f52021q = d12.f51991r;
            this.f52022r = d12.f51992s;
            this.f52023s = d12.f51993t;
            this.f52024t = d12.f51994u;
            this.f52025u = d12.f51995v;
            this.f52026v = d12.f51996w;
            this.f52027w = d12.f51997x;
            this.f52028x = d12.f51998y;
            this.f52029y = d12.f51999z;
            this.f52030z = d12.f51969A;
            this.f52000A = d12.f51970B;
            this.f52001B = d12.f51971C;
            this.f52002C = d12.f51972D;
            this.f52003D = d12.f51973E;
            this.f52004E = d12.f51974F;
        }

        public final D1 a() {
            C23110a.g(this.f52014j.x() || this.f52007c.f52190b.f47255c < this.f52014j.w());
            return new D1(this.f52005a, this.f52006b, this.f52007c, this.f52008d, this.f52009e, this.f52010f, this.f52011g, this.f52012h, this.f52013i, this.f52016l, this.f52014j, this.f52015k, this.f52017m, this.f52018n, this.f52019o, this.f52020p, this.f52021q, this.f52022r, this.f52023s, this.f52024t, this.f52025u, this.f52028x, this.f52029y, this.f52026v, this.f52027w, this.f52030z, this.f52000A, this.f52001B, this.f52002C, this.f52003D, this.f52004E);
        }
    }

    /* compiled from: PlayerInfo.java */
    public static class b implements InterfaceC23096j {

        /* renamed from: d, reason: collision with root package name */
        public static final b f52031d = new b(false, false);

        /* renamed from: e, reason: collision with root package name */
        public static final String f52032e;

        /* renamed from: f, reason: collision with root package name */
        public static final String f52033f;

        /* renamed from: g, reason: collision with root package name */
        public static final M1 f52034g;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f52035b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f52036c;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f52032e = Integer.toString(0, 36);
            f52033f = Integer.toString(1, 36);
            f52034g = new M1(12);
        }

        public b(boolean z12, boolean z13) {
            this.f52035b = z12;
            this.f52036c = z13;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f52035b == bVar.f52035b && this.f52036c == bVar.f52036c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f52035b), Boolean.valueOf(this.f52036c)});
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(f52032e, this.f52035b);
            bundle.putBoolean(f52033f, this.f52036c);
            return bundle;
        }
    }

    static {
        N1 n12 = N1.f52178m;
        H.k kVar = N1.f52177l;
        androidx.media3.common.G g12 = androidx.media3.common.G.f47232e;
        androidx.media3.common.X x12 = androidx.media3.common.X.f47549f;
        androidx.media3.common.P p12 = androidx.media3.common.P.f47368b;
        androidx.media3.common.B b12 = androidx.media3.common.B.f47110J;
        f51936G = new D1(null, 0, n12, kVar, kVar, 0, g12, 0, false, x12, p12, 0, b12, 1.0f, C23091e.f47644h, androidx.media3.common.text.b.f47856d, C23104o.f47686f, 0, false, false, 1, 0, 1, false, false, b12, 0L, 0L, 0L, androidx.media3.common.V.f47535c, androidx.media3.common.U.f47456B);
        int i12 = androidx.media3.common.util.M.f47887a;
        f51937H = Integer.toString(1, 36);
        f51938I = Integer.toString(2, 36);
        f51939J = Integer.toString(3, 36);
        f51940K = Integer.toString(4, 36);
        f51941L = Integer.toString(5, 36);
        f51942M = Integer.toString(6, 36);
        f51943N = Integer.toString(7, 36);
        f51944O = Integer.toString(8, 36);
        f51945P = Integer.toString(9, 36);
        f51946Q = Integer.toString(10, 36);
        f51947R = Integer.toString(11, 36);
        f51948S = Integer.toString(12, 36);
        f51949T = Integer.toString(13, 36);
        f51950U = Integer.toString(14, 36);
        f51951V = Integer.toString(15, 36);
        f51952W = Integer.toString(16, 36);
        f51953X = Integer.toString(17, 36);
        f51954Y = Integer.toString(18, 36);
        f51955Z = Integer.toString(19, 36);
        f51956a0 = Integer.toString(20, 36);
        f51957b0 = Integer.toString(21, 36);
        f51958c0 = Integer.toString(22, 36);
        f51959d0 = Integer.toString(23, 36);
        f51960e0 = Integer.toString(24, 36);
        f51961f0 = Integer.toString(25, 36);
        f51962g0 = Integer.toString(26, 36);
        f51963h0 = Integer.toString(27, 36);
        f51964i0 = Integer.toString(28, 36);
        f51965j0 = Integer.toString(29, 36);
        f51966k0 = Integer.toString(30, 36);
        f51967l0 = Integer.toString(31, 36);
        f51968m0 = new C23228i(29);
    }

    public D1(@j.P PlaybackException playbackException, int i12, N1 n12, H.k kVar, H.k kVar2, int i13, androidx.media3.common.G g12, int i14, boolean z12, androidx.media3.common.X x12, androidx.media3.common.P p12, int i15, androidx.media3.common.B b12, float f12, C23091e c23091e, androidx.media3.common.text.b bVar, C23104o c23104o, int i16, boolean z13, boolean z14, int i17, int i18, int i19, boolean z15, boolean z16, androidx.media3.common.B b13, long j12, long j13, long j14, androidx.media3.common.V v12, androidx.media3.common.U u12) {
        this.f51975b = playbackException;
        this.f51976c = i12;
        this.f51977d = n12;
        this.f51978e = kVar;
        this.f51979f = kVar2;
        this.f51980g = i13;
        this.f51981h = g12;
        this.f51982i = i14;
        this.f51983j = z12;
        this.f51986m = x12;
        this.f51984k = p12;
        this.f51985l = i15;
        this.f51987n = b12;
        this.f51988o = f12;
        this.f51989p = c23091e;
        this.f51990q = bVar;
        this.f51991r = c23104o;
        this.f51992s = i16;
        this.f51993t = z13;
        this.f51994u = z14;
        this.f51995v = i17;
        this.f51998y = i18;
        this.f51999z = i19;
        this.f51996w = z15;
        this.f51997x = z16;
        this.f51969A = b13;
        this.f51970B = j12;
        this.f51971C = j13;
        this.f51972D = j14;
        this.f51973E = v12;
        this.f51974F = u12;
    }

    public final D1 a(androidx.media3.common.V v12) {
        a aVar = new a(this);
        aVar.f52003D = v12;
        return aVar.a();
    }

    @InterfaceC42154j
    public final D1 b(int i12, boolean z12) {
        a aVar = new a(this);
        aVar.f52022r = i12;
        aVar.f52023s = z12;
        return aVar.a();
    }

    @InterfaceC42154j
    public final D1 g(int i12, int i13, boolean z12) {
        a aVar = new a(this);
        aVar.f52024t = z12;
        aVar.f52025u = i12;
        aVar.f52028x = i13;
        aVar.f52026v = this.f51999z == 3 && z12 && i13 == 0;
        return aVar.a();
    }

    @InterfaceC42154j
    public final D1 j(androidx.media3.common.G g12) {
        a aVar = new a(this);
        aVar.f52011g = g12;
        return aVar.a();
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        H.c.a aVar = new H.c.a();
        aVar.f47244a.b(H.c.a.f47243b);
        return q(aVar.c(), false, false);
    }

    @InterfaceC42154j
    public final D1 l(int i12, @j.P PlaybackException playbackException) {
        a aVar = new a(this);
        aVar.f52005a = playbackException;
        aVar.f52029y = i12;
        aVar.f52026v = i12 == 3 && this.f51994u && this.f51998y == 0;
        return aVar.a();
    }

    @InterfaceC42154j
    public final D1 m(N1 n12) {
        a aVar = new a(this);
        aVar.f52007c = n12;
        return aVar.a();
    }

    @InterfaceC42154j
    public final D1 n(androidx.media3.common.P p12, int i12) {
        a aVar = new a(this);
        aVar.f52014j = p12;
        aVar.f52015k = 0;
        N1 n12 = this.f51977d;
        H.k kVar = n12.f52190b;
        aVar.f52007c = new N1(new H.k(kVar.f47254b, i12, kVar.f47256d, kVar.f47257e, kVar.f47258f, kVar.f47259g, kVar.f47260h, kVar.f47261i, kVar.f47262j), n12.f52191c, SystemClock.elapsedRealtime(), n12.f52193e, n12.f52194f, n12.f52195g, n12.f52196h, n12.f52197i, n12.f52198j, n12.f52199k);
        return aVar.a();
    }

    @InterfaceC42154j
    public final D1 o(androidx.media3.common.U u12) {
        a aVar = new a(this);
        aVar.f52004E = u12;
        return aVar.a();
    }

    @j.P
    public final androidx.media3.common.z p() {
        androidx.media3.common.P p12 = this.f51984k;
        if (p12.x()) {
            return null;
        }
        return p12.u(this.f51977d.f52190b.f47255c, new P.d(), 0L).f47409d;
    }

    public final Bundle q(H.c cVar, boolean z12, boolean z13) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i12;
        Bundle bundle = new Bundle();
        boolean zA2 = cVar.a(16);
        boolean zA3 = cVar.a(17);
        PlaybackException playbackException = this.f51975b;
        if (playbackException != null) {
            bundle.putBundle(f51954Y, playbackException.k());
        }
        bundle.putInt(f51956a0, this.f51976c);
        N1 n12 = this.f51977d;
        bundle.putBundle(f51955Z, n12.a(zA2, zA3));
        bundle.putBundle(f51957b0, this.f51978e.a(zA2, zA3));
        bundle.putBundle(f51958c0, this.f51979f.a(zA2, zA3));
        bundle.putInt(f51959d0, this.f51980g);
        bundle.putBundle(f51937H, this.f51981h.k());
        bundle.putInt(f51938I, this.f51982i);
        bundle.putBoolean(f51939J, this.f51983j);
        String str = f51940K;
        androidx.media3.common.P p12 = this.f51984k;
        if (!z12 && zA3) {
            bundle.putBundle(str, p12.k());
        } else if (!zA3 && zA2 && !p12.x()) {
            P.d dVarU = p12.u(n12.f52190b.f47255c, new P.d(), 0L);
            ArrayList arrayList = new ArrayList();
            P.b bVar = new P.b();
            int i13 = dVarU.f47421p;
            while (true) {
                i12 = dVarU.f47422q;
                if (i13 > i12) {
                    break;
                }
                p12.n(i13, bVar, false);
                bVar.f47381d = 0;
                arrayList.add(bVar.k());
                i13++;
            }
            dVarU.f47422q = i12 - dVarU.f47421p;
            dVarU.f47421p = 0;
            Bundle bundleK = dVarU.k();
            Bundle bundle2 = new Bundle();
            C23113d.b(bundle2, androidx.media3.common.P.f47369c, new BinderC23095i(AbstractC37401r1.E(bundleK)));
            C23113d.b(bundle2, androidx.media3.common.P.f47370d, new BinderC23095i(arrayList));
            bundle2.putIntArray(androidx.media3.common.P.f47371e, new int[]{0});
            bundle.putBundle(str, bundle2);
        }
        bundle.putInt(f51967l0, this.f51985l);
        bundle.putBundle(f51941L, this.f51986m.k());
        if (cVar.a(18)) {
            bundle.putBundle(f51942M, this.f51987n.k());
        }
        if (cVar.a(22)) {
            bundle.putFloat(f51943N, this.f51988o);
        }
        if (cVar.a(21)) {
            bundle.putBundle(f51944O, this.f51989p.k());
        }
        if (cVar.a(28)) {
            bundle.putBundle(f51960e0, this.f51990q.k());
        }
        bundle.putBundle(f51945P, this.f51991r.k());
        if (cVar.a(23)) {
            bundle.putInt(f51946Q, this.f51992s);
            bundle.putBoolean(f51947R, this.f51993t);
        }
        bundle.putBoolean(f51948S, this.f51994u);
        bundle.putInt(f51950U, this.f51998y);
        bundle.putInt(f51951V, this.f51999z);
        bundle.putBoolean(f51952W, this.f51996w);
        bundle.putBoolean(f51953X, this.f51997x);
        if (cVar.a(18)) {
            bundle.putBundle(f51961f0, this.f51969A.k());
        }
        bundle.putLong(f51962g0, this.f51970B);
        bundle.putLong(f51963h0, this.f51971C);
        bundle.putLong(f51964i0, this.f51972D);
        if (!z13 && cVar.a(30)) {
            bundle.putBundle(f51966k0, this.f51973E.k());
        }
        bundle.putBundle(f51965j0, this.f51974F.k());
        return bundle;
    }
}
