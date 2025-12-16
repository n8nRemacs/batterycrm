package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v43 extends dtf implements um6 {
    public /* synthetic */ nx3 X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v43(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nx3 nx3Var = (nx3) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                v43 v43Var = new v43(3, continuation, 0);
                v43Var.X = nx3Var;
                g8j.b(qqg.a);
                return v43Var.X;
            default:
                v43 v43Var2 = new v43(3, continuation, 1);
                v43Var2.X = nx3Var;
                return v43Var2.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                return this.X;
            default:
                g8j.b(obj);
                return this.X.a;
        }
    }
}
