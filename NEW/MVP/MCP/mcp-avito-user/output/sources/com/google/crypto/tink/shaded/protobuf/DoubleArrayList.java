package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        DoubleArrayList doubleArrayList = new DoubleArrayList(new double[0], 0);
        EMPTY_LIST = doubleArrayList;
        doubleArrayList.makeImmutable();
    }

    public DoubleArrayList() {
        this(new double[10], 0);
    }

    public static DoubleArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i12) {
        if (i12 < 0 || i12 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i12));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i12) {
        StringBuilder sbJ = G.j(i12, "Index:", ", Size:");
        sbJ.append(this.size);
        return sbJ.toString();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i12 = doubleArrayList.size;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.size;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        double[] dArr = this.array;
        if (i14 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i14);
        }
        System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.DoubleList
    public void addDouble(double d12) {
        ensureIsMutable();
        int i12 = this.size;
        double[] dArr = this.array;
        if (i12 == dArr.length) {
            double[] dArr2 = new double[e.e(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i13 = this.size;
        this.size = i13 + 1;
        dArr3[i13] = d12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i12 = 0; i12 < this.size; i12++) {
            if (Double.doubleToLongBits(this.array[i12]) != Double.doubleToLongBits(dArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.DoubleList
    public double getDouble(int i12) {
        ensureIndexInRange(i12);
        return this.array[i12];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i12]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.array[i12] == dDoubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i12, int i13) {
        ensureIsMutable();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.array;
        System.arraycopy(dArr, i13, dArr, i12, this.size - i13);
        this.size -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.DoubleList
    public double setDouble(int i12, double d12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        double[] dArr = this.array;
        double d13 = dArr[i12];
        dArr[i12] = d12;
        return d13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private DoubleArrayList(double[] dArr, int i12) {
        this.array = dArr;
        this.size = i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i12) {
        return Double.valueOf(getDouble(i12));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, i12), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int i12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        double[] dArr = this.array;
        double d12 = dArr[i12];
        if (i12 < this.size - 1) {
            System.arraycopy(dArr, i12 + 1, dArr, i12, (r3 - i12) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double set(int i12, Double d12) {
        return Double.valueOf(setDouble(i12, d12.doubleValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d12) {
        addDouble(d12.doubleValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i12, Double d12) {
        addDouble(i12, d12.doubleValue());
    }

    private void addDouble(int i12, double d12) {
        int i13;
        ensureIsMutable();
        if (i12 >= 0 && i12 <= (i13 = this.size)) {
            double[] dArr = this.array;
            if (i13 < dArr.length) {
                System.arraycopy(dArr, i12, dArr, i12 + 1, i13 - i12);
            } else {
                double[] dArr2 = new double[e.e(i13, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i12);
                System.arraycopy(this.array, i12, dArr2, i12 + 1, this.size - i12);
                this.array = dArr2;
            }
            this.array[i12] = d12;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i12));
    }
}
