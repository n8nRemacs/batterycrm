package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i14 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i14(long j, Continuation continuation) {
        super(2, continuation);
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((i14) l((xx3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        i14 i14Var = new i14(this.X, continuation);
        i14Var.o = obj;
        return i14Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xx3 xx3Var = (xx3) this.o;
        long j = xx3Var.a;
        String string = xx3Var.b.toString();
        Uri uri = xx3Var.Y;
        String string2 = uri != null ? uri.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        return new kyb(this.X, j, xx3Var.t0, string, string2);
    }
}
