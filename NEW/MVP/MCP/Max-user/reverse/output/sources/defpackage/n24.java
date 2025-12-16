package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n24 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ q24 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n24(q24 q24Var, String str, Continuation continuation) {
        super(2, continuation);
        this.o = q24Var;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n24) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new n24(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        q24 q24Var = this.o;
        List list = ((nx3) q24Var.b.getValue()).a;
        if (list != null) {
            return q24.a(q24Var, list, this.X);
        }
        return null;
    }
}
