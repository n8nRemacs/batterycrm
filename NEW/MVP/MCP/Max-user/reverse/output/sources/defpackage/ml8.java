package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class ml8 extends dtf implements sm6 {
    public final /* synthetic */ MainActivity X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ml8 ml8Var = (ml8) l((w68) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ml8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ml8 ml8Var = new ml8(this.X, continuation);
        ml8Var.o = obj;
        return ml8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        w68 w68Var = (w68) this.o;
        Bundle bundle = new Bundle();
        bundle.putParcelable("link", Uri.EMPTY);
        bundle.putParcelable("link:result", w68Var);
        ((ii4) t1b.a.getAccessor().c(116)).b(":link-intercept", bundle);
        MainActivity mainActivity = this.X;
        x9f x9fVar = mainActivity.Z0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        mainActivity.Z0 = null;
        return qqg.a;
    }
}
