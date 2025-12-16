package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        FloatArrayList floatArrayList = new FloatArrayList(new float[0], 0);
        EMPTY_LIST = floatArrayList;
        floatArrayList.makeImmutable();
    }

    public FloatArrayList() {
        this(new float[10], 0);
    }

    public static FloatArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i12 = floatArrayList.size;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.size;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        float[] fArr = this.array;
        if (i14 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i14);
        }
        System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public void addFloat(float f12) {
        ensureIsMutable();
        int i12 = this.size;
        float[] fArr = this.array;
        if (i12 == fArr.length) {
            float[] fArr2 = new float[e.e(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i13 = this.size;
        this.size = i13 + 1;
        fArr3[i13] = f12;
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
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i12 = 0; i12 < this.size; i12++) {
            if (Float.floatToIntBits(this.array[i12]) != Float.floatToIntBits(fArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public float getFloat(int i12) {
        ensureIndexInRange(i12);
        return this.array[i12];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.array[i12]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.array[i12] == fFloatValue) {
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
        float[] fArr = this.array;
        System.arraycopy(fArr, i13, fArr, i12, this.size - i13);
        this.size -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public float setFloat(int i12, float f12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        float[] fArr = this.array;
        float f13 = fArr[i12];
        fArr[i12] = f12;
        return f13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private FloatArrayList(float[] fArr, int i12) {
        this.array = fArr;
        this.size = i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i12) {
        return Float.valueOf(getFloat(i12));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, i12), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int i12) {
        ensureIsMutable();
        ensureIndexInRange(i12);
        float[] fArr = this.array;
        float f12 = fArr[i12];
        if (i12 < this.size - 1) {
            System.arraycopy(fArr, i12 + 1, fArr, i12, (r2 - i12) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float set(int i12, Float f12) {
        return Float.valueOf(setFloat(i12, f12.floatValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f12) {
        addFloat(f12.floatValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i12, Float f12) {
        addFloat(i12, f12.floatValue());
    }

    private void addFloat(int i12, float f12) {
        int i13;
        ensureIsMutable();
        if (i12 >= 0 && i12 <= (i13 = this.size)) {
            float[] fArr = this.array;
            if (i13 < fArr.length) {
                System.arraycopy(fArr, i12, fArr, i12 + 1, i13 - i12);
            } else {
                float[] fArr2 = new float[e.e(i13, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i12);
                System.arraycopy(this.array, i12, fArr2, i12 + 1, this.size - i12);
                this.array = fArr2;
            }
            this.array[i12] = f12;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i12));
    }
}
