package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class sog implements gof {
    public static final sog b = new sog();
    public final List a;

    public sog(gb4 gb4Var) {
        this.a = Collections.singletonList(gb4Var);
    }

    @Override // defpackage.gof
    public final int e(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.gof
    public final long g(int i) {
        fsi.b(i == 0);
        return 0L;
    }

    @Override // defpackage.gof
    public final List m(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.gof
    public final int s() {
        return 1;
    }

    public sog() {
        this.a = Collections.EMPTY_LIST;
    }
}
