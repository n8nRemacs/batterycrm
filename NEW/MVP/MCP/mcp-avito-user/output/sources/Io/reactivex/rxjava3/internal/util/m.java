package io.reactivex.rxjava3.internal.util;

/* compiled from: OpenHashSet.java */
/* loaded from: classes8.dex */
public final class m<T> {

    /* renamed from: a, reason: collision with root package name */
    public final float f404835a;

    /* renamed from: b, reason: collision with root package name */
    public int f404836b;

    /* renamed from: c, reason: collision with root package name */
    public int f404837c;

    /* renamed from: d, reason: collision with root package name */
    public int f404838d;

    /* renamed from: e, reason: collision with root package name */
    public T[] f404839e;

    public m() {
        this(16, 0);
    }

    public final void a(Object obj) {
        T t12;
        Object obj2;
        Object[] objArr = this.f404839e;
        int i12 = this.f404836b;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i13 = (iHashCode ^ (iHashCode >>> 16)) & i12;
        Object obj3 = objArr[i13];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return;
            }
            do {
                i13 = (i13 + 1) & i12;
                obj2 = objArr[i13];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return;
        }
        objArr[i13] = obj;
        int i14 = this.f404837c + 1;
        this.f404837c = i14;
        if (i14 < this.f404838d) {
            return;
        }
        T[] tArr = this.f404839e;
        int length = tArr.length;
        int i15 = length << 1;
        int i16 = i15 - 1;
        T[] tArr2 = (T[]) new Object[i15];
        while (true) {
            int i17 = i14 - 1;
            if (i14 == 0) {
                this.f404836b = i16;
                this.f404838d = (int) (i15 * this.f404835a);
                this.f404839e = tArr2;
                return;
            }
            do {
                length--;
                t12 = tArr[length];
            } while (t12 == null);
            int iHashCode2 = t12.hashCode() * (-1640531527);
            int i18 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i16;
            if (tArr2[i18] != null) {
                do {
                    i18 = (i18 + 1) & i16;
                } while (tArr2[i18] != null);
            }
            tArr2[i18] = tArr[length];
            i14 = i17;
        }
    }

    public final boolean b(T t12) {
        T t13;
        T[] tArr = this.f404839e;
        int i12 = this.f404836b;
        int iHashCode = t12.hashCode() * (-1640531527);
        int i13 = (iHashCode ^ (iHashCode >>> 16)) & i12;
        T t14 = tArr[i13];
        if (t14 == null) {
            return false;
        }
        if (t14.equals(t12)) {
            c(i13, i12, tArr);
            return true;
        }
        do {
            i13 = (i13 + 1) & i12;
            t13 = tArr[i13];
            if (t13 == null) {
                return false;
            }
        } while (!t13.equals(t12));
        c(i13, i12, tArr);
        return true;
    }

    public final void c(int i12, int i13, Object[] objArr) {
        int i14;
        Object obj;
        this.f404837c--;
        while (true) {
            int i15 = i12 + 1;
            while (true) {
                i14 = i15 & i13;
                obj = objArr[i14];
                if (obj == null) {
                    objArr[i12] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i16 = (iHashCode ^ (iHashCode >>> 16)) & i13;
                if (i12 <= i14) {
                    if (i12 >= i16 || i16 > i14) {
                        break;
                    } else {
                        i15 = i14 + 1;
                    }
                } else if (i12 < i16 || i16 <= i14) {
                    i15 = i14 + 1;
                }
            }
            objArr[i12] = obj;
            i12 = i14;
        }
    }

    public m(int i12, int i13) {
        this.f404835a = 0.75f;
        int iA2 = n.a(i12);
        this.f404836b = iA2 - 1;
        this.f404838d = (int) (0.75f * iA2);
        this.f404839e = (T[]) new Object[iA2];
    }
}
