package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e20 implements oud {
    public ArrayList a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e20.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e20) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "AudioActivityNotification{participantIds=" + this.a + '}';
    }
}
