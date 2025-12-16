package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzcq extends zzcm implements RandomAccess, zzek, zzft {

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f352395c;

    /* renamed from: d, reason: collision with root package name */
    public int f352396d;

    static {
        new zzcq(new boolean[0], 0).zzb();
    }

    public zzcq() {
        this(new boolean[10], 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i12, Object obj) {
        int i13;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f352396d)) {
            throw new IndexOutOfBoundsException(d(i12));
        }
        boolean[] zArr = this.f352395c;
        if (i13 < zArr.length) {
            System.arraycopy(zArr, i12, zArr, i12 + 1, i13 - i12);
        } else {
            boolean[] zArr2 = new boolean[e.e(i13, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            System.arraycopy(this.f352395c, i12, zArr2, i12 + 1, this.f352396d - i12);
            this.f352395c = zArr2;
        }
        this.f352395c[i12] = zBooleanValue;
        this.f352396d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzel.f352447a;
        collection.getClass();
        if (!(collection instanceof zzcq)) {
            return super.addAll(collection);
        }
        zzcq zzcqVar = (zzcq) collection;
        int i12 = zzcqVar.f352396d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f352396d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        boolean[] zArr = this.f352395c;
        if (i14 > zArr.length) {
            this.f352395c = Arrays.copyOf(zArr, i14);
        }
        System.arraycopy(zzcqVar.f352395c, 0, this.f352395c, this.f352396d, zzcqVar.f352396d);
        this.f352396d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i12) {
        int i13 = this.f352396d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i12);
        sb2.append(", Size:");
        sb2.append(i13);
        return sb2.toString();
    }

    public final void e(int i12) {
        if (i12 < 0 || i12 >= this.f352396d) {
            throw new IndexOutOfBoundsException(d(i12));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcq)) {
            return super.equals(obj);
        }
        zzcq zzcqVar = (zzcq) obj;
        if (this.f352396d != zzcqVar.f352396d) {
            return false;
        }
        boolean[] zArr = zzcqVar.f352395c;
        for (int i12 = 0; i12 < this.f352396d; i12++) {
            if (this.f352395c[i12] != zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        e(i12);
        return Boolean.valueOf(this.f352395c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i12 = 0; i12 < this.f352396d; i12++) {
            iZza = (iZza * 31) + zzel.zza(this.f352395c[i12]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i12 = this.f352396d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f352395c[i13] == zBooleanValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        e(i12);
        boolean[] zArr = this.f352395c;
        boolean z12 = zArr[i12];
        if (i12 < this.f352396d - 1) {
            System.arraycopy(zArr, i12 + 1, zArr, i12, (r2 - i12) - 1);
        }
        this.f352396d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f352395c;
        System.arraycopy(zArr, i13, zArr, i12, this.f352396d - i13);
        this.f352396d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        e(i12);
        boolean[] zArr = this.f352395c;
        boolean z12 = zArr[i12];
        zArr[i12] = zBooleanValue;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352396d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek
    public final /* bridge */ /* synthetic */ zzek zzd(int i12) {
        if (i12 >= this.f352396d) {
            return new zzcq(Arrays.copyOf(this.f352395c, i12), this.f352396d);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z12) {
        b();
        int i12 = this.f352396d;
        boolean[] zArr = this.f352395c;
        if (i12 == zArr.length) {
            boolean[] zArr2 = new boolean[e.e(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            this.f352395c = zArr2;
        }
        boolean[] zArr3 = this.f352395c;
        int i13 = this.f352396d;
        this.f352396d = i13 + 1;
        zArr3[i13] = z12;
    }

    public zzcq(boolean[] zArr, int i12) {
        this.f352395c = zArr;
        this.f352396d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
