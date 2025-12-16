package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ahc extends dtf implements sm6 {
    public final /* synthetic */ fhc X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ RectF Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahc(fhc fhcVar, String str, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.X = fhcVar;
        this.Y = str;
        this.Z = rectF;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ahc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ahc(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            b95 b95Var = this.X.b;
            this.o = 1;
            Object objH = b95Var.h(this.Y, this.Z, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
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
