package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lpa extends dtf implements sm6 {
    public ArrayList X;
    public int Y;
    public final /* synthetic */ qpa Z;
    public qpa o;
    public final /* synthetic */ ArrayList s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpa(qpa qpaVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.Z = qpaVar;
        this.s0 = arrayList;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lpa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lpa(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (defpackage.qpa.c(r3, r2, (java.util.List) r1, false, r20) != r8) goto L40;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.Y
            java.util.ArrayList r2 = r0.s0
            qpa r3 = r0.Z
            r4 = 3
            r5 = 2
            r6 = 1
            g84 r8 = defpackage.g84.a
            if (r1 == 0) goto L31
            if (r1 == r6) goto L2d
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            defpackage.g8j.b(r21)
            goto Lb3
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            java.util.ArrayList r2 = r0.X
            qpa r3 = r0.o
            defpackage.g8j.b(r21)
            r1 = r21
            goto La1
        L2d:
            defpackage.g8j.b(r21)
            goto L93
        L31:
            defpackage.g8j.b(r21)
            java.util.ArrayList r1 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.we3.q(r2, r9)
            r1.<init>(r9)
            java.util.Iterator r9 = r2.iterator()
        L43:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L8a
            java.lang.Object r10 = r9.next()
            upa r10 = (defpackage.upa) r10
            vpa r11 = new vpa
            long r12 = r10.a
            long r14 = r10.b
            long r4 = r10.c
            boolean r7 = r10 instanceof defpackage.tpa
            if (r7 == 0) goto L5f
            r7 = r10
            tpa r7 = (defpackage.tpa) r7
            goto L60
        L5f:
            r7 = 0
        L60:
            if (r7 == 0) goto L6b
            boolean r7 = r7.d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r18 = r7
            goto L6d
        L6b:
            r18 = 0
        L6d:
            boolean r7 = r10 instanceof defpackage.spa
            if (r7 == 0) goto L74
            spa r10 = (defpackage.spa) r10
            goto L75
        L74:
            r10 = 0
        L75:
            if (r10 == 0) goto L7e
            x55 r7 = r10.d
            r19 = r7
        L7b:
            r16 = r4
            goto L81
        L7e:
            r19 = 0
            goto L7b
        L81:
            r11.<init>(r12, r14, r16, r18, r19)
            r1.add(r11)
            r4 = 3
            r5 = 2
            goto L43
        L8a:
            r0.Y = r6
            java.lang.Object r1 = defpackage.qpa.d(r3, r1, r0)
            if (r1 != r8) goto L93
            goto Lb2
        L93:
            r0.o = r3
            r0.X = r2
            r1 = 2
            r0.Y = r1
            java.lang.Object r1 = defpackage.qpa.a(r3, r2, r0)
            if (r1 != r8) goto La1
            goto Lb2
        La1:
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            r0.o = r4
            r0.X = r4
            r4 = 3
            r0.Y = r4
            r4 = 0
            java.lang.Object r1 = defpackage.qpa.c(r3, r2, r1, r4, r0)
            if (r1 != r8) goto Lb3
        Lb2:
            return r8
        Lb3:
            qqg r1 = defpackage.qqg.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpa.n(java.lang.Object):java.lang.Object");
    }
}
