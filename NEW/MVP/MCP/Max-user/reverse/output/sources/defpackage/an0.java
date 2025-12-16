package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class an0 implements le9 {
    public final long a;
    public final br2 b;
    public final lzf c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final ContextScope g;
    public final tcf h;
    public final hbd i;
    public final tcf j;
    public final hbd k;
    public final AtomicLong l;
    public final AtomicBoolean m;

    public an0(long j, br2 br2Var, lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = j;
        this.b = br2Var;
        this.c = lzfVar;
        this.d = k18Var3;
        this.e = k18Var2;
        this.f = k18Var;
        q2b q2bVar = (q2b) lzfVar;
        ContextScope contextScopeA = d7j.a(q2bVar.b());
        this.g = contextScopeA;
        tcf tcfVarA = ucf.a(hd5.a);
        this.h = tcfVarA;
        this.i = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.j = tcfVarA2;
        tcf tcfVarA3 = ucf.a(null);
        this.k = new hbd(tcfVarA3);
        this.l = new AtomicLong(0L);
        this.m = new AtomicBoolean(false);
        svi.e(contextScopeA, null, null, new um0(k18Var, this, k18Var4, null), 3);
        gw0.w(gw0.u(new g56(new x3(gw0.m(gw0.k(tcfVarA2, 200L)), this, 4), new rw(2, tcfVarA3, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 1), q2bVar.b()), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable g(defpackage.an0 r11, java.lang.String r12, long r13, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an0.g(an0, java.lang.String, long, q44):java.io.Serializable");
    }

    @Override // defpackage.le9
    public final void a(String str) {
        this.j.setValue(str);
    }

    @Override // defpackage.le9
    public final x26 b() {
        return this.k;
    }

    @Override // defpackage.le9
    public final boolean d() {
        return this.l.get() != -1;
    }

    @Override // defpackage.le9
    public final hbd e() {
        return this.i;
    }

    @Override // defpackage.le9
    public final void f() {
        if (this.m.compareAndSet(false, true)) {
            svi.e(this.g, null, null, new ym0(this, null), 3).invokeOnCompletion(new k(14, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.ArrayList r7, defpackage.q44 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wm0
            if (r0 == 0) goto L13
            r0 = r8
            wm0 r0 = (defpackage.wm0) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            wm0 r0 = new wm0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r8)
            goto L73
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2d:
            defpackage.g8j.b(r8)
            lzf r8 = r6.c
            q2b r8 = (defpackage.q2b) r8
            z74 r8 = r8.a()
            if (r8 != 0) goto L3c
            x74 r8 = r0.b
        L3c:
            kotlinx.coroutines.internal.ContextScope r8 = defpackage.d7j.a(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.we3.q(r7, r3)
            r1.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L4f:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r7.next()
            vm0 r4 = new vm0
            r5 = 0
            r4.<init>(r3, r5, r6)
            r3 = 3
            cs4 r3 = defpackage.svi.b(r8, r5, r4, r3)
            r1.add(r3)
            goto L4f
        L68:
            r0.X = r2
            java.lang.Object r8 = defpackage.hui.b(r1, r0)
            g84 r7 = defpackage.g84.a
            if (r8 != r7) goto L73
            return r7
        L73:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r7 = defpackage.ue3.E(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an0.h(java.util.ArrayList, q44):java.lang.Object");
    }
}
