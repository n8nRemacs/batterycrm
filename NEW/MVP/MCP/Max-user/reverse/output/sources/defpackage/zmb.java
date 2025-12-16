package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zmb implements ec8 {
    public volatile Object X;
    public final long a = ub8.c.getAndIncrement();
    public final ze4 b;
    public final int c;
    public final zdf d;
    public final xmb o;

    public zmb(se4 se4Var, ze4 ze4Var, int i, xmb xmbVar) {
        this.d = new zdf(se4Var);
        this.b = ze4Var;
        this.c = i;
        this.o = xmbVar;
    }

    @Override // defpackage.ec8
    public final void c() {
    }

    @Override // defpackage.ec8
    public final void load() throws IOException {
        this.d.b = 0L;
        ve4 ve4Var = new ve4(this.d, this.b);
        try {
            ve4Var.l();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.X = this.o.m(uri, ve4Var);
        } finally {
            zxg.g(ve4Var);
        }
    }
}
