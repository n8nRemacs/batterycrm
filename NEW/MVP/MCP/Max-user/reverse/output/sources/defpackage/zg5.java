package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class zg5 extends i2 implements yg5, Serializable {
    public final Enum[] a;

    public zg5(Enum[] enumArr) {
        this.a = enumArr;
    }

    @Override // defpackage.j0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) ys.x(r4.ordinal(), this.a)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    @Override // defpackage.j0
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.i2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) ys.x(iOrdinal, this.a)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.i2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
