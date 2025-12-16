package com.google.common.primitives;

import com.google.common.base.M;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Bytes.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class b {

    /* compiled from: Bytes.java */
    @XY0.b
    public static class a extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f360367b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360368c;

        public a(int i12, int i13) {
            this.f360367b = i12;
            this.f360368c = i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            ((Byte) obj).byteValue();
            if (this.f360367b >= this.f360368c) {
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
            if (this.f360367b >= this.f360368c) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            ((Byte) obj).byteValue();
            if (this.f360367b >= this.f360368c) {
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
            if (!(obj instanceof Byte)) {
                return -1;
            }
            ((Byte) obj).byteValue();
            if (this.f360368c - 1 < this.f360367b) {
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
            return this.f360368c - this.f360367b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Byte> subList(int i12, int i13) {
            M.l(i12, i13, size());
            if (i12 == i13) {
                return Collections.emptyList();
            }
            int i14 = this.f360367b;
            return new a(i12 + i14, i14 + i13);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 5).append('[');
            throw null;
        }
    }
}
