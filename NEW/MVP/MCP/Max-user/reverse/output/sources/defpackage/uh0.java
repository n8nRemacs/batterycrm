package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uh0 extends dtf implements um6 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh0(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                uh0 uh0Var = new uh0(3, (Continuation) obj3, 0);
                uh0Var.X = zBooleanValue;
                return uh0Var.n(qqg.a);
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                uh0 uh0Var2 = new uh0(3, (Continuation) obj3, 1);
                uh0Var2.X = zBooleanValue2;
                return uh0Var2.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                break;
            default:
                g8j.b(obj);
                break;
        }
        return Boolean.valueOf(this.X);
    }
}
