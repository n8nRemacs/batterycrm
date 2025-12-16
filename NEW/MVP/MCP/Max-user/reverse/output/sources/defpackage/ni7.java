package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ni7 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bj7 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni7(bj7 bj7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = bj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ni7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ni7 ni7Var = new ni7(this.Y, continuation);
        ni7Var.X = obj;
        return ni7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r11 == r6) goto L19;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            bj7 r0 = r10.Y
            lzf r1 = r0.c
            int r2 = r10.o
            r3 = 2
            r4 = 1
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            defpackage.g8j.b(r11)
            goto L80
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            java.lang.Object r2 = r10.X
            f84 r2 = (defpackage.f84) r2
            defpackage.g8j.b(r11)
            goto L44
        L25:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.X
            r2 = r11
            f84 r2 = (defpackage.f84) r2
            r10.X = r2
            r10.o = r4
            r11 = r1
            q2b r11 = (defpackage.q2b) r11
            z74 r11 = r11.b()
            gi7 r4 = new gi7
            r4.<init>(r0, r5)
            java.lang.Object r11 = defpackage.svi.i(r11, r4, r10)
            if (r11 != r6) goto L44
            goto L7f
        L44:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r4 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.we3.q(r11, r7)
            r4.<init>(r7)
            java.util.Iterator r11 = r11.iterator()
        L55:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r11.next()
            vo6 r7 = (defpackage.vo6) r7
            r8 = r1
            q2b r8 = (defpackage.q2b) r8
            z74 r8 = r8.b()
            mi7 r9 = new mi7
            r9.<init>(r0, r7, r5)
            cs4 r7 = defpackage.svi.b(r2, r8, r9, r3)
            r4.add(r7)
            goto L55
        L75:
            r10.X = r5
            r10.o = r3
            java.lang.Object r11 = defpackage.hui.b(r4, r10)
            if (r11 != r6) goto L80
        L7f:
            return r6
        L80:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            vi5 r1 = new vi5
            r2 = 5
            r1.<init>(r2, r0)
            java.util.List r11 = defpackage.ue3.X(r11, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni7.n(java.lang.Object):java.lang.Object");
    }
}
