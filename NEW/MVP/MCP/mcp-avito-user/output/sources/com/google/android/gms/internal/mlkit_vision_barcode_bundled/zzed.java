package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzed extends zzcm implements RandomAccess, zzei, zzft {

    /* renamed from: e, reason: collision with root package name */
    public static final zzed f352444e;

    /* renamed from: c, reason: collision with root package name */
    public int[] f352445c;

    /* renamed from: d, reason: collision with root package name */
    public int f352446d;

    static {
        zzed zzedVar = new zzed(new int[0], 0);
        f352444e = zzedVar;
        zzedVar.zzb();
    }

    public zzed() {
        this(new int[10], 0);
    }

    public static zzed zzf() {
        return f352444e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i12, Object obj) {
        int i13;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f352446d)) {
            throw new IndexOutOfBoundsException(d(i12));
        }
        int[] iArr = this.f352445c;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i12, iArr, i12 + 1, i13 - i12);
        } else {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            System.arraycopy(this.f352445c, i12, iArr2, i12 + 1, this.f352446d - i12);
            this.f352445c = iArr2;
        }
        this.f352445c[i12] = iIntValue;
        this.f352446d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzel.f352447a;
        collection.getClass();
        if (!(collection instanceof zzed)) {
            return super.addAll(collection);
        }
        zzed zzedVar = (zzed) collection;
        int i12 = zzedVar.f352446d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f352446d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        int[] iArr = this.f352445c;
        if (i14 > iArr.length) {
            this.f352445c = Arrays.copyOf(iArr, i14);
        }
        System.arraycopy(zzedVar.f352445c, 0, this.f352445c, this.f352446d, zzedVar.f352446d);
        this.f352446d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i12) {
        int i13 = this.f352446d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i12);
        sb2.append(", Size:");
        sb2.append(i13);
        return sb2.toString();
    }

    public final void e(int i12) {
        if (i12 < 0 || i12 >= this.f352446d) {
            throw new IndexOutOfBoundsException(d(i12));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzed)) {
            return super.equals(obj);
        }
        zzed zzedVar = (zzed) obj;
        if (this.f352446d != zzedVar.f352446d) {
            return false;
        }
        int[] iArr = zzedVar.f352445c;
        for (int i12 = 0; i12 < this.f352446d; i12++) {
            if (this.f352445c[i12] != iArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        e(i12);
        return Integer.valueOf(this.f352445c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f352446d; i13++) {
            i12 = (i12 * 31) + this.f352445c[i13];
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i12 = this.f352446d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f352445c[i13] == iIntValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        e(i12);
        int[] iArr = this.f352445c;
        int i13 = iArr[i12];
        if (i12 < this.f352446d - 1) {
            System.arraycopy(iArr, i12 + 1, iArr, i12, (r2 - i12) - 1);
        }
        this.f352446d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f352445c;
        System.arraycopy(iArr, i13, iArr, i12, this.f352446d - i13);
        this.f352446d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        e(i12);
        int[] iArr = this.f352445c;
        int i13 = iArr[i12];
        iArr[i12] = iIntValue;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352446d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek
    public final /* bridge */ /* synthetic */ zzek zzd(int i12) {
        if (i12 >= this.f352446d) {
            return new zzed(Arrays.copyOf(this.f352445c, i12), this.f352446d);
        }
        throw new IllegalArgumentException();
    }

    public final int zze(int i12) {
        e(i12);
        return this.f352445c[i12];
    }

    public final void zzg(int i12) {
        b();
        int i13 = this.f352446d;
        int[] iArr = this.f352445c;
        if (i13 == iArr.length) {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.f352445c = iArr2;
        }
        int[] iArr3 = this.f352445c;
        int i14 = this.f352446d;
        this.f352446d = i14 + 1;
        iArr3[i14] = i12;
    }

    public zzed(int[] iArr, int i12) {
        this.f352445c = iArr;
        this.f352446d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Integer) obj).intValue());
        return true;
    }
}
