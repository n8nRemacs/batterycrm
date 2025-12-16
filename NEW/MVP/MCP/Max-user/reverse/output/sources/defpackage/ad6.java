package defpackage;

import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class ad6 extends dtf implements sm6 {
    public final /* synthetic */ FoldersPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad6(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.X = foldersPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ad6 ad6Var = (ad6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ad6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ad6 ad6Var = new ad6(continuation, this.X);
        ad6Var.o = obj;
        return ad6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        yy7[] yy7VarArr = FoldersPickerScreen.Z;
        FoldersPickerScreen foldersPickerScreen = this.X;
        ((OneMeButton) foldersPickerScreen.X.D(foldersPickerScreen, FoldersPickerScreen.Z[3])).setEnabled(zBooleanValue);
        return qqg.a;
    }
}
