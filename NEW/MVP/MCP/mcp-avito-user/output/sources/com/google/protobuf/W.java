package com.google.protobuf;

import com.google.protobuf.C37670d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* loaded from: classes7.dex */
final class W extends AbstractC37667c<Float> implements C37670d0.f, RandomAccess, M0 {

    /* renamed from: e, reason: collision with root package name */
    public static final W f362786e = new W(new float[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public float[] f362787c;

    /* renamed from: d, reason: collision with root package name */
    public int f362788d;

    public W() {
        this(new float[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f362788d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362788d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        float[] fArr = this.f362787c;
        if (i13 < fArr.length) {
            System.arraycopy(fArr, i12, fArr, i12 + 1, i13 - i12);
        } else {
            float[] fArr2 = new float[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            System.arraycopy(this.f362787c, i12, fArr2, i12 + 1, this.f362788d - i12);
            this.f362787c = fArr2;
        }
        this.f362787c[i12] = fFloatValue;
        this.f362788d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        Charset charset = C37670d0.f362857a;
        collection.getClass();
        if (!(collection instanceof W)) {
            return super.addAll(collection);
        }
        W w12 = (W) collection;
        int i12 = w12.f362788d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f362788d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        float[] fArr = this.f362787c;
        if (i14 > fArr.length) {
            this.f362787c = Arrays.copyOf(fArr, i14);
        }
        System.arraycopy(w12.f362787c, 0, this.f362787c, this.f362788d, w12.f362788d);
        this.f362788d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f12) {
        b();
        int i12 = this.f362788d;
        float[] fArr = this.f362787c;
        if (i12 == fArr.length) {
            float[] fArr2 = new float[androidx.compose.ui.graphics.colorspace.e.e(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            this.f362787c = fArr2;
        }
        float[] fArr3 = this.f362787c;
        int i13 = this.f362788d;
        this.f362788d = i13 + 1;
        fArr3[i13] = f12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f362788d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362788d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return super.equals(obj);
        }
        W w12 = (W) obj;
        if (this.f362788d != w12.f362788d) {
            return false;
        }
        float[] fArr = w12.f362787c;
        for (int i12 = 0; i12 < this.f362788d; i12++) {
            if (Float.floatToIntBits(this.f362787c[i12]) != Float.floatToIntBits(fArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        d(i12);
        return Float.valueOf(this.f362787c[i12]);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i12 = 0; i12 < this.f362788d; i12++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f362787c[i12]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i12 = this.f362788d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f362787c[i13] == fFloatValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        float[] fArr = this.f362787c;
        float f12 = fArr[i12];
        if (i12 < this.f362788d - 1) {
            System.arraycopy(fArr, i12 + 1, fArr, i12, (r2 - i12) - 1);
        }
        this.f362788d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f362787c;
        System.arraycopy(fArr, i13, fArr, i12, this.f362788d - i13);
        this.f362788d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        d(i12);
        float[] fArr = this.f362787c;
        float f12 = fArr[i12];
        fArr[i12] = fFloatValue;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f362788d;
    }

    public W(float[] fArr, int i12, boolean z12) {
        super(z12);
        this.f362787c = fArr;
        this.f362788d = i12;
    }

    @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
    /* renamed from: mutableCopyWithCapacity */
    public final C37670d0.k<Float> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.f362788d) {
            return new W(Arrays.copyOf(this.f362787c, i12), this.f362788d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
