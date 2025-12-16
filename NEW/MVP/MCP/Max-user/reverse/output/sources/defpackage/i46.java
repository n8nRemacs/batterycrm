package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class i46 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ z26 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i46(z26 z26Var, Continuation continuation) {
        super(2, continuation);
        this.Y = z26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((i46) l(new na2(((na2) obj).a), (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        i46 i46Var = new i46(this.Y, continuation);
        i46Var.X = obj;
        return i46Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object obj2;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            obj2 = ((na2) this.X).a;
            if (!(obj2 instanceof ma2)) {
                this.X = obj2;
                this.o = 1;
                Object objA = this.Y.a(obj2, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.X;
            g8j.b(obj);
        }
        if (!(obj2 instanceof la2)) {
            return Boolean.TRUE;
        }
        la2 la2Var = obj2 != null ? (la2) obj2 : null;
        Throwable th = la2Var != null ? la2Var.a : null;
        if (th == null) {
            return Boolean.FALSE;
        }
        throw th;
    }
}
