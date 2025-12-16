package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public abstract class hz {
    public final w10 a;
    public volatile boolean b;

    public hz(w10 w10Var) {
        this.a = w10Var;
    }

    public final void a(rx rxVar, Throwable th) {
        if (rxVar != null) {
            rxVar.onError(th);
        }
        this.b = true;
    }

    public vqa b() {
        String str = this.a.s;
        if (pbj.c(str)) {
            return vqa.k(new File(str));
        }
        return null;
    }
}
