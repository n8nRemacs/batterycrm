package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class aj3 extends cj3 {
    public static cj3 g(int i) {
        return i < 0 ? cj3.b : i > 0 ? cj3.c : cj3.a;
    }

    @Override // defpackage.cj3
    public final cj3 a(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.cj3
    public final cj3 b(long j, long j2) {
        return g(Long.compare(j, j2));
    }

    @Override // defpackage.cj3
    public final cj3 c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.cj3
    public final cj3 d(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.cj3
    public final cj3 e(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }

    @Override // defpackage.cj3
    public final int f() {
        return 0;
    }
}
