package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$NoAvailableCameraException;

/* loaded from: classes2.dex */
public final class zed extends xfh implements tfd {
    public static final /* synthetic */ yy7[] I0 = {new z8a(zed.class, "longClickJob", "getLongClickJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, zed.class, "startRecordJob", "getStartRecordJob()Lkotlinx/coroutines/Job;")};
    public final x26 A0;
    public final ci5 B0;
    public final ci5 C0;
    public final bwf D0;
    public volatile AudioFocusRequest E0;
    public final t9f F0;
    public final t9f G0;
    public final String H0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final tdd b;
    public final fed c;
    public final hdc d;
    public final v21 o;
    public final bwf s0;
    public final bwf t0;
    public final k18 u0;
    public final bwf v0;
    public final tcf w0;
    public final hbd x0;
    public final hbd y0;
    public final mcf z0;

    public zed(tdd tddVar, fed fedVar, k18 k18Var, bwf bwfVar, bwf bwfVar2, bwf bwfVar3, hdc hdcVar) {
        o6i o6iVar = o6i.a;
        v21 v21Var = (v21) o6iVar.getAccessor().c(19);
        bwf bwfVarD = o6iVar.getAccessor().d(8);
        bwf bwfVarD2 = o6iVar.getAccessor().d(12);
        bwf bwfVarD3 = o6iVar.getAccessor().d(498);
        this.b = tddVar;
        this.c = fedVar;
        this.d = hdcVar;
        this.o = v21Var;
        this.X = bwfVarD;
        this.Y = bwfVarD2;
        this.Z = k18Var;
        this.s0 = bwfVar;
        this.t0 = bwfVar2;
        this.u0 = bwfVarD3;
        this.v0 = bwfVar3;
        tcf tcfVarA = ucf.a(null);
        this.w0 = tcfVarA;
        hbd hbdVar = new hbd(tcfVarA);
        this.x0 = hbdVar;
        this.y0 = ((hed) bwfVarD3.getValue()).e;
        w60 w60Var = (w60) bwfVar2.getValue();
        this.z0 = w60Var != null ? w60Var.h : null;
        this.A0 = ((ga8) bwfVar.getValue()).d();
        this.B0 = new ci5(0);
        this.C0 = new ci5(0);
        this.D0 = new bwf(new ffb(24, this));
        this.F0 = c7j.c();
        this.G0 = c7j.c();
        this.H0 = zed.class.getName();
        gw0.w(gw0.u(new g56(new d53(hbdVar, 12), new ied(this, null), 1), ((q2b) ((lzf) bwfVarD.getValue())).a()), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.zed r6, defpackage.tdd r7, long r8, byte[] r10, defpackage.q44 r11) {
        /*
            qqg r0 = defpackage.qqg.a
            java.lang.String r1 = "Media for "
            boolean r2 = r11 instanceof defpackage.ued
            if (r2 == 0) goto L17
            r2 = r11
            ued r2 = (defpackage.ued) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            ued r2 = new ued
            r2.<init>(r6, r11)
        L1c:
            java.lang.Object r11 = r2.X
            g84 r3 = defpackage.g84.a
            int r4 = r2.Z
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            tdd r7 = r2.o
            zed r6 = r2.d
            defpackage.g8j.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r7 = move-exception
            goto La0
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.g8j.b(r11)
            int r11 = r7.ordinal()     // Catch: java.lang.Throwable -> L2f
            if (r11 == 0) goto L50
            if (r11 != r5) goto L4a
            ufd r11 = new ufd     // Catch: java.lang.Throwable -> L2f
            r11.<init>(r8, r10)     // Catch: java.lang.Throwable -> L2f
            goto L55
        L4a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2f
            r7.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L2f
        L50:
            vfd r11 = new vfd     // Catch: java.lang.Throwable -> L2f
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L2f
        L55:
            xfd r8 = r6.C()     // Catch: java.lang.Throwable -> L2f
            r2.d = r6     // Catch: java.lang.Throwable -> L2f
            r2.o = r7     // Catch: java.lang.Throwable -> L2f
            r2.Z = r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r11 = r8.g(r11)     // Catch: java.lang.Throwable -> L2f
            if (r11 != r3) goto L66
            return r3
        L66:
            d3 r11 = (defpackage.d3) r11     // Catch: java.lang.Throwable -> L2f
            if (r11 != 0) goto L93
            java.lang.String r8 = r6.H0     // Catch: java.lang.Throwable -> L2f
            l6b r9 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L2f
            if (r9 != 0) goto L71
            goto L92
        L71:
            lg8 r10 = defpackage.lg8.Y     // Catch: java.lang.Throwable -> L2f
            boolean r11 = r9.b(r10)     // Catch: java.lang.Throwable -> L2f
            if (r11 == 0) goto L92
            java.lang.String r7 = r7.name()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            r11.append(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = " wasn't prepared, we cannot send message"
            r11.append(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r11.toString()     // Catch: java.lang.Throwable -> L2f
            r11 = 0
            r9.c(r10, r8, r7, r11)     // Catch: java.lang.Throwable -> L2f
        L92:
            return r0
        L93:
            fed r7 = r6.c     // Catch: java.lang.Throwable -> L2f
            ci5 r7 = r7.c     // Catch: java.lang.Throwable -> L2f
            zdd r8 = new zdd     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L2f
            defpackage.xfh.r(r7, r8)     // Catch: java.lang.Throwable -> L2f
            return r0
        La0:
            java.lang.String r6 = r6.H0
            java.lang.String r8 = r7.getLocalizedMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "We couldn't send record due to "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            defpackage.wqi.e(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zed.t(zed, tdd, long, byte[], q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.zed r14, long r15, defpackage.q44 r17) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zed.u(zed, long, q44):java.lang.Object");
    }

    public final ga8 A() {
        return (ga8) this.s0.getValue();
    }

    public final hed B() {
        return (hed) this.u0.getValue();
    }

    public final xfd C() {
        return (xfd) this.Z.getValue();
    }

    public final void D(s5g s5gVar, boolean z) {
        int i;
        if (z) {
            int iOrdinal = this.b.ordinal();
            if (iOrdinal == 0) {
                i = nab.m;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = nab.e;
            }
            n5g n5gVar = new n5g(i);
            if (s5gVar == null) {
                s5gVar = n5gVar;
            }
            this.c.t(s5gVar, false);
        }
        v();
        this.w0.m(null, new qed(false, 3));
    }

    public final boolean E() {
        red redVar = (red) this.w0.getValue();
        return redVar instanceof ped ? ((ped) redVar).b : (redVar instanceof ned) || (redVar instanceof oed);
    }

    public final void F() {
        ndd nddVarY = y();
        tcf tcfVar = this.w0;
        nddVarY.c(tcfVar.getValue() instanceof ned);
        v();
        tcfVar.m(null, new qed(E(), 2));
    }

    public final void G(Throwable th) {
        if (th instanceof VideoMessageRecordDelegate$NoAvailableCameraException) {
            D(((VideoMessageRecordDelegate$NoAvailableCameraException) th).a, true);
            y().h(odd.a);
            return;
        }
        D(null, true);
        if (th instanceof IOException) {
            y().h(qdd.a);
        } else {
            y().h(pdd.a);
        }
    }

    public final void H() {
        int iOrdinal = this.b.ordinal();
        tcf tcfVar = this.w0;
        if (iOrdinal == 0) {
            tcfVar.m(null, new oed(E(), false));
            C().h();
            B().a();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.c.t(new n5g(nab.f), false);
            tcfVar.m(null, new qed(false, 3));
            v();
        }
    }

    public final void I() {
        tcf tcfVar = this.w0;
        red redVar = (red) tcfVar.getValue();
        if (redVar instanceof ped) {
            tcfVar.m(null, new ped(((ped) redVar).a, true));
            y().d();
        }
    }

    public final void J() {
        tcf tcfVar = this.w0;
        if (((red) tcfVar.getValue()) instanceof ped) {
            try {
                C().h();
                B().a();
                w60 w60VarZ = z();
                if (w60VarZ != null) {
                    svi.e(w60VarZ.f, null, null, new t60(w60VarZ, null), 3);
                }
                tcfVar.m(null, new ned(false));
            } catch (RuntimeException unused) {
                v();
                tcfVar.m(null, new qed(false, 3));
            }
        }
    }

    public final void K() {
        tcf tcfVar = this.w0;
        if (((red) tcfVar.getValue()) instanceof ned) {
            if (((Boolean) this.d.invoke()).booleanValue()) {
                this.c.t(x(), true);
                return;
            }
            try {
                C().e();
                hed hedVarB = B();
                ContextScope contextScope = this.a;
                if (hedVarB.a == null) {
                    hedVarB.c = System.currentTimeMillis();
                    hedVarB.a = svi.e(contextScope, null, null, new ged(hedVarB, null), 3);
                }
                w60 w60VarZ = z();
                if (w60VarZ != null && w60VarZ.n == null) {
                    w60VarZ.n = svi.e(w60VarZ.f, null, null, new v60(w60VarZ, null), 3);
                }
                A().a();
                tcfVar.m(null, new ped(true, true));
                A().c();
            } catch (RuntimeException unused) {
                v();
                tcfVar.m(null, new qed(false, 3));
            }
        }
    }

    public final void L(boolean z) {
        byte[] bArr;
        if ((this.x0.a.getValue() instanceof ped) || (this.x0.a.getValue() instanceof ned) || (this.x0.a.getValue() instanceof oed)) {
            long jLongValue = ((Number) this.y0.a.getValue()).longValue();
            if (!z) {
                v();
                this.w0.m(null, new qed(false, false));
                return;
            }
            if (jLongValue < 1000) {
                xfh.r(this.c.c, new ded(this.b, new n5g(nab.g)));
                y().f();
                v();
                this.w0.m(null, new qed(E(), false));
                return;
            }
            w60 w60VarZ = z();
            if (w60VarZ == null || (bArr = w60VarZ.b) == null) {
                bArr = new byte[0];
            }
            byte[] bArr2 = bArr;
            v();
            svi.e(this.a, bia.a, null, new yed(this, jLongValue, bArr2, null), 2);
            this.w0.m(null, new qed(E(), 2));
        }
    }

    @Override // defpackage.xfh
    public final void s() {
        A().release();
        v();
    }

    public final void v() {
        xfh.r(this.c.c, new aed(this.b, false));
        C().d();
        C().k(null);
        A().b(null);
        hed hedVarB = B();
        x9f x9fVar = hedVarB.a;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        hedVarB.a = null;
        hedVarB.b = 0L;
        hedVarB.d.m(null, 0L);
        w60 w60VarZ = z();
        if (w60VarZ != null) {
            svi.e(w60VarZ.f, null, null, new s60(w60VarZ, null), 3);
        }
        y().clear();
        AudioFocusRequest audioFocusRequest = this.E0;
        if (audioFocusRequest != null) {
            ((AudioManager) this.D0.getValue()).abandonAudioFocusRequest(audioFocusRequest);
            this.E0 = null;
        }
    }

    public final void w() {
        tcf tcfVar = this.w0;
        red redVar = (red) tcfVar.getValue();
        boolean z = redVar instanceof ped;
        if (z) {
            try {
                C().h();
                B().a();
                w60 w60VarZ = z();
                if (w60VarZ != null) {
                    svi.e(w60VarZ.f, null, null, new t60(w60VarZ, null), 3);
                }
            } catch (RuntimeException unused) {
                v();
                tcfVar.m(null, new qed(false, 3));
                return;
            }
        }
        if (z || (redVar instanceof ned)) {
            if (((Boolean) this.d.invoke()).booleanValue() && this.b == tdd.a) {
                tcfVar.m(null, new oed(E(), true));
            } else {
                tcfVar.m(null, new ned(true));
            }
        }
    }

    public final n5g x() {
        int i = sed.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return new n5g(nab.o);
        }
        if (i == 2) {
            return new n5g(nab.a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ndd y() {
        return (ndd) this.v0.getValue();
    }

    public final w60 z() {
        return (w60) this.t0.getValue();
    }
}
