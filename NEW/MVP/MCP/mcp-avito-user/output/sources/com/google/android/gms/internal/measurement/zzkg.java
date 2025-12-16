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
final class zzkg extends zzho<Long> implements zzjo, zzld, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final zzkg f350914e = new zzkg(new long[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public long[] f350915c;

    /* renamed from: d, reason: collision with root package name */
    public int f350916d;

    public zzkg() {
        this(new long[10], 0, true);
    }

    public static zzkg zzd() {
        return f350914e;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350916d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350916d, "Index:", ", Size:"));
        }
        long[] jArr = this.f350915c;
        if (i13 < jArr.length) {
            System.arraycopy(jArr, i12, jArr, i12 + 1, i13 - i12);
        } else {
            long[] jArr2 = new long[e.e(i13, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            System.arraycopy(this.f350915c, i12, jArr2, i12 + 1, this.f350916d - i12);
            this.f350915c = jArr2;
        }
        this.f350915c[i12] = jLongValue;
        this.f350916d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        Charset charset = zzjh.f350896a;
        collection.getClass();
        if (!(collection instanceof zzkg)) {
            return super.addAll(collection);
        }
        zzkg zzkgVar = (zzkg) collection;
        int i12 = zzkgVar.f350916d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350916d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        long[] jArr = this.f350915c;
        if (i14 > jArr.length) {
            this.f350915c = Arrays.copyOf(jArr, i14);
        }
        System.arraycopy(zzkgVar.f350915c, 0, this.f350915c, this.f350916d, zzkgVar.f350916d);
        this.f350916d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350916d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350916d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkg)) {
            return super.equals(obj);
        }
        zzkg zzkgVar = (zzkg) obj;
        if (this.f350916d != zzkgVar.f350916d) {
            return false;
        }
        long[] jArr = zzkgVar.f350915c;
        for (int i12 = 0; i12 < this.f350916d; i12++) {
            if (this.f350915c[i12] != jArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        return Long.valueOf(zzb(i12));
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i12 = 0; i12 < this.f350916d; i12++) {
            iZza = (iZza * 31) + zzjh.zza(this.f350915c[i12]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f350915c[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        long[] jArr = this.f350915c;
        long j12 = jArr[i12];
        if (i12 < this.f350916d - 1) {
            System.arraycopy(jArr, i12 + 1, jArr, i12, (r3 - i12) - 1);
        }
        this.f350916d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f350915c;
        System.arraycopy(jArr, i13, jArr, i12, this.f350916d - i13);
        this.f350916d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i12, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        d(i12);
        long[] jArr = this.f350915c;
        long j12 = jArr[i12];
        jArr[i12] = jLongValue;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350916d;
    }

    @Override // com.google.android.gms.internal.measurement.zzjo
    public final long zzb(int i12) {
        d(i12);
        return this.f350915c[i12];
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzjo zza(int i12) {
        if (i12 >= this.f350916d) {
            return new zzkg(Arrays.copyOf(this.f350915c, i12), this.f350916d, true);
        }
        throw new IllegalArgumentException();
    }

    public zzkg(long[] jArr, int i12, boolean z12) {
        super(z12);
        this.f350915c = jArr;
        this.f350916d = i12;
    }

    public final void zza(long j12) {
        b();
        int i12 = this.f350916d;
        long[] jArr = this.f350915c;
        if (i12 == jArr.length) {
            long[] jArr2 = new long[e.e(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            this.f350915c = jArr2;
        }
        long[] jArr3 = this.f350915c;
        int i13 = this.f350916d;
        this.f350916d = i13 + 1;
        jArr3[i13] = j12;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }
}
