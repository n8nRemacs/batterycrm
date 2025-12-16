package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class qj3 extends l0g {
    public final long c;
    public final List d;

    public qj3(long j, List list) {
        this.c = j;
        this.d = list;
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(complainSync=" + this.c + ",complainsSize:" + this.d.size() + ")";
    }
}
