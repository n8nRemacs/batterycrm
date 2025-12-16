package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class qg2 extends b95 {
    public static final /* synthetic */ yy7[] F = {new z8a(qg2.class, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, qg2.class, "deleteChatJob", "getDeleteChatJob()Lkotlinx/coroutines/Job;")};
    public final t9f A;
    public final kh5 B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final long n;
    public final AtomicBoolean o;
    public volatile boolean p;
    public final k18 q;
    public final k18 r;
    public final k18 s;
    public final k18 t;
    public final k18 u;
    public final k18 v;
    public final k18 w;
    public final k18 x;
    public final k18 y;
    public final t9f z;

    public qg2(long j, ContextScope contextScope) {
        super(contextScope);
        this.n = j;
        boolean z = false;
        this.o = new AtomicBoolean(false);
        yec yecVar = yec.a;
        this.q = yecVar.a();
        k18 k18VarB = yecVar.b();
        this.r = k18VarB;
        this.s = yecVar.c();
        this.t = yecVar.getAccessor().d(254);
        this.u = yecVar.getAccessor().d(186);
        this.v = yecVar.getAccessor().d(224);
        this.w = yecVar.getAccessor().d(225);
        this.x = yecVar.getAccessor().d(226);
        this.y = yecVar.getAccessor().d(83);
        this.z = c7j.c();
        this.A = c7j.c();
        this.B = new kh5(0, ve3.j(new x28(), new ed5()));
        pb2 pb2VarP = p();
        this.C = pb2VarP != null && pb2VarP.M();
        pb2 pb2VarP2 = p();
        this.D = pb2VarP2 != null && pb2VarP2.i0();
        pb2 pb2VarP3 = p();
        if (pb2VarP3 != null && pb2VarP3.v()) {
            z = true;
        }
        this.E = z;
        gw0.w(gw0.u(new g56(new x3(new mwd(new ng2(new d53(((w63) k18VarB.getValue()).j(j), 12), null, this)), this, 13), new cg2(this, null), 1), ((q2b) q()).a()), contextScope);
    }

    public static final void n(qg2 qg2Var) {
        qg2Var.A.O(qg2Var, F[1], svi.d(qg2Var.a, ((q2b) qg2Var.q()).b(), i84.b, new fg2(qg2Var, null)));
    }

    public static final r85 o(qg2 qg2Var, pb2 pb2Var) {
        String strI = pb2Var.i(il0.c, hl0.a);
        long j = pb2Var.b.a;
        pb2Var.q0();
        return new r85(strI, j, pb2Var.w0, pb2Var.s(), null, pb2Var.m(), pb2Var.b.o0);
    }

    @Override // defpackage.b95
    public final void a(int i) {
        svi.e(this.a, ((q2b) q()).a(), null, new dg2(i, this, null), 2);
    }

    @Override // defpackage.b95
    public final void b() {
        yy7[] yy7VarArr = F;
        yy7 yy7Var = yy7VarArr[1];
        t9f t9fVar = this.A;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[1], null);
        yy7 yy7Var2 = yy7VarArr[0];
        t9f t9fVar2 = this.z;
        qt7 qt7Var2 = (qt7) t9fVar2.D(this, yy7Var2);
        if (qt7Var2 != null) {
            qt7Var2.cancel(null);
        }
        t9fVar2.O(this, yy7VarArr[0], null);
    }

    @Override // defpackage.b95
    public final boolean d() {
        return this.p;
    }

    @Override // defpackage.b95
    public final long e() {
        return this.n;
    }

    @Override // defpackage.b95
    public final void g(int i) {
        svi.e(this.a, ((q2b) q()).a(), null, new hg2(i, this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.b95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r10, android.graphics.RectF r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ig2
            if (r0 == 0) goto L14
            r0 = r12
            ig2 r0 = (defpackage.ig2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            ig2 r0 = new ig2
            q44 r12 = (defpackage.q44) r12
            r0.<init>(r9, r12)
            goto L12
        L1c:
            java.lang.Object r12 = r6.o
            int r0 = r6.Y
            qqg r7 = defpackage.qqg.a
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            java.util.concurrent.atomic.AtomicLong r10 = r6.d
            defpackage.g8j.b(r12)
            goto L61
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.g8j.b(r12)
            pb2 r12 = r9.p()
            if (r12 != 0) goto L3f
            return r7
        L3f:
            n10 r5 = defpackage.qfi.a(r11)
            k18 r11 = r9.w
            java.lang.Object r11 = r11.getValue()
            y72 r11 = (defpackage.y72) r11
            long r2 = r12.a
            java.util.concurrent.atomic.AtomicLong r12 = r9.m
            r6.d = r12
            r6.Y = r1
            r4 = r10
            r1 = r11
            java.lang.Object r10 = r1.a(r2, r4, r5, r6)
            g84 r11 = defpackage.g84.a
            if (r10 != r11) goto L5e
            return r11
        L5e:
            r8 = r12
            r12 = r10
            r10 = r8
        L61:
            java.lang.Number r12 = (java.lang.Number) r12
            long r11 = r12.longValue()
            r10.set(r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg2.h(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.b95
    public final qqg i() {
        pb2 pb2VarP = p();
        qqg qqgVar = qqg.a;
        if (pb2VarP == null) {
            return qqgVar;
        }
        tcf tcfVar = this.b;
        xec xecVar = (xec) tcfVar.getValue();
        tcfVar.setValue(xecVar != null ? xec.a(xecVar, pb2VarP.b.b(il0.c, hl0.a), false, 126) : null);
        return qqgVar;
    }

    @Override // defpackage.b95
    public final void j() {
        svi.e(this.a, ((q2b) q()).b(), null, new jg2(this, null), 2);
    }

    @Override // defpackage.b95
    public final void k() {
        svi.e(this.a, ((q2b) q()).a(), null, new kg2(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.b95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.q44 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.og2
            if (r0 == 0) goto L13
            r0 = r11
            og2 r0 = (defpackage.og2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            og2 r0 = new og2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L26
            defpackage.g8j.b(r11)
            goto Lcf
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2e:
            defpackage.g8j.b(r11)
            tcf r11 = r10.j
            java.lang.Object r1 = r11.getValue()
            r85 r1 = (defpackage.r85) r1
            if (r1 != 0) goto L3e
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L3e:
            pb2 r3 = r10.p()
            if (r3 != 0) goto L47
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L47:
            java.lang.Object r4 = r11.getValue()
            r85 r4 = (defpackage.r85) r4
            r5 = 0
            if (r4 == 0) goto L53
            java.lang.String r4 = r4.d
            goto L54
        L53:
            r4 = r5
        L54:
            if (r4 != 0) goto L58
            java.lang.String r4 = ""
        L58:
            kh5 r6 = r10.B
            r7 = 3
            zf3 r4 = r6.a(r7, r4)
            if (r4 != 0) goto L63
            r6 = r2
            goto L64
        L63:
            r6 = 0
        L64:
            java.lang.Object r7 = r11.getValue()
            r85 r7 = (defpackage.r85) r7
            if (r7 == 0) goto L73
            r8 = 111(0x6f, float:1.56E-43)
            r85 r4 = defpackage.r85.c(r7, r5, r4, r5, r8)
            goto L74
        L73:
            r4 = r5
        L74:
            r11.setValue(r4)
            u85 r11 = r10.f()
            java.util.List r11 = r11.a(r10)
            tcf r4 = r10.c
            r4.setValue(r11)
            if (r6 != 0) goto L89
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L89:
            rf2 r11 = r3.b
            long r6 = r11.a
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto Lb5
            java.lang.Class<qg2> r11 = defpackage.qg2.class
            java.lang.String r11 = r11.getName()
            java.lang.String r0 = "Try update chat description or title with charServerId == 0"
            defpackage.wqi.r(r11, r0)
            k18 r11 = r10.y
            java.lang.Object r11 = r11.getValue()
            j94 r11 = (defpackage.j94) r11
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Try update chat description or title with charServerId == 0. ChatEditProfile"
            r0.<init>(r1)
            java.lang.String r1 = "ONEME-18920"
            r11.a(r1, r0)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        Lb5:
            lzf r11 = r10.q()
            q2b r11 = (defpackage.q2b) r11
            z74 r11 = r11.b()
            pg2 r4 = new pg2
            r4.<init>(r1, r10, r3, r5)
            r0.X = r2
            java.lang.Object r11 = defpackage.svi.i(r11, r4, r0)
            g84 r0 = defpackage.g84.a
            if (r11 != r0) goto Lcf
            return r0
        Lcf:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg2.l(q44):java.lang.Object");
    }

    @Override // defpackage.b95
    public final void m(int i, String str) {
        r85 r85Var;
        tcf tcfVar = this.j;
        if (i == 131072) {
            r85 r85Var2 = (r85) tcfVar.getValue();
            if (r85Var2 == null) {
                return;
            }
            tcfVar.m(null, r85.c(r85Var2, str, null, null, 103));
            return;
        }
        if (i != 4 || (r85Var = (r85) tcfVar.getValue()) == null) {
            return;
        }
        tcfVar.m(null, r85.c(r85Var, null, null, str, 95));
    }

    public final pb2 p() {
        return (pb2) ((w63) this.r.getValue()).j(this.n).a.getValue();
    }

    public final lzf q() {
        return (lzf) this.s.getValue();
    }
}
