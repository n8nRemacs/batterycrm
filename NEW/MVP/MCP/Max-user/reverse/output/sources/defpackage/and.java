package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class and implements gud {
    public final boolean a;

    public and(boolean z) {
        this.a = z;
    }

    @Override // defpackage.gud
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && and.class == obj.getClass() && this.a == ((and) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a));
    }

    public final String toString() {
        return "RequestAsr{isEnabled=" + this.a + '}';
    }
}
