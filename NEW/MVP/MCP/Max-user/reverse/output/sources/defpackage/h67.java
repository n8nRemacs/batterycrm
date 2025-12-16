package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h67 implements ac8, fc8, iee, jp5, exd {
    public static final Set i1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final b67 A0;
    public final Handler B0;
    public final ArrayList C0;
    public final Map D0;
    public b93 E0;
    public f67[] F0;
    public int[] G0;
    public final HashSet H0;
    public final SparseIntArray I0;
    public d67 J0;
    public int K0;
    public int L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public gf6 P0;
    public gf6 Q0;
    public boolean R0;
    public mfg S0;
    public Set T0;
    public int[] U0;
    public int V0;
    public boolean W0;
    public final gf6 X;
    public boolean[] X0;
    public final j55 Y;
    public boolean[] Y0;
    public final lk6 Z;
    public long Z0;
    public final String a;
    public long a1;
    public final int b;
    public boolean b1;
    public final t47 c;
    public boolean c1;
    public final l47 d;
    public boolean d1;
    public boolean e1;
    public long f1;
    public x45 g1;
    public r47 h1;
    public final qi4 o;
    public final rha s0;
    public final hc8 t0 = new hc8("Loader:HlsSampleStreamWrapper", 0);
    public final qr4 u0;
    public final int v0;
    public final vd w0;
    public final ArrayList x0;
    public final List y0;
    public final b67 z0;

    /* JADX WARN: Type inference failed for: r1v12, types: [b67] */
    /* JADX WARN: Type inference failed for: r1v13, types: [b67] */
    public h67(String str, int i, t47 t47Var, l47 l47Var, Map map, qi4 qi4Var, long j, gf6 gf6Var, j55 j55Var, lk6 lk6Var, rha rhaVar, qr4 qr4Var, int i2) {
        this.a = str;
        this.b = i;
        this.c = t47Var;
        this.d = l47Var;
        this.D0 = map;
        this.o = qi4Var;
        this.X = gf6Var;
        this.Y = j55Var;
        this.Z = lk6Var;
        this.s0 = rhaVar;
        this.u0 = qr4Var;
        this.v0 = i2;
        final int i3 = 0;
        vd vdVar = new vd(5);
        vdVar.c = null;
        vdVar.b = false;
        vdVar.d = null;
        this.w0 = vdVar;
        this.G0 = new int[0];
        Set set = i1;
        this.H0 = new HashSet(set.size());
        this.I0 = new SparseIntArray(set.size());
        this.F0 = new f67[0];
        this.Y0 = new boolean[0];
        this.X0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.x0 = arrayList;
        this.y0 = Collections.unmodifiableList(arrayList);
        this.C0 = new ArrayList();
        this.z0 = new Runnable(this) { // from class: b67
            public final /* synthetic */ h67 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.t();
                        break;
                    default:
                        h67 h67Var = this.b;
                        h67Var.M0 = true;
                        h67Var.t();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.A0 = new Runnable(this) { // from class: b67
            public final /* synthetic */ h67 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.t();
                        break;
                    default:
                        h67 h67Var = this.b;
                        h67Var.M0 = true;
                        h67Var.t();
                        break;
                }
            }
        };
        this.B0 = xxg.l(null);
        this.Z0 = j;
        this.a1 = j;
    }

    public static q65 e(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        Log.w("HlsSampleStreamWrapper", sb.toString());
        return new q65();
    }

    public static gf6 i(gf6 gf6Var, gf6 gf6Var2, boolean z) {
        String strA;
        if (gf6Var == null) {
            return gf6Var2;
        }
        String str = gf6Var.s0;
        String strC = gf6Var2.v0;
        int iG = wz9.g(strC);
        if (xxg.o(iG, str) == 1) {
            strA = xxg.p(iG, str);
            strC = wz9.c(strA);
        } else {
            strA = wz9.a(str, strC);
        }
        ef6 ef6VarA = gf6Var2.a();
        ef6VarA.a = gf6Var.a;
        ef6VarA.b = gf6Var.b;
        ef6VarA.c = gf6Var.c;
        ef6VarA.d = gf6Var.d;
        ef6VarA.e = gf6Var.o;
        ef6VarA.f = z ? gf6Var.X : -1;
        ef6VarA.g = z ? gf6Var.Y : -1;
        ef6VarA.h = strA;
        if (iG == 2) {
            ef6VarA.p = gf6Var.A0;
            ef6VarA.q = gf6Var.B0;
            ef6VarA.r = gf6Var.C0;
        }
        if (strC != null) {
            ef6VarA.k = strC;
        }
        int i = gf6Var.I0;
        if (i != -1 && iG == 1) {
            ef6VarA.x = i;
        }
        sy9 sy9Var = gf6Var.t0;
        if (sy9Var != null) {
            sy9 sy9Var2 = gf6Var2.t0;
            if (sy9Var2 != null) {
                qy9[] qy9VarArr = sy9Var.a;
                if (qy9VarArr.length == 0) {
                    sy9Var = sy9Var2;
                } else {
                    qy9[] qy9VarArr2 = sy9Var2.a;
                    Object[] objArrCopyOf = Arrays.copyOf(qy9VarArr2, qy9VarArr2.length + qy9VarArr.length);
                    System.arraycopy(qy9VarArr, 0, objArrCopyOf, qy9VarArr2.length, qy9VarArr.length);
                    sy9Var = new sy9((qy9[]) objArrCopyOf);
                }
            }
            ef6VarA.i = sy9Var;
        }
        return new gf6(ef6VarA);
    }

    public static int q(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ac8
    public final void A(dc8 dc8Var, long j, long j2) {
        b93 b93Var = (b93) dc8Var;
        this.E0 = null;
        if (b93Var instanceof e47) {
            e47 e47Var = (e47) b93Var;
            byte[] bArr = e47Var.t0;
            l47 l47Var = this.d;
            l47Var.m = bArr;
            h08 h08Var = l47Var.j;
            Uri uri = e47Var.b.a;
            byte[] bArr2 = e47Var.v0;
            bArr2.getClass();
            zl6 zl6Var = (zl6) h08Var.b;
            uri.getClass();
        }
        long j3 = b93Var.a;
        ye4 ye4Var = b93Var.b;
        ydf ydfVar = b93Var.s0;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        this.s0.getClass();
        this.u0.f(tb8Var, b93Var.c, this.b, b93Var.d, b93Var.o, b93Var.X, b93Var.Y, b93Var.Z);
        if (this.N0) {
            this.c.b(this);
        } else {
            z(this.Z0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [f67[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f67[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rfg] */
    /* JADX WARN: Type inference failed for: r5v4, types: [f67, gxd] */
    /* JADX WARN: Type inference failed for: r5v6, types: [q65] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.jp5
    public final rfg B(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = i1;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.H0;
        SparseIntArray sparseIntArray = this.I0;
        ?? f67Var = 0;
        f67Var = 0;
        if (zContains) {
            fsi.b(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.G0[i3] = i;
                }
                f67Var = this.G0[i3] == i ? this.F0[i3] : e(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.F0;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.G0[i4] == i) {
                    f67Var = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (f67Var == 0) {
            if (this.e1) {
                return e(i, i2);
            }
            int length = this.F0.length;
            boolean z = i2 == 1 || i2 == 2;
            f67Var = new f67(this.o, this.Y, this.Z, this.D0);
            f67Var.t = this.Z0;
            if (z) {
                f67Var.I = this.g1;
                f67Var.z = true;
            }
            long j = this.f1;
            if (f67Var.F != j) {
                f67Var.F = j;
                f67Var.z = true;
            }
            r47 r47Var = this.h1;
            if (r47Var != null) {
                f67Var.C = r47Var.u0;
            }
            f67Var.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.G0, i5);
            this.G0 = iArrCopyOf;
            iArrCopyOf[length] = i;
            f67[] f67VarArr = this.F0;
            int i6 = xxg.a;
            ?? CopyOf = Arrays.copyOf(f67VarArr, f67VarArr.length + 1);
            CopyOf[f67VarArr.length] = f67Var;
            this.F0 = (f67[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.Y0, i5);
            this.Y0 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.W0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (q(i2) > q(this.K0)) {
                this.L0 = length;
                this.K0 = i2;
            }
            this.X0 = Arrays.copyOf(this.X0, i5);
        }
        if (i2 != 5) {
            return f67Var;
        }
        if (this.J0 == null) {
            this.J0 = new d67(f67Var, this.v0);
        }
        return this.J0;
    }

    @Override // defpackage.ac8
    public final y21 D(dc8 dc8Var, long j, long j2, IOException iOException, int i) {
        boolean zR;
        y21 y21Var;
        int i2;
        b93 b93Var = (b93) dc8Var;
        boolean z = b93Var instanceof r47;
        if (z && !((r47) b93Var).U0 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).c) == 410 || i2 == 404)) {
            return hc8.o;
        }
        long j3 = b93Var.s0.b;
        long j4 = b93Var.a;
        ye4 ye4Var = b93Var.b;
        ydf ydfVar = b93Var.s0;
        tb8 tb8Var = new tb8(j4, ye4Var, ydfVar.c, ydfVar.d, j, j2, j3);
        xxg.K(b93Var.Y);
        xxg.K(b93Var.Z);
        sb8 sb8Var = new sb8(i, iOException);
        l47 l47Var = this.d;
        nc5 nc5VarB = pfi.b(l47Var.q);
        this.s0.getClass();
        y21 y21VarP = rha.p(nc5VarB, sb8Var);
        if (y21VarP == null || y21VarP.b != 2) {
            zR = false;
        } else {
            long j5 = y21VarP.c;
            an5 an5Var = l47Var.q;
            zR = an5Var.r(an5Var.p(l47Var.h.a(b93Var.d)), j5);
        }
        if (zR) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.x0;
                fsi.d(((r47) arrayList.remove(arrayList.size() - 1)) == b93Var);
                if (arrayList.isEmpty()) {
                    this.a1 = this.Z0;
                } else {
                    ((r47) uni.c(arrayList)).T0 = true;
                }
            }
            y21Var = hc8.X;
        } else {
            long jS = rha.s(sb8Var);
            y21Var = jS != -9223372036854775807L ? new y21(jS, 0, 4, false) : hc8.Y;
        }
        y21 y21Var2 = y21Var;
        boolean zA = y21Var2.a();
        this.u0.h(tb8Var, b93Var.c, this.b, b93Var.d, b93Var.o, b93Var.X, b93Var.Y, b93Var.Z, iOException, !zA);
        if (!zA) {
            this.E0 = null;
        }
        if (zR) {
            if (!this.N0) {
                z(this.Z0);
                return y21Var2;
            }
            this.c.b(this);
        }
        return y21Var2;
    }

    public final void F() {
        for (f67 f67Var : this.F0) {
            f67Var.x(this.b1);
        }
        this.b1 = false;
    }

    public final boolean G(long j, boolean z) {
        this.Z0 = j;
        if (s()) {
            this.a1 = j;
            return true;
        }
        if (this.M0 && !z) {
            int length = this.F0.length;
            for (int i = 0; i < length; i++) {
                if (this.F0[i].y(j, false) || (!this.Y0[i] && this.W0)) {
                }
            }
            return false;
        }
        this.a1 = j;
        this.d1 = false;
        this.x0.clear();
        hc8 hc8Var = this.t0;
        if (!hc8Var.I()) {
            hc8Var.d = null;
            F();
            return true;
        }
        if (this.M0) {
            for (f67 f67Var : this.F0) {
                f67Var.h();
            }
        }
        hc8Var.x();
        return true;
    }

    @Override // defpackage.jp5
    public final void N(h9e h9eVar) {
    }

    @Override // defpackage.fc8
    public final void a() {
        for (f67 f67Var : this.F0) {
            f67Var.x(true);
            mc5 mc5Var = f67Var.h;
            if (mc5Var != null) {
                mc5Var.E(f67Var.e);
                f67Var.h = null;
                f67Var.g = null;
            }
        }
    }

    @Override // defpackage.exd
    public final void b() {
        this.B0.post(this.z0);
    }

    public final void c() {
        fsi.d(this.N0);
        this.S0.getClass();
        this.T0.getClass();
    }

    @Override // defpackage.iee
    public final long d() {
        if (s()) {
            return this.a1;
        }
        if (this.d1) {
            return Long.MIN_VALUE;
        }
        return n().Z;
    }

    public final mfg g(kfg[] kfgVarArr) {
        for (int i = 0; i < kfgVarArr.length; i++) {
            kfg kfgVar = kfgVarArr[i];
            gf6[] gf6VarArr = new gf6[kfgVar.a];
            for (int i2 = 0; i2 < kfgVar.a; i2++) {
                gf6 gf6Var = kfgVar.c[i2];
                int iB = this.Y.b(gf6Var);
                ef6 ef6VarA = gf6Var.a();
                ef6VarA.D = iB;
                gf6VarArr[i2] = new gf6(ef6VarA);
            }
            kfgVarArr[i] = new kfg(kfgVar.b, gf6VarArr);
        }
        return new mfg(kfgVarArr);
    }

    @Override // defpackage.iee
    public final boolean j() {
        return this.t0.I();
    }

    public final void m(int i) {
        ArrayList arrayList;
        fsi.d(!this.t0.I());
        int i2 = i;
        loop0: while (true) {
            arrayList = this.x0;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    r47 r47Var = (r47) arrayList.get(i2);
                    for (int i4 = 0; i4 < this.F0.length; i4++) {
                        if (this.F0[i4].n() > r47Var.f(i4)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((r47) arrayList.get(i3)).x0) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return;
        }
        long j = n().Z;
        r47 r47Var2 = (r47) arrayList.get(i2);
        xxg.G(arrayList, i2, arrayList.size());
        for (int i5 = 0; i5 < this.F0.length; i5++) {
            this.F0[i5].j(r47Var2.f(i5));
        }
        if (arrayList.isEmpty()) {
            this.a1 = this.Z0;
        } else {
            ((r47) uni.c(arrayList)).T0 = true;
        }
        this.d1 = false;
        int i6 = this.K0;
        long j2 = r47Var2.Y;
        qr4 qr4Var = this.u0;
        qr4Var.m(new g19(1, i6, null, 3, null, qr4Var.a(j2), qr4Var.a(j)));
    }

    public final r47 n() {
        return (r47) wy1.d(this.x0, 1);
    }

    @Override // defpackage.iee
    public final long o() {
        long j;
        ArrayList arrayList = this.x0;
        if (this.d1) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.a1;
        }
        long jMax = this.Z0;
        r47 r47VarN = n();
        if (!r47VarN.R0) {
            r47VarN = arrayList.size() > 1 ? (r47) wy1.d(arrayList, 2) : null;
        }
        if (r47VarN != null) {
            jMax = Math.max(jMax, r47VarN.Z);
        }
        if (this.M0) {
            for (f67 f67Var : this.F0) {
                synchronized (f67Var) {
                    j = f67Var.v;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    @Override // defpackage.iee
    public final void p(long j) {
        hc8 hc8Var = this.t0;
        if (hc8Var.G() || s()) {
            return;
        }
        boolean zI = hc8Var.I();
        l47 l47Var = this.d;
        List list = this.y0;
        if (zI) {
            this.E0.getClass();
            if (l47Var.n != null ? false : l47Var.q.u(j, this.E0, list)) {
                hc8Var.x();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && l47Var.b((r47) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            m(size);
        }
        int size2 = (l47Var.n != null || l47Var.q.length() < 2) ? list.size() : l47Var.q.g(j, list);
        if (size2 < this.x0.size()) {
            m(size2);
        }
    }

    @Override // defpackage.ac8
    public final void r(dc8 dc8Var, long j, long j2, boolean z) {
        b93 b93Var = (b93) dc8Var;
        this.E0 = null;
        long j3 = b93Var.a;
        ye4 ye4Var = b93Var.b;
        ydf ydfVar = b93Var.s0;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        this.s0.getClass();
        this.u0.d(tb8Var, b93Var.c, this.b, b93Var.d, b93Var.o, b93Var.X, b93Var.Y, b93Var.Z);
        if (z) {
            return;
        }
        if (s() || this.O0 == 0) {
            F();
        }
        if (this.O0 > 0) {
            this.c.b(this);
        }
    }

    public final boolean s() {
        return this.a1 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        int i;
        if (!this.R0 && this.U0 == null && this.M0) {
            int i2 = 0;
            for (f67 f67Var : this.F0) {
                if (f67Var.q() == null) {
                    return;
                }
            }
            mfg mfgVar = this.S0;
            if (mfgVar != null) {
                int i3 = mfgVar.a;
                int[] iArr = new int[i3];
                this.U0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        f67[] f67VarArr = this.F0;
                        if (i5 < f67VarArr.length) {
                            gf6 gf6VarQ = f67VarArr[i5].q();
                            fsi.e(gf6VarQ);
                            gf6 gf6Var = this.S0.a(i4).c[0];
                            String str = gf6VarQ.v0;
                            String str2 = gf6Var.v0;
                            int iG = wz9.g(str);
                            if (iG != 3) {
                                if (iG == wz9.g(str2)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (xxg.a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || gf6VarQ.N0 == gf6Var.N0)) {
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
                    ((z57) it.next()).a();
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
                gf6 gf6VarQ2 = this.F0[i6].q();
                fsi.e(gf6VarQ2);
                String str3 = gf6VarQ2.v0;
                if (wz9.j(str3)) {
                    i9 = 2;
                } else if (!wz9.h(str3)) {
                    i9 = wz9.i(str3) ? 3 : -2;
                }
                if (q(i9) > q(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            kfg kfgVar = this.d.h;
            int i10 = kfgVar.a;
            this.V0 = -1;
            this.U0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.U0[i11] = i11;
            }
            kfg[] kfgVarArr = new kfg[length];
            int i12 = 0;
            while (i12 < length) {
                gf6 gf6VarQ3 = this.F0[i12].q();
                fsi.e(gf6VarQ3);
                String str4 = this.a;
                gf6 gf6Var2 = this.X;
                if (i12 == i7) {
                    gf6[] gf6VarArr = new gf6[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        gf6 gf6VarC = kfgVar.c[i13];
                        if (i8 == 1 && gf6Var2 != null) {
                            gf6VarC = gf6VarC.c(gf6Var2);
                        }
                        gf6VarArr[i13] = i10 == 1 ? gf6VarQ3.c(gf6VarC) : i(gf6VarC, gf6VarQ3, true);
                    }
                    kfgVarArr[i12] = new kfg(str4, gf6VarArr);
                    this.V0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !wz9.h(gf6VarQ3.v0)) {
                        gf6Var2 = null;
                    }
                    int i14 = i12 < i7 ? i12 : i12 - 1;
                    StringBuilder sb = new StringBuilder(u45.f(18, str4));
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i14);
                    i = 0;
                    kfgVarArr[i12] = new kfg(sb.toString(), i(gf6Var2, gf6VarQ3, false));
                }
                i12++;
                i2 = i;
            }
            int i15 = i2;
            this.S0 = g(kfgVarArr);
            fsi.d(this.T0 == null ? 1 : i15);
            this.T0 = Collections.EMPTY_SET;
            this.N0 = true;
            this.c.m();
        }
    }

    public final void u() {
        this.t0.b();
        l47 l47Var = this.d;
        BehindLiveWindowException behindLiveWindowException = l47Var.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = l47Var.o;
        if (uri == null || !l47Var.s) {
            return;
        }
        zm4 zm4Var = (zm4) l47Var.g.b.get(uri);
        zm4Var.b.b();
        IOException iOException = zm4Var.t0;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // defpackage.jp5
    public final void w() {
        this.e1 = true;
        this.B0.post(this.A0);
    }

    public final void x(kfg[] kfgVarArr, int... iArr) {
        this.S0 = g(kfgVarArr);
        this.T0 = new HashSet();
        for (int i : iArr) {
            this.T0.add(this.S0.a(i));
        }
        this.V0 = 0;
        this.B0.post(new gq5(6, this.c));
        this.N0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0270 A[PHI: r2
  0x0270: PHI (r2v16 k47) = (r2v15 k47), (r2v21 k47) binds: [B:94:0x0235, B:102:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0237  */
    @Override // defpackage.iee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(long r71) {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h67.z(long):boolean");
    }
}
