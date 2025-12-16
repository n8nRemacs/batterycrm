package defpackage;

import java.io.Serializable;
import java.util.Set;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class p6a {
    public static final /* synthetic */ yy7[] j;
    public final f84 a;
    public final lzf b;
    public final mcf c;
    public final ir9 d;
    public final k18 e;
    public final tcf f;
    public final hbd g;
    public final t9f h;
    public final n9a i;

    static {
        z8a z8aVar = new z8a(p6a.class, "newSelectionJob", "getNewSelectionJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        j = new yy7[]{z8aVar};
    }

    public p6a(k18 k18Var, ContextScope contextScope, lzf lzfVar, hbd hbdVar, ir9 ir9Var) {
        this.a = contextScope;
        this.b = lzfVar;
        this.c = hbdVar;
        this.d = ir9Var;
        this.e = k18Var;
        tcf tcfVarA = ucf.a(new g6a());
        this.f = tcfVarA;
        this.g = new hbd(tcfVarA);
        this.h = c7j.c();
        Symbol symbol = o9a.a;
        this.i = new n9a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.p6a r10, defpackage.em6 r11, defpackage.q44 r12) {
        /*
            tcf r0 = r10.f
            boolean r1 = r12 instanceof defpackage.n6a
            if (r1 == 0) goto L15
            r1 = r12
            n6a r1 = (defpackage.n6a) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            n6a r1 = new n6a
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.X
            int r2 = r1.Z
            qqg r3 = defpackage.qqg.a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.util.Set r10 = r1.o
            p6a r11 = r1.d
            defpackage.g8j.b(r12)
            r2 = r10
            r10 = r11
            goto L9a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.g8j.b(r12)
            java.lang.Object r12 = r0.getValue()
            g6a r12 = (defpackage.g6a) r12
            java.util.Set r12 = r12.a
            java.util.Set r2 = defpackage.ue3.g0(r12)
            java.util.Iterator r6 = r12.iterator()
        L4b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            java.lang.Object r9 = r11.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4b
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            r2.remove(r9)
            goto L4b
        L75:
            boolean r11 = r12.equals(r2)
            if (r11 == 0) goto L7c
            return r3
        L7c:
            boolean r11 = r2.isEmpty()
            if (r11 == 0) goto L8b
            g6a r10 = new g6a
            r10.<init>()
            r0.m(r5, r10)
            return r3
        L8b:
            r1.d = r10
            r1.o = r2
            r1.Z = r4
            java.io.Serializable r12 = r10.d(r2, r1)
            g84 r11 = defpackage.g84.a
            if (r12 != r11) goto L9a
            return r11
        L9a:
            java.util.List r12 = (java.util.List) r12
            tcf r10 = r10.f
            g6a r11 = new g6a
            r11.<init>(r2, r12)
            r10.m(r5, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6a.a(p6a, em6, q44):java.lang.Object");
    }

    public static vfb c(gh9 gh9Var) {
        int iOrdinal = gh9Var.ordinal();
        if (iOrdinal == 0) {
            return new vfb(j7b.v, l7b.t, yud.T1);
        }
        if (iOrdinal == 1) {
            return new vfb(j7b.q, l7b.m, yud.u);
        }
        if (iOrdinal == 4) {
            return new vfb(j7b.y, l7b.w, yud.L1);
        }
        if (iOrdinal == 5) {
            return new vfb(j7b.s, l7b.q, yud.x);
        }
        if (iOrdinal == 7) {
            return new vfb(j7b.x, l7b.v, yud.A1);
        }
        if (iOrdinal != 8) {
            return null;
        }
        return new vfb(j7b.C, l7b.B, yud.y1);
    }

    public final void b() {
        this.f.m(null, new g6a());
    }

    public final Serializable d(Set set, q44 q44Var) {
        return set.isEmpty() ? hd5.a : set.size() == 1 ? f(((hr9) this.c.getValue()).e(((Number) ue3.F(set)).longValue()), q44Var) : e(set, q44Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.util.Set r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.h6a
            if (r0 == 0) goto L13
            r0 = r6
            h6a r0 = (defpackage.h6a) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            h6a r0 = new h6a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.Y
            int r1 = r0.s0
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            o98 r5 = r0.X
            o98 r1 = r0.o
            p6a r0 = r0.d
            defpackage.g8j.b(r6)
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r6)
            o98 r6 = defpackage.ve3.d()
            k18 r1 = r4.e
            java.lang.Object r1 = r1.getValue()
            nh9 r1 = (defpackage.nh9) r1
            r0.d = r4
            r0.o = r6
            r0.X = r6
            r0.s0 = r2
            java.io.Serializable r5 = r1.e(r5, r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L53
            return r0
        L53:
            r0 = r4
            r1 = r6
            r6 = r5
            r5 = r1
        L57:
            java.util.Collection r6 = (java.util.Collection) r6
            r5.addAll(r6)
            o98 r5 = defpackage.ve3.a(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1 = 0
            java.util.ListIterator r5 = r5.listIterator(r1)
        L6a:
            r1 = r5
            m98 r1 = (defpackage.m98) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r1 = r1.next()
            gh9 r1 = (defpackage.gh9) r1
            r0.getClass()
            vfb r1 = c(r1)
            if (r1 == 0) goto L6a
            r6.add(r1)
            goto L6a
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6a.e(java.util.Set, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(one.me.messages.list.loader.MessageModel r6, defpackage.q44 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.i6a
            if (r0 == 0) goto L13
            r0 = r7
            i6a r0 = (defpackage.i6a) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            i6a r0 = new i6a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.Y
            int r1 = r0.s0
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            o98 r6 = r0.X
            o98 r1 = r0.o
            p6a r0 = r0.d
            defpackage.g8j.b(r7)
            goto L5e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.g8j.b(r7)
            if (r6 != 0) goto L3b
            hd5 r6 = defpackage.hd5.a
            return r6
        L3b:
            o98 r7 = defpackage.ve3.d()
            k18 r1 = r5.e
            java.lang.Object r1 = r1.getValue()
            nh9 r1 = (defpackage.nh9) r1
            long r3 = r6.a
            r0.d = r5
            r0.o = r7
            r0.X = r7
            r0.s0 = r2
            java.io.Serializable r6 = r1.d(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L5a
            return r0
        L5a:
            r0 = r5
            r1 = r7
            r7 = r6
            r6 = r1
        L5e:
            java.util.Collection r7 = (java.util.Collection) r7
            r6.addAll(r7)
            o98 r6 = defpackage.ve3.a(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1 = 0
            java.util.ListIterator r6 = r6.listIterator(r1)
        L71:
            r1 = r6
            m98 r1 = (defpackage.m98) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r1 = r1.next()
            gh9 r1 = (defpackage.gh9) r1
            r0.getClass()
            vfb r1 = c(r1)
            if (r1 == 0) goto L71
            r7.add(r1)
            goto L71
        L8d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6a.f(one.me.messages.list.loader.MessageModel, q44):java.io.Serializable");
    }

    public final boolean g() {
        return !((g6a) this.g.a.getValue()).a.isEmpty();
    }

    public final void h(long j2) {
        x9f x9fVarD = svi.d(this.a, ((q2b) this.b).a(), i84.b, new k6a(j2, this, null));
        this.h.O(this, j[0], x9fVarD);
    }
}
