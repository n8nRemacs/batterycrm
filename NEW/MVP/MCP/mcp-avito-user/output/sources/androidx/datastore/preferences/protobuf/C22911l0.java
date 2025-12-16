package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22911l0 extends AbstractC22883c<Integer> implements C22914m0.g, RandomAccess, Y0 {

    /* renamed from: c, reason: collision with root package name */
    public int[] f45871c;

    /* renamed from: d, reason: collision with root package name */
    public int f45872d;

    static {
        new C22911l0(new int[0], 0).f45804b = false;
    }

    public C22911l0() {
        this(new int[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f45872d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45872d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        int[] iArr = this.f45871c;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i12, iArr, i12 + 1, i13 - i12);
        } else {
            int[] iArr2 = new int[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            System.arraycopy(this.f45871c, i12, iArr2, i12 + 1, this.f45872d - i12);
            this.f45871c = iArr2;
        }
        this.f45871c[i12] = iIntValue;
        this.f45872d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Charset charset = C22914m0.f45874a;
        collection.getClass();
        if (!(collection instanceof C22911l0)) {
            return super.addAll(collection);
        }
        C22911l0 c22911l0 = (C22911l0) collection;
        int i12 = c22911l0.f45872d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f45872d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        int[] iArr = this.f45871c;
        if (i14 > iArr.length) {
            this.f45871c = Arrays.copyOf(iArr, i14);
        }
        System.arraycopy(c22911l0.f45871c, 0, this.f45871c, this.f45872d, c22911l0.f45872d);
        this.f45872d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i12) {
        b();
        int i13 = this.f45872d;
        int[] iArr = this.f45871c;
        if (i13 == iArr.length) {
            int[] iArr2 = new int[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.f45871c = iArr2;
        }
        int[] iArr3 = this.f45871c;
        int i14 = this.f45872d;
        this.f45872d = i14 + 1;
        iArr3[i14] = i12;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f45872d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45872d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22911l0)) {
            return super.equals(obj);
        }
        C22911l0 c22911l0 = (C22911l0) obj;
        if (this.f45872d != c22911l0.f45872d) {
            return false;
        }
        int[] iArr = c22911l0.f45871c;
        for (int i12 = 0; i12 < this.f45872d; i12++) {
            if (this.f45871c[i12] != iArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        return Integer.valueOf(getInt(i12));
    }

    public final int getInt(int i12) {
        d(i12);
        return this.f45871c[i12];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f45872d; i13++) {
            i12 = (i12 * 31) + this.f45871c[i13];
        }
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.k
    public final C22914m0.k<Integer> mutableCopyWithCapacity(int i12) {
        if (i12 >= this.f45872d) {
            return new C22911l0(Arrays.copyOf(this.f45871c, i12), this.f45872d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i12 = 0; i12 < this.f45872d; i12++) {
            if (obj.equals(Integer.valueOf(this.f45871c[i12]))) {
                int[] iArr = this.f45871c;
                System.arraycopy(iArr, i12 + 1, iArr, i12, (this.f45872d - i12) - 1);
                this.f45872d--;
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
        int[] iArr = this.f45871c;
        System.arraycopy(iArr, i13, iArr, i12, this.f45872d - i13);
        this.f45872d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        d(i12);
        int[] iArr = this.f45871c;
        int i13 = iArr[i12];
        iArr[i12] = iIntValue;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45872d;
    }

    public C22911l0(int[] iArr, int i12) {
        this.f45871c = iArr;
        this.f45872d = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        int[] iArr = this.f45871c;
        int i13 = iArr[i12];
        if (i12 < this.f45872d - 1) {
            System.arraycopy(iArr, i12 + 1, iArr, i12, (r2 - i12) - 1);
        }
        this.f45872d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
