package defpackage;

import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* loaded from: classes2.dex */
public final class yc6 extends dtf implements sm6 {
    public final /* synthetic */ FoldersPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc6(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.X = foldersPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yc6 yc6Var = (yc6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yc6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yc6 yc6Var = new yc6(continuation, this.X);
        yc6Var.o = obj;
        return yc6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.o
            java.util.List r7 = (java.util.List) r7
            one.me.folders.pickerfolders.FoldersPickerScreen r0 = r6.X
            if (r7 == 0) goto L5c
            yy7[] r1 = one.me.folders.pickerfolders.FoldersPickerScreen.Z
            boolean r1 = r7.isEmpty()
            r2 = 1
            if (r1 != r2) goto L5c
            android.view.View r7 = r0.getView()
            boolean r1 = r7 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L1f
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            goto L20
        L1f:
            r7 = 0
        L20:
            if (r7 == 0) goto L3c
            sn0 r1 = r0.Y
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            kt3 r3 = new kt3
            r4 = -2
            r5 = 0
            r3.<init>(r5, r4)
            r3.i = r5
            r3.e = r5
            r3.h = r5
            r3.l = r5
            defpackage.fqi.b(r7, r1, r3)
        L3c:
            bbd r7 = r0.o
            yy7[] r1 = one.me.folders.pickerfolders.FoldersPickerScreen.Z
            r2 = r1[r2]
            java.lang.Object r7 = r7.D(r0, r2)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r2 = 8
            r7.setVisibility(r2)
            bbd r7 = r0.X
            r3 = 3
            r1 = r1[r3]
            java.lang.Object r7 = r7.D(r0, r1)
            one.me.sdk.uikit.common.button.OneMeButton r7 = (one.me.sdk.uikit.common.button.OneMeButton) r7
            r7.setVisibility(r2)
            goto L67
        L5c:
            b0i r1 = r0.d
            gq5 r2 = new gq5
            r3 = 2
            r2.<init>(r3, r0)
            r1.F(r7, r2)
        L67:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc6.n(java.lang.Object):java.lang.Object");
    }
}
