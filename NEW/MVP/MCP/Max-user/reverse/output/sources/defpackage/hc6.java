package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* loaded from: classes2.dex */
public final class hc6 extends dtf implements sm6 {
    public final /* synthetic */ FoldersListScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc6(Continuation continuation, FoldersListScreen foldersListScreen) {
        super(2, continuation);
        this.X = foldersListScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hc6 hc6Var = (hc6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hc6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hc6 hc6Var = new hc6(continuation, this.X);
        hc6Var.o = obj;
        return hc6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        FoldersListScreen foldersListScreen = this.X;
        ((dc6) ((RecyclerView) foldersListScreen.X.D(foldersListScreen, FoldersListScreen.Y[0])).getAdapter()).F(list, new ue(20, foldersListScreen));
        return qqg.a;
    }
}
