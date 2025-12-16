package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vm4 implements w17, x17 {
    public final ul3 a;
    public final Context b;
    public final rpc c;
    public final Set d;
    public final Executor e;

    public vm4(Context context, String str, Set set, rpc rpcVar, Executor executor) {
        this.a = new ul3(context, 1, str);
        this.d = set;
        this.e = executor;
        this.c = rpcVar;
        this.b = context;
    }

    public final ybj a() {
        return !mxg.a(this.b) ? n5e.f("") : n5e.d(new um4(this, 0), this.e);
    }

    public final void b() {
        if (this.d.size() <= 0) {
            n5e.f(null);
        } else if (mxg.a(this.b)) {
            n5e.d(new um4(this, 1), this.e);
        } else {
            n5e.f(null);
        }
    }
}
