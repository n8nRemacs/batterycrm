package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class k96 extends dtf implements sm6 {
    public final /* synthetic */ FolderEditScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k96(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.X = folderEditScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        k96 k96Var = (k96) l((n96) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        k96Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        k96 k96Var = new k96(this.X, continuation);
        k96Var.o = obj;
        return k96Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        FolderEditScreen folderEditScreen = this.X;
        bbd bbdVar = folderEditScreen.Y;
        g8j.b(obj);
        n96 n96Var = (n96) this.o;
        boolean z = n96Var instanceof l96;
        ofb ifbVar = jfb.a;
        if (z) {
            FolderEditScreen.y0(folderEditScreen).setTitle(f5b.j);
            yy7[] yy7VarArr = FolderEditScreen.Z;
            ((OneMeButton) bbdVar.D(folderEditScreen, yy7VarArr[3])).setVisibility(0);
            ((OneMeButton) bbdVar.D(folderEditScreen, yy7VarArr[3])).setEnabled(((l96) n96Var).b);
            FolderEditScreen.y0(folderEditScreen).setRightActions(ifbVar);
        } else {
            if (!(n96Var instanceof m96)) {
                throw new NoWhenBranchMatchedException();
            }
            FolderEditScreen.y0(folderEditScreen).setTitle(f5b.k);
            ((OneMeButton) bbdVar.D(folderEditScreen, FolderEditScreen.Z[3])).setVisibility(8);
            yfb yfbVarY0 = FolderEditScreen.y0(folderEditScreen);
            if (((m96) n96Var).c) {
                ifbVar = new ifb(new i96(folderEditScreen, 1));
            }
            yfbVarY0.setRightActions(ifbVar);
        }
        return qqg.a;
    }
}
