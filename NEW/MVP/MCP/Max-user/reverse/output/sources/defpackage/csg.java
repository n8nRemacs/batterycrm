package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class csg {
    public static final /* synthetic */ yy7[] j;
    public final mcf a;
    public final mcf b;
    public final f84 c;
    public final lzf d;
    public volatile boolean g;
    public final String e = csg.class.getName();
    public final ci5 f = new ci5(1);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final t9f i = c7j.c();

    static {
        z8a z8aVar = new z8a(csg.class, "invalidateMarkerJob", "getInvalidateMarkerJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        j = new yy7[]{z8aVar};
    }

    public csg(hbd hbdVar, hbd hbdVar2, ContextScope contextScope, lzf lzfVar) {
        this.a = hbdVar;
        this.b = hbdVar2;
        this.c = contextScope;
        this.d = lzfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.pb2 r13, defpackage.hr9 r14, defpackage.dtf r15) throws java.lang.Throwable {
        /*
            r12 = this;
            lg8 r0 = defpackage.lg8.d
            qqg r1 = defpackage.qqg.a
            boolean r2 = r12.g
            if (r2 != 0) goto Lbe
            long r2 = defpackage.szi.b(r13)
            int r4 = r14.f(r2)
            r5 = 1
            if (r4 >= 0) goto L18
            int r4 = java.lang.Math.abs(r4)
            int r4 = r4 - r5
        L18:
            java.util.List r6 = r14.a
            java.lang.Object r6 = defpackage.ue3.J(r4, r6)
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            r7 = 0
            if (r6 == 0) goto L2b
            long r8 = r6.c
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 != 0) goto L2b
            r8 = r5
            goto L2c
        L2b:
            r8 = r7
        L2c:
            r9 = 0
            if (r4 != 0) goto L35
            boolean r10 = r14.c
            if (r10 == 0) goto L35
            if (r8 == 0) goto L37
        L35:
            if (r6 != 0) goto L61
        L37:
            r12.g = r7
            java.lang.String r13 = r12.e
            l6b r14 = defpackage.wqi.a
            if (r14 != 0) goto L41
            goto Lbe
        L41:
            boolean r15 = r14.b(r0)
            if (r15 == 0) goto Lbe
            if (r6 == 0) goto L4e
            java.lang.String r15 = r6.n()
            goto L4f
        L4e:
            r15 = r9
        L4f:
            java.lang.String r4 = "Can't find unreadMarker by chatReadMark:"
            java.lang.String r5 = ", isExact:"
            java.lang.StringBuilder r2 = defpackage.xc0.j(r2, r4, r5, r8)
            java.lang.String r3 = ", firstUnread:"
            java.lang.String r15 = defpackage.ho7.l(r2, r3, r15)
            r14.c(r0, r13, r15, r9)
            return r1
        L61:
            long r6 = r6.c
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L68
            goto L90
        L68:
            if (r8 == 0) goto L8c
            java.util.List r13 = r14.a
            int r4 = r4 + r5
            java.lang.Object r13 = defpackage.ue3.J(r4, r13)
            one.me.messages.list.loader.MessageModel r13 = (one.me.messages.list.loader.MessageModel) r13
            r6 = 1
            r10 = 0
            if (r13 == 0) goto L86
            long r2 = r13.b
            int r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r14 != 0) goto L81
        L7f:
            r2 = r10
            goto L90
        L81:
            long r13 = r13.c
            long r2 = r13 - r6
            goto L90
        L86:
            boolean r13 = r14.b
            if (r13 == 0) goto L7f
            long r2 = r2 + r6
            goto L90
        L8c:
            long r2 = defpackage.szi.b(r13)
        L90:
            java.lang.String r13 = r12.e
            l6b r14 = defpackage.wqi.a
            if (r14 != 0) goto L97
            goto La6
        L97:
            boolean r4 = r14.b(r0)
            if (r4 == 0) goto La6
            java.lang.String r4 = "Found unreadMarker, mark:"
            java.lang.String r4 = defpackage.vb9.e(r2, r4)
            r14.c(r0, r13, r4, r9)
        La6:
            r12.g = r5
            ci5 r13 = r12.f
            jve r13 = r13.b
            yrg r14 = new yrg
            r14.<init>(r2)
            java.lang.Object r13 = r13.a(r14, r15)
            g84 r14 = defpackage.g84.a
            if (r13 != r14) goto Lba
            goto Lbb
        Lba:
            r13 = r1
        Lbb:
            if (r13 != r14) goto Lbe
            return r13
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csg.a(pb2, hr9, dtf):java.lang.Object");
    }

    public final void b(boolean z, cm6 cm6Var) {
        pb2 pb2Var = (pb2) this.a.getValue();
        if (pb2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.h;
        if (z) {
            atomicBoolean.getAndSet(true);
            return;
        }
        if (pb2Var.b.m <= 0) {
            atomicBoolean.getAndSet(false);
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            x9f x9fVarD = svi.d(this.c, ((q2b) this.d).a(), i84.b, new bsg(this, pb2Var, cm6Var, null));
            this.i.O(this, j[0], x9fVarD);
        }
    }
}
