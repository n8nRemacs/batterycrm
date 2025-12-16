package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class sm5 implements Handler.Callback, n29, s4c, x3h {
    public static final long p1 = zxg.m0(WorkRequest.MIN_BACKOFF_MILLIS);
    public final mwf A0;
    public final ql5 B0;
    public final w29 C0;
    public final y87 D0;
    public final yn4 E0;
    public final long F0;
    public final n4c G0;
    public final nj4 H0;
    public final wwf I0;
    public final boolean J0;
    public final o30 K0;
    public k9e L0;
    public x3e M0;
    public boolean N0;
    public boolean O0;
    public qm5 P0;
    public a3c Q0;
    public nm5 R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public final jb8 X;
    public boolean X0;
    public final dh0 Y;
    public int Y0;
    public final wwf Z;
    public boolean Z0;
    public final pld[] a;
    public boolean a1;
    public final tk0[] b;
    public boolean b1;
    public final boolean[] c;
    public boolean c1;
    public final oo8 d;
    public int d1;
    public qm5 e1;
    public long f1;
    public long g1;
    public int h1;
    public boolean i1;
    public ExoPlaybackException j1;
    public long k1;
    public il5 l1;
    public long m1;
    public boolean n1;
    public final ggg o;
    public float o1;
    public final pea s0;
    public final Looper t0;
    public final q9g u0;
    public final m9g v0;
    public final long w0;
    public final boolean x0;
    public final sk y0;
    public final ArrayList z0;

    public sm5(Context context, tk0[] tk0VarArr, tk0[] tk0VarArr2, oo8 oo8Var, ggg gggVar, jb8 jb8Var, dh0 dh0Var, int i, boolean z, nj4 nj4Var, k9e k9eVar, yn4 yn4Var, long j, Looper looper, mwf mwfVar, ql5 ql5Var, n4c n4cVar, pea peaVar, final x3h x3hVar) {
        Looper looper2;
        il5 il5Var = il5.a;
        this.m1 = -9223372036854775807L;
        this.B0 = ql5Var;
        this.d = oo8Var;
        this.o = gggVar;
        this.X = jb8Var;
        this.Y = dh0Var;
        this.Y0 = i;
        this.Z0 = z;
        this.L0 = k9eVar;
        this.E0 = yn4Var;
        this.F0 = j;
        boolean z2 = false;
        this.T0 = false;
        this.A0 = mwfVar;
        this.G0 = n4cVar;
        this.l1 = il5Var;
        this.H0 = nj4Var;
        this.o1 = 1.0f;
        this.M0 = x3e.b;
        this.k1 = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.w0 = jb8Var.h();
        this.x0 = jb8Var.b();
        k9g k9gVar = s9g.a;
        a3c a3cVarK = a3c.k(gggVar);
        this.Q0 = a3cVarK;
        this.R0 = new nm5(a3cVarK);
        this.b = new tk0[tk0VarArr.length];
        this.c = new boolean[tk0VarArr.length];
        ar4 ar4Var = (ar4) oo8Var;
        ar4Var.getClass();
        this.a = new pld[tk0VarArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < tk0VarArr.length; i2++) {
            tk0 tk0Var = tk0VarArr[i2];
            tk0Var.o = i2;
            tk0Var.X = n4cVar;
            tk0Var.Y = mwfVar;
            this.b[i2] = tk0Var;
            tk0 tk0Var2 = this.b[i2];
            synchronized (tk0Var2.a) {
                tk0Var2.B0 = ar4Var;
            }
            tk0 tk0Var3 = tk0VarArr2[i2];
            if (tk0Var3 != null) {
                tk0Var3.o = i2;
                tk0Var3.X = n4cVar;
                tk0Var3.Y = mwfVar;
                z3 = true;
            }
            pld[] pldVarArr = this.a;
            tk0 tk0Var4 = tk0VarArr[i2];
            pld pldVar = new pld();
            pldVar.e = tk0Var4;
            pldVar.c = i2;
            pldVar.f = tk0Var3;
            pldVar.d = 0;
            pldVar.a = false;
            pldVar.b = false;
            pldVarArr[i2] = pldVar;
        }
        this.J0 = z3;
        this.y0 = new sk(this, mwfVar);
        this.z0 = new ArrayList();
        this.u0 = new q9g();
        this.v0 = new m9g();
        hsi.g(oo8Var.a == null);
        oo8Var.a = this;
        oo8Var.b = dh0Var;
        this.i1 = true;
        wwf wwfVarA = mwfVar.a(looper, null);
        this.I0 = wwfVarA;
        this.C0 = new w29(nj4Var, wwfVarA, new wo4(21, this));
        this.D0 = new y87(this, nj4Var, wwfVarA, n4cVar);
        pea peaVar2 = peaVar == null ? new pea((Looper) null) : peaVar;
        this.s0 = peaVar2;
        synchronized (peaVar2.b) {
            try {
                if (((Looper) peaVar2.c) == null) {
                    if (peaVar2.a == 0 && ((HandlerThread) peaVar2.d) == null) {
                        z2 = true;
                    }
                    hsi.g(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    peaVar2.d = handlerThread;
                    handlerThread.start();
                    peaVar2.c = ((HandlerThread) peaVar2.d).getLooper();
                }
                peaVar2.a++;
                looper2 = (Looper) peaVar2.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.t0 = looper2;
        wwf wwfVarA2 = mwfVar.a(looper2, this);
        this.Z = wwfVarA2;
        this.K0 = new o30(context, looper2, this);
        wwfVarA2.a(35, new x3h() { // from class: gm5
            @Override // defpackage.x3h
            public final void b(long j2, long j3, hf6 hf6Var, MediaFormat mediaFormat) {
                sm5 sm5Var = this.a;
                sm5Var.getClass();
                x3hVar.b(j2, j3, hf6Var, mediaFormat);
                sm5Var.b(j2, j3, hf6Var, mediaFormat);
            }
        }).b();
    }

    public static Pair S(s9g s9gVar, qm5 qm5Var, boolean z, int i, boolean z2, q9g q9gVar, m9g m9gVar) {
        int iT;
        s9g s9gVar2 = qm5Var.a;
        if (s9gVar.p()) {
            return null;
        }
        s9g s9gVar3 = s9gVar2.p() ? s9gVar : s9gVar2;
        try {
            Pair pairI = s9gVar3.i(q9gVar, m9gVar, qm5Var.b, qm5Var.c);
            if (!s9gVar.equals(s9gVar3)) {
                if (s9gVar.b(pairI.first) == -1) {
                    if (!z || (iT = T(q9gVar, m9gVar, i, z2, pairI.first, s9gVar3, s9gVar)) == -1) {
                        return null;
                    }
                    return s9gVar.i(q9gVar, m9gVar, iT, -9223372036854775807L);
                }
                if (s9gVar3.g(pairI.first, m9gVar).f && s9gVar3.m(m9gVar.c, q9gVar, 0L).n == s9gVar3.b(pairI.first)) {
                    return s9gVar.i(q9gVar, m9gVar, s9gVar.g(pairI.first, m9gVar).c, qm5Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(q9g q9gVar, m9g m9gVar, int i, boolean z, Object obj, s9g s9gVar, s9g s9gVar2) {
        q9g q9gVar2 = q9gVar;
        s9g s9gVar3 = s9gVar;
        Object obj2 = s9gVar3.m(s9gVar3.g(obj, m9gVar).c, q9gVar, 0L).a;
        for (int i2 = 0; i2 < s9gVar2.o(); i2++) {
            if (s9gVar2.m(i2, q9gVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = s9gVar3.b(obj);
        int iH = s9gVar3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            s9g s9gVar4 = s9gVar3;
            int iD = s9gVar4.d(iB, m9gVar, q9gVar2, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = s9gVar2.b(s9gVar4.l(iD));
            i3++;
            s9gVar3 = s9gVar4;
            iB = iD;
            q9gVar2 = q9gVar;
        }
        if (iB2 == -1) {
            return -1;
        }
        return s9gVar2.f(iB2, m9gVar, false).c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jee, p29] */
    public static boolean z(r29 r29Var) {
        if (r29Var != null) {
            try {
                ?? r1 = r29Var.a;
                if (r29Var.e) {
                    for (jxd jxdVar : r29Var.c) {
                        if (jxdVar != null) {
                            jxdVar.b();
                        }
                    }
                } else {
                    r1.f();
                }
                if ((!r29Var.e ? 0L : r1.d()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, d99 d99Var) {
        w29 w29Var = this.C0;
        r29 r29Var = w29Var.k;
        if (r29Var != null && r29Var.g.a.equals(d99Var)) {
            pld pldVar = this.a[i];
            r29 r29Var2 = w29Var.k;
            int i2 = pldVar.d;
            boolean z = (i2 == 2 || i2 == 4) && pldVar.d(r29Var2) == ((tk0) pldVar.e);
            boolean z2 = pldVar.d == 3 && pldVar.d(r29Var2) == ((tk0) pldVar.f);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void A0(s9g s9gVar, d99 d99Var, s9g s9gVar2, d99 d99Var2, long j, boolean z) {
        boolean zR0 = r0(s9gVar, d99Var);
        Object obj = d99Var.a;
        if (!zR0) {
            c3c c3cVar = d99Var.b() ? c3c.d : this.Q0.o;
            sk skVar = this.y0;
            if (skVar.mo25c().equals(c3cVar)) {
                return;
            }
            this.Z.e(16);
            skVar.J(c3cVar);
            x(this.Q0.o, c3cVar.a, false, false);
            return;
        }
        m9g m9gVar = this.v0;
        int i = s9gVar.g(obj, m9gVar).c;
        q9g q9gVar = this.u0;
        s9gVar.n(i, q9gVar);
        yz8 yz8Var = q9gVar.j;
        yn4 yn4Var = this.E0;
        yn4Var.getClass();
        yn4Var.d = zxg.U(yz8Var.a);
        yn4Var.g = zxg.U(yz8Var.b);
        yn4Var.h = zxg.U(yz8Var.c);
        float f = yz8Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        yn4Var.k = f;
        float f2 = yz8Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        yn4Var.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            yn4Var.d = -9223372036854775807L;
        }
        yn4Var.a();
        if (j != -9223372036854775807L) {
            yn4Var.e = l(s9gVar, obj, j);
            yn4Var.a();
            return;
        }
        if (!Objects.equals(!s9gVar2.p() ? s9gVar2.m(s9gVar2.g(d99Var2.a, m9gVar).c, q9gVar, 0L).a : null, q9gVar.a) || z) {
            yn4Var.e = -9223372036854775807L;
            yn4Var.a();
        }
    }

    public final boolean B() {
        r29 r29Var = this.C0.i;
        long j = r29Var.g.e;
        if (r29Var.e) {
            return j == -9223372036854775807L || this.Q0.s < j || !q0();
        }
        return false;
    }

    public final void B0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.V0 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.A0.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.W0 = jElapsedRealtime;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, p29] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, jee] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, jee] */
    public final void C() {
        long j;
        long j2;
        boolean zJ;
        if (z(this.C0.l)) {
            r29 r29Var = this.C0.l;
            long jO = o(!r29Var.e ? 0L : r29Var.a.d());
            if (r29Var == this.C0.i) {
                j = this.f1;
                j2 = r29Var.p;
            } else {
                j = this.f1 - r29Var.p;
                j2 = r29Var.g.b;
            }
            long j3 = j - j2;
            long j4 = r0(this.Q0.a, r29Var.g.a) ? this.E0.i : -9223372036854775807L;
            n4c n4cVar = this.G0;
            s9g s9gVar = this.Q0.a;
            d99 d99Var = r29Var.g.a;
            float f = this.y0.mo25c().a;
            boolean z = this.Q0.l;
            ib8 ib8Var = new ib8(n4cVar, s9gVar, d99Var, j3, jO, f, this.V0, j4);
            zJ = this.X.j(ib8Var);
            r29 r29Var2 = this.C0.i;
            if (!zJ && r29Var2.e && jO < 500000 && (this.w0 > 0 || this.x0)) {
                r29Var2.a.t(this.Q0.s, false);
                zJ = this.X.j(ib8Var);
            }
        } else {
            zJ = false;
        }
        this.X0 = zJ;
        if (zJ) {
            r29 r29Var3 = this.C0.l;
            r29Var3.getClass();
            nc8 nc8Var = new nc8();
            nc8Var.a = this.f1 - r29Var3.p;
            float f2 = this.y0.mo25c().a;
            hsi.b(f2 > 0.0f || f2 == -3.4028235E38f);
            nc8Var.b = f2;
            long j5 = this.W0;
            hsi.b(j5 >= 0 || j5 == -9223372036854775807L);
            nc8Var.c = j5;
            oc8 oc8Var = new oc8(nc8Var);
            hsi.g(r29Var3.m == null);
            r29Var3.a.r(oc8Var);
        }
        v0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jee, p29] */
    public final void D() {
        w29 w29Var = this.C0;
        w29Var.l();
        r29 r29Var = w29Var.m;
        if (r29Var != null) {
            ?? r1 = r29Var.a;
            if ((!r29Var.d || r29Var.e) && !r1.j()) {
                s9g s9gVar = this.Q0.a;
                if (r29Var.e) {
                    r1.o();
                }
                if (this.X.c()) {
                    if (!r29Var.d) {
                        long j = r29Var.g.b;
                        r29Var.d = true;
                        r1.n(this, j);
                        return;
                    }
                    nc8 nc8Var = new nc8();
                    nc8Var.a = this.f1 - r29Var.p;
                    float f = this.y0.mo25c().a;
                    hsi.b(f > 0.0f || f == -3.4028235E38f);
                    nc8Var.b = f;
                    long j2 = this.W0;
                    hsi.b(j2 >= 0 || j2 == -9223372036854775807L);
                    nc8Var.c = j2;
                    oc8 oc8Var = new oc8(nc8Var);
                    hsi.g(r29Var.m == null);
                    r1.r(oc8Var);
                }
            }
        }
    }

    public final void E() {
        nm5 nm5Var = this.R0;
        a3c a3cVar = this.Q0;
        boolean z = nm5Var.d | (((a3c) nm5Var.f) != a3cVar);
        nm5Var.d = z;
        nm5Var.f = a3cVar;
        if (z) {
            em5 em5Var = this.B0.b;
            em5Var.u0.d(new kr4(em5Var, 25, nm5Var));
            this.R0 = new nm5(this.Q0);
        }
    }

    public final void F(int i) {
        pld pldVar = this.a[i];
        try {
            r29 r29Var = this.C0.i;
            r29Var.getClass();
            tk0 tk0VarD = pldVar.d(r29Var);
            tk0VarD.getClass();
            jxd jxdVar = tk0VarD.s0;
            jxdVar.getClass();
            jxdVar.b();
        } catch (IOException | RuntimeException e) {
            int i2 = ((tk0) pldVar.e).b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            ggg gggVar = this.C0.i.o;
            a8i.h("ExoPlayerImplInternal", "Disabling track due to error: " + hf6.d(((bn5[]) gggVar.o)[i].j()), e);
            ggg gggVar2 = new ggg((kld[]) ((kld[]) gggVar.d).clone(), (bn5[]) ((bn5[]) gggVar.o).clone(), (kgg) gggVar.X, gggVar.c);
            ((kld[]) gggVar2.d)[i] = null;
            ((bn5[]) gggVar2.o)[i] = null;
            g(i);
            r29 r29Var2 = this.C0.i;
            r29Var2.a(gggVar2, this.Q0.s, false, new boolean[r29Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.I0.d(new fm5(this, i, z));
        }
    }

    public final void H() throws Throwable {
        v(this.D0.g(), true);
    }

    public final void I(lm5 lm5Var) throws Throwable {
        s9g s9gVarG;
        this.R0.d(1);
        int i = lm5Var.a;
        int i2 = lm5Var.b;
        int i3 = lm5Var.c;
        hze hzeVar = lm5Var.d;
        y87 y87Var = this.D0;
        ArrayList arrayList = (ArrayList) y87Var.g;
        hsi.b(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        y87Var.m = hzeVar;
        if (i == i2 || i == i3) {
            s9gVarG = y87Var.g();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iO = ((z99) arrayList.get(iMin)).d;
            zxg.T(arrayList, i, i2, i3);
            while (iMin <= iMax) {
                z99 z99Var = (z99) arrayList.get(iMin);
                z99Var.d = iO;
                iO += z99Var.a.o.e.o();
                iMin++;
            }
            s9gVarG = y87Var.g();
        }
        v(s9gVarG, false);
    }

    public final void J() {
        this.R0.d(1);
        O(false, false, false, true);
        this.X.i(this.G0);
        m0(this.Q0.a.p() ? 4 : 2);
        a3c a3cVar = this.Q0;
        boolean z = a3cVar.l;
        y0(this.K0.d(a3cVar.e, z), a3cVar.n, a3cVar.m, z);
        wgg wggVarE = this.Y.e();
        y87 y87Var = this.D0;
        ArrayList arrayList = (ArrayList) y87Var.g;
        hsi.g(!y87Var.e);
        y87Var.n = wggVarE;
        for (int i = 0; i < arrayList.size(); i++) {
            z99 z99Var = (z99) arrayList.get(i);
            y87Var.n(z99Var);
            ((HashSet) y87Var.j).add(z99Var);
        }
        y87Var.e = true;
        this.Z.f(2);
    }

    public final void K(yn3 yn3Var) {
        pea peaVar = this.s0;
        wwf wwfVar = this.Z;
        try {
            O(true, false, true, false);
            L();
            this.X.e(this.G0);
            o30 o30Var = this.K0;
            o30Var.c = null;
            o30Var.a();
            o30Var.c(0);
            this.d.a();
            m0(1);
        } finally {
            wwfVar.a.removeCallbacksAndMessages(null);
            peaVar.f();
            yn3Var.f();
        }
    }

    public final void L() {
        for (int i = 0; i < this.a.length; i++) {
            tk0 tk0Var = this.b[i];
            synchronized (tk0Var.a) {
                tk0Var.B0 = null;
            }
            pld pldVar = this.a[i];
            tk0 tk0Var2 = (tk0) pldVar.e;
            hsi.g(tk0Var2.Z == 0);
            tk0Var2.p();
            pldVar.a = false;
            tk0 tk0Var3 = (tk0) pldVar.f;
            if (tk0Var3 != null) {
                hsi.g(tk0Var3.Z == 0);
                tk0Var3.p();
                pldVar.b = false;
            }
        }
    }

    public final void M(int i, int i2, hze hzeVar) throws Throwable {
        this.R0.d(1);
        y87 y87Var = this.D0;
        y87Var.getClass();
        hsi.b(i >= 0 && i <= i2 && i2 <= ((ArrayList) y87Var.g).size());
        y87Var.m = hzeVar;
        y87Var.t(i, i2);
        v(y87Var.g(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() throws androidx.media3.exoplayer.ExoPlaybackException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        r29 r29Var = this.C0.i;
        this.U0 = r29Var != null && r29Var.g.i && this.T0;
    }

    public final void Q(long j) {
        r29 r29Var = this.C0.i;
        long j2 = j + (r29Var == null ? 1000000000000L : r29Var.p);
        this.f1 = j2;
        ((m69) this.y0.d).a(j2);
        for (pld pldVar : this.a) {
            long j3 = this.f1;
            tk0 tk0VarD = pldVar.d(r29Var);
            if (tk0VarD != null) {
                tk0VarD.x0 = false;
                tk0VarD.v0 = j3;
                tk0VarD.w0 = j3;
                tk0VarD.o(j3, false);
            }
        }
        for (r29 r29Var2 = r0.i; r29Var2 != null; r29Var2 = r29Var2.m) {
            for (bn5 bn5Var : (bn5[]) r29Var2.o.o) {
                if (bn5Var != null) {
                    bn5Var.n();
                }
            }
        }
    }

    public final void R(s9g s9gVar, s9g s9gVar2) {
        if (s9gVar.p() && s9gVar2.p()) {
            return;
        }
        ArrayList arrayList = this.z0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            u45.r(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        boolean z = this.N0;
        long j2 = p1;
        if (z) {
            this.M0.getClass();
            jMin = this.Q0.e != 3 ? j2 : 1000L;
            for (pld pldVar : this.a) {
                long j3 = this.f1;
                long j4 = this.g1;
                tk0 tk0Var = (tk0) pldVar.f;
                tk0 tk0Var2 = (tk0) pldVar.e;
                long jF = pld.h(tk0Var2) ? tk0Var2.f(j3, j4) : BuildConfig.MAX_TIME_TO_UPLOAD;
                if (tk0Var != null && tk0Var.Z != 0) {
                    jF = Math.min(jF, tk0Var.f(j3, j4));
                }
                jMin = Math.min(jMin, zxg.m0(jF));
            }
            if (this.Q0.m()) {
                r29 r29Var = this.C0.i;
                if ((r29Var != null ? r29Var.m : null) != null) {
                    if ((zxg.U(jMin) * this.Q0.o.a) + this.f1 >= r1.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.Q0.e != 3 || q0()) {
            jMin = j2;
        }
        this.Z.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void V(boolean z) throws ExoPlaybackException {
        d99 d99Var = this.C0.i.g.a;
        long jX = X(d99Var, this.Q0.s, true, false);
        if (jX != this.Q0.s) {
            a3c a3cVar = this.Q0;
            this.Q0 = y(d99Var, jX, a3cVar.c, a3cVar.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:37|(20:(8:39|(1:51)(3:45|(1:49)|50)|52|(1:59)|60|61|62|63)(1:64)|114|69|(1:71)(1:72)|73|74|(1:76)(1:77)|78|112|79|80|109|81|82|105|83|84|85|62|63)|103|65|(1:67)(1:68)) */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0173, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:27:0x00a7, B:32:0x00b4, B:34:0x00ba, B:35:0x00bd, B:39:0x00d0, B:41:0x00d6, B:45:0x00de, B:49:0x00ec, B:50:0x00f1, B:52:0x00f9, B:54:0x010a, B:60:0x0118), top: B:111:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, p29] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(defpackage.qm5 r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.W(qm5, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, p29] */
    public final long X(d99 d99Var, long j, boolean z, boolean z2) throws ExoPlaybackException {
        pld[] pldVarArr;
        u0();
        B0(false, true);
        if (z2 || this.Q0.e == 3) {
            m0(2);
        }
        w29 w29Var = this.C0;
        r29 r29Var = w29Var.i;
        r29 r29Var2 = r29Var;
        while (r29Var2 != null && !d99Var.equals(r29Var2.g.a)) {
            r29Var2 = r29Var2.m;
        }
        if (z || r29Var != r29Var2 || (r29Var2 != null && r29Var2.p + j < 0)) {
            int i = 0;
            while (true) {
                pldVarArr = this.a;
                if (i >= pldVarArr.length) {
                    break;
                }
                g(i);
                i++;
            }
            this.m1 = -9223372036854775807L;
            if (r29Var2 != null) {
                while (w29Var.i != r29Var2) {
                    w29Var.a();
                }
                w29Var.o(r29Var2);
                r29Var2.p = 1000000000000L;
                k(new boolean[pldVarArr.length], w29Var.j.e());
                r29Var2.h = true;
            }
        }
        f();
        if (r29Var2 != null) {
            ?? r10 = r29Var2.a;
            w29Var.o(r29Var2);
            if (!r29Var2.e) {
                r29Var2.g = r29Var2.g.b(j);
            } else if (r29Var2.f) {
                j = r10.h(j);
                r10.t(j - this.w0, this.x0);
            }
            Q(j);
            C();
        } else {
            w29Var.b();
            Q(j);
        }
        u(false);
        this.Z.f(2);
        return j;
    }

    public final void Y(w4c w4cVar) {
        w4cVar.getClass();
        wwf wwfVar = this.Z;
        if (w4cVar.e != this.t0) {
            wwfVar.a(15, w4cVar).b();
            return;
        }
        synchronized (w4cVar) {
        }
        try {
            w4cVar.a.a(w4cVar.c, w4cVar.d);
            w4cVar.a(true);
            int i = this.Q0.e;
            if (i == 3 || i == 2) {
                wwfVar.f(2);
            }
        } catch (Throwable th) {
            w4cVar.a(true);
            throw th;
        }
    }

    public final void Z(w4c w4cVar) {
        Looper looper = w4cVar.e;
        if (looper.getThread().isAlive()) {
            this.A0.a(looper, null).d(new qj4(this, w4cVar, 27));
        } else {
            a8i.l("TAG", "Trying to send message on a dead thread.");
            w4cVar.a(false);
        }
    }

    public final void a(km5 km5Var, int i) throws Throwable {
        this.R0.d(1);
        y87 y87Var = this.D0;
        if (i == -1) {
            i = ((ArrayList) y87Var.g).size();
        }
        v(y87Var.b(i, km5Var.a, km5Var.b), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(defpackage.k20 r7, boolean r8) {
        /*
            r6 = this;
            oo8 r0 = r6.d
            ar4 r0 = (defpackage.ar4) r0
            k20 r1 = r0.i
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto Ld
            goto L12
        Ld:
            r0.i = r7
            r0.f()
        L12:
            if (r8 == 0) goto L15
            goto L16
        L15:
            r7 = 0
        L16:
            o30 r8 = r6.K0
            k20 r0 = r8.d
            boolean r0 = java.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L53
            r8.d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L28
        L26:
            r3 = r0
            goto L47
        L28:
            int r2 = r7.c
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L41;
                case 1: goto L3f;
                case 2: goto L3d;
                case 3: goto L26;
                case 4: goto L3d;
                case 5: goto L47;
                case 6: goto L47;
                case 7: goto L47;
                case 8: goto L47;
                case 9: goto L47;
                case 10: goto L47;
                case 11: goto L39;
                case 12: goto L47;
                case 13: goto L47;
                case 14: goto L3f;
                case 15: goto L31;
                case 16: goto L37;
                default: goto L31;
            }
        L31:
            java.lang.String r7 = "Unidentified audio usage: "
            defpackage.wy1.p(r2, r7, r5)
            goto L26
        L37:
            r3 = 4
            goto L47
        L39:
            int r7 = r7.a
            if (r7 != r1) goto L47
        L3d:
            r3 = r4
            goto L47
        L3f:
            r3 = r1
            goto L47
        L41:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.a8i.l(r5, r7)
            goto L3f
        L47:
            r8.f = r3
            if (r3 == r1) goto L4d
            if (r3 != 0) goto L4e
        L4d:
            r0 = r1
        L4e:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.hsi.a(r7, r0)
        L53:
            a3c r7 = r6.Q0
            boolean r0 = r7.l
            int r1 = r7.n
            int r2 = r7.m
            int r7 = r7.e
            int r7 = r8.d(r7, r0)
            r6.y0(r7, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.a0(k20, boolean):void");
    }

    @Override // defpackage.x3h
    public final void b(long j, long j2, hf6 hf6Var, MediaFormat mediaFormat) {
        if (this.O0) {
            wwf wwfVar = this.Z;
            wwfVar.getClass();
            uwf uwfVarC = wwf.c();
            uwfVarC.a = wwfVar.a.obtainMessage(37);
            uwfVarC.b();
        }
    }

    public final void b0(boolean z, yn3 yn3Var) {
        if (this.a1 != z) {
            this.a1 = z;
            if (!z) {
                for (pld pldVar : this.a) {
                    pldVar.k();
                }
            }
        }
        if (yn3Var != null) {
            yn3Var.f();
        }
    }

    public final void c() {
        for (pld pldVar : this.a) {
            x3e x3eVar = this.N0 ? this.M0 : null;
            ((tk0) pldVar.e).a(18, x3eVar);
            tk0 tk0Var = (tk0) pldVar.f;
            if (tk0Var != null) {
                tk0Var.a(18, x3eVar);
            }
        }
    }

    public final void c0(km5 km5Var) throws Throwable {
        this.R0.d(1);
        int i = km5Var.c;
        hze hzeVar = km5Var.b;
        ArrayList arrayList = km5Var.a;
        if (i != -1) {
            this.e1 = new qm5(new h5c(arrayList, hzeVar), km5Var.c, km5Var.d);
        }
        y87 y87Var = this.D0;
        ArrayList arrayList2 = (ArrayList) y87Var.g;
        y87Var.t(0, arrayList2.size());
        v(y87Var.b(arrayList2.size(), arrayList, hzeVar), false);
    }

    public final boolean d() {
        if (!this.J0) {
            return false;
        }
        for (pld pldVar : this.a) {
            if (pldVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z) throws ExoPlaybackException {
        this.T0 = z;
        P();
        if (this.U0) {
            w29 w29Var = this.C0;
            if (w29Var.j != w29Var.i) {
                V(true);
                u(false);
            }
        }
    }

    public final void e() throws ExoPlaybackException, NumberFormatException {
        N();
        V(true);
    }

    public final void e0(c3c c3cVar) {
        this.Z.e(16);
        sk skVar = this.y0;
        skVar.J(c3cVar);
        c3c c3cVarMo25c = skVar.mo25c();
        x(c3cVarMo25c, c3cVarMo25c.a, true, true);
    }

    public final void f() {
        tk0 tk0Var;
        if (this.J0 && d()) {
            for (pld pldVar : this.a) {
                int iC = pldVar.c();
                if (pldVar.f()) {
                    int i = pldVar.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        tk0Var = (tk0) pldVar.e;
                    } else {
                        tk0Var = (tk0) pldVar.f;
                        tk0Var.getClass();
                    }
                    pldVar.a(tk0Var, this.y0);
                    pldVar.i(z);
                    pldVar.d = i2;
                }
                this.d1 -= iC - pldVar.c();
            }
            this.m1 = -9223372036854775807L;
        }
    }

    public final void f0(il5 il5Var) {
        this.l1 = il5Var;
        s9g s9gVar = this.Q0.a;
        w29 w29Var = this.C0;
        w29Var.getClass();
        il5Var.getClass();
        if (w29Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < w29Var.q.size(); i++) {
            ((r29) w29Var.q.get(i)).i();
        }
        w29Var.q = arrayList;
        w29Var.m = null;
        w29Var.l();
    }

    public final void g(int i) {
        pld[] pldVarArr = this.a;
        int iC = pldVarArr[i].c();
        pld pldVar = pldVarArr[i];
        tk0 tk0Var = (tk0) pldVar.e;
        sk skVar = this.y0;
        pldVar.a(tk0Var, skVar);
        tk0 tk0Var2 = (tk0) pldVar.f;
        if (tk0Var2 != null) {
            boolean z = (tk0Var2.Z == 0 || pldVar.d == 3) ? false : true;
            pldVar.a(tk0Var2, skVar);
            pldVar.i(false);
            if (z) {
                tk0 tk0Var3 = (tk0) pldVar.e;
                tk0Var2.getClass();
                tk0Var2.a(17, tk0Var3);
            }
        }
        pldVar.d = 0;
        G(i, false);
        this.d1 -= iC;
    }

    public final void g0(int i) throws ExoPlaybackException {
        this.Y0 = i;
        s9g s9gVar = this.Q0.a;
        w29 w29Var = this.C0;
        w29Var.g = i;
        int iS = w29Var.s(s9gVar);
        if ((iS & 1) != 0) {
            V(true);
        } else if ((iS & 2) != 0) {
            f();
        }
        u(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x08ad  */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, p29] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, p29] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, p29] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p29] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, p29] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 2266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.h():void");
    }

    public final void h0(boolean z) throws Throwable {
        if (!z) {
            this.O0 = false;
            this.Z.e(37);
            qm5 qm5Var = this.P0;
            if (qm5Var != null) {
                W(qm5Var, false);
                this.P0 = null;
            }
        }
        this.N0 = z;
        c();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        r29 r29Var;
        d99 d99Var;
        r29 r29Var2;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.R0.d(1);
                    y0(this.K0.d(this.Q0.e, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    W((qm5) message.obj, true);
                    break;
                case 4:
                    e0((c3c) message.obj);
                    break;
                case 5:
                    j0((k9e) message.obj);
                    break;
                case 6:
                    t0(false, true);
                    break;
                case 7:
                    K((yn3) message.obj);
                    return true;
                case 8:
                    w((p29) message.obj);
                    break;
                case 9:
                    r((p29) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    k0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (yn3) message.obj);
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    Y((w4c) message.obj);
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    Z((w4c) message.obj);
                    break;
                case 16:
                    c3c c3cVar = (c3c) message.obj;
                    x(c3cVar, c3cVar.a, true, false);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    c0((km5) message.obj);
                    break;
                case 18:
                    a((km5) message.obj, message.arg1);
                    break;
                case 19:
                    I((lm5) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (hze) message.obj);
                    break;
                case 21:
                    l0((hze) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    d0(message.arg1 != 0);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    x0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    f0((il5) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (yn3) pair.second);
                    break;
                case 31:
                    a0((k20) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    n0((x3h) message.obj);
                    break;
                case 36:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    this.O0 = false;
                    qm5 qm5Var = this.P0;
                    if (qm5Var != null) {
                        W(qm5Var, false);
                        this.P0 = null;
                        break;
                    }
                    break;
                case 38:
                    i0((x3e) message.obj);
                    break;
            }
        } catch (ParserException e) {
            boolean z2 = e.a;
            int i4 = e.b;
            if (i4 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                t(i, e);
            }
            i = i2;
            t(i, e);
        } catch (DataSourceException e2) {
            t(e2.a, e2);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i5 = e.t0;
            w29 w29Var = this.C0;
            if (i5 == 1 && (r29Var2 = w29Var.j) != null && e.y0 == null) {
                e = e.c(r29Var2.g.a);
            }
            int i6 = e.t0;
            wwf wwfVar = this.Z;
            if (i6 == 1 && (d99Var = e.y0) != null && A(e.v0, d99Var)) {
                this.n1 = true;
                f();
                r29 r29VarH = w29Var.h();
                r29 r29Var3 = w29Var.i;
                if (r29Var3 != r29VarH) {
                    while (r29Var3 != null) {
                        r29 r29Var4 = r29Var3.m;
                        if (r29Var4 == r29VarH) {
                            break;
                        }
                        r29Var3 = r29Var4;
                    }
                }
                w29Var.o(r29Var3);
                if (this.Q0.e != 4) {
                    C();
                    wwfVar.f(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.j1;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.j1;
                }
                if (e.t0 == 1 && w29Var.i != w29Var.j) {
                    while (true) {
                        r29Var = w29Var.i;
                        if (r29Var == w29Var.j) {
                            break;
                        }
                        w29Var.a();
                    }
                    hsi.d(r29Var);
                    E();
                    u29 u29Var = r29Var.g;
                    d99 d99Var2 = u29Var.a;
                    long j = u29Var.b;
                    this.Q0 = y(d99Var2, j, u29Var.c, j, true, 0);
                }
                if (e.z0 && (this.j1 == null || (i = e.a) == 5004 || i == 5003)) {
                    a8i.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.j1 == null) {
                        this.j1 = e;
                    }
                    uwf uwfVarA = wwfVar.a(25, e);
                    Handler handler = wwfVar.a;
                    Message message2 = uwfVarA.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    uwfVarA.a();
                } else {
                    a8i.h("ExoPlayerImplInternal", "Playback error", e);
                    t0(true, false);
                    this.Q0 = this.Q0.f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e4) {
            t(e4.a, e4);
        } catch (BehindLiveWindowException e5) {
            t(1002, e5);
        } catch (IOException e6) {
            t(2000, e6);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            a8i.h("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            t0(true, false);
            this.Q0 = this.Q0.f(exoPlaybackException2);
        }
        E();
        return true;
    }

    @Override // defpackage.n29
    public final void i(p29 p29Var) {
        this.Z.a(8, p29Var).b();
    }

    public final void i0(x3e x3eVar) {
        this.M0 = x3eVar;
        c();
    }

    public final void j(r29 r29Var, int i, boolean z, long j) throws ExoPlaybackException {
        pld pldVar = this.a[i];
        boolean zG = pldVar.g();
        tk0 tk0Var = (tk0) pldVar.e;
        if (zG) {
            return;
        }
        boolean z2 = r29Var == this.C0.i;
        ggg gggVar = r29Var.o;
        kld kldVar = ((kld[]) gggVar.d)[i];
        bn5 bn5Var = ((bn5[]) gggVar.o)[i];
        boolean z3 = q0() && this.Q0.e == 3;
        boolean z4 = !z && z3;
        this.d1++;
        jxd jxdVar = r29Var.c[i];
        long j2 = r29Var.p;
        d99 d99Var = r29Var.g.a;
        tk0 tk0Var2 = (tk0) pldVar.f;
        int length = bn5Var != null ? bn5Var.length() : 0;
        hf6[] hf6VarArr = new hf6[length];
        for (int i2 = 0; i2 < length; i2++) {
            bn5Var.getClass();
            hf6VarArr[i2] = bn5Var.d(i2);
        }
        int i3 = pldVar.d;
        sk skVar = this.y0;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            pldVar.a = true;
            hsi.g(tk0Var.Z == 0);
            tk0Var.d = kldVar;
            tk0Var.A0 = d99Var;
            tk0Var.Z = 1;
            tk0Var.n(z4, z2);
            tk0Var.x(hf6VarArr, jxdVar, j, j2, d99Var);
            tk0Var.x0 = false;
            tk0Var.v0 = j;
            tk0Var.w0 = j;
            tk0Var.o(j, z4);
            skVar.b(tk0Var);
        } else {
            pldVar.b = true;
            tk0Var2.getClass();
            hsi.g(tk0Var2.Z == 0);
            tk0Var2.d = kldVar;
            tk0Var2.A0 = d99Var;
            tk0Var2.Z = 1;
            tk0Var2.n(z4, z2);
            tk0Var2.x(hf6VarArr, jxdVar, j, j2, d99Var);
            tk0Var2.x0 = false;
            tk0Var2.v0 = j;
            tk0Var2.w0 = j;
            tk0Var2.o(j, z4);
            skVar.b(tk0Var2);
        }
        im5 im5Var = new im5(this);
        tk0 tk0VarD = pldVar.d(r29Var);
        tk0VarD.getClass();
        tk0VarD.a(11, im5Var);
        if (z3 && z2) {
            pldVar.m();
        }
    }

    public final void j0(k9e k9eVar) {
        this.L0 = k9eVar;
    }

    public final void k(boolean[] zArr, long j) throws ExoPlaybackException {
        pld[] pldVarArr;
        long j2;
        r29 r29Var = this.C0.j;
        ggg gggVar = r29Var.o;
        int i = 0;
        while (true) {
            pldVarArr = this.a;
            if (i >= pldVarArr.length) {
                break;
            }
            if (!gggVar.S(i)) {
                pldVarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < pldVarArr.length) {
            if (gggVar.S(i2) && pldVarArr[i2].d(r29Var) == null) {
                j2 = j;
                j(r29Var, i2, zArr[i2], j2);
            } else {
                j2 = j;
            }
            i2++;
            j = j2;
        }
    }

    public final void k0(boolean z) throws ExoPlaybackException {
        this.Z0 = z;
        s9g s9gVar = this.Q0.a;
        w29 w29Var = this.C0;
        w29Var.h = z;
        int iS = w29Var.s(s9gVar);
        if ((iS & 1) != 0) {
            V(true);
        } else if ((iS & 2) != 0) {
            f();
        }
        u(false);
    }

    public final long l(s9g s9gVar, Object obj, long j) {
        m9g m9gVar = this.v0;
        int i = s9gVar.g(obj, m9gVar).c;
        q9g q9gVar = this.u0;
        s9gVar.n(i, q9gVar);
        if (q9gVar.f != -9223372036854775807L && q9gVar.a() && q9gVar.i) {
            return zxg.U(zxg.E(q9gVar.g) - q9gVar.f) - (j + m9gVar.e);
        }
        return -9223372036854775807L;
    }

    public final void l0(hze hzeVar) throws Throwable {
        this.R0.d(1);
        y87 y87Var = this.D0;
        int size = ((ArrayList) y87Var.g).size();
        if (hzeVar.b.length != size) {
            hzeVar = hzeVar.a().b(0, size);
        }
        y87Var.m = hzeVar;
        v(y87Var.g(), false);
    }

    public final long m(r29 r29Var) {
        if (r29Var == null) {
            return 0L;
        }
        long jMax = r29Var.p;
        if (!r29Var.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            pld[] pldVarArr = this.a;
            if (i >= pldVarArr.length) {
                return jMax;
            }
            if (pldVarArr[i].d(r29Var) != null) {
                tk0 tk0VarD = pldVarArr[i].d(r29Var);
                Objects.requireNonNull(tk0VarD);
                long j = tk0VarD.w0;
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j, jMax);
            }
            i++;
        }
    }

    public final void m0(int i) {
        a3c a3cVar = this.Q0;
        if (a3cVar.e != i) {
            if (i != 2) {
                this.k1 = -9223372036854775807L;
            }
            if (i != 3 && a3cVar.p) {
                this.Q0 = a3cVar.i(false);
            }
            this.Q0 = this.Q0.h(i);
        }
    }

    public final Pair n(s9g s9gVar) {
        if (s9gVar.p()) {
            return Pair.create(a3c.u, 0L);
        }
        Pair pairI = s9gVar.i(this.u0, this.v0, s9gVar.a(this.Z0), -9223372036854775807L);
        d99 d99VarQ = this.C0.q(s9gVar, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (d99VarQ.b()) {
            Object obj = d99VarQ.a;
            m9g m9gVar = this.v0;
            s9gVar.g(obj, m9gVar);
            jLongValue = d99VarQ.c == m9gVar.f(d99VarQ.b) ? m9gVar.g.b : 0L;
        }
        return Pair.create(d99VarQ, Long.valueOf(jLongValue));
    }

    public final void n0(x3h x3hVar) {
        for (pld pldVar : this.a) {
            tk0 tk0Var = (tk0) pldVar.e;
            if (tk0Var.b == 2) {
                tk0Var.a(7, x3hVar);
                tk0 tk0Var2 = (tk0) pldVar.f;
                if (tk0Var2 != null) {
                    tk0Var2.a(7, x3hVar);
                }
            }
        }
    }

    public final long o(long j) {
        r29 r29Var = this.C0.l;
        if (r29Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f1 - r29Var.p));
    }

    public final void o0(Object obj, yn3 yn3Var) {
        for (pld pldVar : this.a) {
            tk0 tk0Var = (tk0) pldVar.e;
            if (tk0Var.b == 2) {
                int i = pldVar.d;
                if (i == 4 || i == 1) {
                    tk0 tk0Var2 = (tk0) pldVar.f;
                    tk0Var2.getClass();
                    tk0Var2.a(1, obj);
                } else {
                    tk0Var.a(1, obj);
                }
            }
        }
        int i2 = this.Q0.e;
        if (i2 == 3 || i2 == 2) {
            this.Z.f(2);
        }
        if (yn3Var != null) {
            yn3Var.f();
        }
    }

    public final void p(int i) {
        a3c a3cVar = this.Q0;
        y0(i, a3cVar.n, a3cVar.m, a3cVar.l);
    }

    public final void p0(float f) {
        this.o1 = f;
        float f2 = f * this.K0.g;
        for (pld pldVar : this.a) {
            tk0 tk0Var = (tk0) pldVar.e;
            if (tk0Var.b == 1) {
                tk0Var.a(2, Float.valueOf(f2));
                tk0 tk0Var2 = (tk0) pldVar.f;
                if (tk0Var2 != null) {
                    tk0Var2.a(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void q() {
        p0(this.o1);
    }

    public final boolean q0() {
        a3c a3cVar = this.Q0;
        return a3cVar.l && a3cVar.n == 0;
    }

    public final void r(p29 p29Var) {
        w29 w29Var = this.C0;
        r29 r29Var = w29Var.l;
        if (r29Var != null && r29Var.a == p29Var) {
            w29Var.n(this.f1);
            C();
            return;
        }
        r29 r29Var2 = w29Var.m;
        if (r29Var2 == null || r29Var2.a != p29Var) {
            return;
        }
        D();
    }

    public final boolean r0(s9g s9gVar, d99 d99Var) {
        if (d99Var.b() || s9gVar.p()) {
            return false;
        }
        int i = s9gVar.g(d99Var.a, this.v0).c;
        q9g q9gVar = this.u0;
        s9gVar.n(i, q9gVar);
        return q9gVar.a() && q9gVar.i && q9gVar.f != -9223372036854775807L;
    }

    @Override // defpackage.hee
    public final void s(jee jeeVar) {
        this.Z.a(9, (p29) jeeVar).b();
    }

    public final void s0() {
        r29 r29Var = this.C0.i;
        if (r29Var == null) {
            return;
        }
        ggg gggVar = r29Var.o;
        int i = 0;
        while (true) {
            pld[] pldVarArr = this.a;
            if (i >= pldVarArr.length) {
                return;
            }
            if (gggVar.S(i)) {
                pldVarArr[i].m();
            }
            i++;
        }
    }

    public final void t(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        r29 r29Var = this.C0.i;
        if (r29Var != null) {
            exoPlaybackException = exoPlaybackException.c(r29Var.g.a);
        }
        a8i.h("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        t0(false, false);
        this.Q0 = this.Q0.f(exoPlaybackException);
    }

    public final void t0(boolean z, boolean z2) {
        O(z || !this.a1, false, true, false);
        this.R0.d(z2 ? 1 : 0);
        this.X.f(this.G0);
        this.K0.d(1, this.Q0.l);
        m0(1);
    }

    public final void u(boolean z) {
        r29 r29Var = this.C0.l;
        d99 d99Var = r29Var == null ? this.Q0.b : r29Var.g.a;
        boolean zEquals = this.Q0.k.equals(d99Var);
        if (!zEquals) {
            this.Q0 = this.Q0.c(d99Var);
        }
        a3c a3cVar = this.Q0;
        a3cVar.q = r29Var == null ? a3cVar.s : r29Var.d();
        a3c a3cVar2 = this.Q0;
        a3cVar2.r = o(a3cVar2.q);
        if ((!zEquals || z) && r29Var != null && r29Var.e) {
            w0(r29Var.g.a, r29Var.n, r29Var.o);
        }
    }

    public final void u0() {
        sk skVar = this.y0;
        skVar.c = false;
        m69 m69Var = (m69) skVar.d;
        if (m69Var.b) {
            m69Var.a(m69Var.r());
            m69Var.b = false;
        }
        for (pld pldVar : this.a) {
            tk0 tk0Var = (tk0) pldVar.f;
            tk0 tk0Var2 = (tk0) pldVar.e;
            if (pld.h(tk0Var2)) {
                pld.b(tk0Var2);
            }
            if (tk0Var != null && tk0Var.Z != 0) {
                pld.b(tk0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0202  */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(defpackage.s9g r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.v(s9g, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jee] */
    public final void v0() {
        r29 r29Var = this.C0.l;
        boolean z = this.X0 || (r29Var != null && r29Var.a.j());
        a3c a3cVar = this.Q0;
        if (z != a3cVar.g) {
            this.Q0 = a3cVar.b(z);
        }
    }

    public final void w(p29 p29Var) throws ExoPlaybackException, NumberFormatException {
        r29 r29Var;
        w29 w29Var = this.C0;
        r29 r29Var2 = w29Var.l;
        sk skVar = this.y0;
        if (r29Var2 != null && r29Var2.a == p29Var) {
            r29Var2.getClass();
            if (!r29Var2.e) {
                float f = skVar.mo25c().a;
                a3c a3cVar = this.Q0;
                r29Var2.f(f, a3cVar.a, a3cVar.l);
            }
            w0(r29Var2.g.a, r29Var2.n, r29Var2.o);
            if (r29Var2 == w29Var.i) {
                Q(r29Var2.g.b);
                k(new boolean[this.a.length], w29Var.j.e());
                r29Var2.h = true;
                a3c a3cVar2 = this.Q0;
                d99 d99Var = a3cVar2.b;
                long j = r29Var2.g.b;
                this.Q0 = y(d99Var, j, a3cVar2.c, j, false, 5);
            }
            C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= w29Var.q.size()) {
                r29Var = null;
                break;
            }
            r29Var = (r29) w29Var.q.get(i);
            if (r29Var.a == p29Var) {
                break;
            } else {
                i++;
            }
        }
        if (r29Var != null) {
            hsi.g(true ^ r29Var.e);
            float f2 = skVar.mo25c().a;
            a3c a3cVar3 = this.Q0;
            r29Var.f(f2, a3cVar3.a, a3cVar3.l);
            r29 r29Var3 = w29Var.m;
            if (r29Var3 == null || r29Var3.a != p29Var) {
                return;
            }
            D();
        }
    }

    public final void w0(d99 d99Var, nfg nfgVar, ggg gggVar) {
        long j;
        long j2;
        w29 w29Var = this.C0;
        r29 r29Var = w29Var.l;
        r29Var.getClass();
        if (r29Var == w29Var.i) {
            j = this.f1;
            j2 = r29Var.p;
        } else {
            j = this.f1 - r29Var.p;
            j2 = r29Var.g.b;
        }
        long j3 = j - j2;
        long jO = o(r29Var.d());
        long j4 = r0(this.Q0.a, r29Var.g.a) ? this.E0.i : -9223372036854775807L;
        s9g s9gVar = this.Q0.a;
        float f = this.y0.mo25c().a;
        boolean z = this.Q0.l;
        this.X.a(new ib8(this.G0, s9gVar, d99Var, j3, jO, f, this.V0, j4), (bn5[]) gggVar.o);
    }

    public final void x(c3c c3cVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.R0.d(1);
            }
            this.Q0 = this.Q0.g(c3cVar);
        }
        float f2 = c3cVar.a;
        r29 r29Var = this.C0.i;
        while (true) {
            i = 0;
            if (r29Var == null) {
                break;
            }
            bn5[] bn5VarArr = (bn5[]) r29Var.o.o;
            int length = bn5VarArr.length;
            while (i < length) {
                bn5 bn5Var = bn5VarArr[i];
                if (bn5Var != null) {
                    bn5Var.l(f2);
                }
                i++;
            }
            r29Var = r29Var.m;
        }
        pld[] pldVarArr = this.a;
        int length2 = pldVarArr.length;
        while (i < length2) {
            pld pldVar = pldVarArr[i];
            float f3 = c3cVar.a;
            ((tk0) pldVar.e).y(f, f3);
            tk0 tk0Var = (tk0) pldVar.f;
            if (tk0Var != null) {
                tk0Var.y(f, f3);
            }
            i++;
        }
    }

    public final void x0(List list, int i, int i2) throws Throwable {
        this.R0.d(1);
        y87 y87Var = this.D0;
        y87Var.getClass();
        ArrayList arrayList = (ArrayList) y87Var.g;
        hsi.b(i >= 0 && i <= i2 && i2 <= arrayList.size());
        hsi.b(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((z99) arrayList.get(i3)).a.t((k09) list.get(i3 - i));
        }
        v(y87Var.g(), false);
    }

    public final a3c y(d99 d99Var, long j, long j2, long j3, boolean z, int i) {
        zjd zjdVarI;
        boolean z2;
        this.i1 = (!this.i1 && j == this.Q0.s && d99Var.equals(this.Q0.b)) ? false : true;
        P();
        a3c a3cVar = this.Q0;
        nfg nfgVar = a3cVar.h;
        ggg gggVar = a3cVar.i;
        List list = a3cVar.j;
        if (this.D0.e) {
            r29 r29Var = this.C0.i;
            nfgVar = r29Var == null ? nfg.d : r29Var.n;
            gggVar = r29Var == null ? this.o : r29Var.o;
            bn5[] bn5VarArr = (bn5[]) gggVar.o;
            tg7 tg7Var = new tg7(4);
            boolean z3 = false;
            for (bn5 bn5Var : bn5VarArr) {
                if (bn5Var != null) {
                    ty9 ty9Var = bn5Var.d(0).l;
                    if (ty9Var == null) {
                        tg7Var.a(new ty9(new ry9[0]));
                    } else {
                        tg7Var.a(ty9Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                zjdVarI = tg7Var.i();
            } else {
                t76 t76Var = wg7.b;
                zjdVarI = zjd.o;
            }
            list = zjdVarI;
            if (r29Var != null) {
                u29 u29Var = r29Var.g;
                if (u29Var.c != j2) {
                    r29Var.g = u29Var.a(j2);
                }
            }
            pld[] pldVarArr = this.a;
            w29 w29Var = this.C0;
            r29 r29Var2 = w29Var.i;
            if (r29Var2 == w29Var.j && r29Var2 != null) {
                ggg gggVar2 = r29Var2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= pldVarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (gggVar2.S(i2)) {
                        if (((tk0) pldVarArr[i2].e).b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((kld[]) gggVar2.d)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.c1) {
                    this.c1 = z5;
                    if (!z5 && this.Q0.p) {
                        this.Z.f(2);
                    }
                }
            }
        } else if (!d99Var.equals(a3cVar.b)) {
            nfgVar = nfg.d;
            gggVar = this.o;
            list = zjd.o;
        }
        nfg nfgVar2 = nfgVar;
        ggg gggVar3 = gggVar;
        List list2 = list;
        if (z) {
            nm5 nm5Var = this.R0;
            if (!nm5Var.e || nm5Var.c == 5) {
                nm5Var.d = true;
                nm5Var.e = true;
                nm5Var.c = i;
            } else {
                hsi.b(i == 5);
            }
        }
        a3c a3cVar2 = this.Q0;
        return a3cVar2.d(d99Var, j, j2, j3, o(a3cVar2.q), nfgVar2, gggVar3, list2);
    }

    public final void y0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        a3c a3cVar = this.Q0;
        if (a3cVar.l == z2 && a3cVar.n == i2 && a3cVar.m == i3) {
            return;
        }
        this.Q0 = a3cVar.e(i3, i2, z2);
        B0(false, false);
        w29 w29Var = this.C0;
        for (r29 r29Var = w29Var.i; r29Var != null; r29Var = r29Var.m) {
            for (bn5 bn5Var : (bn5[]) r29Var.o.o) {
                if (bn5Var != null) {
                    bn5Var.c(z2);
                }
            }
        }
        if (!q0()) {
            u0();
            z0();
            a3c a3cVar2 = this.Q0;
            if (a3cVar2.p) {
                this.Q0 = a3cVar2.i(false);
            }
            w29Var.n(this.f1);
            return;
        }
        int i4 = this.Q0.e;
        wwf wwfVar = this.Z;
        if (i4 != 3) {
            if (i4 == 2) {
                wwfVar.f(2);
            }
        } else {
            sk skVar = this.y0;
            skVar.c = true;
            ((m69) skVar.d).b();
            s0();
            wwfVar.f(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, p29] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0() {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.z0():void");
    }
}
