package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ye0 implements Serializable {
    public final long a;
    public final String b;
    public final String c;

    public ye0(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        return ctd.j(ho7.n("Background{id=", this.a, ", url=", this.b), ", color=", this.c, "}");
    }
}
