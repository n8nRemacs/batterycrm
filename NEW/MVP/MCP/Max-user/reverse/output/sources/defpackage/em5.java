package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class em5 extends i3 {
    public final ArrayList A0;
    public final boolean B0;
    public final b99 C0;
    public final nj4 D0;
    public final Looper E0;
    public final dh0 F0;
    public final long G0;
    public final long H0;
    public final long I0;
    public final yl5 J0;
    public final am5 K0;
    public final dl6 L0;
    public final xn3 M0;
    public final xn3 N0;
    public final long O0;
    public final a9 P0;
    public int Q0;
    public boolean R0;
    public int S0;
    public int T0;
    public boolean U0;
    public final x3e V0;
    public k9e W0;
    public final Context X;
    public hze X0;
    public final em5 Y;
    public o3c Y0;
    public final tk0[] Z;
    public w19 Z0;
    public w19 a1;
    public Object b1;
    public final ggg c;
    public Surface c1;
    public final o3c d;
    public final int d1;
    public c4f e1;
    public k20 f1;
    public float g1;
    public boolean h1;
    public ib4 i1;
    public final boolean j1;
    public boolean k1;
    public final int l1;
    public lk6 m1;
    public boolean n1;
    public final yn3 o;
    public boolean o1;
    public final mv4 p1;
    public sch q1;
    public w19 r1;
    public final tk0[] s0;
    public a3c s1;
    public final oo8 t0;
    public int t1;
    public final wwf u0;
    public long u1;
    public final ql5 v0;
    public final sm5 w0;
    public final ua8 x0;
    public final CopyOnWriteArraySet y0;
    public final m9g z0;

    static {
        e19.a("media3.exoplayer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em5(hl5 hl5Var) throws Throwable {
        em5 em5Var;
        Context context;
        Looper looper;
        mwf mwfVar;
        wwf wwfVar;
        Looper looper2;
        em5 em5Var2;
        wwf wwfVarA;
        ul5 ul5Var;
        super(3);
        int i = 0;
        this.o = new yn3();
        try {
            a8i.j("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + zxg.a + "]");
            context = hl5Var.a;
            this.X = context.getApplicationContext();
            dm4 dm4Var = hl5Var.h;
            mwf mwfVar2 = hl5Var.b;
            dm4Var.getClass();
            this.D0 = new nj4(mwfVar2);
            this.l1 = hl5Var.j;
            this.m1 = null;
            this.f1 = hl5Var.k;
            this.d1 = hl5Var.l;
            this.h1 = false;
            this.O0 = hl5Var.u;
            yl5 yl5Var = new yl5(this);
            this.J0 = yl5Var;
            this.K0 = new am5();
            Handler handler = new Handler(hl5Var.i);
            vld vldVar = (vld) hl5Var.c.get();
            tk0[] tk0VarArrB = vldVar.b(handler, yl5Var, yl5Var, yl5Var, yl5Var);
            this.Z = tk0VarArrB;
            int i2 = 1;
            hsi.g(tk0VarArrB.length > 0);
            this.s0 = new tk0[tk0VarArrB.length];
            int i3 = 0;
            while (true) {
                tk0[] tk0VarArr = this.s0;
                if (i3 >= tk0VarArr.length) {
                    break;
                }
                vldVar.a(this.Z[i3]);
                tk0VarArr[i3] = null;
                i3++;
            }
            oo8 oo8Var = (oo8) hl5Var.e.get();
            this.t0 = oo8Var;
            this.C0 = (b99) hl5Var.d.get();
            dh0 dh0Var = (dh0) hl5Var.g.get();
            this.F0 = dh0Var;
            this.B0 = hl5Var.m;
            this.W0 = hl5Var.n;
            this.G0 = hl5Var.p;
            this.H0 = hl5Var.q;
            this.I0 = hl5Var.r;
            this.V0 = hl5Var.o;
            looper = hl5Var.i;
            this.E0 = looper;
            mwfVar = hl5Var.b;
            this.Y = this;
            this.x0 = new ua8(looper, mwfVar, new ql5(this, i));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.y0 = copyOnWriteArraySet;
            this.A0 = new ArrayList();
            this.X0 = new hze();
            tk0[] tk0VarArr2 = this.Z;
            ggg gggVar = new ggg(new kld[tk0VarArr2.length], new bn5[tk0VarArr2.length], kgg.b, (Object) null);
            this.c = gggVar;
            this.z0 = new m9g();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            while (i < length) {
                int i4 = iArr[i];
                hsi.g(!false);
                sparseBooleanArray.append(i4, true);
                i++;
            }
            oo8Var.getClass();
            hsi.g(!false);
            sparseBooleanArray.append(29, true);
            hsi.g(!false);
            a26 a26Var = new a26(sparseBooleanArray);
            this.d = new o3c(a26Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i5 = 0; i5 < a26Var.a.size(); i5++) {
                int iB = a26Var.b(i5);
                hsi.g(!false);
                sparseBooleanArray2.append(iB, true);
            }
            hsi.g(!false);
            sparseBooleanArray2.append(4, true);
            hsi.g(!false);
            sparseBooleanArray2.append(10, true);
            hsi.g(!false);
            this.Y0 = new o3c(new a26(sparseBooleanArray2));
            this.u0 = mwfVar.a(looper, null);
            ql5 ql5Var = new ql5(this, i2);
            this.v0 = ql5Var;
            this.s1 = a3c.k(gggVar);
            this.D0.J(this, looper);
            n4c n4cVar = new n4c(hl5Var.y);
            sm5 sm5Var = new sm5(this.X, this.Z, this.s0, oo8Var, gggVar, (jb8) hl5Var.f.get(), dh0Var, this.Q0, this.R0, this.D0, this.W0, hl5Var.s, hl5Var.t, looper, mwfVar, ql5Var, n4cVar, hl5Var.w, this.K0);
            wwfVar = sm5Var.Z;
            this.w0 = sm5Var;
            looper2 = sm5Var.t0;
            this.g1 = 1.0f;
            this.Q0 = 0;
            w19 w19Var = w19.K;
            this.Z0 = w19Var;
            this.a1 = w19Var;
            this.r1 = w19Var;
            this.t1 = -1;
            this.i1 = ib4.d;
            this.j1 = true;
            nj4 nj4Var = this.D0;
            ua8 ua8Var = this.x0;
            nj4Var.getClass();
            ua8Var.a(nj4Var);
            dh0Var.g(new Handler(looper), this.D0);
            copyOnWriteArraySet.add(this.J0);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Context context2 = this.X;
                    boolean z = hl5Var.v;
                    wwfVarA = mwfVar.a(sm5Var.t0, null);
                    ul5Var = new ul5(context2, z, this, n4cVar, 0);
                    em5Var2 = this;
                } catch (Throwable th) {
                    th = th;
                    em5Var2 = this;
                    em5Var = em5Var2;
                    em5Var.o.f();
                    throw th;
                }
                try {
                    wwfVarA.d(ul5Var);
                } catch (Throwable th2) {
                    th = th2;
                    em5Var = em5Var2;
                    em5Var.o.f();
                    throw th;
                }
            } else {
                em5Var2 = this;
            }
            em5Var = em5Var2;
        } catch (Throwable th3) {
            th = th3;
            em5Var = this;
        }
        try {
            a9 a9Var = new a9(0, looper2, looper, mwfVar, new ql5(em5Var2, 2));
            em5Var.P0 = a9Var;
            a9Var.D(new qj4(25, em5Var));
            Context context3 = hl5Var.a;
            Looper looper3 = hl5Var.i;
            yl5 yl5Var2 = em5Var.J0;
            dl6 dl6Var = new dl6();
            dl6Var.b = context3.getApplicationContext();
            dl6Var.d = mwfVar.a(looper2, null);
            dl6Var.c = new o20(dl6Var, mwfVar.a(looper3, null), yl5Var2);
            em5Var.L0 = dl6Var;
            dl6Var.t();
            em5Var.M0 = new xn3(context, looper2, mwfVar, 13);
            em5Var.N0 = new xn3(context, looper2, mwfVar, 14);
            em5Var.p1 = mv4.e;
            em5Var.q1 = sch.d;
            em5Var.e1 = c4f.c;
            wwfVar.a(38, em5Var.V0).b();
            wwfVar.b(em5Var.f1, 31, 0, 0).b();
            em5Var.m1(1, 3, em5Var.f1);
            em5Var.m1(2, 4, Integer.valueOf(em5Var.d1));
            em5Var.m1(2, 5, 0);
            em5Var.m1(1, 9, Boolean.valueOf(em5Var.h1));
            em5Var.m1(6, 8, em5Var.K0);
            em5Var.m1(-1, 16, Integer.valueOf(em5Var.l1));
            em5Var.o.f();
        } catch (Throwable th4) {
            th = th4;
            em5Var.o.f();
            throw th;
        }
    }

    public static long Z0(a3c a3cVar) {
        q9g q9gVar = new q9g();
        m9g m9gVar = new m9g();
        a3cVar.a.g(a3cVar.b.a, m9gVar);
        long j = a3cVar.c;
        return j == -9223372036854775807L ? a3cVar.a.m(m9gVar.c, q9gVar, 0L).l : m9gVar.e + j;
    }

    public static a3c c1(a3c a3cVar, int i) {
        a3c a3cVarH = a3cVar.h(i);
        return (i == 1 || i == 4) ? a3cVarH.b(false) : a3cVarH;
    }

    @Override // defpackage.u3c
    public final void A(int i, long j, List list) {
        A1();
        ArrayList arrayListR0 = R0(list);
        A1();
        n1(arrayListR0, i, j, false);
    }

    public final void A1() {
        this.o.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.E0;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zxg.a;
            Locale locale = Locale.US;
            String strJ = wy1.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.j1) {
                throw new IllegalStateException(strJ);
            }
            a8i.m("ExoPlayerImpl", strJ, this.k1 ? null : new IllegalStateException());
            this.k1 = true;
        }
    }

    @Override // defpackage.u3c
    public final void C(List list) {
        A1();
        ArrayList arrayListR0 = R0(list);
        A1();
        n1(arrayListR0, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.i3
    public final void E0(int i, long j, boolean z) {
        A1();
        if (i == -1) {
            return;
        }
        hsi.b(i >= 0);
        s9g s9gVar = this.s1.a;
        if (s9gVar.p() || i < s9gVar.o()) {
            nj4 nj4Var = this.D0;
            if (!nj4Var.s0) {
                id idVarD = nj4Var.D();
                nj4Var.s0 = true;
                nj4Var.I(idVarD, -1, new ej4(3));
            }
            this.S0++;
            if (f()) {
                a8i.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                nm5 nm5Var = new nm5(this.s1);
                nm5Var.d(1);
                em5 em5Var = this.v0.b;
                em5Var.u0.d(new kr4(em5Var, 25, nm5Var));
                return;
            }
            a3c a3cVarH = this.s1;
            int i2 = a3cVarH.e;
            if (i2 == 3 || (i2 == 4 && !s9gVar.p())) {
                a3cVarH = this.s1.h(2);
            }
            int iT = t();
            a3c a3cVarD1 = d1(a3cVarH, s9gVar, e1(s9gVar, i, j));
            this.w0.Z.a(3, new qm5(s9gVar, i, zxg.U(j))).b();
            y1(a3cVarD1, 0, true, 1, V0(a3cVarD1), iT, z);
        }
    }

    public final void L0(jd jdVar) {
        nj4 nj4Var = this.D0;
        nj4Var.getClass();
        nj4Var.X.a(jdVar);
    }

    public final void M0(int i, List list) {
        A1();
        ArrayList arrayListR0 = R0(list);
        A1();
        hsi.b(i >= 0);
        ArrayList arrayList = this.A0;
        int iMin = Math.min(i, arrayList.size());
        if (!arrayList.isEmpty()) {
            y1(O0(this.s1, iMin, arrayListR0), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.t1 == -1;
        A1();
        n1(arrayListR0, -1, -9223372036854775807L, z);
    }

    public final ArrayList N0(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            z99 z99Var = new z99((ck0) list.get(i2), this.B0);
            arrayList.add(z99Var);
            cm5 cm5Var = new cm5(z99Var.b, z99Var.a);
            this.A0.add(i2 + i, cm5Var);
        }
        this.X0 = this.X0.b(i, arrayList.size());
        return arrayList;
    }

    public final a3c O0(a3c a3cVar, int i, ArrayList arrayList) {
        s9g s9gVar = a3cVar.a;
        this.S0++;
        ArrayList arrayListN0 = N0(i, arrayList);
        h5c h5cVar = new h5c(this.A0, this.X0);
        a3c a3cVarD1 = d1(a3cVar, h5cVar, X0(s9gVar, h5cVar, W0(a3cVar), U0(a3cVar)));
        this.w0.Z.b(new km5(arrayListN0, this.X0, -1, -9223372036854775807L), 18, i, 0).b();
        return a3cVarD1;
    }

    public final w19 P0() {
        s9g s9gVarV = v();
        if (s9gVarV.p()) {
            return this.r1;
        }
        k09 k09Var = s9gVarV.m(t(), (q9g) this.b, 0L).c;
        u19 u19VarA = this.r1.a();
        w19 w19Var = k09Var.d;
        if (w19Var != null) {
            wg7 wg7Var = w19Var.J;
            byte[] bArr = w19Var.k;
            CharSequence charSequence = w19Var.a;
            if (charSequence != null) {
                u19VarA.a = charSequence;
            }
            CharSequence charSequence2 = w19Var.b;
            if (charSequence2 != null) {
                u19VarA.b = charSequence2;
            }
            CharSequence charSequence3 = w19Var.c;
            if (charSequence3 != null) {
                u19VarA.c = charSequence3;
            }
            CharSequence charSequence4 = w19Var.d;
            if (charSequence4 != null) {
                u19VarA.d = charSequence4;
            }
            CharSequence charSequence5 = w19Var.e;
            if (charSequence5 != null) {
                u19VarA.e = charSequence5;
            }
            CharSequence charSequence6 = w19Var.f;
            if (charSequence6 != null) {
                u19VarA.f = charSequence6;
            }
            CharSequence charSequence7 = w19Var.g;
            if (charSequence7 != null) {
                u19VarA.g = charSequence7;
            }
            Long l = w19Var.h;
            if (l != null) {
                u19VarA.c(l);
            }
            g8d g8dVar = w19Var.i;
            if (g8dVar != null) {
                u19VarA.i = g8dVar;
            }
            g8d g8dVar2 = w19Var.j;
            if (g8dVar2 != null) {
                u19VarA.j = g8dVar2;
            }
            Uri uri = w19Var.m;
            if (uri != null || bArr != null) {
                u19VarA.m = uri;
                u19VarA.b(bArr, w19Var.l);
            }
            Integer num = w19Var.n;
            if (num != null) {
                u19VarA.n = num;
            }
            Integer num2 = w19Var.o;
            if (num2 != null) {
                u19VarA.o = num2;
            }
            Integer num3 = w19Var.p;
            if (num3 != null) {
                u19VarA.p = num3;
            }
            Boolean bool = w19Var.q;
            if (bool != null) {
                u19VarA.q = bool;
            }
            Boolean bool2 = w19Var.r;
            if (bool2 != null) {
                u19VarA.r = bool2;
            }
            Integer num4 = w19Var.s;
            if (num4 != null) {
                u19VarA.s = num4;
            }
            Integer num5 = w19Var.t;
            if (num5 != null) {
                u19VarA.s = num5;
            }
            Integer num6 = w19Var.u;
            if (num6 != null) {
                u19VarA.t = num6;
            }
            Integer num7 = w19Var.v;
            if (num7 != null) {
                u19VarA.u = num7;
            }
            Integer num8 = w19Var.w;
            if (num8 != null) {
                u19VarA.v = num8;
            }
            Integer num9 = w19Var.x;
            if (num9 != null) {
                u19VarA.w = num9;
            }
            Integer num10 = w19Var.y;
            if (num10 != null) {
                u19VarA.x = num10;
            }
            CharSequence charSequence8 = w19Var.z;
            if (charSequence8 != null) {
                u19VarA.y = charSequence8;
            }
            CharSequence charSequence9 = w19Var.A;
            if (charSequence9 != null) {
                u19VarA.z = charSequence9;
            }
            CharSequence charSequence10 = w19Var.B;
            if (charSequence10 != null) {
                u19VarA.A = charSequence10;
            }
            Integer num11 = w19Var.C;
            if (num11 != null) {
                u19VarA.B = num11;
            }
            Integer num12 = w19Var.D;
            if (num12 != null) {
                u19VarA.C = num12;
            }
            CharSequence charSequence11 = w19Var.E;
            if (charSequence11 != null) {
                u19VarA.D = charSequence11;
            }
            CharSequence charSequence12 = w19Var.F;
            if (charSequence12 != null) {
                u19VarA.E = charSequence12;
            }
            CharSequence charSequence13 = w19Var.G;
            if (charSequence13 != null) {
                u19VarA.F = charSequence13;
            }
            Integer num13 = w19Var.H;
            if (num13 != null) {
                u19VarA.G = num13;
            }
            Bundle bundle = w19Var.I;
            if (bundle != null) {
                u19VarA.H = bundle;
            }
            if (!wg7Var.isEmpty()) {
                u19VarA.I = wg7.j(wg7Var);
            }
        }
        return new w19(u19VarA);
    }

    public final void Q0() {
        A1();
        r1(null);
        f1(0, 0);
    }

    public final ArrayList R0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.C0.a((k09) list.get(i)));
        }
        return arrayList;
    }

    public final long S0() {
        A1();
        if (!f()) {
            return T0();
        }
        a3c a3cVar = this.s1;
        return a3cVar.k.equals(a3cVar.b) ? zxg.m0(this.s1.q) : getDuration();
    }

    public final long T0() {
        A1();
        if (this.s1.a.p()) {
            return this.u1;
        }
        a3c a3cVar = this.s1;
        if (a3cVar.k.d != a3cVar.b.d) {
            return zxg.m0(a3cVar.a.m(t(), (q9g) this.b, 0L).m);
        }
        long j = a3cVar.q;
        if (this.s1.k.b()) {
            a3c a3cVar2 = this.s1;
            m9g m9gVarG = a3cVar2.a.g(a3cVar2.k.a, this.z0);
            long jD = m9gVarG.d(this.s1.k.b);
            j = jD == Long.MIN_VALUE ? m9gVarG.d : jD;
        }
        a3c a3cVar3 = this.s1;
        s9g s9gVar = a3cVar3.a;
        Object obj = a3cVar3.k.a;
        m9g m9gVar = this.z0;
        s9gVar.g(obj, m9gVar);
        return zxg.m0(j + m9gVar.e);
    }

    public final long U0(a3c a3cVar) {
        d99 d99Var = a3cVar.b;
        long j = a3cVar.c;
        s9g s9gVar = a3cVar.a;
        if (!d99Var.b()) {
            return zxg.m0(V0(a3cVar));
        }
        Object obj = a3cVar.b.a;
        m9g m9gVar = this.z0;
        s9gVar.g(obj, m9gVar);
        if (j == -9223372036854775807L) {
            return zxg.m0(s9gVar.m(W0(a3cVar), (q9g) this.b, 0L).l);
        }
        return zxg.m0(j) + zxg.m0(m9gVar.e);
    }

    public final long V0(a3c a3cVar) {
        if (a3cVar.a.p()) {
            return zxg.U(this.u1);
        }
        long jL = a3cVar.p ? a3cVar.l() : a3cVar.s;
        if (a3cVar.b.b()) {
            return jL;
        }
        s9g s9gVar = a3cVar.a;
        Object obj = a3cVar.b.a;
        m9g m9gVar = this.z0;
        s9gVar.g(obj, m9gVar);
        return jL + m9gVar.e;
    }

    public final int W0(a3c a3cVar) {
        return a3cVar.a.p() ? this.t1 : a3cVar.a.g(a3cVar.b.a, this.z0).c;
    }

    public final Pair X0(s9g s9gVar, h5c h5cVar, int i, long j) {
        if (s9gVar.p() || h5cVar.p()) {
            boolean z = !s9gVar.p() && h5cVar.p();
            return e1(h5cVar, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair pairI = s9gVar.i((q9g) this.b, this.z0, i, zxg.U(j));
        Object obj = pairI.first;
        if (h5cVar.b(obj) != -1) {
            return pairI;
        }
        int iT = sm5.T((q9g) this.b, this.z0, this.Q0, this.R0, obj, s9gVar, h5cVar);
        if (iT == -1) {
            return e1(h5cVar, -1, -9223372036854775807L);
        }
        q9g q9gVar = (q9g) this.b;
        h5cVar.m(iT, q9gVar, 0L);
        return e1(h5cVar, iT, zxg.m0(q9gVar.l));
    }

    public final c3c Y0() {
        A1();
        return this.s1.o;
    }

    @Override // defpackage.u3c
    public final float a() {
        A1();
        return this.g1;
    }

    public final egg a1() {
        A1();
        return ((ar4) this.t0).e();
    }

    public final boolean b1() {
        A1();
        return this.s1.g;
    }

    public final a3c d1(a3c a3cVar, s9g s9gVar, Pair pair) {
        List list;
        hsi.b(s9gVar.p() || pair != null);
        s9g s9gVar2 = a3cVar.a;
        long jU0 = U0(a3cVar);
        a3c a3cVarJ = a3cVar.j(s9gVar);
        if (s9gVar.p()) {
            d99 d99Var = a3c.u;
            long jU = zxg.U(this.u1);
            a3c a3cVarC = a3cVarJ.d(d99Var, jU, jU, jU, 0L, nfg.d, this.c, zjd.o).c(d99Var);
            a3cVarC.q = a3cVarC.s;
            return a3cVarC;
        }
        Object obj = a3cVarJ.b.a;
        String str = zxg.a;
        boolean zEquals = obj.equals(pair.first);
        d99 d99Var2 = !zEquals ? new d99(pair.first) : a3cVarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jU2 = zxg.U(jU0);
        if (!s9gVar2.p()) {
            jU2 -= s9gVar2.g(obj, this.z0).e;
        }
        if (!zEquals || jLongValue < jU2) {
            d99 d99Var3 = d99Var2;
            hsi.g(!d99Var3.b());
            nfg nfgVar = !zEquals ? nfg.d : a3cVarJ.h;
            ggg gggVar = !zEquals ? this.c : a3cVarJ.i;
            if (zEquals) {
                list = a3cVarJ.j;
            } else {
                t76 t76Var = wg7.b;
                list = zjd.o;
            }
            a3c a3cVarC2 = a3cVarJ.d(d99Var3, jLongValue, jLongValue, jLongValue, 0L, nfgVar, gggVar, list).c(d99Var3);
            a3cVarC2.q = jLongValue;
            return a3cVarC2;
        }
        if (jLongValue != jU2) {
            d99 d99Var4 = d99Var2;
            hsi.g(!d99Var4.b());
            long jMax = Math.max(0L, a3cVarJ.r - (jLongValue - jU2));
            long j = a3cVarJ.q;
            if (a3cVarJ.k.equals(a3cVarJ.b)) {
                j = jLongValue + jMax;
            }
            a3c a3cVarD = a3cVarJ.d(d99Var4, jLongValue, jLongValue, jLongValue, jMax, a3cVarJ.h, a3cVarJ.i, a3cVarJ.j);
            a3cVarD.q = j;
            return a3cVarD;
        }
        int iB = s9gVar.b(a3cVarJ.k.a);
        if (iB != -1 && s9gVar.f(iB, this.z0, false).c == s9gVar.g(d99Var2.a, this.z0).c) {
            return a3cVarJ;
        }
        s9gVar.g(d99Var2.a, this.z0);
        long jA = d99Var2.b() ? this.z0.a(d99Var2.b, d99Var2.c) : this.z0.d;
        d99 d99Var5 = d99Var2;
        a3c a3cVarC3 = a3cVarJ.d(d99Var5, a3cVarJ.s, a3cVarJ.s, a3cVarJ.d, jA - a3cVarJ.s, a3cVarJ.h, a3cVarJ.i, a3cVarJ.j).c(d99Var5);
        a3cVarC3.q = jA;
        return a3cVarC3;
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long e() {
        A1();
        return zxg.m0(V0(this.s1));
    }

    public final Pair e1(s9g s9gVar, int i, long j) {
        if (s9gVar.p()) {
            this.t1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.u1 = j;
            return null;
        }
        if (i == -1 || i >= s9gVar.o()) {
            i = s9gVar.a(this.R0);
            j = zxg.m0(s9gVar.m(i, (q9g) this.b, 0L).l);
        }
        return s9gVar.i((q9g) this.b, this.z0, i, zxg.U(j));
    }

    @Override // defpackage.i3, defpackage.u3c
    public final boolean f() {
        A1();
        return this.s1.b.b();
    }

    public final void f1(int i, int i2) {
        c4f c4fVar = this.e1;
        if (i == c4fVar.a && i2 == c4fVar.b) {
            return;
        }
        this.e1 = new c4f(i, i2);
        this.x0.f(24, new sl5(i, i2, 0));
        m1(2, 14, new c4f(i, i2));
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long g() {
        A1();
        return zxg.m0(this.s1.r);
    }

    public final void g1(int i, int i2, int i3) {
        A1();
        hsi.b(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        s9g s9gVarV = v();
        this.S0++;
        zxg.T(arrayList, i, iMin, iMin2);
        hze hzeVar = this.X0;
        hzeVar.getClass();
        this.X0 = hzeVar;
        h5c h5cVar = new h5c(arrayList, this.X0);
        a3c a3cVar = this.s1;
        a3c a3cVarD1 = d1(a3cVar, h5cVar, X0(s9gVarV, h5cVar, W0(a3cVar), U0(this.s1)));
        hze hzeVar2 = this.X0;
        sm5 sm5Var = this.w0;
        sm5Var.getClass();
        sm5Var.Z.a(19, new lm5(i, iMin, iMin2, hzeVar2)).b();
        y1(a3cVarD1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.u3c
    public final long getDuration() {
        A1();
        if (!f()) {
            return m0();
        }
        a3c a3cVar = this.s1;
        d99 d99Var = a3cVar.b;
        s9g s9gVar = a3cVar.a;
        Object obj = d99Var.a;
        m9g m9gVar = this.z0;
        s9gVar.g(obj, m9gVar);
        return zxg.m0(m9gVar.a(d99Var.b, d99Var.c));
    }

    @Override // defpackage.u3c
    public final int getPlaybackState() {
        A1();
        return this.s1.e;
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int getRepeatMode() {
        A1();
        return this.Q0;
    }

    public final void h1() {
        boolean zC;
        a8i.j("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + zxg.a + "] [" + e19.b() + "]");
        A1();
        this.L0.t();
        this.M0.f(false);
        this.N0.f(false);
        sm5 sm5Var = this.w0;
        if (sm5Var.S0 || !sm5Var.t0.getThread().isAlive()) {
            zC = true;
        } else {
            sm5Var.S0 = true;
            yn3 yn3Var = new yn3(sm5Var.A0);
            sm5Var.Z.a(7, yn3Var).b();
            zC = yn3Var.c(sm5Var.F0);
        }
        if (!zC) {
            this.x0.f(10, new dm4(24));
        }
        this.x0.d();
        this.u0.a.removeCallbacksAndMessages(null);
        this.F0.a(this.D0);
        a3c a3cVar = this.s1;
        if (a3cVar.p) {
            this.s1 = a3cVar.a();
        }
        a3c a3cVarC1 = c1(this.s1, 1);
        this.s1 = a3cVarC1;
        a3c a3cVarC = a3cVarC1.c(a3cVarC1.b);
        this.s1 = a3cVarC;
        a3cVarC.q = a3cVarC.s;
        this.s1.r = 0L;
        nj4 nj4Var = this.D0;
        wwf wwfVar = nj4Var.Z;
        hsi.h(wwfVar);
        wwfVar.d(new vy1(29, nj4Var));
        Surface surface = this.c1;
        if (surface != null) {
            surface.release();
            this.c1 = null;
        }
        if (this.n1) {
            lk6 lk6Var = this.m1;
            lk6Var.getClass();
            lk6Var.W(this.l1);
            this.n1 = false;
        }
        this.i1 = ib4.d;
        this.o1 = true;
    }

    @Override // defpackage.u3c
    public final boolean i() {
        A1();
        return this.s1.l;
    }

    public final void i1(r3c r3cVar) {
        A1();
        r3cVar.getClass();
        this.x0.e(r3cVar);
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int j() {
        A1();
        if (this.s1.a.p()) {
            return 0;
        }
        a3c a3cVar = this.s1;
        return a3cVar.a.b(a3cVar.b.a);
    }

    public final void j1(int i, int i2) {
        A1();
        hsi.b(i >= 0 && i2 >= i);
        int size = this.A0.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        a3c a3cVarK1 = k1(this.s1, i, iMin);
        y1(a3cVarK1, 0, !a3cVarK1.b.a.equals(this.s1.b.a), 4, V0(a3cVarK1), -1, false);
    }

    public final a3c k1(a3c a3cVar, int i, int i2) {
        int iW0 = W0(a3cVar);
        long jU0 = U0(a3cVar);
        s9g s9gVar = a3cVar.a;
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        this.S0++;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            arrayList.remove(i3);
        }
        this.X0 = this.X0.c(i, i2);
        h5c h5cVar = new h5c(arrayList, this.X0);
        a3c a3cVarD1 = d1(a3cVar, h5cVar, X0(s9gVar, h5cVar, iW0, jU0));
        int i4 = a3cVarD1.e;
        if (i4 != 1 && i4 != 4 && i < i2 && i2 == size && iW0 >= a3cVarD1.a.o()) {
            a3cVarD1 = c1(a3cVarD1, 4);
        }
        this.w0.Z.b(this.X0, 20, i, i2).b();
        return a3cVarD1;
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int l() {
        A1();
        if (f()) {
            return this.s1.b.c;
        }
        return -1;
    }

    public final void l1(List list, int i, int i2) {
        A1();
        hsi.b(i >= 0 && i2 >= i);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            for (int i3 = i; i3 < iMin; i3++) {
                if (((cm5) arrayList.get(i3)).b.k.a((k09) list.get(i3 - i))) {
                }
            }
            this.S0++;
            this.w0.Z.b(list, 27, i, iMin).b();
            for (int i4 = i; i4 < iMin; i4++) {
                cm5 cm5Var = (cm5) arrayList.get(i4);
                cm5Var.c = new f5c(cm5Var.c, (k09) list.get(i4 - i));
            }
            y1(this.s1.j(new h5c(arrayList, this.X0)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList arrayListR0 = R0(list);
        if (!arrayList.isEmpty()) {
            a3c a3cVarK1 = k1(O0(this.s1, iMin, arrayListR0), i, iMin);
            y1(a3cVarK1, 0, !a3cVarK1.b.a.equals(this.s1.b.a), 4, V0(a3cVarK1), -1, false);
        } else {
            boolean z = this.t1 == -1;
            A1();
            n1(arrayListR0, -1, -9223372036854775807L, z);
        }
    }

    public final void m1(int i, int i2, Object obj) {
        sm5 sm5Var;
        tk0[] tk0VarArr = this.Z;
        int length = tk0VarArr.length;
        int i3 = 0;
        while (true) {
            sm5Var = this.w0;
            if (i3 >= length) {
                break;
            }
            tk0 tk0Var = tk0VarArr[i3];
            if (i == -1 || tk0Var.b == i) {
                int iW0 = W0(this.s1);
                s9g s9gVar = this.s1.a;
                if (iW0 == -1) {
                    iW0 = 0;
                }
                w4c w4cVar = new w4c(sm5Var, tk0Var, s9gVar, iW0, sm5Var.t0);
                hsi.g(!w4cVar.f);
                w4cVar.c = i2;
                hsi.g(!w4cVar.f);
                w4cVar.d = obj;
                w4cVar.b();
            }
            i3++;
        }
        for (tk0 tk0Var2 : this.s0) {
            if (tk0Var2 != null && (i == -1 || tk0Var2.b == i)) {
                int iW02 = W0(this.s1);
                s9g s9gVar2 = this.s1.a;
                if (iW02 == -1) {
                    iW02 = 0;
                }
                w4c w4cVar2 = new w4c(sm5Var, tk0Var2, s9gVar2, iW02, sm5Var.t0);
                hsi.g(!w4cVar2.f);
                w4cVar2.c = i2;
                hsi.g(!w4cVar2.f);
                w4cVar2.d = obj;
                w4cVar2.b();
            }
        }
    }

    @Override // defpackage.u3c
    public final PlaybackException n() {
        A1();
        return this.s1.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r1 = r17
            a3c r2 = r15.s1
            int r2 = r15.W0(r2)
            long r3 = r15.e()
            int r5 = r15.S0
            r6 = 1
            int r5 = r5 + r6
            r15.S0 = r5
            java.util.ArrayList r5 = r15.A0
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L31
            int r7 = r5.size()
            int r9 = r7 + (-1)
        L21:
            if (r9 < 0) goto L29
            r5.remove(r9)
            int r9 = r9 + (-1)
            goto L21
        L29:
            hze r9 = r15.X0
            hze r7 = r9.c(r8, r7)
            r15.X0 = r7
        L31:
            r7 = r16
            java.util.ArrayList r10 = r15.N0(r8, r7)
            h5c r7 = new h5c
            hze r9 = r15.X0
            r7.<init>(r5, r9)
            boolean r5 = r7.p()
            int r9 = r7.h
            if (r5 != 0) goto L4f
            if (r1 >= r9) goto L49
            goto L4f
        L49:
            androidx.media3.common.IllegalSeekPositionException r1 = new androidx.media3.common.IllegalSeekPositionException
            r1.<init>()
            throw r1
        L4f:
            r5 = -1
            if (r20 == 0) goto L5f
            boolean r1 = r15.R0
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L5d:
            r12 = r1
            goto L67
        L5f:
            if (r1 != r5) goto L64
            r12 = r2
            r2 = r3
            goto L67
        L64:
            r2 = r18
            goto L5d
        L67:
            a3c r1 = r15.s1
            android.util.Pair r4 = r15.e1(r7, r12, r2)
            a3c r1 = r15.d1(r1, r7, r4)
            int r4 = r1.e
            if (r12 == r5) goto L83
            if (r4 == r6) goto L83
            boolean r4 = r7.p()
            if (r4 != 0) goto L82
            if (r12 < r9) goto L80
            goto L82
        L80:
            r4 = 2
            goto L83
        L82:
            r4 = 4
        L83:
            a3c r1 = c1(r1, r4)
            long r13 = defpackage.zxg.U(r2)
            hze r11 = r15.X0
            sm5 r2 = r15.w0
            wwf r2 = r2.Z
            km5 r9 = new km5
            r9.<init>(r10, r11, r12, r13)
            r3 = 17
            uwf r2 = r2.a(r3, r9)
            r2.b()
            a3c r2 = r15.s1
            d99 r2 = r2.b
            java.lang.Object r2 = r2.a
            d99 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lbb
            a3c r2 = r15.s1
            s9g r2 = r2.a
            boolean r2 = r2.p()
            if (r2 != 0) goto Lbb
            r3 = r6
            goto Lbc
        Lbb:
            r3 = r8
        Lbc:
            long r5 = r15.V0(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r15
            r0.y1(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em5.n1(java.util.List, int, long, boolean):void");
    }

    public final void o1(boolean z) {
        A1();
        x1(1, z);
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long p() {
        A1();
        return U0(this.s1);
    }

    public final void p1(c3c c3cVar) {
        A1();
        if (this.s1.o.equals(c3cVar)) {
            return;
        }
        a3c a3cVarG = this.s1.g(c3cVar);
        this.S0++;
        this.w0.Z.a(4, c3cVar).b();
        y1(a3cVarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.u3c
    public final void prepare() {
        A1();
        a3c a3cVar = this.s1;
        if (a3cVar.e != 1) {
            return;
        }
        a3c a3cVarF = a3cVar.f(null);
        a3c a3cVarC1 = c1(a3cVarF, a3cVarF.a.p() ? 4 : 2);
        this.S0++;
        wwf wwfVar = this.w0.Z;
        wwfVar.getClass();
        uwf uwfVarC = wwf.c();
        uwfVarC.a = wwfVar.a.obtainMessage(29);
        uwfVarC.b();
        y1(a3cVarC1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.u3c
    public final kgg q() {
        A1();
        return (kgg) this.s1.i.X;
    }

    public final void q1(int i) {
        A1();
        if (this.Q0 != i) {
            this.Q0 = i;
            wwf wwfVar = this.w0.Z;
            wwfVar.getClass();
            uwf uwfVarC = wwf.c();
            uwfVarC.a = wwfVar.a.obtainMessage(11, i, 0);
            uwfVarC.b();
            cj4 cj4Var = new cj4(i, 3);
            ua8 ua8Var = this.x0;
            ua8Var.c(8, cj4Var);
            w1();
            ua8Var.b();
        }
    }

    public final void r1(Surface surface) {
        Object obj = this.b1;
        boolean zC = true;
        boolean z = (obj == null || obj == surface) ? false : true;
        long j = z ? this.O0 : -9223372036854775807L;
        sm5 sm5Var = this.w0;
        if (!sm5Var.S0 && sm5Var.t0.getThread().isAlive()) {
            yn3 yn3Var = new yn3(sm5Var.A0);
            sm5Var.Z.a(30, new Pair(surface, yn3Var)).b();
            if (j != -9223372036854775807L) {
                zC = yn3Var.c(j);
            }
        }
        if (z) {
            Object obj2 = this.b1;
            Surface surface2 = this.c1;
            if (obj2 == surface2) {
                surface2.release();
                this.c1 = null;
            }
        }
        this.b1 = surface;
        if (zC) {
            return;
        }
        v1(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int s() {
        A1();
        if (f()) {
            return this.s1.b.b;
        }
        return -1;
    }

    public final void s1(Surface surface) {
        A1();
        r1(surface);
        int i = surface == null ? 0 : -1;
        f1(i, i);
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int t() {
        A1();
        int iW0 = W0(this.s1);
        if (iW0 == -1) {
            return 0;
        }
        return iW0;
    }

    public final void t1(float f) {
        A1();
        float fH = zxg.h(f, 0.0f, 1.0f);
        if (this.g1 == fH) {
            return;
        }
        this.g1 = fH;
        this.w0.Z.a(32, Float.valueOf(fH)).b();
        this.x0.f(22, new ll5(1, fH));
    }

    @Override // defpackage.u3c
    public final int u() {
        A1();
        return this.s1.n;
    }

    public final void u1() {
        A1();
        v1(null);
        this.i1 = new ib4(this.s1.s, zjd.o);
    }

    @Override // defpackage.u3c
    public final s9g v() {
        A1();
        return this.s1.a;
    }

    public final void v1(ExoPlaybackException exoPlaybackException) {
        a3c a3cVar = this.s1;
        a3c a3cVarC = a3cVar.c(a3cVar.b);
        a3cVarC.q = a3cVarC.s;
        a3cVarC.r = 0L;
        a3c a3cVarC1 = c1(a3cVarC, 1);
        if (exoPlaybackException != null) {
            a3cVarC1 = a3cVarC1.f(exoPlaybackException);
        }
        a3c a3cVar2 = a3cVarC1;
        this.S0++;
        wwf wwfVar = this.w0.Z;
        wwfVar.getClass();
        uwf uwfVarC = wwf.c();
        uwfVarC.a = wwfVar.a.obtainMessage(6);
        uwfVarC.b();
        y1(a3cVar2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void w1() {
        o3c o3cVar = this.Y0;
        String str = zxg.a;
        em5 em5Var = this.Y;
        boolean zF = em5Var.f();
        boolean zY0 = em5Var.y0();
        boolean zU0 = em5Var.u0();
        boolean zT0 = em5Var.t0();
        boolean zX0 = em5Var.x0();
        boolean zW0 = em5Var.w0();
        boolean zP = em5Var.v().p();
        a3b a3bVar = new a3b(1);
        y16 y16Var = (y16) a3bVar.b;
        y16Var.b(this.d.a);
        boolean z = !zF;
        a3bVar.k(4, z);
        a3bVar.k(5, zY0 && !zF);
        a3bVar.k(6, zU0 && !zF);
        a3bVar.k(7, !zP && (zU0 || !zX0 || zY0) && !zF);
        a3bVar.k(8, zT0 && !zF);
        a3bVar.k(9, !zP && (zT0 || (zX0 && zW0)) && !zF);
        a3bVar.k(10, z);
        a3bVar.k(11, zY0 && !zF);
        a3bVar.k(12, zY0 && !zF);
        o3c o3cVar2 = new o3c(y16Var.e());
        this.Y0 = o3cVar2;
        if (o3cVar2.equals(o3cVar)) {
            return;
        }
        this.x0.c(13, new ql5(this, 3));
    }

    public final void x1(int i, boolean z) {
        a3c a3cVarA = this.s1;
        int i2 = a3cVarA.n;
        int i3 = (i2 != 1 || z) ? 0 : 1;
        if (a3cVarA.l == z && i2 == i3 && a3cVarA.m == i) {
            return;
        }
        this.S0++;
        if (a3cVarA.p) {
            a3cVarA = a3cVarA.a();
        }
        a3c a3cVarE = a3cVarA.e(i, i3, z);
        wwf wwfVar = this.w0.Z;
        wwfVar.getClass();
        uwf uwfVarC = wwf.c();
        uwfVarC.a = wwfVar.a.obtainMessage(1, z ? 1 : 0, i | (i3 << 4));
        uwfVarC.b();
        y1(a3cVarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.u3c
    public final boolean y() {
        A1();
        return this.R0;
    }

    public final void y1(final a3c a3cVar, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        k09 k09Var;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        Object obj;
        k09 k09Var2;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long jZ0;
        long jZ02;
        Object obj3;
        k09 k09Var3;
        Object obj4;
        int i7;
        a3c a3cVar2 = this.s1;
        this.s1 = a3cVar;
        boolean zEquals = a3cVar2.a.equals(a3cVar.a);
        q9g q9gVar = (q9g) this.b;
        m9g m9gVar = this.z0;
        s9g s9gVar = a3cVar2.a;
        d99 d99Var = a3cVar2.b;
        s9g s9gVar2 = a3cVar.a;
        d99 d99Var2 = a3cVar.b;
        if (s9gVar2.p() && s9gVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (s9gVar2.p() != s9gVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (s9gVar.m(s9gVar.g(d99Var.a, m9gVar).c, q9gVar, 0L).a.equals(s9gVar2.m(s9gVar2.g(d99Var2.a, m9gVar).c, q9gVar, 0L).a)) {
            pair = (z && i2 == 0 && d99Var.d < d99Var2.d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            k09Var = !a3cVar.a.p() ? a3cVar.a.m(a3cVar.a.g(a3cVar.b.a, this.z0).c, (q9g) this.b, 0L).c : null;
            this.r1 = w19.K;
        } else {
            k09Var = null;
        }
        if (zBooleanValue || !a3cVar2.j.equals(a3cVar.j)) {
            u19 u19VarA = this.r1.a();
            List list = a3cVar.j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                ty9 ty9Var = (ty9) list.get(i8);
                int i9 = 0;
                while (true) {
                    ry9[] ry9VarArr = ty9Var.a;
                    if (i9 < ry9VarArr.length) {
                        ry9VarArr[i9].a(u19VarA);
                        i9++;
                    }
                }
            }
            this.r1 = new w19(u19VarA);
        }
        w19 w19VarP0 = P0();
        boolean zEquals2 = w19VarP0.equals(this.Z0);
        this.Z0 = w19VarP0;
        boolean z6 = a3cVar2.l != a3cVar.l;
        boolean z7 = a3cVar2.e != a3cVar.e;
        if (z7 || z6) {
            z1();
        }
        boolean z8 = a3cVar2.g;
        boolean z9 = a3cVar.g;
        boolean z10 = z8 != z9;
        if (z10) {
            int i10 = this.l1;
            lk6 lk6Var = this.m1;
            if (lk6Var != null) {
                if (z9 && !this.n1) {
                    lk6Var.l(i10);
                    this.n1 = true;
                } else if (!z9 && this.n1) {
                    lk6Var.W(i10);
                    this.n1 = false;
                }
            }
        }
        if (!zEquals) {
            this.x0.c(0, new ad0(a3cVar, i, 2));
        }
        if (z) {
            m9g m9gVar2 = new m9g();
            if (a3cVar2.a.p()) {
                z3 = zBooleanValue;
                z4 = zEquals2;
                z5 = z7;
                i5 = i3;
                obj = null;
                k09Var2 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj5 = a3cVar2.b.a;
                a3cVar2.a.g(obj5, m9gVar2);
                int i11 = m9gVar2.c;
                int iB = a3cVar2.a.b(obj5);
                z3 = zBooleanValue;
                z4 = zEquals2;
                z5 = z7;
                obj = a3cVar2.a.m(i11, (q9g) this.b, 0L).a;
                k09Var2 = ((q9g) this.b).c;
                obj2 = obj5;
                i5 = i11;
                i6 = iB;
            }
            if (i2 == 0) {
                if (a3cVar2.b.b()) {
                    d99 d99Var3 = a3cVar2.b;
                    jZ0 = m9gVar2.a(d99Var3.b, d99Var3.c);
                    jZ02 = Z0(a3cVar2);
                } else if (a3cVar2.b.e != -1) {
                    jZ0 = Z0(this.s1);
                    jZ02 = jZ0;
                } else {
                    j2 = m9gVar2.e;
                    j3 = m9gVar2.d;
                    jZ0 = j2 + j3;
                    jZ02 = jZ0;
                }
            } else if (a3cVar2.b.b()) {
                jZ0 = a3cVar2.s;
                jZ02 = Z0(a3cVar2);
            } else {
                j2 = m9gVar2.e;
                j3 = a3cVar2.s;
                jZ0 = j2 + j3;
                jZ02 = jZ0;
            }
            long jM0 = zxg.m0(jZ0);
            long jM02 = zxg.m0(jZ02);
            d99 d99Var4 = a3cVar2.b;
            t3c t3cVar = new t3c(obj, i5, k09Var2, obj2, i6, jM0, jM02, d99Var4.b, d99Var4.c);
            q9g q9gVar2 = (q9g) this.b;
            int iT = t();
            if (this.s1.a.p()) {
                obj3 = null;
                k09Var3 = null;
                obj4 = null;
                i7 = -1;
            } else {
                a3c a3cVar3 = this.s1;
                Object obj6 = a3cVar3.b.a;
                a3cVar3.a.g(obj6, this.z0);
                int iB2 = this.s1.a.b(obj6);
                Object obj7 = this.s1.a.m(iT, q9gVar2, 0L).a;
                k09Var3 = q9gVar2.c;
                i7 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jM03 = zxg.m0(j);
            long jM04 = this.s1.b.b() ? zxg.m0(Z0(this.s1)) : jM03;
            d99 d99Var5 = this.s1.b;
            this.x0.c(11, new pz1(i2, t3cVar, new t3c(obj3, iT, k09Var3, obj4, i7, jM03, jM04, d99Var5.b, d99Var5.c), 2));
        } else {
            z3 = zBooleanValue;
            z4 = zEquals2;
            z5 = z7;
        }
        if (z3) {
            this.x0.c(1, new ad0(k09Var, iIntValue, 3));
        }
        if (a3cVar2.f != a3cVar.f) {
            final int i12 = 7;
            this.x0.c(10, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj8) {
                    r3c r3cVar = (r3c) obj8;
                    switch (i12) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
            if (a3cVar.f != null) {
                final int i13 = 8;
                this.x0.c(10, new pa8() { // from class: pl5
                    @Override // defpackage.pa8, defpackage.oa8
                    public final void invoke(Object obj8) {
                        r3c r3cVar = (r3c) obj8;
                        switch (i13) {
                            case 0:
                                a3c a3cVar4 = a3cVar;
                                r3cVar.r(a3cVar4.g);
                                r3cVar.h(a3cVar4.g);
                                break;
                            case 1:
                                a3c a3cVar5 = a3cVar;
                                r3cVar.o(a3cVar5.e, a3cVar5.l);
                                break;
                            case 2:
                                r3cVar.k(a3cVar.e);
                                break;
                            case 3:
                                a3c a3cVar6 = a3cVar;
                                r3cVar.i(a3cVar6.m, a3cVar6.l);
                                break;
                            case 4:
                                r3cVar.f(a3cVar.n);
                                break;
                            case 5:
                                r3cVar.q(a3cVar.m());
                                break;
                            case 6:
                                r3cVar.A0(a3cVar.o);
                                break;
                            case 7:
                                r3cVar.C0(a3cVar.f);
                                break;
                            case 8:
                                r3cVar.L0(a3cVar.f);
                                break;
                            default:
                                r3cVar.e0((kgg) a3cVar.i.X);
                                break;
                        }
                    }
                });
            }
        }
        ggg gggVar = a3cVar2.i;
        ggg gggVar2 = a3cVar.i;
        if (gggVar != gggVar2) {
            oo8 oo8Var = this.t0;
            Object obj8 = gggVar2.c;
            oo8Var.getClass();
            final int i14 = 9;
            this.x0.c(2, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj82) {
                    r3c r3cVar = (r3c) obj82;
                    switch (i14) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
        }
        if (!z4) {
            this.x0.c(14, new nl5(this.Z0));
        }
        if (z10) {
            final int i15 = 0;
            this.x0.c(3, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj82) {
                    r3c r3cVar = (r3c) obj82;
                    switch (i15) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
        }
        if (z5 || z6) {
            final int i16 = 1;
            this.x0.c(-1, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj82) {
                    r3c r3cVar = (r3c) obj82;
                    switch (i16) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i17 = 2;
            this.x0.c(4, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj82) {
                    r3c r3cVar = (r3c) obj82;
                    switch (i17) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
        }
        if (z6 || a3cVar2.m != a3cVar.m) {
            final int i18 = 3;
            this.x0.c(5, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj82) {
                    r3c r3cVar = (r3c) obj82;
                    switch (i18) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
        }
        if (a3cVar2.n != a3cVar.n) {
            final int i19 = 4;
            this.x0.c(6, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj82) {
                    r3c r3cVar = (r3c) obj82;
                    switch (i19) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
        }
        if (a3cVar2.m() != a3cVar.m()) {
            final int i20 = 5;
            this.x0.c(7, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj82) {
                    r3c r3cVar = (r3c) obj82;
                    switch (i20) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
        }
        if (!a3cVar2.o.equals(a3cVar.o)) {
            final int i21 = 6;
            this.x0.c(12, new pa8() { // from class: pl5
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj82) {
                    r3c r3cVar = (r3c) obj82;
                    switch (i21) {
                        case 0:
                            a3c a3cVar4 = a3cVar;
                            r3cVar.r(a3cVar4.g);
                            r3cVar.h(a3cVar4.g);
                            break;
                        case 1:
                            a3c a3cVar5 = a3cVar;
                            r3cVar.o(a3cVar5.e, a3cVar5.l);
                            break;
                        case 2:
                            r3cVar.k(a3cVar.e);
                            break;
                        case 3:
                            a3c a3cVar6 = a3cVar;
                            r3cVar.i(a3cVar6.m, a3cVar6.l);
                            break;
                        case 4:
                            r3cVar.f(a3cVar.n);
                            break;
                        case 5:
                            r3cVar.q(a3cVar.m());
                            break;
                        case 6:
                            r3cVar.A0(a3cVar.o);
                            break;
                        case 7:
                            r3cVar.C0(a3cVar.f);
                            break;
                        case 8:
                            r3cVar.L0(a3cVar.f);
                            break;
                        default:
                            r3cVar.e0((kgg) a3cVar.i.X);
                            break;
                    }
                }
            });
        }
        w1();
        this.x0.b();
        if (a3cVar2.p != a3cVar.p) {
            Iterator it = this.y0.iterator();
            while (it.hasNext()) {
                ((yl5) it.next()).a.z1();
            }
        }
    }

    public final void z1() {
        int playbackState = getPlaybackState();
        xn3 xn3Var = this.N0;
        xn3 xn3Var2 = this.M0;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                A1();
                boolean z2 = this.s1.p;
                if (i() && !z2) {
                    z = true;
                }
                xn3Var2.f(z);
                xn3Var.f(i());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        xn3Var2.f(false);
        xn3Var.f(false);
    }
}
