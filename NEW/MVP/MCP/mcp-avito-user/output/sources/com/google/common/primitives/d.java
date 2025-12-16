package com.google.common.primitives;

import com.google.common.base.AbstractC37266j;
import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

/* compiled from: Doubles.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f360372a = 0;

    /* compiled from: Doubles.java */
    @XY0.b
    public static class a extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f360373b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360374c;

        public a(int i12, int i13) {
            this.f360373b = i12;
            this.f360374c = i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Double)) {
                return false;
            }
            ((Double) obj).doubleValue();
            int i12 = d.f360372a;
            if (this.f360373b >= this.f360374c) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            int size = size();
            if (((a) obj).size() != size) {
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
            if (this.f360373b >= this.f360374c) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            ((Double) obj).doubleValue();
            int i12 = d.f360372a;
            if (this.f360373b >= this.f360374c) {
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
            if (!(obj instanceof Double)) {
                return -1;
            }
            ((Double) obj).doubleValue();
            int i12 = d.f360372a;
            if (this.f360374c - 1 < this.f360373b) {
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
            return this.f360374c - this.f360373b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Double> subList(int i12, int i13) {
            M.l(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int i14 = this.f360373b;
            return new a(i12 + i14, i14 + i13);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 12).append('[');
            throw null;
        }
    }

    /* compiled from: Doubles.java */
    public static final class b extends AbstractC37266j<String, Double> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final b f360375b = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f360375b;
        }

        @Override // com.google.common.base.AbstractC37266j
        public final Double b(String str) {
            return Double.valueOf(str);
        }

        public final String toString() {
            return "Doubles.stringConverter()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Doubles.java */
    public static final class c implements Comparator<double[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f360376b = {new c("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        c EF5;

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f360376b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(double[] dArr, double[] dArr2) {
            double[] dArr3 = dArr;
            double[] dArr4 = dArr2;
            int iMin = Math.min(dArr3.length, dArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                int iCompare = Double.compare(dArr3[i12], dArr4[i12]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr3.length - dArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    static {
        Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }
}
