package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class rm5 implements Handler.Callback, m29 {
    public final rl5 A0;
    public final v29 B0;
    public final y87 C0;
    public final yn4 D0;
    public j9e E0;
    public z2c F0;
    public mm5 G0;
    public boolean H0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public int M0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public pm5 S0;
    public long T0;
    public int U0;
    public boolean V0;
    public ExoPlaybackException W0;
    public final ao4 X;
    public final ch0 Y;
    public final vwf Z;
    public final sk0[] a;
    public final Set b;
    public final sk0[] c;
    public final no8 d;
    public final ggg o;
    public final HandlerThread s0;
    public final Looper t0;
    public final p9g u0;
    public final l9g v0;
    public final long w0;
    public final sk x0;
    public final ArrayList y0;
    public final kwf z0;
    public boolean N0 = false;
    public boolean I0 = false;
    public long X0 = -9223372036854775807L;

    public rm5(sk0[] sk0VarArr, no8 no8Var, ggg gggVar, ao4 ao4Var, ch0 ch0Var, int i, mj4 mj4Var, j9e j9eVar, yn4 yn4Var, Looper looper, kwf kwfVar, rl5 rl5Var, m4c m4cVar) {
        this.A0 = rl5Var;
        this.a = sk0VarArr;
        this.d = no8Var;
        this.o = gggVar;
        this.X = ao4Var;
        this.Y = ch0Var;
        this.M0 = i;
        this.E0 = j9eVar;
        this.D0 = yn4Var;
        this.z0 = kwfVar;
        this.w0 = ao4Var.g;
        z2c z2cVarH = z2c.h(gggVar);
        this.F0 = z2cVarH;
        this.G0 = new mm5(z2cVarH);
        this.c = new sk0[sk0VarArr.length];
        for (int i2 = 0; i2 < sk0VarArr.length; i2++) {
            sk0 sk0Var = sk0VarArr[i2];
            sk0Var.d = i2;
            sk0Var.o = m4cVar;
            this.c[i2] = sk0Var;
        }
        this.x0 = new sk(this, kwfVar);
        this.y0 = new ArrayList();
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.u0 = new p9g();
        this.v0 = new l9g();
        no8Var.a = this;
        no8Var.b = ch0Var;
        this.V0 = true;
        Handler handler = new Handler(looper);
        this.B0 = new v29(mj4Var, handler);
        this.C0 = new y87(this, mj4Var, handler, m4cVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.s0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.t0 = looper2;
        this.Z = kwfVar.a(looper2, this);
    }

    public static Pair E(r9g r9gVar, pm5 pm5Var, boolean z, int i, boolean z2, p9g p9gVar, l9g l9gVar) {
        Object objF;
        r9g r9gVar2 = pm5Var.a;
        if (r9gVar.p()) {
            return null;
        }
        r9g r9gVar3 = r9gVar2.p() ? r9gVar : r9gVar2;
        try {
            Pair pairI = r9gVar3.i(p9gVar, l9gVar, pm5Var.b, pm5Var.c);
            if (!r9gVar.equals(r9gVar3)) {
                if (r9gVar.b(pairI.first) == -1) {
                    if (!z || (objF = F(p9gVar, l9gVar, i, z2, pairI.first, r9gVar3, r9gVar)) == null) {
                        return null;
                    }
                    return r9gVar.i(p9gVar, l9gVar, r9gVar.g(objF, l9gVar).c, -9223372036854775807L);
                }
                if (r9gVar3.g(pairI.first, l9gVar).X && r9gVar3.m(l9gVar.c, p9gVar, 0L).y0 == r9gVar3.b(pairI.first)) {
                    return r9gVar.i(p9gVar, l9gVar, r9gVar.g(pairI.first, l9gVar).c, pm5Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object F(p9g p9gVar, l9g l9gVar, int i, boolean z, Object obj, r9g r9gVar, r9g r9gVar2) {
        int iB = r9gVar.b(obj);
        int iH = r9gVar.h();
        int i2 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i2 < iH && iB2 == -1) {
            p9g p9gVar2 = p9gVar;
            l9g l9gVar2 = l9gVar;
            int i3 = i;
            boolean z2 = z;
            r9g r9gVar3 = r9gVar;
            iD = r9gVar3.d(iD, l9gVar2, p9gVar2, i3, z2);
            if (iD == -1) {
                break;
            }
            iB2 = r9gVar2.b(r9gVar3.l(iD));
            i2++;
            r9gVar = r9gVar3;
            l9gVar = l9gVar2;
            p9gVar = p9gVar2;
            i = i3;
            z = z2;
        }
        if (iB2 == -1) {
            return null;
        }
        return r9gVar2.l(iB2);
    }

    public static void M(sk0 sk0Var, long j) {
        sk0Var.u0 = true;
        if (sk0Var instanceof g5g) {
            g5g g5gVar = (g5g) sk0Var;
            fsi.d(g5gVar.u0);
            g5gVar.K0 = j;
        }
    }

    public static boolean q(sk0 sk0Var) {
        return sk0Var.X != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[PHI: r4 r5 r7
  0x00c3: PHI (r4v4 c99) = (r4v3 c99), (r4v10 c99) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r5v2 long) = (r5v1 long), (r5v9 long) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r7v3 long) = (r7v2 long), (r7v6 long) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        q29 q29Var = this.B0.h;
        this.J0 = q29Var != null && q29Var.f.h && this.I0;
    }

    public final void C(long j) {
        q29 q29Var = this.B0.h;
        long j2 = j + (q29Var == null ? 1000000000000L : q29Var.o);
        this.T0 = j2;
        ((m69) this.x0.d).a(j2);
        for (sk0 sk0Var : this.a) {
            if (q(sk0Var)) {
                long j3 = this.T0;
                sk0Var.u0 = false;
                sk0Var.t0 = j3;
                sk0Var.l(j3, false);
            }
        }
        for (q29 q29Var2 = r0.h; q29Var2 != null; q29Var2 = q29Var2.l) {
            for (an5 an5Var : (an5[]) q29Var2.n.o) {
                if (an5Var != null) {
                    an5Var.n();
                }
            }
        }
    }

    public final void D(r9g r9gVar, r9g r9gVar2) {
        if (r9gVar.p() && r9gVar2.p()) {
            return;
        }
        ArrayList arrayList = this.y0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            u45.r(arrayList.get(size));
            throw null;
        }
    }

    public final void G(long j, long j2) {
        vwf vwfVar = this.Z;
        vwfVar.a.removeMessages(2);
        vwfVar.a.sendEmptyMessageAtTime(2, j + j2);
    }

    public final void H(boolean z) throws ExoPlaybackException {
        c99 c99Var = this.B0.h.f.a;
        long J = J(c99Var, this.F0.s, true, false);
        if (J != this.F0.s) {
            z2c z2cVar = this.F0;
            this.F0 = o(c99Var, J, z2cVar.c, z2cVar.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:36|(7:(9:103|38|(1:46)(1:44)|47|(1:54)|55|56|57|58)(1:61)|105|81|82|83|57|58)|101|62|(1:64)(1:65)|66|(1:68)(1:70)|69|71|72|(1:74)(1:75)|76|99|77|78|96|79|80) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0155, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0158, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:40:0x00ce, B:44:0x00d6), top: B:98:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, o29] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(defpackage.pm5 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.I(pm5):void");
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, o29] */
    public final long J(c99 c99Var, long j, boolean z, boolean z2) throws ExoPlaybackException {
        b0();
        this.K0 = false;
        if (z2 || this.F0.e == 3) {
            W(2);
        }
        v29 v29Var = this.B0;
        q29 q29Var = v29Var.h;
        q29 q29Var2 = q29Var;
        while (q29Var2 != null && !c99Var.equals(q29Var2.f.a)) {
            q29Var2 = q29Var2.l;
        }
        if (z || q29Var != q29Var2 || (q29Var2 != null && q29Var2.o + j < 0)) {
            sk0[] sk0VarArr = this.a;
            for (sk0 sk0Var : sk0VarArr) {
                d(sk0Var);
            }
            if (q29Var2 != null) {
                while (v29Var.h != q29Var2) {
                    v29Var.a();
                }
                v29Var.k(q29Var2);
                q29Var2.o = 1000000000000L;
                f(new boolean[sk0VarArr.length]);
            }
        }
        if (q29Var2 != null) {
            ?? r9 = q29Var2.a;
            v29Var.k(q29Var2);
            if (!q29Var2.d) {
                q29Var2.f = q29Var2.f.b(j);
            } else if (q29Var2.e) {
                j = r9.h(j);
                r9.y(j - this.w0);
            }
            C(j);
            s();
        } else {
            v29Var.b();
            C(j);
        }
        k(false);
        this.Z.c(2);
        return j;
    }

    public final void K(v4c v4cVar) {
        vwf vwfVar = this.Z;
        if (v4cVar.f != this.t0) {
            vwfVar.a(15, v4cVar).b();
            return;
        }
        synchronized (v4cVar) {
        }
        try {
            v4cVar.a.a(v4cVar.d, v4cVar.e);
            v4cVar.b(true);
            int i = this.F0.e;
            if (i == 3 || i == 2) {
                vwfVar.c(2);
            }
        } catch (Throwable th) {
            v4cVar.b(true);
            throw th;
        }
    }

    public final void L(v4c v4cVar) {
        Looper looper = v4cVar.f;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            v4cVar.b(false);
        } else {
            vwf vwfVarA = this.z0.a(looper, null);
            vwfVarA.a.post(new qj4(this, v4cVar, 26));
        }
    }

    public final void N(AtomicBoolean atomicBoolean, boolean z) {
        if (this.O0 != z) {
            this.O0 = z;
            if (!z) {
                for (sk0 sk0Var : this.a) {
                    if (!q(sk0Var) && this.b.remove(sk0Var)) {
                        sk0Var.v();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(jm5 jm5Var) throws Throwable {
        this.G0.a(1);
        int i = jm5Var.c;
        gze gzeVar = jm5Var.b;
        ArrayList arrayList = jm5Var.a;
        if (i != -1) {
            this.S0 = new pm5(new g5c(arrayList, gzeVar), jm5Var.c, jm5Var.d);
        }
        y87 y87Var = this.C0;
        ArrayList arrayList2 = (ArrayList) y87Var.g;
        y87Var.t(0, arrayList2.size());
        l(y87Var.a(arrayList2.size(), arrayList, gzeVar), false);
    }

    public final void P(boolean z) {
        if (z == this.Q0) {
            return;
        }
        this.Q0 = z;
        z2c z2cVar = this.F0;
        int i = z2cVar.e;
        if (z || i == 4 || i == 1) {
            this.F0 = z2cVar.c(z);
        } else {
            this.Z.c(2);
        }
    }

    public final void Q(boolean z) throws ExoPlaybackException {
        this.I0 = z;
        B();
        if (this.J0) {
            v29 v29Var = this.B0;
            if (v29Var.i != v29Var.h) {
                H(true);
                k(false);
            }
        }
    }

    public final void R(int i, int i2, boolean z, boolean z2) {
        this.G0.a(z2 ? 1 : 0);
        mm5 mm5Var = this.G0;
        mm5Var.a = true;
        mm5Var.f = true;
        mm5Var.g = i2;
        this.F0 = this.F0.d(i, z);
        this.K0 = false;
        for (q29 q29Var = this.B0.h; q29Var != null; q29Var = q29Var.l) {
            for (an5 an5Var : (an5[]) q29Var.n.o) {
                if (an5Var != null) {
                    an5Var.c(z);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i3 = this.F0.e;
        vwf vwfVar = this.Z;
        if (i3 == 3) {
            Z();
            vwfVar.c(2);
        } else if (i3 == 2) {
            vwfVar.c(2);
        }
    }

    public final void S(b3c b3cVar) {
        sk skVar = this.x0;
        skVar.s(b3cVar);
        b3c b3cVarC = skVar.c();
        n(b3cVarC, b3cVarC.a, true, true);
    }

    public final void T(int i) throws ExoPlaybackException {
        this.M0 = i;
        r9g r9gVar = this.F0.a;
        v29 v29Var = this.B0;
        v29Var.f = i;
        if (!v29Var.n(r9gVar)) {
            H(true);
        }
        k(false);
    }

    public final void U(boolean z) throws ExoPlaybackException {
        this.N0 = z;
        r9g r9gVar = this.F0.a;
        v29 v29Var = this.B0;
        v29Var.g = z;
        if (!v29Var.n(r9gVar)) {
            H(true);
        }
        k(false);
    }

    public final void V(gze gzeVar) throws Throwable {
        this.G0.a(1);
        y87 y87Var = this.C0;
        int size = ((ArrayList) y87Var.g).size();
        if (gzeVar.b.length != size) {
            gzeVar = new gze(new Random(gzeVar.a.nextLong())).a(size);
        }
        y87Var.m = gzeVar;
        l(y87Var.f(), false);
    }

    public final void W(int i) {
        z2c z2cVar = this.F0;
        if (z2cVar.e != i) {
            if (i != 2) {
                this.X0 = -9223372036854775807L;
            }
            this.F0 = z2cVar.f(i);
        }
    }

    public final boolean X() {
        z2c z2cVar = this.F0;
        return z2cVar.l && z2cVar.m == 0;
    }

    public final boolean Y(r9g r9gVar, c99 c99Var) {
        if (c99Var.a() || r9gVar.p()) {
            return false;
        }
        int i = r9gVar.g(c99Var.a, this.v0).c;
        p9g p9gVar = this.u0;
        r9gVar.n(i, p9gVar);
        return p9gVar.a() && p9gVar.s0 && p9gVar.X != -9223372036854775807L;
    }

    public final void Z() {
        this.K0 = false;
        sk skVar = this.x0;
        skVar.c = true;
        ((m69) skVar.d).b();
        for (sk0 sk0Var : this.a) {
            if (q(sk0Var)) {
                fsi.d(sk0Var.X == 1);
                sk0Var.X = 2;
                sk0Var.n();
            }
        }
    }

    public final void a(jm5 jm5Var, int i) throws Throwable {
        this.G0.a(1);
        y87 y87Var = this.C0;
        if (i == -1) {
            i = ((ArrayList) y87Var.g).size();
        }
        l(y87Var.a(i, jm5Var.a, jm5Var.b), false);
    }

    public final void a0(boolean z, boolean z2) {
        A(z || !this.O0, false, true, false);
        this.G0.a(z2 ? 1 : 0);
        this.X.b(true);
        W(1);
    }

    @Override // defpackage.gee
    public final void b(iee ieeVar) {
        this.Z.a(9, (o29) ieeVar).b();
    }

    public final void b0() {
        int i;
        sk skVar = this.x0;
        skVar.c = false;
        m69 m69Var = (m69) skVar.d;
        if (m69Var.b) {
            m69Var.a(m69Var.r());
            m69Var.b = false;
        }
        for (sk0 sk0Var : this.a) {
            if (q(sk0Var) && (i = sk0Var.X) == 2) {
                fsi.d(i == 2);
                sk0Var.X = 1;
                sk0Var.o();
            }
        }
    }

    @Override // defpackage.m29
    public final void c(o29 o29Var) {
        this.Z.a(8, o29Var).b();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [iee, java.lang.Object] */
    public final void c0() {
        q29 q29Var = this.B0.j;
        boolean z = this.L0 || (q29Var != null && q29Var.a.j());
        z2c z2cVar = this.F0;
        if (z != z2cVar.g) {
            this.F0 = new z2c(z2cVar.a, z2cVar.b, z2cVar.c, z2cVar.d, z2cVar.e, z2cVar.f, z, z2cVar.h, z2cVar.i, z2cVar.j, z2cVar.k, z2cVar.l, z2cVar.m, z2cVar.n, z2cVar.q, z2cVar.r, z2cVar.s, z2cVar.o, z2cVar.p);
        }
    }

    public final void d(sk0 sk0Var) {
        if (q(sk0Var)) {
            sk skVar = this.x0;
            if (sk0Var == ((sk0) skVar.X)) {
                skVar.Y = null;
                skVar.X = null;
                skVar.b = true;
            }
            int i = sk0Var.X;
            if (i == 2) {
                fsi.d(i == 2);
                sk0Var.X = 1;
                sk0Var.o();
            }
            fsi.d(sk0Var.X == 1);
            sk0Var.b.f();
            sk0Var.X = 0;
            sk0Var.Y = null;
            sk0Var.Z = null;
            sk0Var.u0 = false;
            sk0Var.j();
            this.R0--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d0(ggg gggVar) {
        an5[] an5VarArr = (an5[]) gggVar.o;
        ao4 ao4Var = this.X;
        int iMax = ao4Var.f;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                sk0[] sk0VarArr = this.a;
                int i3 = 13107200;
                if (i < sk0VarArr.length) {
                    if (an5VarArr[i] != null) {
                        switch (sk0VarArr[i].a) {
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        ao4Var.h = iMax;
        ao4Var.a.a(iMax);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141 A[EDGE_INSN: B:468:0x0141->B:61:0x0141 BREAK  A[LOOP:7: B:71:0x0157->B:88:0x018a], EDGE_INSN: B:469:0x0141->B:61:0x0141 BREAK  A[LOOP:7: B:71:0x0157->B:88:0x018a], EDGE_INSN: B:470:0x0141->B:61:0x0141 BREAK  A[LOOP:7: B:71:0x0157->B:88:0x018a], EDGE_INSN: B:471:0x0141->B:61:0x0141 BREAK  A[LOOP:7: B:71:0x0157->B:88:0x018a]] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o29] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, o29] */
    /* JADX WARN: Type inference failed for: r2v86, types: [java.lang.Object, o29] */
    /* JADX WARN: Type inference failed for: r3v86, types: [iee, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [iee, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43, types: [iee, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, o29] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [int] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, o29] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.e0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean[] r24) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.f(boolean[]):void");
    }

    public final void f0(r9g r9gVar, c99 c99Var, r9g r9gVar2, c99 c99Var2, long j) {
        boolean zY = Y(r9gVar, c99Var);
        Object obj = c99Var.a;
        if (!zY) {
            b3c b3cVar = c99Var.a() ? b3c.d : this.F0.n;
            sk skVar = this.x0;
            if (skVar.c().equals(b3cVar)) {
                return;
            }
            skVar.s(b3cVar);
            return;
        }
        l9g l9gVar = this.v0;
        int i = r9gVar.g(obj, l9gVar).c;
        p9g p9gVar = this.u0;
        r9gVar.n(i, p9gVar);
        xz8 xz8Var = p9gVar.u0;
        int i2 = xxg.a;
        yn4 yn4Var = this.D0;
        yn4Var.getClass();
        yn4Var.d = xxg.B(xz8Var.a);
        yn4Var.g = xxg.B(xz8Var.b);
        yn4Var.h = xxg.B(xz8Var.c);
        float f = xz8Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        yn4Var.k = f;
        float f2 = xz8Var.o;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        yn4Var.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            yn4Var.d = -9223372036854775807L;
        }
        yn4Var.a();
        if (j != -9223372036854775807L) {
            yn4Var.e = g(r9gVar, obj, j);
            yn4Var.a();
            return;
        }
        if (xxg.a(!r9gVar2.p() ? r9gVar2.m(r9gVar2.g(c99Var2.a, l9gVar).c, p9gVar, 0L).a : null, p9gVar.a)) {
            return;
        }
        yn4Var.e = -9223372036854775807L;
        yn4Var.a();
    }

    public final long g(r9g r9gVar, Object obj, long j) {
        l9g l9gVar = this.v0;
        int i = r9gVar.g(obj, l9gVar).c;
        p9g p9gVar = this.u0;
        r9gVar.n(i, p9gVar);
        if (p9gVar.X != -9223372036854775807L && p9gVar.a() && p9gVar.s0) {
            return xxg.B(xxg.s(p9gVar.Y) - p9gVar.X) - (j + l9gVar.o);
        }
        return -9223372036854775807L;
    }

    public final Pair h(r9g r9gVar) {
        if (r9gVar.p()) {
            return Pair.create(z2c.t, 0L);
        }
        Pair pairI = r9gVar.i(this.u0, this.v0, r9gVar.a(this.N0), -9223372036854775807L);
        c99 c99VarM = this.B0.m(r9gVar, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (c99VarM.a()) {
            Object obj = c99VarM.a;
            l9g l9gVar = this.v0;
            r9gVar.g(obj, l9gVar);
            jLongValue = c99VarM.c == l9gVar.e(c99VarM.b) ? l9gVar.Y.b : 0L;
        }
        return Pair.create(c99VarM, Long.valueOf(jLongValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        q29 q29Var;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    I((pm5) message.obj);
                    break;
                case 4:
                    S((b3c) message.obj);
                    break;
                case 5:
                    this.E0 = (j9e) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((o29) message.obj);
                    break;
                case 9:
                    i((o29) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    U(message.arg1 != 0);
                    break;
                case 13:
                    N((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    v4c v4cVar = (v4c) message.obj;
                    v4cVar.getClass();
                    K(v4cVar);
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    L((v4c) message.obj);
                    break;
                case 16:
                    b3c b3cVar = (b3c) message.obj;
                    n(b3cVar, b3cVar.a, true, false);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    O((jm5) message.obj);
                    break;
                case 18:
                    a((jm5) message.obj, message.arg1);
                    break;
                case 19:
                    u45.r(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (gze) message.obj);
                    break;
                case 21:
                    V((gze) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    Q(message.arg1 != 0);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    P(message.arg1 == 1);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.c == 1 && (q29Var = this.B0.i) != null) {
                e = e.a(q29Var.f.a);
            }
            if (e.s0 && this.W0 == null) {
                pai.e("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.W0 = e;
                vwf vwfVar = this.Z;
                twf twfVarA = vwfVar.a(25, e);
                Handler handler = vwfVar.a;
                Message message2 = twfVarA.a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                twfVarA.a();
            } else {
                ExoPlaybackException exoPlaybackException = this.W0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.W0;
                }
                pai.c("ExoPlayerImplInternal", "Playback error", e);
                a0(true, false);
                this.F0 = this.F0.e(e);
            }
        } catch (ParserException e2) {
            boolean z = e2.a;
            int i2 = e2.b;
            if (i2 == 1) {
                i = z ? 3001 : 3003;
            } else {
                if (i2 == 4) {
                    i = z ? 3002 : 3004;
                }
                j(i, e2);
            }
            i = i;
            j(i, e2);
        } catch (DrmSession$DrmSessionException e3) {
            j(e3.a, e3);
        } catch (BehindLiveWindowException e4) {
            j(1002, e4);
        } catch (DataSourceException e5) {
            j(e5.a, e5);
        } catch (IOException e6) {
            j(2000, e6);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            pai.c("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            a0(true, false);
            this.F0 = this.F0.e(exoPlaybackException2);
        }
        t();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [iee, java.lang.Object] */
    public final void i(o29 o29Var) {
        q29 q29Var = this.B0.j;
        if (q29Var == null || q29Var.a != o29Var) {
            return;
        }
        long j = this.T0;
        if (q29Var != null) {
            fsi.d(q29Var.l == null);
            if (q29Var.d) {
                q29Var.a.p(j - q29Var.o);
            }
        }
        s();
    }

    public final void j(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        q29 q29Var = this.B0.h;
        if (q29Var != null) {
            exoPlaybackException = exoPlaybackException.a(q29Var.f.a);
        }
        pai.c("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        a0(false, false);
        this.F0 = this.F0.e(exoPlaybackException);
    }

    public final void k(boolean z) {
        q29 q29Var = this.B0.j;
        c99 c99Var = q29Var == null ? this.F0.b : q29Var.f.a;
        boolean zEquals = this.F0.k.equals(c99Var);
        if (!zEquals) {
            this.F0 = this.F0.a(c99Var);
        }
        z2c z2cVar = this.F0;
        z2cVar.q = q29Var == null ? z2cVar.s : q29Var.d();
        z2c z2cVar2 = this.F0;
        long j = z2cVar2.q;
        q29 q29Var2 = this.B0.j;
        z2cVar2.r = q29Var2 != null ? Math.max(0L, j - (this.T0 - q29Var2.o)) : 0L;
        if ((!zEquals || z) && q29Var != null && q29Var.d) {
            d0(q29Var.n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0215 A[PHI: r4
  0x0215: PHI (r4v29 long) = (r4v28 long), (r4v33 long) binds: [B:101:0x020b, B:104:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0303 A[Catch: all -> 0x0309, TRY_ENTER, TryCatch #5 {all -> 0x0309, blocks: (B:166:0x0303, B:179:0x0321, B:181:0x032b, B:183:0x0331, B:185:0x033b, B:186:0x0348), top: B:270:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r19v13, types: [c99, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [v29] */
    /* JADX WARN: Type inference failed for: r39v0, types: [rm5] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v40, types: [r9g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.r9g r40, boolean r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.l(r9g, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o29] */
    public final void m(o29 o29Var) throws ExoPlaybackException {
        v29 v29Var = this.B0;
        q29 q29Var = v29Var.j;
        if (q29Var == null || q29Var.a != o29Var) {
            return;
        }
        float f = this.x0.c().a;
        r9g r9gVar = this.F0.a;
        q29Var.d = true;
        q29Var.m = q29Var.a.l();
        ggg gggVarG = q29Var.g(f, r9gVar);
        t29 t29Var = q29Var.f;
        long jMax = t29Var.b;
        long j = t29Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = q29Var.a(gggVarG, jMax, false, new boolean[q29Var.i.length]);
        long j2 = q29Var.o;
        t29 t29Var2 = q29Var.f;
        q29Var.o = (t29Var2.b - jA) + j2;
        q29Var.f = t29Var2.b(jA);
        d0(q29Var.n);
        if (q29Var == v29Var.h) {
            C(q29Var.f.b);
            f(new boolean[this.a.length]);
            z2c z2cVar = this.F0;
            c99 c99Var = z2cVar.b;
            long j3 = q29Var.f.b;
            this.F0 = o(c99Var, j3, z2cVar.c, j3, false, 5);
        }
        s();
    }

    public final void n(b3c b3cVar, float f, boolean z, boolean z2) {
        b3c b3cVar2;
        int i;
        if (z) {
            if (z2) {
                this.G0.a(1);
            }
            z2c z2cVar = this.F0;
            z2c z2cVar2 = new z2c(z2cVar.a, z2cVar.b, z2cVar.c, z2cVar.d, z2cVar.e, z2cVar.f, z2cVar.g, z2cVar.h, z2cVar.i, z2cVar.j, z2cVar.k, z2cVar.l, z2cVar.m, b3cVar, z2cVar.q, z2cVar.r, z2cVar.s, z2cVar.o, z2cVar.p);
            b3cVar2 = b3cVar;
            this.F0 = z2cVar2;
        } else {
            b3cVar2 = b3cVar;
        }
        float f2 = b3cVar2.a;
        q29 q29Var = this.B0.h;
        while (true) {
            i = 0;
            if (q29Var == null) {
                break;
            }
            an5[] an5VarArr = (an5[]) q29Var.n.o;
            int length = an5VarArr.length;
            while (i < length) {
                an5 an5Var = an5VarArr[i];
                if (an5Var != null) {
                    an5Var.l(f2);
                }
                i++;
            }
            q29Var = q29Var.l;
        }
        sk0[] sk0VarArr = this.a;
        int length2 = sk0VarArr.length;
        while (i < length2) {
            sk0 sk0Var = sk0VarArr[i];
            if (sk0Var != null) {
                sk0Var.w(f, b3cVar2.a);
            }
            i++;
        }
    }

    public final z2c o(c99 c99Var, long j, long j2, long j3, boolean z, int i) {
        zjd zjdVarI;
        this.V0 = (!this.V0 && j == this.F0.s && c99Var.equals(this.F0.b)) ? false : true;
        B();
        z2c z2cVar = this.F0;
        mfg mfgVar = z2cVar.h;
        ggg gggVar = z2cVar.i;
        List list = z2cVar.j;
        if (this.C0.e) {
            q29 q29Var = this.B0.h;
            mfgVar = q29Var == null ? mfg.d : q29Var.m;
            gggVar = q29Var == null ? this.o : q29Var.n;
            an5[] an5VarArr = (an5[]) gggVar.o;
            tg7 tg7Var = new tg7(4);
            boolean z2 = false;
            for (an5 an5Var : an5VarArr) {
                if (an5Var != null) {
                    sy9 sy9Var = an5Var.d(0).t0;
                    if (sy9Var == null) {
                        tg7Var.a(new sy9(new qy9[0]));
                    } else {
                        tg7Var.a(sy9Var);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                zjdVarI = tg7Var.i();
            } else {
                t76 t76Var = wg7.b;
                zjdVarI = zjd.o;
            }
            list = zjdVarI;
            if (q29Var != null) {
                t29 t29Var = q29Var.f;
                if (t29Var.c != j2) {
                    q29Var.f = t29Var.a(j2);
                }
            }
        } else if (!c99Var.equals(z2cVar.b)) {
            mfgVar = mfg.d;
            gggVar = this.o;
            list = zjd.o;
        }
        mfg mfgVar2 = mfgVar;
        ggg gggVar2 = gggVar;
        List list2 = list;
        if (z) {
            mm5 mm5Var = this.G0;
            if (!mm5Var.d || mm5Var.e == 5) {
                mm5Var.a = true;
                mm5Var.d = true;
                mm5Var.e = i;
            } else {
                fsi.b(i == 5);
            }
        }
        z2c z2cVar2 = this.F0;
        long j4 = z2cVar2.q;
        q29 q29Var2 = this.B0.j;
        return z2cVar2.b(c99Var, j, j2, j3, q29Var2 == null ? 0L : Math.max(0L, j4 - (this.T0 - q29Var2.o)), mfgVar2, gggVar2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [iee, java.lang.Object] */
    public final boolean p() {
        q29 q29Var = this.B0.j;
        if (q29Var == null) {
            return false;
        }
        return (!q29Var.d ? 0L : q29Var.a.d()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        q29 q29Var = this.B0.h;
        long j = q29Var.f.e;
        if (q29Var.d) {
            return j == -9223372036854775807L || this.F0.s < j || !X();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [iee, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [iee, java.lang.Object] */
    public final void s() {
        int i;
        boolean z;
        v29 v29Var = this.B0;
        if (p()) {
            q29 q29Var = v29Var.j;
            long jD = !q29Var.d ? 0L : q29Var.a.d();
            q29 q29Var2 = this.B0.j;
            long jMax = q29Var2 != null ? Math.max(0L, jD - (this.T0 - q29Var2.o)) : 0L;
            ao4 ao4Var = this.X;
            float f = this.x0.c().a;
            long j = ao4Var.c;
            qi4 qi4Var = ao4Var.a;
            synchronized (qi4Var) {
                i = qi4Var.d * qi4Var.b;
            }
            boolean z2 = i >= ao4Var.h;
            long jMin = ao4Var.b;
            if (f > 1.0f) {
                jMin = Math.min(xxg.r(f, jMin), j);
            }
            if (jMax < Math.max(jMin, 500000L)) {
                ao4Var.i = !z2;
                if (z2 && jMax < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (jMax >= j || z2) {
                ao4Var.i = false;
            }
            z = ao4Var.i;
        } else {
            z = false;
        }
        this.L0 = z;
        if (z) {
            q29 q29Var3 = v29Var.j;
            long j2 = this.T0;
            fsi.d(q29Var3.l == null);
            q29Var3.a.z(j2 - q29Var3.o);
        }
        c0();
    }

    public final void t() {
        mm5 mm5Var = this.G0;
        z2c z2cVar = this.F0;
        boolean z = mm5Var.a | (mm5Var.b != z2cVar);
        mm5Var.a = z;
        mm5Var.b = z2cVar;
        if (z) {
            dm5 dm5Var = this.A0.a;
            dm5Var.t0.a.post(new kr4(dm5Var, 26, mm5Var));
            this.G0 = new mm5(this.F0);
        }
    }

    public final void u() throws Throwable {
        l(this.C0.f(), true);
    }

    public final void v() {
        this.G0.a(1);
        throw null;
    }

    public final void w() {
        this.G0.a(1);
        A(false, false, false, true);
        this.X.b(false);
        W(this.F0.a.p() ? 4 : 2);
        dk4 dk4Var = (dk4) this.Y;
        dk4Var.getClass();
        y87 y87Var = this.C0;
        ArrayList arrayList = (ArrayList) y87Var.g;
        fsi.d(!y87Var.e);
        y87Var.n = dk4Var;
        for (int i = 0; i < arrayList.size(); i++) {
            y99 y99Var = (y99) arrayList.get(i);
            y87Var.m(y99Var);
            ((HashSet) y87Var.l).add(y99Var);
        }
        y87Var.e = true;
        this.Z.c(2);
    }

    public final void x() {
        A(true, false, true, false);
        this.X.b(true);
        W(1);
        this.s0.quit();
        synchronized (this) {
            this.H0 = true;
            notifyAll();
        }
    }

    public final void y(int i, int i2, gze gzeVar) throws Throwable {
        this.G0.a(1);
        y87 y87Var = this.C0;
        y87Var.getClass();
        fsi.b(i >= 0 && i <= i2 && i2 <= ((ArrayList) y87Var.g).size());
        y87Var.m = gzeVar;
        y87Var.t(i, i2);
        l(y87Var.f(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void z() throws ExoPlaybackException {
        int i;
        boolean z;
        float f = this.x0.c().a;
        v29 v29Var = this.B0;
        q29 q29Var = v29Var.h;
        q29 q29Var2 = v29Var.i;
        boolean z2 = true;
        for (q29 q29Var3 = q29Var; q29Var3 != null && q29Var3.d; q29Var3 = q29Var3.l) {
            ggg gggVarG = q29Var3.g(f, this.F0.a);
            ggg gggVar = q29Var3.n;
            an5[] an5VarArr = (an5[]) gggVarG.o;
            boolean z3 = false;
            if (gggVar != null && ((an5[]) gggVar.o).length == an5VarArr.length) {
                for (int i2 = 0; i2 < an5VarArr.length; i2++) {
                    if (gggVarG.Q(gggVar, i2)) {
                    }
                }
                if (q29Var3 == q29Var2) {
                    z2 = false;
                }
            }
            if (z2) {
                v29 v29Var2 = this.B0;
                q29 q29Var4 = v29Var2.h;
                boolean zK = v29Var2.k(q29Var4);
                boolean[] zArr = new boolean[this.a.length];
                long jA = q29Var4.a(gggVarG, this.F0.s, zK, zArr);
                z2c z2cVar = this.F0;
                if (z2cVar.e == 4 || jA == z2cVar.s) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                z2c z2cVar2 = this.F0;
                boolean z4 = z;
                i = 4;
                this.F0 = o(z2cVar2.b, jA, z2cVar2.c, z2cVar2.d, z3, 5);
                if (z3) {
                    C(jA);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                ?? r8 = z4;
                while (true) {
                    sk0[] sk0VarArr = this.a;
                    if (r8 >= sk0VarArr.length) {
                        break;
                    }
                    sk0 sk0Var = sk0VarArr[r8];
                    boolean zQ = q(sk0Var);
                    zArr2[r8] = zQ;
                    ixd ixdVar = q29Var4.c[r8];
                    if (zQ) {
                        if (ixdVar != sk0Var.Y) {
                            d(sk0Var);
                        } else if (zArr[r8]) {
                            long j = this.T0;
                            sk0Var.u0 = z4;
                            sk0Var.t0 = j;
                            sk0Var.l(j, z4);
                        }
                    }
                    r8++;
                }
                f(zArr2);
            } else {
                i = 4;
                this.B0.k(q29Var3);
                if (q29Var3.d) {
                    q29Var3.a(gggVarG, Math.max(q29Var3.f.b, this.T0 - q29Var3.o), false, new boolean[q29Var3.i.length]);
                }
            }
            k(true);
            if (this.F0.e != i) {
                s();
                e0();
                this.Z.c(2);
                return;
            }
            return;
        }
    }
}
