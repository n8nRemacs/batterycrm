package com.google.common.primitives;

import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Chars.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class c {

    /* compiled from: Chars.java */
    @XY0.b
    public static class a extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f360369b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360370c;

        public a(int i12, int i13) {
            this.f360369b = i12;
            this.f360370c = i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Character)) {
                return false;
            }
            ((Character) obj).charValue();
            if (this.f360369b >= this.f360370c) {
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
            if (this.f360369b >= this.f360370c) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            ((Character) obj).charValue();
            if (this.f360369b >= this.f360370c) {
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
            if (!(obj instanceof Character)) {
                return -1;
            }
            ((Character) obj).charValue();
            if (this.f360370c - 1 < this.f360369b) {
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
            return this.f360370c - this.f360369b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Character> subList(int i12, int i13) {
            M.l(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int i14 = this.f360369b;
            return new a(i12 + i14, i14 + i13);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 3).append('[');
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Chars.java */
    public static final class b implements Comparator<char[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f360371b = {new b("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f360371b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(char[] cArr, char[] cArr2) {
            char[] cArr3 = cArr;
            char[] cArr4 = cArr2;
            int iMin = Math.min(cArr3.length, cArr4.length);
            for (int i12 = 0; i12 < iMin; i12++) {
                int i13 = cArr3[i12] - cArr4[i12];
                if (i13 != 0) {
                    return i13;
                }
            }
            return cArr3.length - cArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }
}
