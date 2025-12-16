package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class hh7 extends ng7 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient wg7 b;

    public static int h(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            u5j.c("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static hh7 i(int i, Object... objArr) {
        if (i == 0) {
            return fkd.t0;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new a4f(obj);
        }
        int iH = h(i);
        Object[] objArr2 = new Object[iH];
        int i2 = iH - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(ho7.f(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iG = t2i.g(iHashCode);
            while (true) {
                int i6 = iG & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iG++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new a4f(obj4);
        }
        if (h(i4) < iH / 2) {
            return i(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new fkd(i3, i2, i4, objArr, objArr2);
    }

    public static hh7 j(Collection collection) {
        if ((collection instanceof hh7) && !(collection instanceof SortedSet)) {
            hh7 hh7Var = (hh7) collection;
            if (!hh7Var.f()) {
                return hh7Var;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    @Override // defpackage.ng7
    public wg7 a() {
        wg7 wg7Var = this.b;
        if (wg7Var != null) {
            return wg7Var;
        }
        wg7 wg7VarK = k();
        this.b = wg7VarK;
        return wg7VarK;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof hh7) && l() && ((hh7) obj).l() && hashCode() != obj.hashCode()) {
            return false;
        }
        return w9j.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return w9j.d(this);
    }

    public wg7 k() {
        Object[] array = toArray(ng7.a);
        t76 t76Var = wg7.b;
        return wg7.h(array.length, array);
    }

    public boolean l() {
        return this instanceof fkd;
    }
}
