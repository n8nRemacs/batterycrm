package com.google.common.primitives;

import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Booleans.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class a {

    /* compiled from: Booleans.java */
    @XY0.b
    /* renamed from: com.google.common.primitives.a$a, reason: collision with other inner class name */
    public static class C10685a extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f360361b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360362c;

        public C10685a(int i12, int i13) {
            this.f360361b = i12;
            this.f360362c = i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            ((Boolean) obj).booleanValue();
            if (this.f360361b >= this.f360362c) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C10685a)) {
                return super.equals(obj);
            }
            int size = size();
            if (((C10685a) obj).size() != size) {
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
            if (this.f360361b >= this.f360362c) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            ((Boolean) obj).booleanValue();
            if (this.f360361b >= this.f360362c) {
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
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            ((Boolean) obj).booleanValue();
            if (this.f360362c - 1 < this.f360361b) {
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
            return this.f360362c - this.f360361b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Boolean> subList(int i12, int i13) {
            M.l(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int i14 = this.f360361b;
            return new C10685a(i12 + i14, i14 + i13);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 7);
            throw null;
        }
    }

    /* compiled from: Booleans.java */
    public enum b implements Comparator<Boolean> {
        /* JADX INFO: Fake field, exist only in values array */
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        /* JADX INFO: Fake field, exist only in values array */
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* renamed from: b, reason: collision with root package name */
        public final int f360364b;

        /* renamed from: c, reason: collision with root package name */
        public final String f360365c;

        b(int i12, String str) {
            this.f360364b = i12;
            this.f360365c = str;
        }

        @Override // java.util.Comparator
        public final int compare(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool2;
            boolean zBooleanValue = bool.booleanValue();
            int i12 = this.f360364b;
            return (bool3.booleanValue() ? i12 : 0) - (zBooleanValue ? i12 : 0);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f360365c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Booleans.java */
    public static final class c implements Comparator<boolean[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f360366b = {new c("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        c EF5;

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f360366b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(boolean[] zArr, boolean[] zArr2) {
            boolean[] zArr3 = zArr;
            boolean[] zArr4 = zArr2;
            int iMin = Math.min(zArr3.length, zArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                boolean z12 = zArr3[i12];
                int i13 = z12 == zArr4[i12] ? 0 : z12 ? 1 : -1;
                if (i13 != 0) {
                    return i13;
                }
            }
            return zArr3.length - zArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }
}
