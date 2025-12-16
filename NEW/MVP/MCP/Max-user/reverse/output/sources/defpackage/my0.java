package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class my0 {
    public final File a;
    public final long b;
    public final long c;
    public final zy0 d;

    public my0(File file, zy0 zy0Var) {
        this.a = file;
        this.b = file.length();
        this.c = file.lastModified();
        this.d = zy0Var;
    }

    public final String toString() {
        return "CacheEntry{file=" + this.a + ", length=" + this.b + ", lastModified=" + this.c + ", cacheType=" + this.d + '}';
    }
}
