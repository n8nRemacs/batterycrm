package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eqh implements cw7 {
    public final ew7 a;
    public final k18 b;
    public final k18 c;
    public final xs d;
    public final pv0 e;
    public clh f;

    public eqh(ew7 ew7Var, k18 k18Var, k18 k18Var2) {
        this.a = ew7Var;
        this.b = k18Var;
        this.c = k18Var2;
        xs xsVar = new xs(0);
        f2 f2Var = new f2(0, uph.c);
        while (f2Var.hasNext()) {
            ((uph) f2Var.next()).getClass();
            xsVar.add("WebAppDownloadFile");
        }
        this.d = xsVar;
        this.e = gzi.a(0, 0, 7);
    }

    public static final aw7 e(eqh eqhVar, Throwable th) {
        eqhVar.getClass();
        tph tphVar = th instanceof tph ? (tph) th : null;
        if (tphVar instanceof rph) {
            return new yv7(new bw7("download_failed", 1));
        }
        if (tphVar instanceof sph) {
            return new yv7(new bw7("invalid_params", 2));
        }
        if (tphVar instanceof qph) {
            return new yv7(new bw7("denied_download_request", 3));
        }
        if (tphVar == null) {
            return zv7.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (((defpackage.qv7) r11).d(r1, r0) != r7) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[PHI: r9 r10 r11
  0x00a0: PHI (r9v5 hqh) = (r9v4 hqh), (r9v10 hqh) binds: [B:29:0x009d, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r10v4 eqh) = (r10v3 eqh), (r10v7 eqh) binds: [B:29:0x009d, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r11v8 java.lang.Object) = (r11v7 java.lang.Object), (r11v1 java.lang.Object) binds: [B:29:0x009d, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.eqh r9, defpackage.hqh r10, defpackage.q44 r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.wph
            if (r0 == 0) goto L16
            r0 = r11
            wph r0 = (defpackage.wph) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            wph r0 = new wph
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.Y
            int r1 = r0.s0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            g84 r7 = defpackage.g84.a
            if (r1 == 0) goto L57
            if (r1 == r5) goto L4d
            if (r1 == r4) goto L45
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            defpackage.g8j.b(r11)
            goto Lb4
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            hqh r9 = r0.o
            eqh r10 = r0.d
            defpackage.g8j.b(r11)
            goto La0
        L45:
            hqh r9 = r0.o
            eqh r10 = r0.d
            defpackage.g8j.b(r11)
            goto L8c
        L4d:
            oph r9 = r0.X
            hqh r10 = r0.o
            eqh r1 = r0.d
            defpackage.g8j.b(r11)
            goto L76
        L57:
            defpackage.g8j.b(r11)
            oph r11 = new oph
            java.lang.String r1 = r10.b
            java.lang.String r8 = r10.c
            r11.<init>(r1, r8)
            pv0 r1 = r9.e
            r0.d = r9
            r0.o = r10
            r0.X = r11
            r0.s0 = r5
            java.lang.Object r1 = r1.h(r11, r0)
            if (r1 != r7) goto L74
            goto Lb3
        L74:
            r1 = r9
            r9 = r11
        L76:
            yph r11 = new yph
            r11.<init>(r1, r10, r6)
            r0.d = r1
            r0.o = r10
            r0.X = r6
            r0.s0 = r4
            java.lang.Object r11 = r9.e(r11, r0)
            if (r11 != r7) goto L8a
            goto Lb3
        L8a:
            r9 = r10
            r10 = r1
        L8c:
            qv7 r11 = (defpackage.qv7) r11
            zph r1 = new zph
            r1.<init>(r10, r9, r6)
            r0.d = r10
            r0.o = r9
            r0.s0 = r3
            java.lang.Object r11 = r11.c(r1, r0)
            if (r11 != r7) goto La0
            goto Lb3
        La0:
            qv7 r11 = (defpackage.qv7) r11
            aqh r1 = new aqh
            r1.<init>(r10, r9, r6)
            r0.d = r6
            r0.o = r6
            r0.s0 = r2
            java.lang.Object r9 = r11.d(r1, r0)
            if (r9 != r7) goto Lb4
        Lb3:
            return r7
        Lb4:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqh.f(eqh, hqh, q44):java.lang.Object");
    }

    @Override // defpackage.cw7
    public final Object a(String str, String str2, Continuation continuation) {
        Object next;
        Iterator it = uph.c.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            ((uph) next).getClass();
            if ("WebAppDownloadFile".equals(str)) {
                break;
            }
        }
        uph uphVar = (uph) next;
        qqg qqgVar = qqg.a;
        if (uphVar != null) {
            if (vph.$EnumSwitchMapping$0[uphVar.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Object objG = g(str2, (q44) continuation);
            return objG == g84.a ? objG : qqgVar;
        }
        wqi.e(eqh.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
        return qqgVar;
    }

    @Override // defpackage.cw7
    public final pv0 b() {
        return this.e;
    }

    @Override // defpackage.cw7
    public final Set c() {
        return this.d;
    }

    @Override // defpackage.cw7
    public final void d(clh clhVar) {
        this.f = clhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqh.g(java.lang.String, q44):java.lang.Object");
    }
}
