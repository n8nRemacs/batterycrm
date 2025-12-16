package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class ipd implements Serializable {
    public final Throwable a;

    public ipd(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ipd) {
            return fni.a(this.a, ((ipd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
