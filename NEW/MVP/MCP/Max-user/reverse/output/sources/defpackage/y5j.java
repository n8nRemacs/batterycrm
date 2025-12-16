package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y5j {
    public final x5j a;
    public final Integer b;

    public /* synthetic */ y5j(aqc aqcVar) {
        this.a = (x5j) aqcVar.b;
        this.b = (Integer) aqcVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y5j)) {
            return false;
        }
        y5j y5jVar = (y5j) obj;
        return syi.c(this.a, y5jVar.a) && syi.c(this.b, y5jVar.b) && syi.c(null, null) && syi.c(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
