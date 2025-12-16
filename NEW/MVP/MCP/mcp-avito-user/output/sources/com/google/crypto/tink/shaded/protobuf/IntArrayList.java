package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        IntArrayList intArrayList = new IntArrayList(new int[0], 0);
        EMPTY_LIST = intArrayList;
        intArrayList.makeImmutable();
    }

    public IntArrayList() {
        this(new int[10], 0);
    }

    public static IntArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i12 = intArrayList.size;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.size;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        int[] iArr = this.array;
        if (i14 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i14);
        }
        System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
        this.size = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public void addInt(int i12) {
        ensureIsMutable();
        int i13 = this.size;
        int[] iArr = this.array;
        if (i13 == iArr.length) {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i14 = this.size;
        this.size = i14 + 1;
        iArr3[i14] = i12;
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
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i12 = 0; i12 < this.size; i12++) {
            if (this.array[i12] != iArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public int getInt(int i12) {
        ensureIndexInRange(i12);
        return this.array[i12];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.size; i13++) {
            i12 = (i12 * 31) + this.array[i13];
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.array[i12] == iIntValue) {
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
        int[] iArr = this.array;
        System.arraycopy(iArr, i13, iArr, i12, this.size - i13);
        this.size -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public int setInt(int i12, int i13) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        int[] iArr = this.array;
        int i14 = iArr[i12];
        iArr[i12] = i13;
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] iArr, int i12) {
        this.array = iArr;
        this.size = i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i12) {
        return Integer.valueOf(getInt(i12));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.array, i12), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        int[] iArr = this.array;
        int i13 = iArr[i12];
        if (i12 < this.size - 1) {
            System.arraycopy(iArr, i12 + 1, iArr, i12, (r2 - i12) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i12, Integer num) {
        return Integer.valueOf(setInt(i12, num.intValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i12, Integer num) {
        addInt(i12, num.intValue());
    }

    private void addInt(int i12, int i13) {
        int i14;
        ensureIsMutable();
        if (i12 >= 0 && i12 <= (i14 = this.size)) {
            int[] iArr = this.array;
            if (i14 < iArr.length) {
                System.arraycopy(iArr, i12, iArr, i12 + 1, i14 - i12);
            } else {
                int[] iArr2 = new int[e.e(i14, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i12);
                System.arraycopy(this.array, i12, iArr2, i12 + 1, this.size - i12);
                this.array = iArr2;
            }
            this.array[i12] = i13;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i12));
    }
}
