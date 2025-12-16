package defpackage;

import android.net.Uri;
import java.nio.file.Path;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hx2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hx2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                l6bVar = null;
            }
            if (l6bVar == null) {
                return qqgVar;
            }
            this.o = 1;
            obj = l6bVar.a(this);
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        this.X.F(Uri.fromFile(((Path) obj).toFile()), null, null);
        return qqgVar;
    }
}
