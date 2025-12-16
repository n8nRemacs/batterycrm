package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ig4 extends dtf implements sm6 {
    public mg4 X;
    public int Y;
    public /* synthetic */ Object Z;
    public Object o;
    public final /* synthetic */ mg4 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig4(mg4 mg4Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = mg4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ig4) l((jg4) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ig4 ig4Var = new ig4(this.s0, continuation);
        ig4Var.Z = obj;
        return ig4Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        jg4 jg4Var;
        j9a j9aVar;
        mg4 mg4Var;
        j9a j9aVar2;
        int i = this.Y;
        g84 g84Var = g84.a;
        try {
            if (i == 0) {
                g8j.b(obj);
                jg4Var = (jg4) this.Z;
                mg4 mg4Var2 = this.s0;
                n9a n9aVar = mg4Var2.d;
                this.Z = jg4Var;
                this.o = n9aVar;
                this.X = mg4Var2;
                this.Y = 1;
                if (n9aVar.e(null, this) != g84Var) {
                    j9aVar = n9aVar;
                    mg4Var = mg4Var2;
                }
                return g84Var;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mg4Var = (mg4) this.o;
                j9aVar2 = (j9a) this.Z;
                try {
                    g8j.b(obj);
                    mg4Var.c.setValue(jg4.e);
                    ((n9a) j9aVar2).g(null);
                    return qqg.a;
                } catch (Throwable th) {
                    th = th;
                    ((n9a) j9aVar2).g(null);
                    throw th;
                }
            }
            mg4Var = this.X;
            j9aVar = (j9a) this.o;
            jg4Var = (jg4) this.Z;
            g8j.b(obj);
            this.Z = j9aVar;
            this.o = mg4Var;
            this.X = null;
            this.Y = 2;
            if (mg4.a(mg4Var, jg4Var, this) != g84Var) {
                j9aVar2 = j9aVar;
                mg4Var.c.setValue(jg4.e);
                ((n9a) j9aVar2).g(null);
                return qqg.a;
            }
            return g84Var;
        } catch (Throwable th2) {
            th = th2;
            j9aVar2 = j9aVar;
            ((n9a) j9aVar2).g(null);
            throw th;
        }
    }
}
