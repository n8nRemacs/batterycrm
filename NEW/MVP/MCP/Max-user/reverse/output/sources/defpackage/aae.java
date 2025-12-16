package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class aae extends y9e {
    public final List j;

    public aae(r7d r7dVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(r7dVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.y9e
    public final long e(long j) {
        return this.j.size();
    }

    @Override // defpackage.y9e
    public final r7d i(umd umdVar, long j) {
        return (r7d) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.y9e
    public final boolean j() {
        return true;
    }
}
