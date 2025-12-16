package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class j35 implements re4, d4c {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;
    public Object s0;
    public Object t0;

    public /* synthetic */ j35(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.j35 r6, long r7, defpackage.p3b r9, defpackage.q44 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.h35
            if (r0 == 0) goto L13
            r0 = r10
            h35 r0 = (defpackage.h35) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            h35 r0 = new h35
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.Y
            int r1 = r0.s0
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            long r7 = r0.X
            p3b r9 = r0.o
            j35 r6 = r0.d
            defpackage.g8j.b(r10)
        L2a:
            r3 = r7
            r5 = r9
            goto L4d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r6.d
            oa3 r10 = (defpackage.oa3) r10
            r0.d = r6
            r0.o = r9
            r0.X = r7
            r0.s0 = r2
            java.lang.Object r10 = r10.a(r7, r0)
            g84 r0 = defpackage.g84.a
            if (r10 != r0) goto L2a
            return r0
        L4d:
            java.lang.Object r6 = r6.Z
            k18 r6 = (defpackage.k18) r6
            java.lang.Object r6 = r6.getValue()
            hwa r6 = (defpackage.hwa) r6
            boolean r7 = r6.j(r3)
            if (r7 != 0) goto L5e
            goto L70
        L5e:
            b35 r0 = new b35
            z7c r7 = r6.t()
            pe8 r7 = r7.a
            long r1 = r7.k()
            r0.<init>(r1, r3, r5)
            defpackage.hwa.r(r6, r0)
        L70:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j35.e(j35, long, p3b, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (((defpackage.h49) ((defpackage.e5c) ((defpackage.k18) r13.s0).getValue())).e(r14.b) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.j35 r13, defpackage.w8h r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j35.f(j35, w8h, q44):java.lang.Object");
    }

    @Override // defpackage.d4c
    public void a() {
        v7h v7hVar = (v7h) this.d;
        cbh cbhVar = v7hVar.f;
        if (cbhVar == null || !cbhVar.d()) {
            cbh cbhVar2 = v7hVar.f;
            if (cbhVar2 != null) {
                cbhVar2.play();
                return;
            }
            return;
        }
        cbh cbhVar3 = v7hVar.f;
        if (cbhVar3 != null) {
            cbhVar3.pause();
        }
    }

    @Override // defpackage.d4c
    public void b() {
        cbh cbhVar = ((v7h) this.d).f;
        if (cbhVar != null) {
            cbhVar.stop();
        }
    }

    @Override // defpackage.d4c
    public ei4 c() {
        w8h w8hVar = (w8h) ue3.I(((v7h) this.d).h.a.b());
        if (w8hVar == null) {
            return null;
        }
        k0c k0cVar = k0c.c;
        long j = w8hVar.b;
        long j2 = w8hVar.a;
        k0cVar.getClass();
        return k0c.L0(j2, j, true);
    }

    @Override // defpackage.d4c
    public void d(d3c d3cVar) {
    }

    public bc0 g() {
        String strI = ((String) this.b) == null ? " mimeType" : "";
        if (((f9g) this.d) == null) {
            strI = az1.i(strI, " inputTimebase");
        }
        if (((Size) this.o) == null) {
            strI = az1.i(strI, " resolution");
        }
        if (((cc0) this.Y) == null) {
            strI = az1.i(strI, " dataSpace");
        }
        if (((Integer) this.Z) == null) {
            strI = az1.i(strI, " frameRate");
        }
        if (((Integer) this.t0) == null) {
            strI = az1.i(strI, " bitrate");
        }
        if (strI.isEmpty()) {
            return new bc0((String) this.b, ((Integer) this.c).intValue(), (f9g) this.d, (Size) this.o, ((Integer) this.X).intValue(), (cc0) this.Y, ((Integer) this.Z).intValue(), ((Integer) this.s0).intValue(), ((Integer) this.t0).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public q28 h() {
        switch (this.a) {
            case 4:
                return new q28((r28) this.d, (rje) ((bwf) this.t0).getValue(), (k4e) ((bwf) this.b).getValue(), (qja) ((k18) this.X).getValue(), (oje) ((k18) this.o).getValue(), (hya) ((k18) this.Y).getValue(), (tya) ((k18) this.Z).getValue(), (vda) ((k18) this.s0).getValue(), (vya) this.c);
            default:
                return new bha((pga) ((k18) this.o).getValue(), (rje) ((bwf) this.b).getValue(), (k4e) ((bwf) this.d).getValue(), (qja) ((k18) this.Y).getValue(), (oje) ((k18) this.X).getValue(), (hya) ((k18) this.Z).getValue(), (tya) ((k18) this.s0).getValue(), (vda) ((k18) this.t0).getValue(), (vya) this.c);
        }
    }

    public py0 i() {
        return (py0) this.t0;
    }

    public jkc j() {
        return (jkc) this.Z;
    }

    public s7c k() {
        return (s7c) this.o;
    }

    public void l(eh9 eh9Var, int i, int i2) {
        pb2 pb2Var = (pb2) this.Z;
        q19 q19VarH = ((r19) this.t0).h();
        si9 si9Var = eh9Var.a;
        long j = si9Var.b;
        if (q19VarH.d == si9Var.Z && q19VarH.c.containsAll((Set) this.s0)) {
            if (i > 0) {
                long j2 = q19VarH.b;
                if (j2 != 0) {
                    j = j2;
                }
            }
            if (i2 > 0) {
                long j3 = q19VarH.a;
                if (j3 != 0) {
                    j = j3;
                }
            }
        }
        u2f u2fVarG = ((hwa) this.X).G(new fh2(pb2Var.b.a, Long.valueOf(j), (Set) this.s0, Integer.valueOf(i), Integer.valueOf(i2)), u0e.d);
        d1g d1gVar = (d1g) this.Y;
        d1gVar.getClass();
        zj2 zj2Var = (zj2) u2fVarG.j(new b1g(d1gVar, 2, 0)).e();
        ((qi9) this.b).g(pb2Var.a, ((z7c) this.o).a.s(), zj2Var.e());
        ve2 ve2Var = (ve2) this.d;
        long j4 = pb2Var.a;
        si9 si9Var2 = eh9Var.a;
        Set set = (Set) this.s0;
        ve2Var.getClass();
        ve2Var.r(j4, false, new qe2(ve2Var, set, zj2Var, i2, si9Var2.a, i, si9Var2.c, j4));
    }

    @Override // defpackage.re4
    public List m(long j, j37 j37Var, int i, int i2, long j2, long j3) {
        if (!(j37Var instanceof eh9)) {
            wqi.e("j35", "item must be instanceof Message", null);
            return Collections.EMPTY_LIST;
        }
        eh9 eh9Var = (eh9) j37Var;
        if (i2 > 0) {
            l(eh9Var, i2, 0);
        }
        if (i > 0) {
            l(eh9Var, 0, i);
        }
        return ((ywf) this.c).m(j, j37Var, i, i2, j2, j3);
    }

    public e8d n() {
        return (e8d) this.Y;
    }

    public xpb o() {
        return (xpb) this.s0;
    }

    public wib p() {
        return (wib) this.X;
    }

    @Override // defpackage.d4c
    public void pause() {
        cbh cbhVar = ((v7h) this.d).f;
        if (cbhVar != null) {
            cbhVar.pause();
        }
    }

    public void q() {
        ((kce) this.c).b = null;
        ((kce) this.d).b = null;
        ((kce) this.b).b = null;
        ((kce) this.o).b = null;
        ((kce) this.X).b = null;
        ((kce) this.Y).b = null;
        ((kce) this.Z).b = null;
        ((kce) this.s0).b = null;
    }

    public j35() {
        this.a = 3;
        int i = 24;
        this.c = new kce(i);
        this.d = new kce(i);
        this.b = new kce(i);
        this.o = new kce(i);
        this.X = new kce(i);
        this.Y = new kce(i);
        this.Z = new kce(i);
        this.s0 = new kce(i);
        this.t0 = new s6b(8);
    }

    public j35(kp1 kp1Var, dj1 dj1Var, f0f f0fVar, sm6 sm6Var, qf1 qf1Var, y6d y6dVar, si1 si1Var) {
        this.a = 7;
        this.c = new jkc(dj1Var, f0fVar.a, sm6Var);
        this.d = new xo8(sm6Var, y6dVar, f0fVar.b, f0fVar.d);
        this.b = new lqh(f0fVar.m, f0fVar.n, f0fVar.o, kp1Var, si1Var.r);
        v1a v1aVar = f0fVar.c;
        kk4 kk4Var = f0fVar.h;
        ju5 ju5Var = qf1Var.j;
        s7c s7cVar = new s7c();
        s7cVar.a = y6dVar;
        s7cVar.b = ju5Var;
        this.o = s7cVar;
        this.X = new wib(f0fVar.p, qf1Var.d, false, 18);
        this.Y = qf1Var.p;
        this.Z = new jkc(dj1Var, f0fVar.q, qf1Var.k);
        this.s0 = new xpb(qf1Var.q, 14, f0fVar.k);
        this.t0 = new py0(qf1Var.r, 9, f0fVar.l);
    }

    public j35(wib wibVar) {
        this.a = 6;
        this.b = new CopyOnWriteArrayList();
        this.Y = new Handler(Looper.getMainLooper());
        this.Z = new AtomicBoolean(false);
        this.s0 = new AtomicReference(null);
        this.t0 = new p8i(1, this);
        jdc jdcVar = (jdc) wibVar.b;
        if (jdcVar != null) {
            y6d y6dVar = (y6d) wibVar.c;
            if (y6dVar != null) {
                this.c = jdcVar;
                this.d = y6dVar;
                HandlerThread handlerThread = new HandlerThread("RtcNotifRecv");
                this.o = handlerThread;
                handlerThread.start();
                this.X = new Handler(handlerThread.getLooper());
                return;
            }
            throw new IllegalArgumentException("Illegal 'log' value: null");
        }
        throw new IllegalArgumentException("Illegal 'serializer' value: null");
    }

    public j35(k18 k18Var, k18 k18Var2, k18 k18Var3, bwf bwfVar, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, vya vyaVar, int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.c = vyaVar;
                this.o = k18Var;
                this.X = k18Var2;
                this.Y = k18Var3;
                this.d = bwfVar;
                this.Z = k18Var5;
                this.s0 = k18Var6;
                this.t0 = k18Var7;
                this.b = new bwf(new nz(k18Var4, 25));
                break;
            default:
                this.c = vyaVar;
                this.d = new r28(k18Var);
                this.o = k18Var2;
                this.X = k18Var3;
                this.b = bwfVar;
                this.Y = k18Var5;
                this.Z = k18Var6;
                this.s0 = k18Var7;
                this.t0 = new bwf(new nz(k18Var4, 19));
                break;
        }
    }

    public j35(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, ra3 ra3Var, oa3 oa3Var) {
        this.a = 0;
        this.c = ra3Var;
        this.d = oa3Var;
        this.b = j35.class.getName();
        this.o = k18Var;
        this.X = k18Var2;
        this.Y = k18Var3;
        this.Z = k18Var4;
        this.s0 = k18Var5;
        this.t0 = k18Var6;
    }

    public j35(f84 f84Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, lzf lzfVar, v7h v7hVar) {
        this.a = 8;
        this.c = lzfVar;
        this.d = v7hVar;
        this.o = k18Var;
        this.X = k18Var2;
        this.Y = k18Var3;
        this.Z = k18Var4;
        this.s0 = k18Var5;
        gbd gbdVar = v7hVar.h;
        ft0 ft0VarA = wb4.a(new uxb(gbdVar, this, 29), 0);
        jve jveVarA = kve.a(0, ft0VarA.a, ft0VarA.b);
        x74 x74Var = (x74) ft0VarA.d;
        x26 x26Var = (x26) ft0VarA.c;
        Symbol symbol = kve.a;
        lcj lcjVar = yve.a;
        dcf dcfVar = yve.b;
        svi.d(f84Var, x74Var, dcfVar.equals(lcjVar) ? i84.a : i84.d, new u56(dcfVar, x26Var, jveVarA, symbol, null));
        this.b = new gbd(jveVarA);
        this.t0 = gw0.C(new xnb(gbdVar, 14), f84Var, dcfVar, Float.valueOf(0.0f));
    }

    public j35(ywf ywfVar, ve2 ve2Var, qi9 qi9Var, z7c z7cVar, hwa hwaVar, d1g d1gVar, pb2 pb2Var, Set set, r19 r19Var) {
        this.a = 2;
        this.c = ywfVar;
        this.d = ve2Var;
        this.b = qi9Var;
        this.o = z7cVar;
        this.X = hwaVar;
        this.Y = d1gVar;
        this.Z = pb2Var;
        this.s0 = set;
        this.t0 = r19Var;
    }

    public j35(Context context, qo3 qo3Var, u5i u5iVar, jac jacVar, WorkDatabase workDatabase, r5i r5iVar, ArrayList arrayList) {
        this.a = 9;
        this.t0 = new hc8(19);
        this.c = context.getApplicationContext();
        this.b = u5iVar;
        this.d = jacVar;
        this.o = qo3Var;
        this.X = workDatabase;
        this.Y = r5iVar;
        this.s0 = arrayList;
    }
}
