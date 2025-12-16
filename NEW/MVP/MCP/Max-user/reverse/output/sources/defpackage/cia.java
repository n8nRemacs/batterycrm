package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cia extends dtf implements sm6 {
    public final /* synthetic */ eia X;
    public final /* synthetic */ n8a Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cia(eia eiaVar, n8a n8aVar, Continuation continuation) {
        super(2, continuation);
        this.X = eiaVar;
        this.Y = n8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cia) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cia(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objC = this.X.c(this.Y, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
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
