package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final BooleanArrayList EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        BooleanArrayList booleanArrayList = new BooleanArrayList(new boolean[0], 0);
        EMPTY_LIST = booleanArrayList;
        booleanArrayList.makeImmutable();
    }

    public BooleanArrayList() {
        this(new boolean[10], 0);
    }

    public static BooleanArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i12 = booleanArrayList.size;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.size;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        boolean[] zArr = this.array;
        if (i14 > zArr.length) {
            this.array = Arrays.copyOf(zArr, i14);
        }
        System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
        this.size = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public void addBoolean(boolean z12) {
        ensureIsMutable();
        int i12 = this.size;
        boolean[] zArr = this.array;
        if (i12 == zArr.length) {
            boolean[] zArr2 = new boolean[e.e(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i13 = this.size;
        this.size = i13 + 1;
        zArr3[i13] = z12;
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
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i12 = 0; i12 < this.size; i12++) {
            if (this.array[i12] != zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public boolean getBoolean(int i12) {
        ensureIndexInRange(i12);
        return this.array[i12];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.array[i12]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.array[i12] == zBooleanValue) {
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
        boolean[] zArr = this.array;
        System.arraycopy(zArr, i13, zArr, i12, this.size - i13);
        this.size -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public boolean setBoolean(int i12, boolean z12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        boolean[] zArr = this.array;
        boolean z13 = zArr[i12];
        zArr[i12] = z12;
        return z13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private BooleanArrayList(boolean[] zArr, int i12) {
        this.array = zArr;
        this.size = i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i12) {
        return Boolean.valueOf(getBoolean(i12));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.size) {
            return new BooleanArrayList(Arrays.copyOf(this.array, i12), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean remove(int i12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        boolean[] zArr = this.array;
        boolean z12 = zArr[i12];
        if (i12 < this.size - 1) {
            System.arraycopy(zArr, i12 + 1, zArr, i12, (r2 - i12) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean set(int i12, Boolean bool) {
        return Boolean.valueOf(setBoolean(i12, bool.booleanValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i12, Boolean bool) {
        addBoolean(i12, bool.booleanValue());
    }

    private void addBoolean(int i12, boolean z12) {
        int i13;
        ensureIsMutable();
        if (i12 >= 0 && i12 <= (i13 = this.size)) {
            boolean[] zArr = this.array;
            if (i13 < zArr.length) {
                System.arraycopy(zArr, i12, zArr, i12 + 1, i13 - i12);
            } else {
                boolean[] zArr2 = new boolean[e.e(i13, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i12);
                System.arraycopy(this.array, i12, zArr2, i12 + 1, this.size - i12);
                this.array = zArr2;
            }
            this.array[i12] = z12;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i12));
    }
}
