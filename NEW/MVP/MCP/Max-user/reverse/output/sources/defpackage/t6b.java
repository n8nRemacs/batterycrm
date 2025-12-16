package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t6b extends dtf implements sm6 {
    public final /* synthetic */ u6b X;
    public final /* synthetic */ File Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6b(u6b u6bVar, File file, Continuation continuation) {
        super(2, continuation);
        this.X = u6bVar;
        this.Y = file;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((t6b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new t6b(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            vxd vxdVar = (vxd) this.X.n.getValue();
            this.o = 1;
            vxdVar.getClass();
            obj = svi.i(bia.a.plus(vxdVar.b), new uxd(this.Y, vxdVar, null), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        if (((Uri) obj) == null) {
            wqi.e("u6b", "Can't save video", null);
        }
        return qqg.a;
    }
}
