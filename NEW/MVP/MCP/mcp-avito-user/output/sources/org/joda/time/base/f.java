package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.AbstractC44872n;
import org.joda.time.N;
import org.joda.time.format.t;

/* compiled from: AbstractPeriod.java */
/* loaded from: classes7.dex */
public abstract class f implements N {
    @Override // org.joda.time.N
    public final AbstractC44872n I(int i12) {
        return a().f420436c[i12];
    }

    public final int b(AbstractC44872n abstractC44872n) {
        AbstractC44872n[] abstractC44872nArr = a().f420436c;
        int length = abstractC44872nArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (abstractC44872nArr[i12] == abstractC44872n) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return 0;
        }
        return g(i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n12 = (N) obj;
        if (size() != n12.size()) {
            return false;
        }
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (g(i12) != n12.g(i12) || I(i12) != n12.I(i12)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = size();
        int iHashCode = 17;
        for (int i12 = 0; i12 < size; i12++) {
            iHashCode = I(i12).hashCode() + ((g(i12) + (iHashCode * 27)) * 27);
        }
        return iHashCode;
    }

    @Override // org.joda.time.N
    public final int size() {
        return a().f420436c.length;
    }

    @ToString
    public final String toString() {
        t tVar = org.joda.time.format.k.a().f420852a;
        if (tVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        StringBuffer stringBuffer = new StringBuffer(tVar.a(this));
        tVar.b(stringBuffer, this);
        return stringBuffer.toString();
    }
}
