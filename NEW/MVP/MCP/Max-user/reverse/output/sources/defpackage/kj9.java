package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class kj9 implements mj9 {
    public final Collection a;

    public kj9(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj9) && fni.a(this.a, ((kj9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ByIds(messageIds=" + this.a + ")";
    }
}
