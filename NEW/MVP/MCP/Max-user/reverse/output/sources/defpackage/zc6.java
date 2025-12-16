package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* loaded from: classes2.dex */
public final class zc6 extends dtf implements sm6 {
    public final /* synthetic */ FoldersPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc6(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.X = foldersPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zc6 zc6Var = (zc6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zc6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zc6 zc6Var = new zc6(continuation, this.X);
        zc6Var.o = obj;
        return zc6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = FoldersPickerScreen.Z;
        FoldersPickerScreen foldersPickerScreen = this.X;
        ((RecyclerView) foldersPickerScreen.o.D(foldersPickerScreen, FoldersPickerScreen.Z[1])).invalidate();
        return qqg.a;
    }
}
