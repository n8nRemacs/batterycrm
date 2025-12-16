package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ale extends dtf implements sm6 {
    public ci5 X;
    public int Y;
    public final /* synthetic */ ele Z;
    public ele o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(ele eleVar, Continuation continuation) {
        super(2, continuation);
        this.Z = eleVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ale) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ale(this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (defpackage.svi.i(r11, r0, r10) == r4) goto L20;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.Y
            r1 = 1
            r2 = 2
            ele r3 = r10.Z
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L23
            if (r0 == r1) goto L1b
            if (r0 != r2) goto L13
            defpackage.g8j.b(r11)
            goto L8a
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            ci5 r0 = r10.X
            ele r1 = r10.o
            defpackage.g8j.b(r11)
            goto L58
        L23:
            defpackage.g8j.b(r11)
            ci5 r0 = r3.C0
            zt6 r11 = r3.c
            drc r5 = new drc
            z7c r6 = r3.w()
            pe8 r6 = r6.a
            long r6 = r6.s()
            v1a r8 = defpackage.a93.s0
            android.app.Application r9 = r3.d
            a93 r8 = r8.x(r9)
            yeb r8 = r8.k()
            java.lang.String r8 = r8.getName()
            r5.<init>(r6, r8)
            r10.o = r3
            r10.X = r0
            r10.Y = r1
            r6 = 0
            java.lang.Object r11 = r11.b(r5, r1, r6, r10)
            if (r11 != r4) goto L57
            goto L89
        L57:
            r1 = r3
        L58:
            xqc r11 = (defpackage.xqc) r11
            r5 = 0
            if (r11 == 0) goto L60
            android.net.Uri r11 = r11.a
            goto L61
        L60:
            r11 = r5
        L61:
            zoe r6 = new zoe
            r6.<init>(r11)
            yy7[] r11 = defpackage.ele.M0
            r1.getClass()
            defpackage.xfh.r(r0, r6)
            lzf r11 = r3.v()
            q2b r11 = (defpackage.q2b) r11
            z74 r11 = r11.a()
            zke r0 = new zke
            r0.<init>(r2, r5)
            r10.o = r5
            r10.X = r5
            r10.Y = r2
            java.lang.Object r11 = defpackage.svi.i(r11, r0, r10)
            if (r11 != r4) goto L8a
        L89:
            return r4
        L8a:
            yy7[] r11 = defpackage.ele.M0
            z7c r11 = r3.w()
            pe8 r11 = r11.a
            fde r0 = r11.Z
            yy7[] r1 = defpackage.w4e.m0
            r2 = 43
            r1 = r1[r2]
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.O(r11, r1, r2)
            qqg r11 = defpackage.qqg.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ale.n(java.lang.Object):java.lang.Object");
    }
}
