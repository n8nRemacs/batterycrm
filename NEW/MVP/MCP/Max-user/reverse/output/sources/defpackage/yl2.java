package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes.dex */
public final class yl2 extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ am2 Y;
    public final /* synthetic */ pb2 Z;
    public int o;
    public si9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl2(Object obj, Continuation continuation, am2 am2Var, pb2 pb2Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = am2Var;
        this.Z = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yl2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yl2(this.X, continuation, this.Y, this.Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object obj2 = this.o;
        am2 am2Var = this.Y;
        try {
            if (obj2 == 0) {
                g8j.b(obj);
                si9 si9Var = (si9) this.X;
                o2b o2bVar = (o2b) am2Var.e.getValue();
                pb2 pb2Var = this.Z;
                this.s0 = si9Var;
                this.o = 1;
                obj = o2bVar.j(pb2Var, this, si9Var);
                g84 g84Var = g84.a;
                obj2 = si9Var;
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (obj2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                si9 si9Var2 = this.s0;
                g8j.b(obj);
                obj2 = si9Var2;
            }
            return (MessageModel) obj;
        } catch (Exception e) {
            ((y3b) ((yi5) am2Var.f.getValue())).a(new RuntimeException("Error during mapping message=" + obj2, e));
            return null;
        }
    }
}
