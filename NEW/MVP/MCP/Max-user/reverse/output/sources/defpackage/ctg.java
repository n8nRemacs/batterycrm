package defpackage;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ctg implements rud {
    public final Map a;

    public ctg(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ctg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ctg) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "UpdateDisplayLayoutCommandV2Response{participantsToErrorMap=" + this.a + '}';
    }
}
