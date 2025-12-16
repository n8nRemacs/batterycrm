package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdu extends zzcm implements RandomAccess, zzeh, zzft {

    /* renamed from: e, reason: collision with root package name */
    public static final zzdu f352431e;

    /* renamed from: c, reason: collision with root package name */
    public float[] f352432c;

    /* renamed from: d, reason: collision with root package name */
    public int f352433d;

    static {
        zzdu zzduVar = new zzdu(new float[0], 0);
        f352431e = zzduVar;
        zzduVar.zzb();
    }

    public zzdu() {
        this(new float[10], 0);
    }

    public static zzdu zze() {
        return f352431e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i12, Object obj) {
        int i13;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f352433d)) {
            throw new IndexOutOfBoundsException(d(i12));
        }
        float[] fArr = this.f352432c;
        if (i13 < fArr.length) {
            System.arraycopy(fArr, i12, fArr, i12 + 1, i13 - i12);
        } else {
            float[] fArr2 = new float[e.e(i13, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            System.arraycopy(this.f352432c, i12, fArr2, i12 + 1, this.f352433d - i12);
            this.f352432c = fArr2;
        }
        this.f352432c[i12] = fFloatValue;
        this.f352433d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzel.f352447a;
        collection.getClass();
        if (!(collection instanceof zzdu)) {
            return super.addAll(collection);
        }
        zzdu zzduVar = (zzdu) collection;
        int i12 = zzduVar.f352433d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f352433d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        float[] fArr = this.f352432c;
        if (i14 > fArr.length) {
            this.f352432c = Arrays.copyOf(fArr, i14);
        }
        System.arraycopy(zzduVar.f352432c, 0, this.f352432c, this.f352433d, zzduVar.f352433d);
        this.f352433d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i12) {
        int i13 = this.f352433d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i12);
        sb2.append(", Size:");
        sb2.append(i13);
        return sb2.toString();
    }

    public final void e(int i12) {
        if (i12 < 0 || i12 >= this.f352433d) {
            throw new IndexOutOfBoundsException(d(i12));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdu)) {
            return super.equals(obj);
        }
        zzdu zzduVar = (zzdu) obj;
        if (this.f352433d != zzduVar.f352433d) {
            return false;
        }
        float[] fArr = zzduVar.f352432c;
        for (int i12 = 0; i12 < this.f352433d; i12++) {
            if (Float.floatToIntBits(this.f352432c[i12]) != Float.floatToIntBits(fArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        e(i12);
        return Float.valueOf(this.f352432c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i12 = 0; i12 < this.f352433d; i12++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f352432c[i12]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i12 = this.f352433d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f352432c[i13] == fFloatValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        e(i12);
        float[] fArr = this.f352432c;
        float f12 = fArr[i12];
        if (i12 < this.f352433d - 1) {
            System.arraycopy(fArr, i12 + 1, fArr, i12, (r2 - i12) - 1);
        }
        this.f352433d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f352432c;
        System.arraycopy(fArr, i13, fArr, i12, this.f352433d - i13);
        this.f352433d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        e(i12);
        float[] fArr = this.f352432c;
        float f12 = fArr[i12];
        fArr[i12] = fFloatValue;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352433d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzeh zzd(int i12) {
        if (i12 >= this.f352433d) {
            return new zzdu(Arrays.copyOf(this.f352432c, i12), this.f352433d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final void zzg(float f12) {
        b();
        int i12 = this.f352433d;
        float[] fArr = this.f352432c;
        if (i12 == fArr.length) {
            float[] fArr2 = new float[e.e(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            this.f352432c = fArr2;
        }
        float[] fArr3 = this.f352432c;
        int i13 = this.f352433d;
        this.f352433d = i13 + 1;
        fArr3[i13] = f12;
    }

    public zzdu(float[] fArr, int i12) {
        this.f352432c = fArr;
        this.f352433d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Float) obj).floatValue());
        return true;
    }
}
