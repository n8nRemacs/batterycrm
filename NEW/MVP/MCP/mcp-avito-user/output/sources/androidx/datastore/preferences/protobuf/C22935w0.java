package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22935w0 extends AbstractC22883c<Long> implements C22914m0.i, RandomAccess, Y0 {

    /* renamed from: c, reason: collision with root package name */
    public long[] f45936c;

    /* renamed from: d, reason: collision with root package name */
    public int f45937d;

    static {
        new C22935w0(new long[0], 0).f45804b = false;
    }

    public C22935w0() {
        this(new long[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f45937d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45937d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        long[] jArr = this.f45936c;
        if (i13 < jArr.length) {
            System.arraycopy(jArr, i12, jArr, i12 + 1, i13 - i12);
        } else {
            long[] jArr2 = new long[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            System.arraycopy(this.f45936c, i12, jArr2, i12 + 1, this.f45937d - i12);
            this.f45936c = jArr2;
        }
        this.f45936c[i12] = jLongValue;
        this.f45937d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        Charset charset = C22914m0.f45874a;
        collection.getClass();
        if (!(collection instanceof C22935w0)) {
            return super.addAll(collection);
        }
        C22935w0 c22935w0 = (C22935w0) collection;
        int i12 = c22935w0.f45937d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f45937d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        long[] jArr = this.f45936c;
        if (i14 > jArr.length) {
            this.f45936c = Arrays.copyOf(jArr, i14);
        }
        System.arraycopy(c22935w0.f45936c, 0, this.f45936c, this.f45937d, c22935w0.f45937d);
        this.f45937d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j12) {
        b();
        int i12 = this.f45937d;
        long[] jArr = this.f45936c;
        if (i12 == jArr.length) {
            long[] jArr2 = new long[androidx.compose.ui.graphics.colorspace.e.e(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            this.f45936c = jArr2;
        }
        long[] jArr3 = this.f45936c;
        int i13 = this.f45937d;
        this.f45937d = i13 + 1;
        jArr3[i13] = j12;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f45937d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45937d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22935w0)) {
            return super.equals(obj);
        }
        C22935w0 c22935w0 = (C22935w0) obj;
        if (this.f45937d != c22935w0.f45937d) {
            return false;
        }
        long[] jArr = c22935w0.f45936c;
        for (int i12 = 0; i12 < this.f45937d; i12++) {
            if (this.f45936c[i12] != jArr[i12]) {
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
        return this.f45936c[i12];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB2 = 1;
        for (int i12 = 0; i12 < this.f45937d; i12++) {
            iB2 = (iB2 * 31) + C22914m0.b(this.f45936c[i12]);
        }
        return iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.k
    public final C22914m0.k<Long> mutableCopyWithCapacity(int i12) {
        if (i12 >= this.f45937d) {
            return new C22935w0(Arrays.copyOf(this.f45936c, i12), this.f45937d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i12 = 0; i12 < this.f45937d; i12++) {
            if (obj.equals(Long.valueOf(this.f45936c[i12]))) {
                long[] jArr = this.f45936c;
                System.arraycopy(jArr, i12 + 1, jArr, i12, (this.f45937d - i12) - 1);
                this.f45937d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f45936c;
        System.arraycopy(jArr, i13, jArr, i12, this.f45937d - i13);
        this.f45937d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        d(i12);
        long[] jArr = this.f45936c;
        long j12 = jArr[i12];
        jArr[i12] = jLongValue;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45937d;
    }

    public C22935w0(long[] jArr, int i12) {
        this.f45936c = jArr;
        this.f45937d = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        long[] jArr = this.f45936c;
        long j12 = jArr[i12];
        if (i12 < this.f45937d - 1) {
            System.arraycopy(jArr, i12 + 1, jArr, i12, (r3 - i12) - 1);
        }
        this.f45937d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j12);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
