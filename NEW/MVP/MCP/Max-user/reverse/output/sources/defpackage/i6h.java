package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class i6h {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final ContextScope j;
    public final jve l;
    public final gbd m;
    public final String i = i6h.class.getName();
    public final ConcurrentHashMap.KeySetView k = ConcurrentHashMap.newKeySet();

    public i6h(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = k18Var7;
        this.h = k18Var8;
        this.j = d7j.a(((q2b) ((lzf) k18Var5.getValue())).b().plus(zk6.a()));
        jve jveVarB = kve.b(0, 0, 7);
        this.l = jveVarB;
        this.m = new gbd(jveVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.i6h r27, long r28, defpackage.w10 r30, defpackage.g2h r31, defpackage.q44 r32) {
        /*
            r0 = r27
            r1 = r32
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.c6h
            if (r2 == 0) goto L1a
            r2 = r1
            c6h r2 = (defpackage.c6h) r2
            int r3 = r2.X
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.X = r3
            goto L1f
        L1a:
            c6h r2 = new c6h
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.d
            int r3 = r2.X
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            defpackage.g8j.b(r1)
            goto L7d
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            defpackage.g8j.b(r1)
            long r9 = r31.i()
            r1 = r30
            java.lang.String r8 = r1.r
            android.net.Uri r3 = r31.a()
            java.lang.String r17 = r3.toString()
            java.lang.String r26 = r1.a()
            m2g r5 = new m2g
            r11 = 0
            r13 = 0
            r15 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            java.lang.String r22 = ""
            r23 = 0
            r24 = 0
            r25 = 1
            r6 = r28
            r5.<init>(r6, r8, r9, r11, r13, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26)
            k18 r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            dv5 r1 = (defpackage.dv5) r1
            d53 r1 = r1.a(r5)
            r2.X = r4
            java.lang.Enum r1 = r0.d(r1, r2)
            g84 r0 = defpackage.g84.a
            if (r1 != r0) goto L7d
            return r0
        L7d:
            w4i r0 = defpackage.w4i.c
            if (r1 != r0) goto L82
            goto L83
        L82:
            r4 = 0
        L83:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6h.a(i6h, long, w10, g2h, q44):java.lang.Object");
    }

    public static String c(long j, long j2) {
        return j + ":" + j2;
    }

    public final Object b(long j, long j2, q44 q44Var) {
        return svi.i(((q2b) ((lzf) this.e.getValue())).b(), new f6h(this, j, j2, null), q44Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum d(defpackage.d53 r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.g6h
            if (r0 == 0) goto L13
            r0 = r6
            g6h r0 = (defpackage.g6h) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            g6h r0 = new g6h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L26
            defpackage.g8j.b(r6)
            goto L42
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            defpackage.g8j.b(r6)
            h6h r6 = new h6h
            r1 = 2
            r6.<init>(r1, r2)
            r0.X = r3
            java.lang.Object r6 = defpackage.gw0.o(r5, r6, r0)
            g84 r5 = defpackage.g84.a
            if (r6 != r5) goto L42
            return r5
        L42:
            x4i r6 = (defpackage.x4i) r6
            if (r6 == 0) goto L49
            w4i r5 = r6.b
            return r5
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6h.d(d53, q44):java.lang.Enum");
    }
}
