package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rl8 extends dtf implements um6 {
    public /* synthetic */ String X;
    public /* synthetic */ long o;

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        rl8 rl8Var = new rl8(3, (Continuation) obj3);
        rl8Var.o = jLongValue;
        rl8Var.X = (String) obj2;
        return rl8Var.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.o;
        String str = this.X;
        if (j == -1) {
            str = null;
        }
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }
}
