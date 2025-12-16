package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v4e extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ w4e Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4e(w4e w4eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = w4eVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((v4e) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        v4e v4eVar = new v4e(this.Y, continuation);
        v4eVar.X = obj;
        return v4eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            Long l = new Long(this.Y.s());
            this.o = 1;
            Object objA = z26Var.a(l, this);
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
