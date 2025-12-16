package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class xqf {
    public final hwa a;
    public pb2 b;
    public final o7e c;
    public final z7c d;
    public final f8c e;
    public final oje f;
    public final k18 g;
    public final k18 h;
    public final lzf i;
    public final k18 j;
    public final x6i k;
    public final ssb l;
    public final spf m;
    public final String n;
    public volatile List o;
    public final n9a p;
    public volatile x9f q;
    public x9f r;

    public xqf(hwa hwaVar, w63 w63Var, k18 k18Var, pb2 pb2Var, o7e o7eVar, f7b f7bVar, z7c z7cVar, f8c f8cVar, oje ojeVar, k18 k18Var2, k18 k18Var3, ContextScope contextScope, lzf lzfVar) {
        this.a = hwaVar;
        this.b = pb2Var;
        this.c = o7eVar;
        this.d = z7cVar;
        this.e = f8cVar;
        this.f = ojeVar;
        this.g = k18Var2;
        this.h = k18Var3;
        this.i = lzfVar;
        this.j = k18Var;
        this.k = new x6i(3, this.b.b.b);
        this.l = new ssb(o7eVar, 10, f7bVar);
        this.m = new spf(this.b.b.b);
        String name = xqf.class.getName();
        this.n = name;
        this.o = hd5.a;
        Symbol symbol = o9a.a;
        this.p = new n9a();
        l6b l6bVar = wqi.a;
        Continuation continuation = null;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, this + " init", null);
            }
        }
        q2b q2bVar = (q2b) lzfVar;
        svi.e(contextScope, q2bVar.a(), null, new pqf(this, null), 2);
        hbd hbdVarJ = w63Var.j(this.b.a);
        int i = s65.d;
        this.r = zs0.e(new m36(gw0.d(gw0.u(new g56(new d53(zs0.g(hbdVarJ, v9j.h(1, y65.SECONDS)), 12), new ir9(2, this, xqf.class, "handleChatUpdate", "handleChatUpdate(Lru/ok/tamtam/chats/Chat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 1), q2bVar.a())), new kga(this, continuation, 27)), contextScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.xqf r10, defpackage.pb2 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            qqg r0 = defpackage.qqg.a
            boolean r1 = r12 instanceof defpackage.sqf
            if (r1 == 0) goto L18
            r1 = r12
            sqf r1 = (defpackage.sqf) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.Y = r2
            goto L1d
        L18:
            sqf r1 = new sqf
            r1.<init>(r10, r12)
        L1d:
            java.lang.Object r12 = r1.o
            g84 r2 = defpackage.g84.a
            int r3 = r1.Y
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            xqf r10 = r1.d
            defpackage.g8j.b(r12)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            return r0
        L2e:
            r11 = move-exception
            goto Laa
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            defpackage.g8j.b(r12)
            java.lang.String r12 = r10.n
            l6b r3 = defpackage.wqi.a
            r5 = 0
            if (r3 != 0) goto L44
            goto L57
        L44:
            lg8 r6 = defpackage.lg8.d
            boolean r7 = r3.b(r6)
            if (r7 == 0) goto L57
            long r7 = r11.a
            java.lang.String r9 = "handleChatUpdate "
            java.lang.String r7 = defpackage.vb9.e(r7, r9)
            r3.c(r6, r12, r7, r5)
        L57:
            r10.b = r11
            eh9 r11 = r11.c
            if (r11 != 0) goto L5e
            goto La9
        L5e:
            si9 r11 = r11.a
            if (r11 != 0) goto L63
            goto La9
        L63:
            z7c r12 = r10.d
            pe8 r12 = r12.a
            long r6 = r12.j()
            long r8 = r11.c
            long r6 = r6 - r8
            r8 = 60000(0xea60, double:2.9644E-319)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 <= 0) goto L76
            goto La9
        L76:
            d10 r11 = r11.k()     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            if (r11 == 0) goto L7f
            c10 r11 = r11.a     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            goto L80
        L7f:
            r11 = r5
        L80:
            if (r11 != 0) goto L84
            r11 = -1
            goto L8c
        L84:
            int[] r12 = defpackage.qqf.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            int r11 = r11.ordinal()     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            r11 = r12[r11]     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
        L8c:
            if (r11 == r4) goto L95
            r12 = 2
            if (r11 == r12) goto L95
            r12 = 3
            if (r11 == r12) goto L95
            goto La9
        L95:
            r1.d = r10     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            r1.Y = r4     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            uqf r11 = new uqf     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            r11.<init>(r10, r5)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            java.lang.Object r10 = defpackage.d7j.d(r11, r1)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> Lb2
            if (r10 != r2) goto La5
            goto La6
        La5:
            r10 = r0
        La6:
            if (r10 != r2) goto La9
            return r2
        La9:
            return r0
        Laa:
            java.lang.String r10 = r10.n
            java.lang.String r12 = "Got error during handling event"
            defpackage.wqi.e(r10, r12, r11)
            return r0
        Lb2:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqf.a(xqf, pb2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static boolean e(pb2 pb2Var) {
        return pb2Var.b.a != 0 && pb2Var.j0() && pb2Var.F() && pb2Var.s0();
    }

    public final qpf b() {
        return (this.f.k == 3 && this.b.b.e.size() < this.b.b.c()) ? new z95(this.b.b.a, this.a, this.l, this.g) : new lz9(this.c, this.l, this.d, this.e, this.g, new vgd(6, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.q44 r8) {
        /*
            r7 = this;
            qqg r0 = defpackage.qqg.a
            boolean r1 = r8 instanceof defpackage.vqf
            if (r1 == 0) goto L15
            r1 = r8
            vqf r1 = (defpackage.vqf) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            vqf r1 = new vqf
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.o
            g84 r2 = defpackage.g84.a
            int r3 = r1.Y
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            xqf r1 = r1.d
            defpackage.g8j.b(r8)
            goto L4e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.g8j.b(r8)
            k18 r8 = r7.j
            java.lang.Object r8 = r8.getValue()
            rr0 r8 = (defpackage.rr0) r8
            pb2 r3 = r7.b
            long r5 = r3.a
            r1.d = r7
            r1.Y = r4
            java.io.Serializable r8 = r8.d(r5, r1)
            if (r8 != r2) goto L4d
            return r2
        L4d:
            r1 = r7
        L4e:
            sr0 r8 = (defpackage.sr0) r8
            if (r8 != 0) goto L53
            return r0
        L53:
            x6i r2 = r1.k
            java.util.List r3 = r8.a
            java.util.Map r8 = r8.b
            r2.getClass()
            if (r3 != 0) goto L61
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            goto L6b
        L61:
            i00 r4 = new i00
            r5 = 2
            r4.<init>(r2, r5, r8)
            java.util.ArrayList r8 = defpackage.jqi.g(r3, r4)
        L6b:
            r1.o = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqf.c(q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (c(r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.wqf
            if (r0 == 0) goto L14
            r0 = r11
            wqf r0 = (defpackage.wqf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.s0 = r1
        L12:
            r7 = r0
            goto L1c
        L14:
            wqf r0 = new wqf
            q44 r11 = (defpackage.q44) r11
            r0.<init>(r8, r11)
            goto L12
        L1c:
            java.lang.Object r11 = r7.Y
            g84 r0 = defpackage.g84.a
            int r1 = r7.s0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            defpackage.g8j.b(r11)
            goto L88
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            int r10 = r7.X
            java.lang.String r9 = r7.o
            xqf r1 = r7.d
            defpackage.g8j.b(r11)
            goto L62
        L40:
            defpackage.g8j.b(r11)
            java.util.List r11 = r8.o
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L65
            pb2 r11 = r8.b
            boolean r11 = e(r11)
            if (r11 == 0) goto L65
            r7.d = r8
            r7.o = r9
            r7.X = r10
            r7.s0 = r3
            java.lang.Object r11 = r8.c(r7)
            if (r11 != r0) goto L65
            goto L87
        L62:
            r3 = r9
            r4 = r10
            goto L67
        L65:
            r1 = r8
            goto L62
        L67:
            spf r9 = r1.m
            java.util.List r10 = r1.o
            java.util.List r5 = defpackage.ue3.d0(r10)
            qpf r6 = r1.b()
            r10 = 0
            r7.d = r10
            r7.o = r10
            r7.s0 = r2
            pf2 r10 = r9.a
            xpf r2 = defpackage.io5.a(r3, r4, r10)
            r1 = r9
            java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L88
        L87:
            return r0
        L88:
            java.util.List r11 = (java.util.List) r11
            java.util.List r9 = defpackage.ue3.d0(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqf.d(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
