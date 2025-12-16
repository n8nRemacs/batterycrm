package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.folders.picker.FolderMemberPickerScreen;

/* loaded from: classes2.dex */
public final class ma6 extends dtf implements sm6 {
    public final /* synthetic */ FolderMemberPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma6(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.X = folderMemberPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ma6 ma6Var = (ma6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ma6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ma6 ma6Var = new ma6(continuation, this.X);
        ma6Var.o = obj;
        return ma6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zIsEmpty = ((Set) this.o).isEmpty();
        FolderMemberPickerScreen folderMemberPickerScreen = this.X;
        if (zIsEmpty) {
            yy7[] yy7VarArr = FolderMemberPickerScreen.y0;
            folderMemberPickerScreen.H0().setRightActions(jfb.a);
        } else {
            yy7[] yy7VarArr2 = FolderMemberPickerScreen.y0;
            folderMemberPickerScreen.H0().setRightActions(new ifb(new z11(8, folderMemberPickerScreen)));
        }
        return qqg.a;
    }
}
