package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dh3 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kh3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh3(kh3 kh3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = kh3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dh3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dh3 dh3Var = new dh3(this.Y, continuation);
        dh3Var.X = obj;
        return dh3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        r0 = r11;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        defpackage.wqi.e(r0.getClass().getName(), "request error!", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            kh3 r0 = r10.Y
            tcf r1 = r0.h
            int r2 = r10.o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            if (r2 != r3) goto L18
            java.lang.Object r0 = r10.X
            f84 r0 = (defpackage.f84) r0
            defpackage.g8j.b(r11)     // Catch: java.lang.Throwable -> L15
            goto Lad
        L15:
            r11 = move-exception
            goto Lb4
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.X
            f84 r11 = (defpackage.f84) r11
            yy7[] r2 = defpackage.kh3.m
            java.lang.Object r2 = r1.getValue()
            sh3 r2 = (defpackage.sh3) r2
            boolean r5 = r2 instanceof defpackage.nh3
            if (r5 == 0) goto L36
            nh3 r2 = (defpackage.nh3) r2
            goto L37
        L36:
            r2 = r4
        L37:
            if (r2 == 0) goto L3c
            java.lang.Long r2 = r2.c
            goto L3d
        L3c:
            r2 = r4
        L3d:
            java.lang.Object r5 = r1.getValue()
            r6 = r5
            sh3 r6 = (defpackage.sh3) r6
            r6.getClass()
            boolean r7 = r6 instanceof defpackage.nh3
            if (r7 == 0) goto L63
            nh3 r6 = (defpackage.nh3) r6
            java.util.List r7 = r6.a
            java.lang.Object r8 = defpackage.ue3.Q(r7)
            boolean r8 = r8 instanceof defpackage.ph3
            if (r8 != 0) goto L5d
            ph3 r8 = defpackage.ph3.a
            java.util.ArrayList r7 = defpackage.ue3.U(r7, r8)
        L5d:
            r8 = 6
            nh3 r6 = defpackage.nh3.a(r6, r7, r8)
            goto L6f
        L63:
            nh3 r6 = new nh3
            ph3 r7 = defpackage.ph3.a
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r8 = 0
            r6.<init>(r4, r7, r8)
        L6f:
            boolean r5 = r1.c(r5, r6)
            if (r5 == 0) goto L3d
            k18 r1 = r0.d     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lb0
            hwa r1 = (defpackage.hwa) r1     // Catch: java.lang.Throwable -> Lb0
            fh2 r5 = new fh2     // Catch: java.lang.Throwable -> Lb0
            long[] r0 = r0.g     // Catch: java.lang.Throwable -> Lb0
            r6 = 11
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = "userIds"
            r5.q(r6, r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "count"
            r6 = 50
            r5.j(r6, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9d
            java.lang.String r0 = "marker"
            java.lang.Object r6 = r5.b     // Catch: java.lang.Throwable -> Lb0
            us r6 = (defpackage.us) r6     // Catch: java.lang.Throwable -> Lb0
            r6.put(r0, r2)     // Catch: java.lang.Throwable -> Lb0
        L9d:
            r10.X = r11     // Catch: java.lang.Throwable -> Lb0
            r10.o = r3     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r0 = r1.F(r5, r10)     // Catch: java.lang.Throwable -> Lb0
            g84 r1 = defpackage.g84.a
            if (r0 != r1) goto Laa
            return r1
        Laa:
            r9 = r0
            r0 = r11
            r11 = r9
        Lad:
            by2 r11 = (defpackage.by2) r11     // Catch: java.lang.Throwable -> L15
            return r11
        Lb0:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        Lb4:
            boolean r1 = r11 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Lc5
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "request error!"
            defpackage.wqi.e(r0, r1, r11)
        Lc5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh3.n(java.lang.Object):java.lang.Object");
    }
}
