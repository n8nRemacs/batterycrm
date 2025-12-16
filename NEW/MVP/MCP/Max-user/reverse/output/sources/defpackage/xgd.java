package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xgd implements zgd {
    public final /* synthetic */ Context a;
    public final /* synthetic */ gb0 b;

    public xgd(gb0 gb0Var, Context context) {
        this.b = gb0Var;
        this.a = context;
    }

    @Override // defpackage.zgd
    public final a60 a(f90 f90Var, Executor executor) {
        return new a60(f90Var, executor, this.a);
    }
}
