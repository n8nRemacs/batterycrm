package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class kj5 extends z74 implements Closeable, AutoCloseable {
    static {
        y74 y74Var = z74.Key;
        if (y74Var != null) {
            w74 w74Var = y74Var.b;
        }
    }

    public abstract Executor w();
}
