package com.google.common.primitives;

import com.google.common.base.AbstractC37266j;
import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Shorts.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class r extends s {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Shorts.java */
    public static final class a implements Comparator<short[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f360409b = {new a("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360409b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(short[] sArr, short[] sArr2) {
            short[] sArr3 = sArr;
            short[] sArr4 = sArr2;
            int iMin = Math.min(sArr3.length, sArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                int i13 = sArr3[i12] - sArr4[i12];
                if (i13 != 0) {
                    return i13;
                }
            }
            return sArr3.length - sArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    /* compiled from: Shorts.java */
    @XY0.b
    public static class b extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f360410b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360411c;

        public b(int i12, int i13) {
            this.f360410b = i12;
            this.f360411c = i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Short)) {
                return false;
            }
            ((Short) obj).shortValue();
            if (this.f360410b >= this.f360411c) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return super.equals(obj);
            }
            int size = size();
            if (((b) obj).size() != size) {
                return false;
            }
            if (size <= 0) {
                return true;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            M.i(i12, size());
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            if (this.f360410b >= this.f360411c) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            ((Short) obj).shortValue();
            if (this.f360410b >= this.f360411c) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            ((Short) obj).shortValue();
            if (this.f360411c - 1 < this.f360410b) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i12, Object obj) {
            M.i(i12, size());
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360411c - this.f360410b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Short> subList(int i12, int i13) {
            M.l(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int i14 = this.f360410b;
            return new b(i12 + i14, i14 + i13);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 6).append('[');
            throw null;
        }
    }

    /* compiled from: Shorts.java */
    public static final class c extends AbstractC37266j<String, Short> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final c f360412b = new c();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f360412b;
        }

        @Override // com.google.common.base.AbstractC37266j
        public final Short b(String str) {
            return Short.decode(str);
        }

        public final String toString() {
            return "Shorts.stringConverter()";
        }
    }
}
