package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* loaded from: classes.dex */
public final class ng1 extends dtf implements sm6 {
    public final /* synthetic */ CallMoreBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.X = callMoreBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ng1 ng1Var = (ng1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ng1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ng1 ng1Var = new ng1(continuation, this.X);
        ng1Var.o = obj;
        return ng1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            defpackage.g8j.b(r15)
            java.lang.Object r15 = r14.o
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            yy7[] r0 = one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet.C0
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r0 = r14.X
            java.lang.Object r0 = r0.A0
            java.lang.Object r0 = r0.getValue()
            r41 r0 = (defpackage.r41) r0
            r0.b = r15
            d9a r0 = r0.a
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L72
            r3 = 0
            r4 = r3
        L26:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L6d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L40:
            if (r9 >= r7) goto L6b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L67
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            q41 r10 = (defpackage.q41) r10
            ig1 r10 = (defpackage.ig1) r10
            if (r15 <= 0) goto L5f
            r10.getClass()
            wne r11 = new wne
            r11.<init>(r15)
            goto L60
        L5f:
            r11 = 0
        L60:
            android.view.View r10 = r10.a
            roe r10 = (defpackage.roe) r10
            r10.setCounter(r11)
        L67:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L40
        L6b:
            if (r7 != r8) goto L72
        L6d:
            if (r4 == r2) goto L72
            int r4 = r4 + 1
            goto L26
        L72:
            qqg r15 = defpackage.qqg.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng1.n(java.lang.Object):java.lang.Object");
    }
}
