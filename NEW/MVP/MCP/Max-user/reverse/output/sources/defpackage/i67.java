package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class i67 implements bc8, gc8, jee, kp5, fxd {
    public static final Set i1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final c67 A0;
    public final Handler B0;
    public final ArrayList C0;
    public final Map D0;
    public e93 E0;
    public g67[] F0;
    public int[] G0;
    public final HashSet H0;
    public final SparseIntArray I0;
    public e67 J0;
    public int K0;
    public int L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public hf6 P0;
    public hf6 Q0;
    public boolean R0;
    public nfg S0;
    public Set T0;
    public int[] U0;
    public int V0;
    public boolean W0;
    public final hf6 X;
    public boolean[] X0;
    public final k55 Y;
    public boolean[] Y0;
    public final d55 Z;
    public long Z0;
    public final String a;
    public long a1;
    public final int b;
    public boolean b1;
    public final h08 c;
    public boolean c1;
    public final m47 d;
    public boolean d1;
    public boolean e1;
    public long f1;
    public y45 g1;
    public s47 h1;
    public final ri4 o;
    public final tha s0;
    public final te8 t0 = new te8("Loader:HlsSampleStreamWrapper");
    public final lk6 u0;
    public final int v0;
    public final vd w0;
    public final ArrayList x0;
    public final List y0;
    public final c67 z0;

    /* JADX WARN: Type inference failed for: r1v12, types: [c67] */
    /* JADX WARN: Type inference failed for: r1v13, types: [c67] */
    public i67(String str, int i, h08 h08Var, m47 m47Var, Map map, ri4 ri4Var, long j, hf6 hf6Var, k55 k55Var, d55 d55Var, tha thaVar, lk6 lk6Var, int i2) {
        this.a = str;
        this.b = i;
        this.c = h08Var;
        this.d = m47Var;
        this.D0 = map;
        this.o = ri4Var;
        this.X = hf6Var;
        this.Y = k55Var;
        this.Z = d55Var;
        this.s0 = thaVar;
        this.u0 = lk6Var;
        this.v0 = i2;
        vd vdVar = new vd(6);
        vdVar.c = null;
        final int i3 = 0;
        vdVar.b = false;
        vdVar.d = null;
        this.w0 = vdVar;
        this.G0 = new int[0];
        Set set = i1;
        this.H0 = new HashSet(set.size());
        this.I0 = new SparseIntArray(set.size());
        this.F0 = new g67[0];
        this.Y0 = new boolean[0];
        this.X0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.x0 = arrayList;
        this.y0 = Collections.unmodifiableList(arrayList);
        this.C0 = new ArrayList();
        this.z0 = new Runnable(this) { // from class: c67
            public final /* synthetic */ i67 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        i67 i67Var = this.b;
                        i67Var.M0 = true;
                        i67Var.C();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.A0 = new Runnable(this) { // from class: c67
            public final /* synthetic */ i67 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        i67 i67Var = this.b;
                        i67Var.M0 = true;
                        i67Var.C();
                        break;
                }
            }
        };
        this.B0 = zxg.n(null);
        this.Z0 = j;
        this.a1 = j;
    }

    public static jx4 i(int i, int i2) {
        a8i.l("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new jx4();
    }

    public static hf6 u(hf6 hf6Var, hf6 hf6Var2, boolean z) {
        String strB;
        if (hf6Var == null) {
            return hf6Var2;
        }
        String str = hf6Var.k;
        String strD = hf6Var2.n;
        int iH = xz9.h(strD);
        if (zxg.u(iH, str) == 1) {
            strB = zxg.v(iH, str);
            strD = xz9.d(strB);
        } else {
            strB = xz9.b(str, strD);
        }
        ff6 ff6VarA = hf6Var2.a();
        ff6VarA.a = hf6Var.a;
        ff6VarA.b = hf6Var.b;
        ff6VarA.c = wg7.j(hf6Var.c);
        ff6VarA.d = hf6Var.d;
        ff6VarA.e = hf6Var.e;
        ff6VarA.f = hf6Var.f;
        ff6VarA.h = z ? hf6Var.h : -1;
        ff6VarA.i = z ? hf6Var.i : -1;
        ff6VarA.j = strB;
        if (iH == 2) {
            ff6VarA.t = hf6Var.u;
            ff6VarA.u = hf6Var.v;
            ff6VarA.x = hf6Var.y;
        }
        if (strD != null) {
            ff6VarA.m = xz9.n(strD);
        }
        int i = hf6Var.F;
        if (i != -1 && iH == 1) {
            ff6VarA.E = i;
        }
        ty9 ty9VarB = hf6Var.l;
        if (ty9VarB != null) {
            ty9 ty9Var = hf6Var2.l;
            if (ty9Var != null) {
                ty9VarB = ty9Var.b(ty9VarB);
            }
            ff6VarA.k = ty9VarB;
        }
        return new hf6(ff6VarA);
    }

    public static int z(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final boolean A() {
        return this.a1 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [g67[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g67[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [sfg] */
    /* JADX WARN: Type inference failed for: r5v4, types: [g67, hxd] */
    /* JADX WARN: Type inference failed for: r5v6, types: [jx4] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.kp5
    /* renamed from: B */
    public final sfg mo163B(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = i1;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.H0;
        SparseIntArray sparseIntArray = this.I0;
        ?? g67Var = 0;
        g67Var = 0;
        if (zContains) {
            hsi.b(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.G0[i3] = i;
                }
                g67Var = this.G0[i3] == i ? this.F0[i3] : i(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.F0;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.G0[i4] == i) {
                    g67Var = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (g67Var == 0) {
            if (this.e1) {
                return i(i, i2);
            }
            int length = this.F0.length;
            boolean z = i2 == 1 || i2 == 2;
            g67Var = new g67(this.o, this.Y, this.Z, this.D0);
            g67Var.t = this.Z0;
            if (z) {
                g67Var.I = this.g1;
                g67Var.z = true;
            }
            long j = this.f1;
            if (g67Var.F != j) {
                g67Var.F = j;
                g67Var.z = true;
            }
            if (this.h1 != null) {
                g67Var.C = r6.u0;
            }
            g67Var.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.G0, i5);
            this.G0 = iArrCopyOf;
            iArrCopyOf[length] = i;
            g67[] g67VarArr = this.F0;
            String str = zxg.a;
            ?? CopyOf = Arrays.copyOf(g67VarArr, g67VarArr.length + 1);
            CopyOf[g67VarArr.length] = g67Var;
            this.F0 = (g67[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.Y0, i5);
            this.Y0 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.W0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (z(i2) > z(this.K0)) {
                this.L0 = length;
                this.K0 = i2;
            }
            this.X0 = Arrays.copyOf(this.X0, i5);
        }
        if (i2 != 5) {
            return g67Var;
        }
        if (this.J0 == null) {
            this.J0 = new e67(g67Var, this.v0);
        }
        return this.J0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        int i;
        if (!this.R0 && this.U0 == null && this.M0) {
            int i2 = 0;
            for (g67 g67Var : this.F0) {
                if (g67Var.t() == null) {
                    return;
                }
            }
            nfg nfgVar = this.S0;
            if (nfgVar != null) {
                int i3 = nfgVar.a;
                int[] iArr = new int[i3];
                this.U0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        g67[] g67VarArr = this.F0;
                        if (i5 < g67VarArr.length) {
                            hf6 hf6VarT = g67VarArr[i5].t();
                            hsi.h(hf6VarT);
                            hf6 hf6Var = this.S0.a(i4).d[0];
                            String str = hf6VarT.n;
                            String str2 = hf6Var.n;
                            int iH = xz9.h(str);
                            if (iH != 3) {
                                if (iH == xz9.h(str2)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || hf6VarT.K == hf6Var.K)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.U0[i4] = i5;
                }
                Iterator it = this.C0.iterator();
                while (it.hasNext()) {
                    ((a67) it.next()).a();
                }
                return;
            }
            int length = this.F0.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                hf6 hf6VarT2 = this.F0[i6].t();
                hsi.h(hf6VarT2);
                String str3 = hf6VarT2.n;
                if (xz9.m(str3)) {
                    i9 = 2;
                } else if (!xz9.i(str3)) {
                    i9 = xz9.l(str3) ? 3 : -2;
                }
                if (z(i9) > z(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            lfg lfgVar = this.d.h;
            int i10 = lfgVar.a;
            this.V0 = -1;
            this.U0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.U0[i11] = i11;
            }
            lfg[] lfgVarArr = new lfg[length];
            int i12 = 0;
            while (i12 < length) {
                hf6 hf6VarT3 = this.F0[i12].t();
                hsi.h(hf6VarT3);
                String str4 = this.a;
                hf6 hf6Var2 = this.X;
                if (i12 == i7) {
                    hf6[] hf6VarArr = new hf6[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        hf6 hf6VarE = lfgVar.d[i13];
                        if (i8 == 1 && hf6Var2 != null) {
                            hf6VarE = hf6VarE.e(hf6Var2);
                        }
                        hf6VarArr[i13] = i10 == 1 ? hf6VarT3.e(hf6VarE) : u(hf6VarE, hf6VarT3, true);
                    }
                    lfgVarArr[i12] = new lfg(str4, hf6VarArr);
                    this.V0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !xz9.i(hf6VarT3.n)) {
                        hf6Var2 = null;
                    }
                    StringBuilder sbO = ho7.o(str4, ":muxed:");
                    sbO.append(i12 < i7 ? i12 : i12 - 1);
                    i = 0;
                    lfgVarArr[i12] = new lfg(sbO.toString(), u(hf6Var2, hf6VarT3, false));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.S0 = s(lfgVarArr);
            hsi.g(this.T0 == null ? 1 : i14);
            this.T0 = Collections.EMPTY_SET;
            this.N0 = true;
            this.c.N();
        }
    }

    public final void D() throws IOException {
        this.t0.b();
        m47 m47Var = this.d;
        BehindLiveWindowException behindLiveWindowException = m47Var.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = m47Var.o;
        if (uri == null || !uri.equals(m47Var.p)) {
            return;
        }
        bn4 bn4Var = m47Var.g;
        an4 an4Var = (an4) bn4Var.b.get(m47Var.o);
        an4Var.b.b();
        IOException iOException = an4Var.t0;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void E(lfg[] lfgVarArr, int... iArr) {
        this.S0 = s(lfgVarArr);
        this.T0 = new HashSet();
        for (int i : iArr) {
            this.T0.add(this.S0.a(i));
        }
        this.V0 = 0;
        this.B0.post(new gq5(7, this.c));
        this.N0 = true;
    }

    public final void F() {
        for (g67 g67Var : this.F0) {
            g67Var.A(this.b1);
        }
        this.b1 = false;
    }

    @Override // defpackage.bc8
    public final void G(ec8 ec8Var, long j, long j2, int i) {
        ub8 ub8Var;
        e93 e93Var = (e93) ec8Var;
        if (i == 0) {
            long j3 = e93Var.a;
            ub8Var = new ub8(e93Var.b);
        } else {
            long j4 = e93Var.a;
            ze4 ze4Var = e93Var.b;
            zdf zdfVar = e93Var.s0;
            Uri uri = zdfVar.c;
            ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        }
        this.u0.R(ub8Var, e93Var.c, this.b, e93Var.d, e93Var.o, e93Var.X, e93Var.Y, e93Var.Z, i);
    }

    public final boolean H(long j, boolean z) {
        s47 s47Var;
        boolean z2;
        boolean zC;
        this.Z0 = j;
        if (A()) {
            this.a1 = j;
            return true;
        }
        boolean z3 = this.d.q;
        ArrayList arrayList = this.x0;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                s47Var = (s47) arrayList.get(i);
                if (s47Var.Y == j) {
                    break;
                }
            }
            s47Var = null;
        } else {
            s47Var = null;
        }
        if (this.M0 && !z && !arrayList.isEmpty()) {
            int length = this.F0.length;
            for (int i2 = 0; i2 < length; i2++) {
                g67 g67Var = this.F0[i2];
                if (s47Var != null) {
                    zC = g67Var.B(s47Var.f(i2));
                } else {
                    long jD = d();
                    zC = g67Var.C(j, jD == Long.MIN_VALUE || j < jD);
                }
                if (!zC && (this.Y0[i2] || !this.W0)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.a1 = j;
        this.d1 = false;
        arrayList.clear();
        te8 te8Var = this.t0;
        if (!te8Var.A()) {
            te8Var.c = null;
            F();
            return true;
        }
        if (this.M0) {
            for (g67 g67Var2 : this.F0) {
                g67Var2.h();
            }
        }
        te8Var.c();
        return true;
    }

    @Override // defpackage.bc8
    public final y21 K(ec8 ec8Var, long j, long j2, IOException iOException, int i) {
        boolean zU;
        y21 y21Var;
        int i2;
        e93 e93Var = (e93) ec8Var;
        boolean z = e93Var instanceof s47;
        if (z && !((s47) e93Var).g() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).d) == 410 || i2 == 404)) {
            return te8.d;
        }
        long j3 = e93Var.s0.b;
        ze4 ze4Var = e93Var.b;
        Uri uri = e93Var.s0.c;
        ub8 ub8Var = new ub8(ze4Var, j2, j3);
        zxg.m0(e93Var.Y);
        zxg.m0(e93Var.Z);
        sb8 sb8Var = new sb8(i, iOException);
        m47 m47Var = this.d;
        y21 y21VarP = this.s0.p(qfi.b(m47Var.r), sb8Var);
        if (y21VarP == null || y21VarP.b != 2) {
            zU = false;
        } else {
            long j4 = y21VarP.c;
            bn5 bn5Var = m47Var.r;
            zU = bn5Var.u(bn5Var.p(m47Var.h.b(e93Var.d)), j4);
        }
        if (zU) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.x0;
                hsi.g(((s47) arrayList.remove(arrayList.size() - 1)) == e93Var);
                if (arrayList.isEmpty()) {
                    this.a1 = this.Z0;
                } else {
                    ((s47) uni.c(arrayList)).T0 = true;
                }
            }
            y21Var = te8.o;
        } else {
            long jS = tha.s(sb8Var);
            y21Var = jS != -9223372036854775807L ? new y21(jS, 0, 5, false) : te8.X;
        }
        y21 y21Var2 = y21Var;
        boolean zA = y21Var2.a();
        this.u0.O(ub8Var, e93Var.c, this.b, e93Var.d, e93Var.o, e93Var.X, e93Var.Y, e93Var.Z, iOException, !zA);
        if (!zA) {
            this.E0 = null;
        }
        if (zU) {
            if (!this.N0) {
                nc8 nc8Var = new nc8();
                nc8Var.a = this.Z0;
                r(new oc8(nc8Var));
                return y21Var2;
            }
            this.c.s(this);
        }
        return y21Var2;
    }

    @Override // defpackage.kp5
    public final void Q(i9e i9eVar) {
    }

    @Override // defpackage.gc8
    public final void a() {
        for (g67 g67Var : this.F0) {
            g67Var.A(true);
            z45 z45Var = g67Var.h;
            if (z45Var != null) {
                z45Var.c(g67Var.e);
                g67Var.h = null;
                g67Var.g = null;
            }
        }
    }

    @Override // defpackage.fxd
    public final void b() {
        this.B0.post(this.z0);
    }

    @Override // defpackage.jee
    public final long d() {
        if (A()) {
            return this.a1;
        }
        if (this.d1) {
            return Long.MIN_VALUE;
        }
        return y().Z;
    }

    public final void e() {
        hsi.g(this.N0);
        this.S0.getClass();
        this.T0.getClass();
    }

    public final boolean g(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.x0;
            if (i2 >= arrayList.size()) {
                s47 s47Var = (s47) arrayList.get(i);
                for (int i3 = 0; i3 < this.F0.length; i3++) {
                    if (this.F0[i3].q() > s47Var.f(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (((s47) arrayList.get(i2)).V0) {
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.t0.A();
    }

    @Override // defpackage.jee
    public final long o() {
        if (this.d1) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.a1;
        }
        long jMax = this.Z0;
        s47 s47VarY = y();
        if (!s47VarY.R0) {
            ArrayList arrayList = this.x0;
            s47VarY = arrayList.size() > 1 ? (s47) wy1.d(arrayList, 2) : null;
        }
        if (s47VarY != null) {
            jMax = Math.max(jMax, s47VarY.Z);
        }
        if (this.M0) {
            for (g67 g67Var : this.F0) {
                jMax = Math.max(jMax, g67Var.n());
            }
        }
        return jMax;
    }

    @Override // defpackage.jee
    public final void p(long j) {
        te8 te8Var = this.t0;
        if (te8Var.x() || A()) {
            return;
        }
        boolean zA = te8Var.A();
        m47 m47Var = this.d;
        List list = this.y0;
        if (zA) {
            this.E0.getClass();
            if (m47Var.n != null ? false : m47Var.r.t(j, this.E0, list)) {
                te8Var.c();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && m47Var.b((s47) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            v(size);
        }
        int size2 = (m47Var.n != null || m47Var.r.length() < 2) ? list.size() : m47Var.r.g(j, list);
        if (size2 < this.x0.size()) {
            v(size2);
        }
    }

    @Override // defpackage.bc8
    public final void q(ec8 ec8Var, long j, long j2, boolean z) {
        e93 e93Var = (e93) ec8Var;
        this.E0 = null;
        long j3 = e93Var.a;
        ze4 ze4Var = e93Var.b;
        zdf zdfVar = e93Var.s0;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        this.s0.getClass();
        this.u0.M(ub8Var, e93Var.c, this.b, e93Var.d, e93Var.o, e93Var.X, e93Var.Y, e93Var.Z);
        if (z) {
            return;
        }
        if (A() || this.O0 == 0) {
            F();
        }
        if (this.O0 > 0) {
            this.c.s(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0205  */
    @Override // defpackage.jee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(defpackage.oc8 r75) {
        /*
            Method dump skipped, instructions count: 1347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i67.r(oc8):boolean");
    }

    public final nfg s(lfg[] lfgVarArr) {
        for (int i = 0; i < lfgVarArr.length; i++) {
            lfg lfgVar = lfgVarArr[i];
            hf6[] hf6VarArr = new hf6[lfgVar.a];
            for (int i2 = 0; i2 < lfgVar.a; i2++) {
                hf6 hf6Var = lfgVar.d[i2];
                int iD = this.Y.d(hf6Var);
                ff6 ff6VarA = hf6Var.a();
                ff6VarA.N = iD;
                hf6VarArr[i2] = new hf6(ff6VarA);
            }
            lfgVarArr[i] = new lfg(lfgVar.b, hf6VarArr);
        }
        return new nfg(lfgVarArr);
    }

    public final void v(int i) {
        ArrayList arrayList;
        hsi.g(!this.t0.A());
        while (true) {
            arrayList = this.x0;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (g(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = y().Z;
        s47 s47Var = (s47) arrayList.get(i);
        zxg.b0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.F0.length; i2++) {
            this.F0[i2].k(s47Var.f(i2));
        }
        if (arrayList.isEmpty()) {
            this.a1 = this.Z0;
        } else {
            ((s47) uni.c(arrayList)).T0 = true;
        }
        this.d1 = false;
        this.u0.Z(this.K0, s47Var.Y, j);
    }

    @Override // defpackage.kp5
    public final void w() {
        this.e1 = true;
        this.B0.post(this.A0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bc8
    public final void x(ec8 ec8Var, long j, long j2) {
        e93 e93Var = (e93) ec8Var;
        this.E0 = null;
        if (e93Var instanceof f47) {
            f47 f47Var = (f47) e93Var;
            byte[] bArr = f47Var.t0;
            m47 m47Var = this.d;
            m47Var.m = bArr;
            a3b a3bVar = m47Var.j;
            Uri uri = f47Var.b.a;
            byte[] bArr2 = f47Var.v0;
            bArr2.getClass();
            zl6 zl6Var = (zl6) a3bVar.b;
            uri.getClass();
        }
        long j3 = e93Var.a;
        ze4 ze4Var = e93Var.b;
        zdf zdfVar = e93Var.s0;
        Uri uri2 = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        this.s0.getClass();
        this.u0.N(ub8Var, e93Var.c, this.b, e93Var.d, e93Var.o, e93Var.X, e93Var.Y, e93Var.Z);
        if (this.N0) {
            this.c.s(this);
            return;
        }
        nc8 nc8Var = new nc8();
        nc8Var.a = this.Z0;
        r(new oc8(nc8Var));
    }

    public final s47 y() {
        return (s47) wy1.d(this.x0, 1);
    }
}
