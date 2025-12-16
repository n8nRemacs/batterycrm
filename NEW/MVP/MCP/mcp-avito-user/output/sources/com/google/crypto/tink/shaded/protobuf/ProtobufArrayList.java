package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private E[] array;
    private int size;

    static {
        ProtobufArrayList<Object> protobufArrayList = new ProtobufArrayList<>(new Object[0], 0);
        EMPTY_LIST = protobufArrayList;
        protobufArrayList.makeImmutable();
    }

    public ProtobufArrayList() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i12) {
        return (E[]) new Object[i12];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e12) {
        ensureIsMutable();
        int i12 = this.size;
        E[] eArr = this.array;
        if (i12 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i12 * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i13 = this.size;
        this.size = i13 + 1;
        eArr2[i13] = e12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i12) {
        ensureIndexInRange(i12);
        return this.array[i12];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        E[] eArr = this.array;
        E e12 = eArr[i12];
        if (i12 < this.size - 1) {
            System.arraycopy(eArr, i12 + 1, eArr, i12, (r2 - i12) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i12, E e12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        E[] eArr = this.array;
        E e13 = eArr[i12];
        eArr[i12] = e12;
        ((AbstractList) this).modCount++;
        return e13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] eArr, int i12) {
        this.array = eArr;
        this.size = i12;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public ProtobufArrayList<E> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.array, i12), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i12, E e12) {
        int i13;
        ensureIsMutable();
        if (i12 >= 0 && i12 <= (i13 = this.size)) {
            E[] eArr = this.array;
            if (i13 < eArr.length) {
                System.arraycopy(eArr, i12, eArr, i12 + 1, i13 - i12);
            } else {
                E[] eArr2 = (E[]) createArray(e.e(i13, 3, 2, 1));
                System.arraycopy(this.array, 0, eArr2, 0, i12);
                System.arraycopy(this.array, i12, eArr2, i12 + 1, this.size - i12);
                this.array = eArr2;
            }
            this.array[i12] = e12;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i12));
    }
}
