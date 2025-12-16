package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rw2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ Long Z;
    public int o;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ List t0;
    public final /* synthetic */ boolean u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw2(zx2 zx2Var, Long l, Long l2, CharSequence charSequence, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
        this.Y = l;
        this.Z = l2;
        this.s0 = charSequence;
        this.t0 = list;
        this.u0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rw2(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            y85 y85Var = this.X.Y;
            long jLongValue = this.Y.longValue();
            long jLongValue2 = this.Z.longValue();
            this.o = 1;
            Object objA = y85Var.a(jLongValue, jLongValue2, this.s0, this.t0, this.u0, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
