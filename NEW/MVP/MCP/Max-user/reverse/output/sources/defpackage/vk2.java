package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vk2 extends dtf implements sm6 {
    public final /* synthetic */ yk2 X;
    public final /* synthetic */ y1h Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk2(yk2 yk2Var, y1h y1hVar, Continuation continuation) {
        super(2, continuation);
        this.X = yk2Var;
        this.Y = y1hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vk2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vk2(this.X, this.Y, continuation);
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
        hwa hwaVar = (hwa) this.X.Y.getValue();
        this.o = 1;
        Object objF = hwaVar.F(this.Y, this);
        g84 g84Var = g84.a;
        return objF == g84Var ? g84Var : objF;
    }
}
