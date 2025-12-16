package defpackage;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qd0 extends dtf implements sm6 {
    public final /* synthetic */ Bitmap X;
    public final /* synthetic */ em6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd0(em6 em6Var, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.o = em6Var;
        this.X = bitmap;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qd0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qd0(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return this.o.invoke(new Integer(this.X.getWidth()));
    }
}
