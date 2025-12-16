package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class rc7 implements oud {
    public final HashMap a;

    public rc7(HashMap map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rc7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((rc7) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "IdMappingsNotification{mapping=" + this.a + '}';
    }
}
