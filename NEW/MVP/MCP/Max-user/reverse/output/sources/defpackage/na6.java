package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.picker.FolderMemberPickerScreen;

/* loaded from: classes2.dex */
public final class na6 extends dtf implements sm6 {
    public final /* synthetic */ FolderMemberPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na6(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.X = folderMemberPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        na6 na6Var = (na6) l((ia6) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        na6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        na6 na6Var = new na6(continuation, this.X);
        na6Var.o = obj;
        return na6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        FolderMemberPickerScreen folderMemberPickerScreen = this.X;
        hs hsVar = folderMemberPickerScreen.x0;
        g8j.b(obj);
        ia6 ia6Var = (ia6) this.o;
        if (ia6Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        yy7[] yy7VarArr = FolderMemberPickerScreen.y0;
        yy7 yy7Var = yy7VarArr[1];
        if (!vmf.F((String) hsVar.a(folderMemberPickerScreen))) {
            ytd router = folderMemberPickerScreen.getRouter();
            yy7 yy7Var2 = yy7VarArr[1];
            Object objG = router.g((String) hsVar.a(folderMemberPickerScreen));
            sa6 sa6Var = objG instanceof sa6 ? (sa6) objG : null;
            if (sa6Var != null) {
                Set set = ia6Var.a;
                ca6 ca6VarZ0 = ((FolderEditScreen) sa6Var).z0();
                ca6VarZ0.G0.O(ca6VarZ0, ca6.H0[1], svi.d(ca6VarZ0.a, ((q2b) ca6VarZ0.d).b(), i84.b, new t96(set, ca6VarZ0, null)));
            }
        }
        folderMemberPickerScreen.getRouter().C();
        return qqg.a;
    }
}
