package defpackage;

import java.nio.file.Path;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n4b extends dtf implements sm6 {
    public final /* synthetic */ x4b X;
    public final /* synthetic */ Path Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4b(x4b x4bVar, Path path, Continuation continuation) {
        super(2, continuation);
        this.X = x4bVar;
        this.Y = path;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n4b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new n4b(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Path path = this.Y;
            x4b x4bVar = this.X;
            m4b m4bVar = new m4b(path, x4bVar, null, 0);
            this.o = 1;
            Object objG = x4bVar.g(m4bVar, this);
            g84 g84Var = g84.a;
            if (objG == g84Var) {
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
