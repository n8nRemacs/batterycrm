package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class gl4 {
    public final String a;
    public final mv5 b;
    public long c;
    public long d;

    public gl4(File file, String str) {
        str.getClass();
        this.a = str;
        this.b = new mv5(file);
        this.c = -1L;
        this.d = -1L;
    }

    public final long a() {
        if (this.d < 0) {
            this.d = this.b.a.lastModified();
        }
        return this.d;
    }
}
