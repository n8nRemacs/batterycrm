package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ly2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ py2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly2(py2 py2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = py2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ly2) l((pb2) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ly2 ly2Var = new ly2(this.Y, continuation);
        ly2Var.X = obj;
        return ly2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                rf2 rf2Var = ((pb2) this.X).b;
                long j = rf2Var.a;
                of2 of2Var = rf2Var.c;
                if (this.Y.h != j || this.Y.g != of2Var) {
                    this.Y.g = of2Var;
                    this.Y.h = j;
                    py2 py2Var = this.Y;
                    this.o = 1;
                    py2Var.b(j, this);
                    if (qqgVar == g84Var) {
                        return g84Var;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
        } catch (Throwable th) {
            wqi.e("py2", "catch error in chatUpdateFlow.onEach", th);
        }
        return qqgVar;
    }
}
