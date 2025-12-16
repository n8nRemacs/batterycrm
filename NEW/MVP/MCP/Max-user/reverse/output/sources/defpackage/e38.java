package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.LibraryUpgradeHelper$FailToClearStatException;

/* loaded from: classes.dex */
public final class e38 extends dtf implements sm6 {
    public final /* synthetic */ uy5 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e38(uy5 uy5Var, Continuation continuation) {
        super(2, continuation);
        this.X = uy5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e38) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new e38(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        uy5 uy5Var = this.X;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return qqgVar;
            }
            g8j.b(obj);
            aef aefVar = (aef) ((bwf) uy5Var.Z).getValue();
            this.o = 1;
            xdf xdfVar = (xdf) ((fsd) aefVar).b.getValue();
            Object objB = k7j.b(xdfVar.a, new bm4(14, xdfVar), this);
            g84 g84Var = g84.a;
            if (objB != g84Var) {
                objB = qqgVar;
            }
            return objB == g84Var ? g84Var : qqgVar;
        } catch (Throwable th) {
            wqi.e("LibraryUpgradeHelper", "fail to migrate 4", th);
            ((j94) ((bwf) uy5Var.s0).getValue()).a("ONEME-14182", new LibraryUpgradeHelper$FailToClearStatException("fail to clear stats", th));
            return qqgVar;
        }
    }
}
