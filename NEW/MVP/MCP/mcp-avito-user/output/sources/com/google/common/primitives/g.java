package com.google.common.primitives;

import com.google.common.base.AbstractC37266j;
import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Floats.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class g extends h {

    /* compiled from: Floats.java */
    @XY0.b
    public static class a extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f360377b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360378c;

        public a(int i12, int i13) {
            this.f360377b = i12;
            this.f360378c = i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Float)) {
                return false;
            }
            ((Float) obj).floatValue();
            if (this.f360377b >= this.f360378c) {
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
            if (this.f360377b >= this.f360378c) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            ((Float) obj).floatValue();
            if (this.f360377b >= this.f360378c) {
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
            if (!(obj instanceof Float)) {
                return -1;
            }
            ((Float) obj).floatValue();
            if (this.f360378c - 1 < this.f360377b) {
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
            return this.f360378c - this.f360377b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Float> subList(int i12, int i13) {
            M.l(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int i14 = this.f360377b;
            return new a(i12 + i14, i14 + i13);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 12).append('[');
            throw null;
        }
    }

    /* compiled from: Floats.java */
    public static final class b extends AbstractC37266j<String, Float> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final b f360379b = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f360379b;
        }

        @Override // com.google.common.base.AbstractC37266j
        public final Float b(String str) {
            return Float.valueOf(str);
        }

        public final String toString() {
            return "Floats.stringConverter()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Floats.java */
    public static final class c implements Comparator<float[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f360380b = {new c("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        c EF5;

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f360380b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(float[] fArr, float[] fArr2) {
            float[] fArr3 = fArr;
            float[] fArr4 = fArr2;
            int iMin = Math.min(fArr3.length, fArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                int iCompare = Float.compare(fArr3[i12], fArr4[i12]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return fArr3.length - fArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }
}
