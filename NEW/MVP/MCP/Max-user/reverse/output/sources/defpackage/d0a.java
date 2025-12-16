package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d0a extends dtf implements sm6 {
    public final /* synthetic */ qi8 X;
    public final /* synthetic */ k0a Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0a(qi8 qi8Var, k0a k0aVar, Continuation continuation) {
        super(2, continuation);
        this.X = qi8Var;
        this.Y = k0aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d0a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d0a(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objA = this.X.a(this);
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
        k0a k0aVar = this.Y;
        ((rc0) k0aVar.f.getValue()).b.clear();
        d7j.c(k0aVar.e, null);
        return qqg.a;
    }
}
