package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m6a extends dtf implements sm6 {
    public p6a X;
    public int Y;
    public final /* synthetic */ p6a Z;
    public j9a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6a(p6a p6aVar, Continuation continuation) {
        super(2, continuation);
        this.Z = p6aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((m6a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new m6a(this.Z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [j9a] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        p6a p6aVar;
        n9a n9aVar;
        j9a j9aVar;
        Throwable th;
        int i = this.Y;
        g84 g84Var = g84.a;
        try {
            if (i == 0) {
                g8j.b(obj);
                p6aVar = this.Z;
                n9aVar = p6aVar.i;
                this.o = n9aVar;
                this.X = p6aVar;
                this.Y = 1;
                if (n9aVar.e(null, this) != g84Var) {
                }
                return g84Var;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9aVar = this.o;
                try {
                    g8j.b(obj);
                    ((n9a) j9aVar).g(null);
                    return qqg.a;
                } catch (Throwable th2) {
                    th = th2;
                    ((n9a) j9aVar).g(null);
                    throw th;
                }
            }
            p6aVar = this.X;
            ?? r2 = this.o;
            g8j.b(obj);
            n9aVar = r2;
            wu7 wu7Var = new wu7(22, (hr9) p6aVar.c.getValue());
            this.o = n9aVar;
            this.X = null;
            this.Y = 2;
            if (p6a.a(p6aVar, wu7Var, this) != g84Var) {
                j9aVar = n9aVar;
                ((n9a) j9aVar).g(null);
                return qqg.a;
            }
            return g84Var;
        } catch (Throwable th3) {
            j9aVar = n9aVar;
            th = th3;
            ((n9a) j9aVar).g(null);
            throw th;
        }
    }
}
