package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class kb4 {
    public final wg7 a;
    public final long b;
    public final long c;
    public final long d;

    public kb4(long j, long j2, List list) {
        this.a = wg7.j(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
