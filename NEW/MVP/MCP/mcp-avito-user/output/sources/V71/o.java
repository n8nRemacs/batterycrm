package V71;

import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: GreaterOrEqual.java */
/* loaded from: classes7.dex */
public class o<T extends Comparable<T>> extends g<T> implements Serializable {
    @Override // V71.g
    public final String a() {
        return "geq";
    }

    @Override // V71.g
    public final boolean c(int i12) {
        return i12 >= 0;
    }
}
