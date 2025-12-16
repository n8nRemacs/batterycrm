package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fb9 extends dtf implements sm6 {
    public final /* synthetic */ Uri X;
    public final /* synthetic */ gb9 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb9(Uri uri, gb9 gb9Var, Continuation continuation) {
        super(2, continuation);
        this.X = uri;
        this.Y = gb9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fb9 fb9Var = (fb9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fb9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fb9 fb9Var = new fb9(this.X, this.Y, continuation);
        fb9Var.o = obj;
        return fb9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        gb9 gb9Var = this.Y;
        eb9 eb9Var = gb9Var.b;
        Context context = gb9Var.d;
        Uri uri = this.X;
        if (xpi.n(uri, context, null)) {
            wqi.q(f84Var.getClass().getName(), "try to share internal file!", new Object[0]);
        } else {
            xfh.r(eb9Var.c, new za9(uri));
            xfh.r(eb9Var.b, ab9.a);
        }
        return qqg.a;
    }
}
