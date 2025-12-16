package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nff extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dgf Z;
    public int o;
    public final /* synthetic */ off s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nff(dgf dgfVar, off offVar, Continuation continuation) {
        super(2, continuation);
        this.Z = dgfVar;
        this.s0 = offVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nff) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nff nffVar = new nff(this.Z, this.s0, continuation);
        nffVar.Y = obj;
        return nffVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            off r0 = r12.s0
            ci5 r1 = r0.u0
            int r2 = r12.X
            qqg r3 = defpackage.qqg.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L22
            if (r2 != r5) goto L1a
            int r2 = r12.o
            java.lang.Object r6 = r12.Y
            f84 r6 = (defpackage.f84) r6
            defpackage.g8j.b(r13)     // Catch: java.lang.Throwable -> L18
            goto L59
        L18:
            r13 = move-exception
            goto L5d
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            defpackage.g8j.b(r13)
            java.lang.Object r13 = r12.Y
            r6 = r13
            f84 r6 = (defpackage.f84) r6
            dgf r13 = r12.Z
            int r2 = r13.X
            r7 = 2
            if (r2 == r7) goto L33
            r8 = r5
            goto L34
        L33:
            r8 = r4
        L34:
            yy7[] r9 = defpackage.off.F0     // Catch: java.lang.Throwable -> L5b
            k18 r9 = r0.Y     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L5b
            vr5 r9 = (defpackage.vr5) r9     // Catch: java.lang.Throwable -> L5b
            long r10 = r13.a     // Catch: java.lang.Throwable -> L5b
            if (r2 == r7) goto L44
            r13 = r5
            goto L45
        L44:
            r13 = r4
        L45:
            uk3 r13 = r9.d(r10, r13)     // Catch: java.lang.Throwable -> L5b
            r12.Y = r6     // Catch: java.lang.Throwable -> L5b
            r12.o = r8     // Catch: java.lang.Throwable -> L5b
            r12.X = r5     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r13 = defpackage.n8j.a(r13, r12)     // Catch: java.lang.Throwable -> L5b
            g84 r2 = defpackage.g84.a
            if (r13 != r2) goto L58
            return r2
        L58:
            r2 = r8
        L59:
            r7 = r3
            goto L62
        L5b:
            r13 = move-exception
            r2 = r8
        L5d:
            ipd r7 = new ipd
            r7.<init>(r13)
        L62:
            boolean r13 = r7 instanceof defpackage.ipd
            if (r13 != 0) goto L8c
            r13 = r7
            qqg r13 = (defpackage.qqg) r13
            if (r2 == 0) goto L6c
            r4 = r5
        L6c:
            sye r13 = new sye
            if (r4 == 0) goto L73
            int r2 = defpackage.yud.o
            goto L75
        L73:
            int r2 = defpackage.yud.x
        L75:
            if (r4 == 0) goto L7f
            int r4 = defpackage.wab.c
            n5g r5 = new n5g
            r5.<init>(r4)
            goto L86
        L7f:
            int r4 = defpackage.wab.d
            n5g r5 = new n5g
            r5.<init>(r4)
        L86:
            r13.<init>(r2, r5)
            defpackage.xfh.r(r1, r13)
        L8c:
            java.lang.Throwable r13 = defpackage.kpd.a(r7)
            if (r13 == 0) goto Lac
            boolean r2 = r13 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto Lab
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "Can't toggle favorite for sticker set"
            defpackage.wqi.e(r2, r4, r13)
            sye r13 = defpackage.off.t(r0, r13)
            defpackage.xfh.r(r1, r13)
            goto Lac
        Lab:
            throw r13
        Lac:
            r13 = 0
            r0.E0 = r13
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nff.n(java.lang.Object):java.lang.Object");
    }
}
