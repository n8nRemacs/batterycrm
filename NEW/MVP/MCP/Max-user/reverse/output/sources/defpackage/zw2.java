package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zw2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zw2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            d53 d53Var = new d53(this.X.a1, 12);
            this.o = 1;
            obj = gw0.p(d53Var, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return new Long(((pb2) obj).a);
    }
}
