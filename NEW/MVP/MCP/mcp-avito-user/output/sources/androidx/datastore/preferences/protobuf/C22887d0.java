package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22887d0 extends AbstractC22883c<Float> implements C22914m0.f, RandomAccess, Y0 {

    /* renamed from: c, reason: collision with root package name */
    public float[] f45812c;

    /* renamed from: d, reason: collision with root package name */
    public int f45813d;

    static {
        new C22887d0(new float[0], 0).f45804b = false;
    }

    public C22887d0() {
        this(new float[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f45813d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45813d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        float[] fArr = this.f45812c;
        if (i13 < fArr.length) {
            System.arraycopy(fArr, i12, fArr, i12 + 1, i13 - i12);
        } else {
            float[] fArr2 = new float[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            System.arraycopy(this.f45812c, i12, fArr2, i12 + 1, this.f45813d - i12);
            this.f45812c = fArr2;
        }
        this.f45812c[i12] = fFloatValue;
        this.f45813d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        Charset charset = C22914m0.f45874a;
        collection.getClass();
        if (!(collection instanceof C22887d0)) {
            return super.addAll(collection);
        }
        C22887d0 c22887d0 = (C22887d0) collection;
        int i12 = c22887d0.f45813d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f45813d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        float[] fArr = this.f45812c;
        if (i14 > fArr.length) {
            this.f45812c = Arrays.copyOf(fArr, i14);
        }
        System.arraycopy(c22887d0.f45812c, 0, this.f45812c, this.f45813d, c22887d0.f45813d);
        this.f45813d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f12) {
        b();
        int i12 = this.f45813d;
        float[] fArr = this.f45812c;
        if (i12 == fArr.length) {
            float[] fArr2 = new float[androidx.compose.ui.graphics.colorspace.e.e(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            this.f45812c = fArr2;
        }
        float[] fArr3 = this.f45812c;
        int i13 = this.f45813d;
        this.f45813d = i13 + 1;
        fArr3[i13] = f12;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f45813d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45813d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22887d0)) {
            return super.equals(obj);
        }
        C22887d0 c22887d0 = (C22887d0) obj;
        if (this.f45813d != c22887d0.f45813d) {
            return false;
        }
        float[] fArr = c22887d0.f45812c;
        for (int i12 = 0; i12 < this.f45813d; i12++) {
            if (Float.floatToIntBits(this.f45812c[i12]) != Float.floatToIntBits(fArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        d(i12);
        return Float.valueOf(this.f45812c[i12]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i12 = 0; i12 < this.f45813d; i12++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f45812c[i12]);
        }
        return iFloatToIntBits;
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.k
    public final C22914m0.k<Float> mutableCopyWithCapacity(int i12) {
        if (i12 >= this.f45813d) {
            return new C22887d0(Arrays.copyOf(this.f45812c, i12), this.f45813d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i12 = 0; i12 < this.f45813d; i12++) {
            if (obj.equals(Float.valueOf(this.f45812c[i12]))) {
                float[] fArr = this.f45812c;
                System.arraycopy(fArr, i12 + 1, fArr, i12, (this.f45813d - i12) - 1);
                this.f45813d--;
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
        float[] fArr = this.f45812c;
        System.arraycopy(fArr, i13, fArr, i12, this.f45813d - i13);
        this.f45813d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        d(i12);
        float[] fArr = this.f45812c;
        float f12 = fArr[i12];
        fArr[i12] = fFloatValue;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45813d;
    }

    public C22887d0(float[] fArr, int i12) {
        this.f45812c = fArr;
        this.f45813d = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        float[] fArr = this.f45812c;
        float f12 = fArr[i12];
        if (i12 < this.f45813d - 1) {
            System.arraycopy(fArr, i12 + 1, fArr, i12, (r2 - i12) - 1);
        }
        this.f45813d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f12);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
