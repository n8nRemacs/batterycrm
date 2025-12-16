package defpackage;

import java.io.Closeable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class uua implements Closeable {
    public static final Pattern b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"", 2);
    public final ood a;

    public uua(ood oodVar) {
        this.a = oodVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
