package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class pbd implements Closeable {
    public final wv0 a;
    public final vv0 b;
    public final /* synthetic */ gge c;

    public pbd(gge ggeVar, wv0 wv0Var, vv0 vv0Var) {
        this.c = ggeVar;
        this.a = wv0Var;
        this.b = vv0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.b(true, true, null);
    }
}
