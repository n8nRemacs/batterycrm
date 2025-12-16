package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cg8 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k18 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg8(k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cg8) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cg8 cg8Var = new cg8(this.Y, continuation);
        cg8Var.X = obj;
        return cg8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        List list = (List) this.X;
        aef aefVar = (aef) this.Y.getValue();
        this.o = 1;
        xdf xdfVar = (xdf) ((fsd) aefVar).b.getValue();
        Object objB = k7j.b(xdfVar.a, new jad(xdfVar, 9, list), this);
        g84 g84Var = g84.a;
        if (objB != g84Var) {
            objB = qqgVar;
        }
        return objB == g84Var ? g84Var : qqgVar;
    }
}
