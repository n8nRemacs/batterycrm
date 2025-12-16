package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wu3 extends dtf implements sm6 {
    public final /* synthetic */ iv3 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu3(iv3 iv3Var, Continuation continuation) {
        super(2, continuation);
        this.X = iv3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wu3 wu3Var = (wu3) l((y82) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wu3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wu3 wu3Var = new wu3(this.X, continuation);
        wu3Var.o = obj;
        return wu3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            defpackage.g8j.b(r9)
            java.lang.Object r9 = r8.o
            y82 r9 = (defpackage.y82) r9
            iv3 r0 = r8.X
            tcf r1 = r0.c
            java.lang.Object r2 = r1.getValue()
            v82 r2 = (defpackage.v82) r2
            r3 = 0
            if (r2 == 0) goto L57
            tcf r4 = r0.h
            java.lang.Object r4 = r4.getValue()
            y82 r4 = (defpackage.y82) r4
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L31
            if (r9 == 0) goto L2c
            java.lang.String r4 = r4.b
            java.lang.String r7 = r9.b
            boolean r4 = defpackage.fni.a(r4, r7)
            r4 = r4 ^ r5
            goto L2d
        L2c:
            r4 = r6
        L2d:
            if (r4 != r5) goto L31
            r4 = r5
            goto L32
        L31:
            r4 = r6
        L32:
            if (r9 == 0) goto L36
            java.lang.String r3 = r9.b
        L36:
            if (r3 == 0) goto L41
            int r3 = r3.length()
            if (r3 != 0) goto L3f
            goto L41
        L3f:
            r3 = r6
            goto L42
        L41:
            r3 = r5
        L42:
            if (r3 != 0) goto L50
            if (r9 == 0) goto L4c
            boolean r9 = r9.e
            if (r9 != 0) goto L4c
            r9 = r5
            goto L4d
        L4c:
            r9 = r6
        L4d:
            if (r9 == 0) goto L50
            goto L51
        L50:
            r5 = r6
        L51:
            r9 = 9
            v82 r3 = defpackage.v82.a(r2, r4, r5, r6, r9)
        L57:
            r1.setValue(r3)
            tcf r9 = r0.d
            bwf r1 = r0.g
            java.lang.Object r1 = r1.getValue()
            o82 r1 = (defpackage.o82) r1
            java.util.List r0 = r1.a(r0)
            r9.setValue(r0)
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu3.n(java.lang.Object):java.lang.Object");
    }
}
