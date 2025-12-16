package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdk extends zzcm implements RandomAccess, zzek, zzft {

    /* renamed from: c, reason: collision with root package name */
    public double[] f352415c;

    /* renamed from: d, reason: collision with root package name */
    public int f352416d;

    static {
        new zzdk(new double[0], 0).zzb();
    }

    public zzdk() {
        this(new double[10], 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i12, Object obj) {
        int i13;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f352416d)) {
            throw new IndexOutOfBoundsException(d(i12));
        }
        double[] dArr = this.f352415c;
        if (i13 < dArr.length) {
            System.arraycopy(dArr, i12, dArr, i12 + 1, i13 - i12);
        } else {
            double[] dArr2 = new double[e.e(i13, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            System.arraycopy(this.f352415c, i12, dArr2, i12 + 1, this.f352416d - i12);
            this.f352415c = dArr2;
        }
        this.f352415c[i12] = dDoubleValue;
        this.f352416d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzel.f352447a;
        collection.getClass();
        if (!(collection instanceof zzdk)) {
            return super.addAll(collection);
        }
        zzdk zzdkVar = (zzdk) collection;
        int i12 = zzdkVar.f352416d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f352416d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        double[] dArr = this.f352415c;
        if (i14 > dArr.length) {
            this.f352415c = Arrays.copyOf(dArr, i14);
        }
        System.arraycopy(zzdkVar.f352415c, 0, this.f352415c, this.f352416d, zzdkVar.f352416d);
        this.f352416d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i12) {
        int i13 = this.f352416d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i12);
        sb2.append(", Size:");
        sb2.append(i13);
        return sb2.toString();
    }

    public final void e(int i12) {
        if (i12 < 0 || i12 >= this.f352416d) {
            throw new IndexOutOfBoundsException(d(i12));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdk)) {
            return super.equals(obj);
        }
        zzdk zzdkVar = (zzdk) obj;
        if (this.f352416d != zzdkVar.f352416d) {
            return false;
        }
        double[] dArr = zzdkVar.f352415c;
        for (int i12 = 0; i12 < this.f352416d; i12++) {
            if (Double.doubleToLongBits(this.f352415c[i12]) != Double.doubleToLongBits(dArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        e(i12);
        return Double.valueOf(this.f352415c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i12 = 0; i12 < this.f352416d; i12++) {
            iZzc = (iZzc * 31) + zzel.zzc(Double.doubleToLongBits(this.f352415c[i12]));
        }
        return iZzc;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i12 = this.f352416d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f352415c[i13] == dDoubleValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        e(i12);
        double[] dArr = this.f352415c;
        double d12 = dArr[i12];
        if (i12 < this.f352416d - 1) {
            System.arraycopy(dArr, i12 + 1, dArr, i12, (r3 - i12) - 1);
        }
        this.f352416d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f352415c;
        System.arraycopy(dArr, i13, dArr, i12, this.f352416d - i13);
        this.f352416d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        e(i12);
        double[] dArr = this.f352415c;
        double d12 = dArr[i12];
        dArr[i12] = dDoubleValue;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352416d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek
    public final /* bridge */ /* synthetic */ zzek zzd(int i12) {
        if (i12 >= this.f352416d) {
            return new zzdk(Arrays.copyOf(this.f352415c, i12), this.f352416d);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d12) {
        b();
        int i12 = this.f352416d;
        double[] dArr = this.f352415c;
        if (i12 == dArr.length) {
            double[] dArr2 = new double[e.e(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            this.f352415c = dArr2;
        }
        double[] dArr3 = this.f352415c;
        int i13 = this.f352416d;
        this.f352416d = i13 + 1;
        dArr3[i13] = d12;
    }

    public zzdk(double[] dArr, int i12) {
        this.f352415c = dArr;
        this.f352416d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
