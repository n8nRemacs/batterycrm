package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rma implements Serializable {
    public final Throwable a;

    public rma(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rma) {
            return Objects.equals(this.a, ((rma) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.a + "]";
    }
}
