package com.google.protobuf;

import com.google.protobuf.C37670d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* renamed from: com.google.protobuf.n0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37690n0 extends AbstractC37667c<Long> implements C37670d0.i, RandomAccess, M0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C37690n0 f362918e = new C37690n0(new long[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public long[] f362919c;

    /* renamed from: d, reason: collision with root package name */
    public int f362920d;

    public C37690n0() {
        this(new long[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f362920d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362920d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        long[] jArr = this.f362919c;
        if (i13 < jArr.length) {
            System.arraycopy(jArr, i12, jArr, i12 + 1, i13 - i12);
        } else {
            long[] jArr2 = new long[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            System.arraycopy(this.f362919c, i12, jArr2, i12 + 1, this.f362920d - i12);
            this.f362919c = jArr2;
        }
        this.f362919c[i12] = jLongValue;
        this.f362920d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        Charset charset = C37670d0.f362857a;
        collection.getClass();
        if (!(collection instanceof C37690n0)) {
            return super.addAll(collection);
        }
        C37690n0 c37690n0 = (C37690n0) collection;
        int i12 = c37690n0.f362920d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f362920d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        long[] jArr = this.f362919c;
        if (i14 > jArr.length) {
            this.f362919c = Arrays.copyOf(jArr, i14);
        }
        System.arraycopy(c37690n0.f362919c, 0, this.f362919c, this.f362920d, c37690n0.f362920d);
        this.f362920d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j12) {
        b();
        int i12 = this.f362920d;
        long[] jArr = this.f362919c;
        if (i12 == jArr.length) {
            long[] jArr2 = new long[androidx.compose.ui.graphics.colorspace.e.e(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            this.f362919c = jArr2;
        }
        long[] jArr3 = this.f362919c;
        int i13 = this.f362920d;
        this.f362920d = i13 + 1;
        jArr3[i13] = j12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f362920d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362920d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37690n0)) {
            return super.equals(obj);
        }
        C37690n0 c37690n0 = (C37690n0) obj;
        if (this.f362920d != c37690n0.f362920d) {
            return false;
        }
        long[] jArr = c37690n0.f362919c;
        for (int i12 = 0; i12 < this.f362920d; i12++) {
            if (this.f362919c[i12] != jArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        return Long.valueOf(getLong(i12));
    }

    public final long getLong(int i12) {
        d(i12);
        return this.f362919c[i12];
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB2 = 1;
        for (int i12 = 0; i12 < this.f362920d; i12++) {
            iB2 = (iB2 * 31) + C37670d0.b(this.f362919c[i12]);
        }
        return iB2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i12 = this.f362920d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f362919c[i13] == jLongValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        long[] jArr = this.f362919c;
        long j12 = jArr[i12];
        if (i12 < this.f362920d - 1) {
            System.arraycopy(jArr, i12 + 1, jArr, i12, (r3 - i12) - 1);
        }
        this.f362920d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f362919c;
        System.arraycopy(jArr, i13, jArr, i12, this.f362920d - i13);
        this.f362920d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        d(i12);
        long[] jArr = this.f362919c;
        long j12 = jArr[i12];
        jArr[i12] = jLongValue;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f362920d;
    }

    public C37690n0(long[] jArr, int i12, boolean z12) {
        super(z12);
        this.f362919c = jArr;
        this.f362920d = i12;
    }

    @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
    /* renamed from: mutableCopyWithCapacity */
    public final C37670d0.k<Long> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.f362920d) {
            return new C37690n0(Arrays.copyOf(this.f362919c, i12), this.f362920d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
