package V71;

import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: CompareEqual.java */
/* loaded from: classes7.dex */
public class f<T extends Comparable<T>> extends g<T> implements Serializable {
    @Override // V71.g
    public final String a() {
        return "cmpEq";
    }

    @Override // V71.g
    public final boolean c(int i12) {
        return i12 == 0;
    }
}
