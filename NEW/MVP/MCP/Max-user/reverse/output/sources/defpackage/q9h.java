package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q9h extends dtf implements sm6 {
    public tcf X;
    public int Y;
    public final /* synthetic */ x9h Z;
    public Bitmap o;
    public final /* synthetic */ List s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9h(x9h x9hVar, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = x9hVar;
        this.s0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((q9h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new q9h(this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Bitmap bitmap;
        tcf tcfVar;
        g84 g84Var = g84.a;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            bitmap = (Bitmap) this.Z.v0.getValue();
            x9h x9hVar = this.Z;
            tcf tcfVar2 = x9hVar.v0;
            l6h l6hVar = (l6h) x9hVar.o.getValue();
            List list = this.s0;
            int i2 = this.Z.t0;
            int i3 = this.Z.u0;
            this.o = bitmap;
            this.X = tcfVar2;
            this.Y = 1;
            obj = l6hVar.c(list, i2, i3, this);
            if (obj == g84Var) {
                return g84Var;
            }
            tcfVar = tcfVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tcfVar = this.X;
            bitmap = this.o;
            g8j.b(obj);
        }
        tcfVar.setValue(obj);
        if (bitmap != null) {
            bitmap.recycle();
        }
        return qqg.a;
    }
}
