package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class s7f implements oud {
    public ti1 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s7f.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((s7f) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "SpeakerChangedNotification{speaker=" + this.a + '}';
    }
}
