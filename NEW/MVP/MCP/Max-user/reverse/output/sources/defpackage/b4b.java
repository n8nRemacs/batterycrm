package defpackage;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b4b {
    public final gge a;

    public b4b(gge ggeVar) {
        this.a = ggeVar;
    }

    public final tz5 a(String str, boolean z) {
        tz5 tz5Var = new tz5(1, 1, 0L, TimeUnit.MILLISECONDS, Build.VERSION.SDK_INT >= 35 ? new z3b() : new a4b(), this.a.h(str, 5, z, true));
        tz5Var.setRejectedExecutionHandler(new d22(1));
        return tz5Var;
    }
}
