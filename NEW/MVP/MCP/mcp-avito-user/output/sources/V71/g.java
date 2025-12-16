package V71;

import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: CompareTo.java */
/* loaded from: classes7.dex */
public abstract class g<T extends Comparable<T>> implements org.mockito.d<T>, Serializable {
    public abstract String a();

    @Override // org.mockito.d
    public final boolean b(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (comparable != null && comparable.getClass().isInstance(null)) {
            return c(comparable.compareTo(null));
        }
        return false;
    }

    public abstract boolean c(int i12);

    public final String toString() {
        return a().concat("(null)");
    }
}
