package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kqg extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ z26 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqg(z26 z26Var, Continuation continuation) {
        super(2, continuation);
        this.Y = z26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kqg) l(obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kqg kqgVar = new kqg(this.Y, continuation);
        kqgVar.X = obj;
        return kqgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Object obj2 = this.X;
            this.o = 1;
            Object objA = this.Y.a(obj2, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
