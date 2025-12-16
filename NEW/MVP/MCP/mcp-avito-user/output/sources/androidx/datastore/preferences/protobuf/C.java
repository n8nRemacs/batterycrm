package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* loaded from: classes.dex */
final class C extends AbstractC22883c<Double> implements C22914m0.b, RandomAccess, Y0 {

    /* renamed from: c, reason: collision with root package name */
    public double[] f45593c;

    /* renamed from: d, reason: collision with root package name */
    public int f45594d;

    static {
        new C(new double[0], 0).f45804b = false;
    }

    public C() {
        this(new double[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f45594d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45594d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        double[] dArr = this.f45593c;
        if (i13 < dArr.length) {
            System.arraycopy(dArr, i12, dArr, i12 + 1, i13 - i12);
        } else {
            double[] dArr2 = new double[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            System.arraycopy(this.f45593c, i12, dArr2, i12 + 1, this.f45594d - i12);
            this.f45593c = dArr2;
        }
        this.f45593c[i12] = dDoubleValue;
        this.f45594d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        Charset charset = C22914m0.f45874a;
        collection.getClass();
        if (!(collection instanceof C)) {
            return super.addAll(collection);
        }
        C c12 = (C) collection;
        int i12 = c12.f45594d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f45594d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        double[] dArr = this.f45593c;
        if (i14 > dArr.length) {
            this.f45593c = Arrays.copyOf(dArr, i14);
        }
        System.arraycopy(c12.f45593c, 0, this.f45593c, this.f45594d, c12.f45594d);
        this.f45594d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d12) {
        b();
        int i12 = this.f45594d;
        double[] dArr = this.f45593c;
        if (i12 == dArr.length) {
            double[] dArr2 = new double[androidx.compose.ui.graphics.colorspace.e.e(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            this.f45593c = dArr2;
        }
        double[] dArr3 = this.f45593c;
        int i13 = this.f45594d;
        this.f45594d = i13 + 1;
        dArr3[i13] = d12;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f45594d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45594d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return super.equals(obj);
        }
        C c12 = (C) obj;
        if (this.f45594d != c12.f45594d) {
            return false;
        }
        double[] dArr = c12.f45593c;
        for (int i12 = 0; i12 < this.f45594d; i12++) {
            if (Double.doubleToLongBits(this.f45593c[i12]) != Double.doubleToLongBits(dArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        d(i12);
        return Double.valueOf(this.f45593c[i12]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB2 = 1;
        for (int i12 = 0; i12 < this.f45594d; i12++) {
            iB2 = (iB2 * 31) + C22914m0.b(Double.doubleToLongBits(this.f45593c[i12]));
        }
        return iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.k
    public final C22914m0.k<Double> mutableCopyWithCapacity(int i12) {
        if (i12 >= this.f45594d) {
            return new C(Arrays.copyOf(this.f45593c, i12), this.f45594d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i12 = 0; i12 < this.f45594d; i12++) {
            if (obj.equals(Double.valueOf(this.f45593c[i12]))) {
                double[] dArr = this.f45593c;
                System.arraycopy(dArr, i12 + 1, dArr, i12, (this.f45594d - i12) - 1);
                this.f45594d--;
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
        double[] dArr = this.f45593c;
        System.arraycopy(dArr, i13, dArr, i12, this.f45594d - i13);
        this.f45594d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        d(i12);
        double[] dArr = this.f45593c;
        double d12 = dArr[i12];
        dArr[i12] = dDoubleValue;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45594d;
    }

    public C(double[] dArr, int i12) {
        this.f45593c = dArr;
        this.f45594d = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        double[] dArr = this.f45593c;
        double d12 = dArr[i12];
        if (i12 < this.f45594d - 1) {
            System.arraycopy(dArr, i12 + 1, dArr, i12, (r3 - i12) - 1);
        }
        this.f45594d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d12);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
