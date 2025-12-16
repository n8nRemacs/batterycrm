package defpackage;

import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* loaded from: classes2.dex */
public final class gc6 extends dtf implements sm6 {
    public final /* synthetic */ FoldersListScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc6(Continuation continuation, FoldersListScreen foldersListScreen) {
        super(2, continuation);
        this.X = foldersListScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gc6 gc6Var = (gc6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gc6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gc6 gc6Var = new gc6(continuation, this.X);
        gc6Var.o = obj;
        return gc6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof ei4) {
            qa6.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
