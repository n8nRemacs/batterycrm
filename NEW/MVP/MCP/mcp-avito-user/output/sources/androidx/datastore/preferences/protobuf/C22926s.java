package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22926s extends AbstractC22883c<Boolean> implements C22914m0.a, RandomAccess, Y0 {

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f45918c;

    /* renamed from: d, reason: collision with root package name */
    public int f45919d;

    static {
        new C22926s(new boolean[0], 0).f45804b = false;
    }

    public C22926s() {
        this(new boolean[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f45919d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45919d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        boolean[] zArr = this.f45918c;
        if (i13 < zArr.length) {
            System.arraycopy(zArr, i12, zArr, i12 + 1, i13 - i12);
        } else {
            boolean[] zArr2 = new boolean[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            System.arraycopy(this.f45918c, i12, zArr2, i12 + 1, this.f45919d - i12);
            this.f45918c = zArr2;
        }
        this.f45918c[i12] = zBooleanValue;
        this.f45919d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        Charset charset = C22914m0.f45874a;
        collection.getClass();
        if (!(collection instanceof C22926s)) {
            return super.addAll(collection);
        }
        C22926s c22926s = (C22926s) collection;
        int i12 = c22926s.f45919d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f45919d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        boolean[] zArr = this.f45918c;
        if (i14 > zArr.length) {
            this.f45918c = Arrays.copyOf(zArr, i14);
        }
        System.arraycopy(c22926s.f45918c, 0, this.f45918c, this.f45919d, c22926s.f45919d);
        this.f45919d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z12) {
        b();
        int i12 = this.f45919d;
        boolean[] zArr = this.f45918c;
        if (i12 == zArr.length) {
            boolean[] zArr2 = new boolean[androidx.compose.ui.graphics.colorspace.e.e(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            this.f45918c = zArr2;
        }
        boolean[] zArr3 = this.f45918c;
        int i13 = this.f45919d;
        this.f45919d = i13 + 1;
        zArr3[i13] = z12;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f45919d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45919d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22926s)) {
            return super.equals(obj);
        }
        C22926s c22926s = (C22926s) obj;
        if (this.f45919d != c22926s.f45919d) {
            return false;
        }
        boolean[] zArr = c22926s.f45918c;
        for (int i12 = 0; i12 < this.f45919d; i12++) {
            if (this.f45918c[i12] != zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        d(i12);
        return Boolean.valueOf(this.f45918c[i12]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f45919d; i13++) {
            int i14 = i12 * 31;
            boolean z12 = this.f45918c[i13];
            Charset charset = C22914m0.f45874a;
            i12 = i14 + (z12 ? 1231 : 1237);
        }
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.k
    public final C22914m0.k<Boolean> mutableCopyWithCapacity(int i12) {
        if (i12 >= this.f45919d) {
            return new C22926s(Arrays.copyOf(this.f45918c, i12), this.f45919d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i12 = 0; i12 < this.f45919d; i12++) {
            if (obj.equals(Boolean.valueOf(this.f45918c[i12]))) {
                boolean[] zArr = this.f45918c;
                System.arraycopy(zArr, i12 + 1, zArr, i12, (this.f45919d - i12) - 1);
                this.f45919d--;
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
        boolean[] zArr = this.f45918c;
        System.arraycopy(zArr, i13, zArr, i12, this.f45919d - i13);
        this.f45919d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i12);
        boolean[] zArr = this.f45918c;
        boolean z12 = zArr[i12];
        zArr[i12] = zBooleanValue;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45919d;
    }

    public C22926s(boolean[] zArr, int i12) {
        this.f45918c = zArr;
        this.f45919d = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        boolean[] zArr = this.f45918c;
        boolean z12 = zArr[i12];
        if (i12 < this.f45919d - 1) {
            System.arraycopy(zArr, i12 + 1, zArr, i12, (r2 - i12) - 1);
        }
        this.f45919d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z12);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
