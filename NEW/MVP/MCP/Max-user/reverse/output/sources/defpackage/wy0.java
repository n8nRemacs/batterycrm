package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public abstract class wy0 implements Comparable {
    public final long X;
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File o;

    public wy0(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.o = file;
        this.X = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wy0 wy0Var) {
        String str = wy0Var.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(wy0Var.a);
        }
        long j = this.b - wy0Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(this.b);
        sb.append(", ");
        return ho7.k(sb, this.c, "]");
    }
}
