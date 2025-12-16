package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class gz6 implements Serializable {
    public static final gz6 b = new gz6(false);
    public final boolean a;

    public gz6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz6) && this.a == ((gz6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("GroupOptions(isPremium=", ")", this.a);
    }
}
