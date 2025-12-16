package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class jf2 implements Serializable, d93 {
    public final long a;
    public final long b;

    public jf2(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j == -1) {
            wqi.p("Chunk", "", new IllegalStateException("start time is -1"));
        }
        if (j2 == -1) {
            wqi.p("Chunk", "", new IllegalStateException("end time is -1"));
        }
    }

    @Override // defpackage.d93
    public final long a() {
        return this.a;
    }

    @Override // defpackage.d93
    public final long c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chunk(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        return utb.l(sb, this.b, ')');
    }
}
