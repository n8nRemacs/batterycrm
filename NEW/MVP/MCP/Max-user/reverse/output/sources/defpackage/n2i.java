package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n2i extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sm6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2i(sm6 sm6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = sm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n2i) l(obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        n2i n2iVar = new n2i(this.Y, continuation);
        n2iVar.X = obj;
        return n2iVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Object obj2 = this.X;
            this.o = 1;
            Object objInvoke = this.Y.invoke(obj2, this);
            g84 g84Var = g84.a;
            if (objInvoke == g84Var) {
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
