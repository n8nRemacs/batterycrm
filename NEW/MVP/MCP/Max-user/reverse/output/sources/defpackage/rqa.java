package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class rqa {
    public static final Object[] a = new Object[0];
    public static final w8a b = new w8a(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(wy1.g("Index ", i, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException(wy1.g("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(wy1.e(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
