package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l6a extends dtf implements sm6 {
    public p6a X;
    public Collection Y;
    public int Z;
    public j9a o;
    public final /* synthetic */ p6a s0;
    public final /* synthetic */ Collection t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6a(p6a p6aVar, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.s0 = p6aVar;
        this.t0 = collection;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((l6a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new l6a(this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        j9a j9aVar;
        Collection collection;
        p6a p6aVar;
        j9a j9aVar2;
        int i = this.Z;
        g84 g84Var = g84.a;
        try {
            if (i == 0) {
                g8j.b(obj);
                p6a p6aVar2 = this.s0;
                n9a n9aVar = p6aVar2.i;
                this.o = n9aVar;
                this.X = p6aVar2;
                Collection collection2 = this.t0;
                this.Y = collection2;
                this.Z = 1;
                if (n9aVar.e(null, this) != g84Var) {
                    j9aVar = n9aVar;
                    collection = collection2;
                    p6aVar = p6aVar2;
                }
                return g84Var;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9aVar2 = this.o;
                try {
                    g8j.b(obj);
                    ((n9a) j9aVar2).g(null);
                    return qqg.a;
                } catch (Throwable th) {
                    th = th;
                    ((n9a) j9aVar2).g(null);
                    throw th;
                }
            }
            collection = this.Y;
            p6aVar = this.X;
            j9aVar = this.o;
            g8j.b(obj);
            wu7 wu7Var = new wu7(21, collection);
            this.o = j9aVar;
            this.X = null;
            this.Y = null;
            this.Z = 2;
            if (p6a.a(p6aVar, wu7Var, this) != g84Var) {
                j9aVar2 = j9aVar;
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
