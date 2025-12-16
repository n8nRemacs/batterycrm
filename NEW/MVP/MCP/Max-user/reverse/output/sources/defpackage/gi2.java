package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gi2 extends dtf implements sm6 {
    public final /* synthetic */ ve2 X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ String Z;
    public int o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi2(ve2 ve2Var, List list, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.X = ve2Var;
        this.Y = list;
        this.Z = str;
        this.s0 = str2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gi2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gi2(this.X, this.Y, this.Z, this.s0, continuation);
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
        fq fqVar = new fq(this.X, this.Y, this.Z, this.s0, 2);
        this.o = 1;
        Object objI = vmi.i(bd5.a, fqVar, this);
        g84 g84Var = g84.a;
        return objI == g84Var ? g84Var : objI;
    }
}
