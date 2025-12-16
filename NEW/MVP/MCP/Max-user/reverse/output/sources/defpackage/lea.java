package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class lea implements oud {
    public final HashMap a;

    public lea(HashMap map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lea.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((lea) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "NetworkStatusNotification{networkStatus=" + this.a + '}';
    }
}
