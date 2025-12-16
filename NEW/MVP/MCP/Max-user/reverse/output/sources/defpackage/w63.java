package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w63 implements ue2, ui8 {
    public final lzf a;
    public final a93 b;
    public final k18 c;
    public final k18 d;

    public w63(k18 k18Var, k18 k18Var2, k18 k18Var3, lzf lzfVar) {
        this.a = lzfVar;
        a93 a93Var = new a93();
        a93Var.a = k18Var;
        a93Var.b = k18Var2;
        a93Var.c = k18Var3;
        a93Var.d = new bwf(new b63(lzfVar, 0));
        a93Var.o = new ConcurrentHashMap();
        a93Var.X = new ConcurrentHashMap();
        a93Var.Y = new AtomicBoolean(false);
        this.b = a93Var;
        this.c = k18Var3;
        this.d = k18Var2;
        svi.e(d7j.a(((q2b) lzfVar).b()), null, null, new l63(k18Var2, this, null), 3);
    }

    @Override // defpackage.ue2
    public final void a(Collection collection) {
        this.b.a(collection);
    }

    @Override // defpackage.ue2
    public final void b(Collection collection) {
        this.b.b(collection);
    }

    @Override // defpackage.ui8
    public final void c() {
        a93 a93Var = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) a93Var.X;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) a93Var.o;
        x9f x9fVar = (x9f) a93Var.Z;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        ((AtomicBoolean) a93Var.Y).set(false);
        a93Var.Z = null;
        Iterator it = concurrentHashMap2.values().iterator();
        while (it.hasNext()) {
            ((f9a) it.next()).setValue(null);
        }
        Iterator it2 = concurrentHashMap.values().iterator();
        while (it2.hasNext()) {
            ((f9a) it2.next()).setValue(null);
        }
        concurrentHashMap2.clear();
        concurrentHashMap.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r9, defpackage.q44 r11, java.util.List r12, boolean r13) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.m63
            if (r0 == 0) goto L13
            r0 = r11
            m63 r0 = (defpackage.m63) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            m63 r0 = new m63
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.Z
            int r1 = r0.t0
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            boolean r13 = r0.Y
            long r9 = r0.X
            java.util.List r12 = r0.o
            w63 r0 = r0.d
            defpackage.g8j.b(r11)
        L2c:
            r2 = r9
            r6 = r12
            r7 = r13
            goto L50
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.g8j.b(r11)
            r0.d = r8
            r0.o = r12
            r0.X = r9
            r0.Y = r13
            r0.t0 = r2
            java.lang.Object r11 = r8.r(r9, r0)
            g84 r0 = defpackage.g84.a
            if (r11 != r0) goto L4e
            return r0
        L4e:
            r0 = r8
            goto L2c
        L50:
            pb2 r11 = (defpackage.pb2) r11
            ve2 r9 = r0.i()
            rf2 r10 = r11.b
            long r4 = r10.a
            r9.getClass()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "addChatUsers, chatId = "
            r10.<init>(r11)
            r10.append(r2)
            java.lang.String r11 = ", ids = "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "ve2"
            defpackage.wqi.d(r11, r10)
            r9.o(r2, r6)
            kz4 r9 = r9.q
            java.lang.Object r9 = r9.get()
            r1 = r9
            hwa r1 = (defpackage.hwa) r1
            r1.a(r2, r4, r6, r7)
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w63.d(long, q44, java.util.List, boolean):java.lang.Object");
    }

    public final Object e(long j, sm6 sm6Var, q44 q44Var) {
        ve2 ve2VarI = i();
        ve2VarI.getClass();
        return si2.d(ve2VarI, j, false, sm6Var, q44Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable f(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.o63
            if (r0 == 0) goto L13
            r0 = r5
            o63 r0 = (defpackage.o63) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            o63 r0 = new o63
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r5)
            goto L59
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.g8j.b(r5)
            ve2 r5 = r4.i()
            tcf r5 = r5.T()
            java.lang.Object r5 = r5.getValue()
            pb2 r5 = (defpackage.pb2) r5
            if (r5 != 0) goto L5b
            lzf r5 = r4.a
            q2b r5 = (defpackage.q2b) r5
            z74 r5 = r5.b()
            p63 r1 = new p63
            r3 = 0
            r1.<init>(r4, r3)
            r0.X = r2
            java.lang.Object r5 = defpackage.svi.i(r5, r1, r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L59
            return r0
        L59:
            pb2 r5 = (defpackage.pb2) r5
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w63.f(q44):java.lang.Comparable");
    }

    public final pb2 g(long j) {
        try {
            return (pb2) j(j).a.getValue();
        } catch (Throwable th) {
            wqi.e(w63.class.getName(), "failed to fetch chat for #" + j, th);
            return null;
        }
    }

    public final Object h(long j, q44 q44Var) {
        return vmi.i(bd5.a, new j63(this, j, 1), q44Var);
    }

    public final ve2 i() {
        return (ve2) this.d.getValue();
    }

    public final hbd j(long j) {
        a93 a93Var = this.b;
        return new hbd((f9a) ((ConcurrentHashMap) a93Var.o).computeIfAbsent(Long.valueOf(j), new ni(6, new c63(a93Var, j, 0))));
    }

    public final hbd k(long j) {
        a93 a93Var = this.b;
        return new hbd((f9a) ((ConcurrentHashMap) a93Var.X).computeIfAbsent(Long.valueOf(j), new ni(7, new c63(a93Var, j, 1))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.n8a r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.r63
            if (r0 == 0) goto L13
            r0 = r6
            r63 r0 = (defpackage.r63) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            r63 r0 = new r63
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r6)
            return r6
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r6)
            qn2 r6 = new qn2
            r1 = 4
            r6.<init>(r4, r1, r5)
            r0.X = r2
            bd5 r5 = defpackage.bd5.a
            java.lang.Object r5 = defpackage.vmi.i(r5, r6, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L43
            return r6
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w63.l(n8a, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.Set r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.q63
            if (r0 == 0) goto L13
            r0 = r6
            q63 r0 = (defpackage.q63) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            q63 r0 = new q63
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r6)
            return r6
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r6)
            qn2 r6 = new qn2
            r1 = 5
            r6.<init>(r4, r1, r5)
            r0.X = r2
            bd5 r5 = defpackage.bd5.a
            java.lang.Object r5 = defpackage.vmi.i(r5, r6, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L43
            return r6
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w63.m(java.util.Set, q44):java.lang.Object");
    }

    public final pb2 n(long j) {
        return i().P(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(long r5, java.util.Set r7, defpackage.q44 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.s63
            if (r0 == 0) goto L13
            r0 = r8
            s63 r0 = (defpackage.s63) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            s63 r0 = new s63
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.util.Set r7 = r0.o
            w63 r5 = r0.d
            defpackage.g8j.b(r8)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r8)
            r0.d = r4
            r0.o = r7
            r0.Z = r2
            java.lang.Object r8 = r4.r(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r8 != r5) goto L43
            return r5
        L43:
            r5 = r4
        L44:
            pb2 r8 = (defpackage.pb2) r8
            ve2 r5 = r5.i()
            rf2 r6 = r8.b
            r5.getClass()
            df2 r5 = defpackage.ve2.R(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w63.o(long, java.util.Set, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.t63
            if (r0 == 0) goto L13
            r0 = r7
            t63 r0 = (defpackage.t63) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            t63 r0 = new t63
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r7)
            return r7
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r7)
            lzf r7 = r4.a
            q2b r7 = (defpackage.q2b) r7
            z74 r7 = r7.b()
            j63 r1 = new j63
            r3 = 0
            r1.<init>(r4, r5, r3)
            r0.X = r2
            java.lang.Object r5 = defpackage.vmi.i(r7, r1, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L49
            return r6
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w63.p(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final mcf q() {
        a93 a93Var = this.b;
        tcf tcfVarT = a93Var.i().T();
        if (tcfVarT.getValue() != null && ((AtomicBoolean) a93Var.Y).compareAndSet(false, true)) {
            ((f9a) ((ConcurrentHashMap) a93Var.X).computeIfAbsent(0L, new ni(5, new d92(9, tcfVarT)))).setValue(tcfVarT.getValue());
            if (((x9f) a93Var.Z) == null) {
                a93Var.Z = zs0.e(new g56(new d53(tcfVarT, 12), new g63(a93Var, null), 1), (f84) ((bwf) a93Var.d).getValue());
            }
        }
        return tcfVarT;
    }

    public Object r(long j, Continuation continuation) {
        return gw0.p(new d53(j(j), 12), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r13.e(r1, r10, r5) == r9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(long r17, java.util.Set r19, int r20, defpackage.q44 r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            r4 = r21
            boolean r5 = r4 instanceof defpackage.u63
            if (r5 == 0) goto L1b
            r5 = r4
            u63 r5 = (defpackage.u63) r5
            int r6 = r5.t0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1b
            int r6 = r6 - r7
            r5.t0 = r6
            goto L20
        L1b:
            u63 r5 = new u63
            r5.<init>(r0, r4)
        L20:
            java.lang.Object r4 = r5.Z
            int r6 = r5.t0
            r7 = 2
            r8 = 1
            g84 r9 = defpackage.g84.a
            if (r6 == 0) goto L4a
            if (r6 == r8) goto L3a
            if (r6 != r7) goto L32
            defpackage.g8j.b(r4)
            goto L7b
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            int r1 = r5.Y
            long r2 = r5.X
            java.util.Set r6 = r5.o
            w63 r8 = r5.d
            defpackage.g8j.b(r4)
            r12 = r1
            r1 = r2
            r14 = r6
            r13 = r8
            goto L64
        L4a:
            defpackage.g8j.b(r4)
            r5.d = r0
            r5.o = r3
            r5.X = r1
            r4 = r20
            r5.Y = r4
            r5.t0 = r8
            java.lang.Object r6 = r0.o(r1, r3, r5)
            if (r6 != r9) goto L60
            goto L7a
        L60:
            r13 = r0
            r14 = r3
            r12 = r4
            r4 = r6
        L64:
            r11 = r4
            df2 r11 = (defpackage.df2) r11
            v63 r10 = new v63
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r3 = 0
            r5.d = r3
            r5.o = r3
            r5.t0 = r7
            java.lang.Object r1 = r13.e(r1, r10, r5)
            if (r1 != r9) goto L7b
        L7a:
            return r9
        L7b:
            qqg r1 = defpackage.qqg.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w63.s(long, java.util.Set, int, q44):java.lang.Object");
    }
}
