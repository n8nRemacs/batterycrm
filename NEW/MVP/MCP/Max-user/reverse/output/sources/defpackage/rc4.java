package defpackage;

import java.io.Closeable;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class rc4 implements Closeable {
    public Provider X;
    public Provider Y;
    public Provider a;
    public tl4 b;
    public Provider c;
    public znd d;
    public Provider o;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((gwd) ((ri5) this.X.get())).close();
    }
}
