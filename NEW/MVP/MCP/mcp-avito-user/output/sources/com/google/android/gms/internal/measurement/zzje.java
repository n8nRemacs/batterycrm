package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzje extends zzho<Float> implements zzjn<Float>, zzld, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public float[] f350890c;

    /* renamed from: d, reason: collision with root package name */
    public int f350891d;

    static {
        new zzje(new float[0], 0, false);
    }

    public zzje() {
        this(new float[10], 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350891d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350891d, "Index:", ", Size:"));
        }
        float[] fArr = this.f350890c;
        if (i13 < fArr.length) {
            System.arraycopy(fArr, i12, fArr, i12 + 1, i13 - i12);
        } else {
            float[] fArr2 = new float[e.e(i13, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            System.arraycopy(this.f350890c, i12, fArr2, i12 + 1, this.f350891d - i12);
            this.f350890c = fArr2;
        }
        this.f350890c[i12] = fFloatValue;
        this.f350891d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        Charset charset = zzjh.f350896a;
        collection.getClass();
        if (!(collection instanceof zzje)) {
            return super.addAll(collection);
        }
        zzje zzjeVar = (zzje) collection;
        int i12 = zzjeVar.f350891d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350891d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        float[] fArr = this.f350890c;
        if (i14 > fArr.length) {
            this.f350890c = Arrays.copyOf(fArr, i14);
        }
        System.arraycopy(zzjeVar.f350890c, 0, this.f350890c, this.f350891d, zzjeVar.f350891d);
        this.f350891d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350891d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350891d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzje)) {
            return super.equals(obj);
        }
        zzje zzjeVar = (zzje) obj;
        if (this.f350891d != zzjeVar.f350891d) {
            return false;
        }
        float[] fArr = zzjeVar.f350890c;
        for (int i12 = 0; i12 < this.f350891d; i12++) {
            if (Float.floatToIntBits(this.f350890c[i12]) != Float.floatToIntBits(fArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Float.valueOf(this.f350890c[i12]);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i12 = 0; i12 < this.f350891d; i12++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f350890c[i12]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f350890c[i12] == fFloatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        float[] fArr = this.f350890c;
        float f12 = fArr[i12];
        if (i12 < this.f350891d - 1) {
            System.arraycopy(fArr, i12 + 1, fArr, i12, (r2 - i12) - 1);
        }
        this.f350891d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f350890c;
        System.arraycopy(fArr, i13, fArr, i12, this.f350891d - i13);
        this.f350891d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i12, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        d(i12);
        float[] fArr = this.f350890c;
        float f12 = fArr[i12];
        fArr[i12] = fFloatValue;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350891d;
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final /* synthetic */ zzjn<Float> zza(int i12) {
        if (i12 >= this.f350891d) {
            return new zzje(Arrays.copyOf(this.f350890c, i12), this.f350891d, true);
        }
        throw new IllegalArgumentException();
    }

    public zzje(float[] fArr, int i12, boolean z12) {
        super(z12);
        this.f350890c = fArr;
        this.f350891d = i12;
    }

    public final void zza(float f12) {
        b();
        int i12 = this.f350891d;
        float[] fArr = this.f350890c;
        if (i12 == fArr.length) {
            float[] fArr2 = new float[e.e(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            this.f350890c = fArr2;
        }
        float[] fArr3 = this.f350890c;
        int i13 = this.f350891d;
        this.f350891d = i13 + 1;
        fArr3[i13] = f12;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }
}
