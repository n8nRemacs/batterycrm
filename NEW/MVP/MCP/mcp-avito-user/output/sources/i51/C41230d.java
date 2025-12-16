package i51;

import Y61.k;
import Y61.l;
import java.io.Serializable;
import kotlin.jvm.internal.C42822w;

/* compiled from: LookupLocation.kt */
/* renamed from: i51.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41230d implements Serializable {

    /* compiled from: LookupLocation.kt */
    /* renamed from: i51.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41230d)) {
            return false;
        }
        ((C41230d) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + (Integer.hashCode(-1) * 31);
    }

    @k
    public final String toString() {
        return "Position(line=-1, column=-1)";
    }
}
