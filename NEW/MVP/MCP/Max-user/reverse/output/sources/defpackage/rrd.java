package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rrd extends dtf implements sm6 {
    public final /* synthetic */ bsd X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ Collection Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrd(bsd bsdVar, long j, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.X = bsdVar;
        this.Y = j;
        this.Z = collection;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rrd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rrd(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            lq9 lq9VarD = this.X.d();
            List listD0 = ue3.d0(this.Z);
            this.o = 1;
            Object objB = k7j.b(lq9VarD.a, new k35(lq9VarD, listD0, this.Y), this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
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
