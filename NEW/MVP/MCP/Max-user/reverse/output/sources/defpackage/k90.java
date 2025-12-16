package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k90 extends gm0 {
    public final ArrayList a;

    public k90(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        return this.a.equals(((k90) ((gm0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
