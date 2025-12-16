package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u83 extends dtf implements um6 {
    public /* synthetic */ Throwable X;
    public final /* synthetic */ a93 Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u83(a93 a93Var, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = a93Var;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                u83 u83Var = new u83(this.Y, continuation, 0);
                u83Var.X = th;
                u83Var.n(qqg.a);
                throw null;
            default:
                u83 u83Var2 = new u83(this.Y, continuation, 1);
                u83Var2.X = th;
                qqg qqgVar = qqg.a;
                u83Var2.n(qqgVar);
                return qqgVar;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                Throwable th = this.X;
                wqi.e((String) this.Y.Z, "big_flow: fail", th);
                throw th;
            default:
                String str = (String) this.Y.Z;
                g8j.b(obj);
                Throwable th2 = this.X;
                if (th2 != null) {
                    wqi.e(str, "big_flow: completion", th2);
                } else {
                    wqi.c(str, "big_flow: completion", new Object[0]);
                }
                return qqg.a;
        }
    }
}
