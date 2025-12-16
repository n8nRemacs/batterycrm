package V71;

import java.io.Serializable;

/* compiled from: NotNull.java */
/* loaded from: classes7.dex */
public class w implements org.mockito.d<Object>, Serializable {
    static {
        new w();
    }

    @Override // org.mockito.d
    public final boolean b(Object obj) {
        return obj != null;
    }

    public final String toString() {
        return "notNull()";
    }
}
