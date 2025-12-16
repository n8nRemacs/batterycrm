package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class uvh extends xfh {
    public static final /* synthetic */ yy7[] o1 = {new z8a(uvh.class, "reloadWebAppJob", "getReloadWebAppJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, uvh.class, "openInternalLinkJob", "getOpenInternalLinkJob()Lkotlinx/coroutines/Job;")};
    public static final String[] p1 = {"image/*", "video/*"};
    public final k18 A0;
    public final k18 B0;
    public final k18 C0;
    public final bwf D0;
    public final Object E0;
    public final String F0;
    public clh G0;
    public final t9f H0;
    public final t9f I0;
    public final ra3 J0;
    public final tcf K0;
    public final tcf L0;
    public final tcf M0;
    public final tcf N0;
    public final tcf O0;
    public final tcf P0;
    public boolean Q0;
    public boolean R0;
    public volatile String S0;
    public volatile String T0;
    public final tcf U0;
    public final d53 V0;
    public final hbd W0;
    public final zvh X;
    public final hbd X0;
    public final e10 Y;
    public final hbd Y0;
    public final pb3 Z;
    public final ci5 Z0;
    public final bwf a1;
    public final long b;
    public final Object b1;
    public final ukh c;
    public final tcf c1;
    public final Long d;
    public final hbd d1;
    public qv7 e1;
    public pph f1;
    public cxh g1;
    public bxh h1;
    public yoh i1;
    public final ConcurrentHashMap j1;
    public x9f k1;
    public final ConcurrentHashMap l1;
    public final bwf m1;
    public x9f n1;
    public final String o;
    public final j94 s0;
    public final lt6 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    /* JADX WARN: Removed duplicated region for block: B:40:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public uvh(long r24, defpackage.ukh r26, java.lang.Long r27, java.lang.String r28, defpackage.zvh r29, defpackage.bwf r30) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvh.<init>(long, ukh, java.lang.Long, java.lang.String, zvh, bwf):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r11 == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        if (r11 == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        if (r11 == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0175, code lost:
    
        if (r11 == r3) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.uvh r9, defpackage.wkf r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvh.t(uvh, wkf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static String u(String str, String str2) {
        return (str == null || str.length() == 0) ? str2 == null ? "" : str2 : (str2 == null || str2.length() == 0) ? str : u45.k(str, "\n", str2);
    }

    public final void A(boolean z) {
        if (z) {
            pph pphVar = this.f1;
            if (pphVar != null) {
                pphVar.a(qqg.a);
            }
        } else {
            pph pphVar2 = this.f1;
            if (pphVar2 != null) {
                pphVar2.b(new qph());
            }
        }
        this.f1 = null;
    }

    public final void B(boolean z) {
        qv7 qv7Var = this.e1;
        if (qv7Var == null) {
            return;
        }
        if (!z) {
            qv7Var.b(new dth());
            return;
        }
        svi.e(this.a, ((q2b) w()).b(), null, new ivh(this, qv7Var, null), 2);
    }

    public final void C() {
        xfh.r(this.Z0, muh.a);
    }

    public final void D() {
        if (!((qsb) this.A0.getValue()).c(qsb.m)) {
            xfh.r(this.Z0, duh.a);
            return;
        }
        svi.e(this.a, ((q2b) w()).b(), null, new nvh(this, null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.xfh
    public final void s() {
        rqh rqhVar = (rqh) this.E0.getValue();
        ((tw0) rqhVar.a.getValue()).f(rqhVar);
        this.G0 = null;
        Iterator it = ((List) this.J0.d).iterator();
        while (it.hasNext()) {
            ((cw7) it.next()).d(null);
        }
    }

    public final tmh v() {
        return (tmh) this.a1.getValue();
    }

    public final lzf w() {
        return (lzf) this.u0.getValue();
    }

    public final void x(boolean z) {
        tmh tmhVarV = v();
        svi.e(tmhVarV.c, null, null, new amh(tmhVarV, null, z), 3);
    }

    public final void y() {
        String str = this.F0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onPageLoadingError: " + this.K0.getValue(), null);
            }
        }
        this.K0.m(null, vlb.a);
    }

    public final void z(String str, boolean z) {
        String str2 = this.F0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, "onPageStartLoading: " + str + " " + z, null);
            }
        }
        swg swgVar = (swg) this.U0.getValue();
        if (!fni.a(swgVar != null ? swgVar.a : null, str) || z) {
            this.K0.m(null, wlb.a);
        }
    }
}
