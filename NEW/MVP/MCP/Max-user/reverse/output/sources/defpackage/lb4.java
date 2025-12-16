package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class lb4 implements hof {
    public static final mx0 c = new mx0(new df3(17), yca.b);
    public final wg7 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lb4(defpackage.zjd r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb4.<init>(zjd):void");
    }

    @Override // defpackage.hof
    public final int e(long j) {
        int iA = zxg.a(this.b, j, false);
        if (iA < this.a.size()) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.hof
    public final long g(int i) {
        hsi.b(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.hof
    public final List m(long j) {
        int iE = zxg.e(this.b, j, false);
        if (iE != -1) {
            return (wg7) this.a.get(iE);
        }
        t76 t76Var = wg7.b;
        return zjd.o;
    }

    @Override // defpackage.hof
    public final int s() {
        return this.a.size();
    }
}
