package defpackage;

import android.database.Cursor;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ei0 extends dtf implements sm6 {
    public final /* synthetic */ hi0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei0(hi0 hi0Var, Continuation continuation) {
        super(2, continuation);
        this.o = hi0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ei0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ei0(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sub subVarC = ((csd) ((so4) this.o.c.getValue()).a.getValue()).c();
        subVarC.getClass();
        dsd dsdVarC = dsd.c(0, "SELECT COUNT(*) FROM phones");
        lrd lrdVar = subVarC.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            long j = cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
            cursorN.close();
            dsdVarC.y();
            return Boolean.valueOf(j == 0);
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }
}
