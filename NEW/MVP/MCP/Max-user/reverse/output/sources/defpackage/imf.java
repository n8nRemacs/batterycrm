package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class imf {
    public final List a;

    public imf(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof imf) && fni.a(this.a, ((imf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkipAnyOf(containsAnyOf=" + this.a + ")";
    }
}
