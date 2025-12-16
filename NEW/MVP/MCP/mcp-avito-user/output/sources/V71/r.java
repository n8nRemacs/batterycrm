package V71;

import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: LessOrEqual.java */
/* loaded from: classes7.dex */
public class r<T extends Comparable<T>> extends g<T> implements Serializable {
    @Override // V71.g
    public final String a() {
        return "leq";
    }

    @Override // V71.g
    public final boolean c(int i12) {
        return i12 <= 0;
    }
}
