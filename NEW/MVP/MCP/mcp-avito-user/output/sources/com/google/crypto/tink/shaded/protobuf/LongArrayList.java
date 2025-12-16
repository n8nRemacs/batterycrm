package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        LongArrayList longArrayList = new LongArrayList(new long[0], 0);
        EMPTY_LIST = longArrayList;
        longArrayList.makeImmutable();
    }

    public LongArrayList() {
        this(new long[10], 0);
    }

    public static LongArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i12 = longArrayList.size;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.size;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        long[] jArr = this.array;
        if (i14 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i14);
        }
        System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public void addLong(long j12) {
        ensureIsMutable();
        int i12 = this.size;
        long[] jArr = this.array;
        if (i12 == jArr.length) {
            long[] jArr2 = new long[e.e(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i13 = this.size;
        this.size = i13 + 1;
        jArr3[i13] = j12;
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
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i12 = 0; i12 < this.size; i12++) {
            if (this.array[i12] != jArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public long getLong(int i12) {
        ensureIndexInRange(i12);
        return this.array[i12];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.array[i12]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.array[i12] == jLongValue) {
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
        long[] jArr = this.array;
        System.arraycopy(jArr, i13, jArr, i12, this.size - i13);
        this.size -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public long setLong(int i12, long j12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        long[] jArr = this.array;
        long j13 = jArr[i12];
        jArr[i12] = j12;
        return j13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] jArr, int i12) {
        this.array = jArr;
        this.size = i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i12) {
        return Long.valueOf(getLong(i12));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, i12), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        long[] jArr = this.array;
        long j12 = jArr[i12];
        if (i12 < this.size - 1) {
            System.arraycopy(jArr, i12 + 1, jArr, i12, (r3 - i12) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i12, Long l12) {
        return Long.valueOf(setLong(i12, l12.longValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l12) {
        addLong(l12.longValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i12, Long l12) {
        addLong(i12, l12.longValue());
    }

    private void addLong(int i12, long j12) {
        int i13;
        ensureIsMutable();
        if (i12 >= 0 && i12 <= (i13 = this.size)) {
            long[] jArr = this.array;
            if (i13 < jArr.length) {
                System.arraycopy(jArr, i12, jArr, i12 + 1, i13 - i12);
            } else {
                long[] jArr2 = new long[e.e(i13, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i12);
                System.arraycopy(this.array, i12, jArr2, i12 + 1, this.size - i12);
                this.array = jArr2;
            }
            this.array[i12] = j12;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i12));
    }
}
