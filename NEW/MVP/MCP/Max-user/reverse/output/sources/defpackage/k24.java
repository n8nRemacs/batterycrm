package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k24 extends dtf implements sm6 {
    public final /* synthetic */ l24 X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ yv3 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k24(l24 l24Var, List list, yv3 yv3Var, Continuation continuation) {
        super(2, continuation);
        this.X = l24Var;
        this.Y = list;
        this.Z = yv3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k24) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k24(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        da1 da1Var = new da1(this.X, this.Y, this.Z, 4);
        this.o = 1;
        Object objI = vmi.i(bd5.a, da1Var, this);
        g84 g84Var = g84.a;
        return objI == g84Var ? g84Var : objI;
    }
}
