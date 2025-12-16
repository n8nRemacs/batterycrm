package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ujf extends dtf implements sm6 {
    public final /* synthetic */ hkf X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujf(hkf hkfVar, Continuation continuation) {
        super(2, continuation);
        this.X = hkfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ujf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ujf(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        hkf hkfVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            kdd kddVar = (kdd) hkfVar.X.getValue();
            this.o = 1;
            obj = kddVar.a(this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        qqg qqgVar = qqg.a;
        if (!zBooleanValue) {
            return qqgVar;
        }
        xfh.r(hkfVar.y0, new qne(yud.x, new n5g(vdb.C)));
        return qqgVar;
    }
}
