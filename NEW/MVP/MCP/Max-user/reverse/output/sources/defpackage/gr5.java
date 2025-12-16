package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class gr5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs5 b;

    public /* synthetic */ gr5(qs5 qs5Var, int i) {
        this.a = i;
        this.b = qs5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                qs5 qs5Var = this.b;
                qs5Var.getClass();
                dsd dsdVarC = dsd.c(0, "SELECT COUNT(*) FROM favorite_stickers");
                lrd lrdVar = qs5Var.a;
                lrdVar.b();
                Cursor cursorN = lrdVar.n(dsdVarC);
                try {
                    long j = cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
                    cursorN.close();
                    dsdVarC.y();
                    return Long.valueOf(j);
                } catch (Throwable th) {
                    cursorN.close();
                    dsdVarC.y();
                    throw th;
                }
            default:
                return this.b.c();
        }
    }
}
