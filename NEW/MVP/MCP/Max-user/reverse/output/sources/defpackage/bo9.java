package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bo9 extends dtf implements wm6 {
    public /* synthetic */ nn9 X;
    public /* synthetic */ qn9 Y;
    public /* synthetic */ boolean Z;
    public int o;
    public final /* synthetic */ no9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo9(no9 no9Var, Continuation continuation) {
        super(4, continuation);
        this.s0 = no9Var;
    }

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        bo9 bo9Var = new bo9(this.s0, (Continuation) obj4);
        bo9Var.X = (nn9) obj;
        bo9Var.Y = (qn9) obj2;
        bo9Var.Z = zBooleanValue;
        return bo9Var.n(qqg.a);
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
        nn9 nn9Var = this.X;
        qn9 qn9Var = this.Y;
        boolean z = this.Z;
        this.X = null;
        this.o = 1;
        Object objT = no9.t(this.s0, nn9Var, qn9Var, z, this);
        g84 g84Var = g84.a;
        return objT == g84Var ? g84Var : objT;
    }
}
