package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cw extends dtf implements sm6 {
    public final /* synthetic */ xw X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ boolean Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(xw xwVar, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = xwVar;
        this.Y = j;
        this.Z = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cw) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cw(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jkd] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        xw xwVar = this.X;
        ?? r2 = xwVar.k;
        this.o = 1;
        Object objS = xwVar.s(r2, this.Y, this.Z, this);
        g84 g84Var = g84.a;
        return objS == g84Var ? g84Var : objS;
    }
}
