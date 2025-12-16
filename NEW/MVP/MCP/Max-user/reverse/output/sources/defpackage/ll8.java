package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class ll8 extends dtf implements sm6 {
    public final /* synthetic */ MainActivity X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ll8) l((Uri) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ll8 ll8Var = new ll8(this.X, continuation);
        ll8Var.o = obj;
        return ll8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Uri uri = (Uri) this.o;
        String name = MainActivity.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ctd.i(uri, "handle mytracker link "), null);
            }
        }
        return ((s78) ((t78) t1b.a.getAccessor().c(677)).b.getValue()).e(uri);
    }
}
