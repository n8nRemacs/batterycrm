package defpackage;

import android.database.Cursor;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zi7 extends dtf implements sm6 {
    public final /* synthetic */ bj7 X;
    public final /* synthetic */ uo6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi7(uo6 uo6Var, bj7 bj7Var, Continuation continuation) {
        super(2, continuation);
        this.o = uo6Var;
        this.X = bj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zi7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zi7(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        int count;
        g8j.b(obj);
        ro6 ro6Var = ro6.a;
        uo6 uo6Var = this.o;
        if (fni.a(uo6Var, ro6Var)) {
            return new Integer(-1);
        }
        int i = 0;
        for (oo6 oo6Var : uo6Var.d()) {
            Cursor cursorQuery = this.X.d.query(oo6Var.j(), new String[]{oo6Var.f()}, uo6Var.e(oo6Var), uo6Var.a(oo6Var), null);
            if (cursorQuery != null) {
                try {
                    count = cursorQuery.getCount();
                    cursorQuery.close();
                } finally {
                }
            } else {
                count = 0;
            }
            i += count;
        }
        return new Integer(i);
    }
}
