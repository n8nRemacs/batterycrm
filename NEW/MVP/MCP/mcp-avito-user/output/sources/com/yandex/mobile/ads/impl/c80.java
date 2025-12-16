package com.yandex.mobile.ads.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public final class c80 extends d80 {

    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        final int[] f384200a;

        /* renamed from: b, reason: collision with root package name */
        final int f384201b;

        /* renamed from: c, reason: collision with root package name */
        final int f384202c;

        public a(int i12, int i13, int[] iArr) {
            this.f384200a = iArr;
            this.f384201b = i12;
            this.f384202c = i13;
        }

        public final int[] b() {
            return Arrays.copyOfRange(this.f384200a, this.f384201b, this.f384202c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f384200a;
                int iIntValue = ((Integer) obj).intValue();
                int i12 = this.f384201b;
                int i13 = this.f384202c;
                while (true) {
                    if (i12 >= i13) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == iIntValue) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1) {
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
                if (this.f384200a[this.f384201b + i12] != aVar.f384200a[aVar.f384201b + i12]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            iu0.a(i12, size());
            return Integer.valueOf(this.f384200a[this.f384201b + i12]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i12 = 1;
            for (int i13 = this.f384201b; i13 < this.f384202c; i13++) {
                i12 = (i12 * 31) + this.f384200a[i13];
            }
            return i12;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f384200a;
                int iIntValue = ((Integer) obj).intValue();
                int i12 = this.f384201b;
                int i13 = this.f384202c;
                while (true) {
                    if (i12 >= i13) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == iIntValue) {
                        break;
                    }
                    i12++;
                }
                if (i12 >= 0) {
                    return i12 - this.f384201b;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f384200a;
                int iIntValue = ((Integer) obj).intValue();
                int i12 = this.f384201b;
                int i13 = this.f384202c - 1;
                while (true) {
                    if (i13 < i12) {
                        i13 = -1;
                        break;
                    }
                    if (iArr[i13] == iIntValue) {
                        break;
                    }
                    i13--;
                }
                if (i13 >= 0) {
                    return i13 - this.f384201b;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i12, Object obj) {
            Integer num = (Integer) obj;
            iu0.a(i12, size());
            int[] iArr = this.f384200a;
            int i13 = this.f384201b + i12;
            int i14 = iArr[i13];
            num.getClass();
            iArr[i13] = num.intValue();
            return Integer.valueOf(i14);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f384202c - this.f384201b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i12, int i13) {
            iu0.a(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int[] iArr = this.f384200a;
            int i14 = this.f384201b;
            return new a(i12 + i14, i14 + i13, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f384200a[this.f384201b]);
            int i12 = this.f384201b;
            while (true) {
                i12++;
                if (i12 >= this.f384202c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f384200a[i12]);
            }
        }
    }

    public static int a(long j12) {
        int i12 = (int) j12;
        if (((long) i12) == j12) {
            return i12;
        }
        throw new IllegalArgumentException(p71.a("Out of range: %s", Long.valueOf(j12)));
    }

    public static int b(long j12) {
        if (j12 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j12 < -2147483648L ? BeduinInputModel.MIN_TEXT_VERSION : (int) j12;
    }

    public static int[] a(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof a) {
            return ((a) abstractCollection).b();
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            Object obj = array[i12];
            obj.getClass();
            iArr[i12] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List<Integer> a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(0, iArr.length, iArr);
    }
}
