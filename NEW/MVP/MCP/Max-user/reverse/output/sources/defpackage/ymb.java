package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class ymb implements dc8 {
    public volatile Object X;
    public final long a;
    public final ye4 b;
    public final int c;
    public final ydf d;
    public final wmb o;

    public ymb(qe4 qe4Var, Uri uri, int i, wmb wmbVar) {
        Map map = Collections.EMPTY_MAP;
        if (uri == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        ye4 ye4Var = new ye4(uri, 0L, 1, null, map, 0L, -1L, null, 1);
        this.d = new ydf(qe4Var);
        this.b = ye4Var;
        this.c = i;
        this.o = wmbVar;
        this.a = tb8.h.getAndIncrement();
    }

    @Override // defpackage.dc8
    public final void c() {
    }

    @Override // defpackage.dc8
    public final void load() throws IOException {
        this.d.b = 0L;
        ve4 ve4Var = new ve4(this.d, this.b);
        try {
            ve4Var.l();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.X = this.o.l(uri, ve4Var);
        } finally {
            xxg.g(ve4Var);
        }
    }
}
