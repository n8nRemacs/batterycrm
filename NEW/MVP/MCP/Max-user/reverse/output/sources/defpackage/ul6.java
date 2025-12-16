package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ul6 {
    public final ConcurrentHashMap a;

    public final boolean equals(Object obj) {
        if (obj instanceof ul6) {
            return fni.a(this.a, ((ul6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FtsCache(titles=" + this.a + ")";
    }
}
