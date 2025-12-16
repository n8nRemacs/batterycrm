package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class z9e extends x9e {
    public final List j;

    public z9e(q7d q7dVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(q7dVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.x9e
    public final long e(long j) {
        return this.j.size();
    }

    @Override // defpackage.x9e
    public final q7d i(tmd tmdVar, long j) {
        return (q7d) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.x9e
    public final boolean j() {
        return true;
    }
}
