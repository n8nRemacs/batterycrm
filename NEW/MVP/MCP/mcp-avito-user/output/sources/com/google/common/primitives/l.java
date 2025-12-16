package com.google.common.primitives;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.common.base.AbstractC37266j;
import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Ints.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class l extends m {

    /* compiled from: Ints.java */
    @XY0.b
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f360398b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360399c;

        /* renamed from: d, reason: collision with root package name */
        public final int f360400d;

        public a(int i12, int i13, int[] iArr) {
            this.f360398b = iArr;
            this.f360399c = i12;
            this.f360400d = i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (obj instanceof Integer) {
                if (l.e(this.f360398b, ((Integer) obj).intValue(), this.f360399c, this.f360400d) != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i12 = 0; i12 < size; i12++) {
                if (this.f360398b[this.f360399c + i12] != aVar.f360398b[aVar.f360399c + i12]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            M.i(i12, size());
            return Integer.valueOf(this.f360398b[this.f360399c + i12]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i12 = 1;
            for (int i13 = this.f360399c; i13 < this.f360400d; i13++) {
                i12 = (i12 * 31) + this.f360398b[i13];
            }
            return i12;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int iIntValue = ((Integer) obj).intValue();
            int[] iArr = this.f360398b;
            int i12 = this.f360399c;
            int iE2 = l.e(iArr, iIntValue, i12, this.f360400d);
            if (iE2 >= 0) {
                return iE2 - i12;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            int i12;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i13 = this.f360400d;
                while (true) {
                    i13--;
                    i12 = this.f360399c;
                    if (i13 < i12) {
                        i13 = -1;
                        break;
                    }
                    if (this.f360398b[i13] == iIntValue) {
                        break;
                    }
                }
                if (i13 >= 0) {
                    return i13 - i12;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i12, Object obj) {
            Integer num = (Integer) obj;
            M.i(i12, size());
            int i13 = this.f360399c + i12;
            int[] iArr = this.f360398b;
            int i14 = iArr[i13];
            num.getClass();
            iArr[i13] = num.intValue();
            return Integer.valueOf(i14);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360400d - this.f360399c;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i12, int i13) {
            M.l(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int i14 = this.f360399c;
            return new a(i12 + i14, i14 + i13, this.f360398b);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            int[] iArr = this.f360398b;
            int i12 = this.f360399c;
            sb2.append(iArr[i12]);
            while (true) {
                i12++;
                if (i12 >= this.f360400d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(iArr[i12]);
            }
        }
    }

    /* compiled from: Ints.java */
    public static final class b extends AbstractC37266j<String, Integer> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final b f360401b = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f360401b;
        }

        @Override // com.google.common.base.AbstractC37266j
        public final Integer b(String str) {
            return Integer.decode(str);
        }

        public final String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Ints.java */
    public static final class c implements Comparator<int[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f360402b = {new c("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        c EF5;

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f360402b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int iMin = Math.min(iArr3.length, iArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                int i13 = iArr3[i12];
                int i14 = iArr4[i12];
                int i15 = i13 < i14 ? -1 : i13 > i14 ? 1 : 0;
                if (i15 != 0) {
                    return i15;
                }
            }
            return iArr3.length - iArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static List<Integer> a(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(0, iArr.length, iArr);
    }

    public static int b(long j12) {
        int i12 = (int) j12;
        M.e("Out of range: %s", ((long) i12) == j12, j12);
        return i12;
    }

    public static int c(int i12, int i13) {
        M.b(i13, 1073741823, "min (%s) must be less than or equal to max (%s)", i13 <= 1073741823);
        return Math.min(Math.max(i12, i13), 1073741823);
    }

    public static int d(byte b12, byte b13, byte b14, byte b15) {
        return (b12 << 24) | ((b13 & 255) << 16) | ((b14 & 255) << 8) | (b15 & 255);
    }

    public static int e(int[] iArr, int i12, int i13, int i14) {
        while (i13 < i14) {
            if (iArr[i13] == i12) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static int f(long j12) {
        if (j12 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j12 < -2147483648L ? BeduinInputModel.MIN_TEXT_VERSION : (int) j12;
    }

    public static int[] g(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            a aVar = (a) collection;
            return Arrays.copyOfRange(aVar.f360398b, aVar.f360399c, aVar.f360400d);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            Object obj = array[i12];
            obj.getClass();
            iArr[i12] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
