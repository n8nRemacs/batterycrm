package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public interface f3h {
    int H();

    Range I();

    boolean L();

    Range Q(int i);

    Range T(int i);

    int U();

    Range V();

    boolean W(int i, int i2);

    Range Y();

    default boolean b(int i, int i2) {
        if (W(i, i2)) {
            return true;
        }
        return L() && W(i2, i);
    }
}
