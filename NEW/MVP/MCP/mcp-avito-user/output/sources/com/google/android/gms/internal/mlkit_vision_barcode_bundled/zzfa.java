package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfa extends zzcm implements RandomAccess, zzek, zzft {

    /* renamed from: c, reason: collision with root package name */
    public long[] f352461c;

    /* renamed from: d, reason: collision with root package name */
    public int f352462d;

    static {
        new zzfa(new long[0], 0).zzb();
    }

    public zzfa() {
        this(new long[10], 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i12, Object obj) {
        int i13;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f352462d)) {
            throw new IndexOutOfBoundsException(d(i12));
        }
        long[] jArr = this.f352461c;
        if (i13 < jArr.length) {
            System.arraycopy(jArr, i12, jArr, i12 + 1, i13 - i12);
        } else {
            long[] jArr2 = new long[e.e(i13, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            System.arraycopy(this.f352461c, i12, jArr2, i12 + 1, this.f352462d - i12);
            this.f352461c = jArr2;
        }
        this.f352461c[i12] = jLongValue;
        this.f352462d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzel.f352447a;
        collection.getClass();
        if (!(collection instanceof zzfa)) {
            return super.addAll(collection);
        }
        zzfa zzfaVar = (zzfa) collection;
        int i12 = zzfaVar.f352462d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f352462d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        long[] jArr = this.f352461c;
        if (i14 > jArr.length) {
            this.f352461c = Arrays.copyOf(jArr, i14);
        }
        System.arraycopy(zzfaVar.f352461c, 0, this.f352461c, this.f352462d, zzfaVar.f352462d);
        this.f352462d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i12) {
        int i13 = this.f352462d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i12);
        sb2.append(", Size:");
        sb2.append(i13);
        return sb2.toString();
    }

    public final void e(int i12) {
        if (i12 < 0 || i12 >= this.f352462d) {
            throw new IndexOutOfBoundsException(d(i12));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfa)) {
            return super.equals(obj);
        }
        zzfa zzfaVar = (zzfa) obj;
        if (this.f352462d != zzfaVar.f352462d) {
            return false;
        }
        long[] jArr = zzfaVar.f352461c;
        for (int i12 = 0; i12 < this.f352462d; i12++) {
            if (this.f352461c[i12] != jArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        e(i12);
        return Long.valueOf(this.f352461c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i12 = 0; i12 < this.f352462d; i12++) {
            iZzc = (iZzc * 31) + zzel.zzc(this.f352461c[i12]);
        }
        return iZzc;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i12 = this.f352462d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f352461c[i13] == jLongValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        e(i12);
        long[] jArr = this.f352461c;
        long j12 = jArr[i12];
        if (i12 < this.f352462d - 1) {
            System.arraycopy(jArr, i12 + 1, jArr, i12, (r3 - i12) - 1);
        }
        this.f352462d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f352461c;
        System.arraycopy(jArr, i13, jArr, i12, this.f352462d - i13);
        this.f352462d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        e(i12);
        long[] jArr = this.f352461c;
        long j12 = jArr[i12];
        jArr[i12] = jLongValue;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352462d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek
    public final /* bridge */ /* synthetic */ zzek zzd(int i12) {
        if (i12 >= this.f352462d) {
            return new zzfa(Arrays.copyOf(this.f352461c, i12), this.f352462d);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i12) {
        e(i12);
        return this.f352461c[i12];
    }

    public final void zzf(long j12) {
        b();
        int i12 = this.f352462d;
        long[] jArr = this.f352461c;
        if (i12 == jArr.length) {
            long[] jArr2 = new long[e.e(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            this.f352461c = jArr2;
        }
        long[] jArr3 = this.f352461c;
        int i13 = this.f352462d;
        this.f352462d = i13 + 1;
        jArr3[i13] = j12;
    }

    public zzfa(long[] jArr, int i12) {
        this.f352461c = jArr;
        this.f352462d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
