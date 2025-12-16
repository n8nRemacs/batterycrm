package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ov2 extends dtf implements um6 {
    public /* synthetic */ f82 X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ov2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f82 f82Var = (f82) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                ov2 ov2Var = new ov2(3, continuation, 0);
                ov2Var.X = f82Var;
                ov2Var.Y = yebVar;
                qqg qqgVar = qqg.a;
                ov2Var.n(qqgVar);
                return qqgVar;
            default:
                ov2 ov2Var2 = new ov2(3, continuation, 1);
                ov2Var2.X = f82Var;
                ov2Var2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                ov2Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.a().u().a.a.d);
                break;
            default:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().h);
                break;
        }
        return qqg.a;
    }
}
