package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class klc {
    public final jdc a;
    public final k18 b;
    public final ContextScope c;
    public final mk3 d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;

    public klc(jdc jdcVar, k18 k18Var, k18 k18Var2, a84 a84Var) {
        this.a = jdcVar;
        this.b = k18Var2;
        ContextScope contextScopeA = d7j.a(((q2b) ((lzf) k18Var.getValue())).b().limitedParallelism(1, "profile_repository").plus(a84Var));
        this.c = contextScopeA;
        this.d = new mk3();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        gw0.w(new g56(new mwd(new p84((lrd) jdcVar.b, new String[]{"profile"}, new ci(jdcVar, 28, dsd.c(0, "SELECT * FROM profile")), null)), new glc(this, k18Var2, null), 1), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, defpackage.q44 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.hlc
            if (r0 == 0) goto L13
            r0 = r11
            hlc r0 = (defpackage.hlc) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            hlc r0 = new hlc
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            long r9 = r0.o
            klc r0 = r0.d
            defpackage.g8j.b(r11)
        L2a:
            r3 = r9
            goto L48
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.g8j.b(r11)
            mk3 r11 = r8.d
            r0.d = r8
            r0.o = r9
            r0.Z = r3
            java.lang.Object r11 = r11.awaitInternal(r0)
            if (r11 != r1) goto L46
            return r1
        L46:
            r0 = r8
            goto L2a
        L48:
            java.util.concurrent.ConcurrentHashMap r9 = r0.e
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r3)
            java.lang.Object r9 = r9.get(r10)
            xac r9 = (defpackage.xac) r9
            if (r9 == 0) goto L58
            return r9
        L58:
            java.lang.Class<klc> r9 = defpackage.klc.class
            java.lang.String r9 = r9.getName()
            l6b r10 = defpackage.wqi.a
            if (r10 != 0) goto L63
            goto L71
        L63:
            lg8 r11 = defpackage.lg8.d
            boolean r1 = r10.b(r11)
            if (r1 == 0) goto L71
            java.lang.String r1 = "getProfile: return stubProfile"
            r2 = 0
            r10.c(r11, r9, r1, r2)
        L71:
            xac r2 = new xac
            id5 r5 = defpackage.id5.a
            hd5 r6 = defpackage.hd5.a
            k18 r9 = r0.b
            java.lang.Object r9 = r9.getValue()
            l24 r9 = (defpackage.l24) r9
            ku3 r7 = r9.a(r3)
            r2.<init>(r3, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klc.a(long, q44):java.lang.Object");
    }

    public final void b(wac wacVar) {
        String name = klc.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "putProfile: " + wacVar, null);
            }
        }
        svi.e(this.c, null, null, new ilc(wacVar, this, null), 3);
    }
}
