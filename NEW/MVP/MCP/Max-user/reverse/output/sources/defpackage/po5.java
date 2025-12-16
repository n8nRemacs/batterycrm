package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class po5 extends dtf implements sm6 {
    public qo5 X;
    public int Y;
    public final /* synthetic */ qo5 Z;
    public qo5 o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po5(qo5 qo5Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = qo5Var;
        this.s0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((po5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new po5(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, qo5] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qo5 qo5Var;
        ?? r0 = this.Y;
        try {
            if (r0 == 0) {
                g8j.b(obj);
                qo5 qo5Var2 = this.Z;
                m36 m36VarA = gw0.A(new mwd(new no5(qo5Var2, this.s0, null)), 5L, new oo5(qo5Var2, null));
                this.o = qo5Var2;
                this.X = qo5Var2;
                this.Y = 1;
                obj = gw0.p(m36VarA, this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
                qo5Var = qo5Var2;
            } else {
                if (r0 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qo5 qo5Var3 = this.X;
                qo5Var = this.o;
                g8j.b(obj);
            }
            go5 go5Var = (go5) obj;
            Long l = go5Var.c;
            if (l != null) {
                xfh.r(qo5Var.o, ul8.c.R0(l.longValue(), ukh.Y, go5Var.d));
            } else {
                xfh.r(qo5Var.o, lo5.b);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.e(r0.d, "ExternalCallback request failed due to " + th + ".", th);
            xfh.r(r0.o, new mo5(new n5g(mvd.D)));
        }
        return qqg.a;
    }
}
