package com.google.protobuf;

import com.google.protobuf.C37670d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* loaded from: classes7.dex */
final class B extends AbstractC37667c<Double> implements C37670d0.b, RandomAccess, M0 {

    /* renamed from: e, reason: collision with root package name */
    public static final B f362598e = new B(new double[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public double[] f362599c;

    /* renamed from: d, reason: collision with root package name */
    public int f362600d;

    public B() {
        this(new double[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f362600d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362600d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        double[] dArr = this.f362599c;
        if (i13 < dArr.length) {
            System.arraycopy(dArr, i12, dArr, i12 + 1, i13 - i12);
        } else {
            double[] dArr2 = new double[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            System.arraycopy(this.f362599c, i12, dArr2, i12 + 1, this.f362600d - i12);
            this.f362599c = dArr2;
        }
        this.f362599c[i12] = dDoubleValue;
        this.f362600d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        Charset charset = C37670d0.f362857a;
        collection.getClass();
        if (!(collection instanceof B)) {
            return super.addAll(collection);
        }
        B b12 = (B) collection;
        int i12 = b12.f362600d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f362600d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        double[] dArr = this.f362599c;
        if (i14 > dArr.length) {
            this.f362599c = Arrays.copyOf(dArr, i14);
        }
        System.arraycopy(b12.f362599c, 0, this.f362599c, this.f362600d, b12.f362600d);
        this.f362600d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d12) {
        b();
        int i12 = this.f362600d;
        double[] dArr = this.f362599c;
        if (i12 == dArr.length) {
            double[] dArr2 = new double[androidx.compose.ui.graphics.colorspace.e.e(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            this.f362599c = dArr2;
        }
        double[] dArr3 = this.f362599c;
        int i13 = this.f362600d;
        this.f362600d = i13 + 1;
        dArr3[i13] = d12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f362600d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362600d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return super.equals(obj);
        }
        B b12 = (B) obj;
        if (this.f362600d != b12.f362600d) {
            return false;
        }
        double[] dArr = b12.f362599c;
        for (int i12 = 0; i12 < this.f362600d; i12++) {
            if (Double.doubleToLongBits(this.f362599c[i12]) != Double.doubleToLongBits(dArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        d(i12);
        return Double.valueOf(this.f362599c[i12]);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB2 = 1;
        for (int i12 = 0; i12 < this.f362600d; i12++) {
            iB2 = (iB2 * 31) + C37670d0.b(Double.doubleToLongBits(this.f362599c[i12]));
        }
        return iB2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i12 = this.f362600d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f362599c[i13] == dDoubleValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        double[] dArr = this.f362599c;
        double d12 = dArr[i12];
        if (i12 < this.f362600d - 1) {
            System.arraycopy(dArr, i12 + 1, dArr, i12, (r3 - i12) - 1);
        }
        this.f362600d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f362599c;
        System.arraycopy(dArr, i13, dArr, i12, this.f362600d - i13);
        this.f362600d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        d(i12);
        double[] dArr = this.f362599c;
        double d12 = dArr[i12];
        dArr[i12] = dDoubleValue;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f362600d;
    }

    public B(double[] dArr, int i12, boolean z12) {
        super(z12);
        this.f362599c = dArr;
        this.f362600d = i12;
    }

    @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
    /* renamed from: mutableCopyWithCapacity */
    public final C37670d0.k<Double> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.f362600d) {
            return new B(Arrays.copyOf(this.f362599c, i12), this.f362600d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
