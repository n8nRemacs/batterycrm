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
final class zzhs extends zzho<Boolean> implements zzjn<Boolean>, zzld, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f350835c;

    /* renamed from: d, reason: collision with root package name */
    public int f350836d;

    static {
        new zzhs(new boolean[0], 0, false);
    }

    public zzhs() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350836d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350836d, "Index:", ", Size:"));
        }
        boolean[] zArr = this.f350835c;
        if (i13 < zArr.length) {
            System.arraycopy(zArr, i12, zArr, i12 + 1, i13 - i12);
        } else {
            boolean[] zArr2 = new boolean[e.e(i13, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            System.arraycopy(this.f350835c, i12, zArr2, i12 + 1, this.f350836d - i12);
            this.f350835c = zArr2;
        }
        this.f350835c[i12] = zBooleanValue;
        this.f350836d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        Charset charset = zzjh.f350896a;
        collection.getClass();
        if (!(collection instanceof zzhs)) {
            return super.addAll(collection);
        }
        zzhs zzhsVar = (zzhs) collection;
        int i12 = zzhsVar.f350836d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350836d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        boolean[] zArr = this.f350835c;
        if (i14 > zArr.length) {
            this.f350835c = Arrays.copyOf(zArr, i14);
        }
        System.arraycopy(zzhsVar.f350835c, 0, this.f350835c, this.f350836d, zzhsVar.f350836d);
        this.f350836d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350836d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350836d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhs)) {
            return super.equals(obj);
        }
        zzhs zzhsVar = (zzhs) obj;
        if (this.f350836d != zzhsVar.f350836d) {
            return false;
        }
        boolean[] zArr = zzhsVar.f350835c;
        for (int i12 = 0; i12 < this.f350836d; i12++) {
            if (this.f350835c[i12] != zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Boolean.valueOf(this.f350835c[i12]);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i12 = 0; i12 < this.f350836d; i12++) {
            iZza = (iZza * 31) + zzjh.zza(this.f350835c[i12]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f350835c[i12] == zBooleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        boolean[] zArr = this.f350835c;
        boolean z12 = zArr[i12];
        if (i12 < this.f350836d - 1) {
            System.arraycopy(zArr, i12 + 1, zArr, i12, (r2 - i12) - 1);
        }
        this.f350836d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f350835c;
        System.arraycopy(zArr, i13, zArr, i12, this.f350836d - i13);
        this.f350836d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i12);
        boolean[] zArr = this.f350835c;
        boolean z12 = zArr[i12];
        zArr[i12] = zBooleanValue;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350836d;
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final /* synthetic */ zzjn<Boolean> zza(int i12) {
        if (i12 >= this.f350836d) {
            return new zzhs(Arrays.copyOf(this.f350835c, i12), this.f350836d, true);
        }
        throw new IllegalArgumentException();
    }

    public zzhs(boolean[] zArr, int i12, boolean z12) {
        super(z12);
        this.f350835c = zArr;
        this.f350836d = i12;
    }

    public final void zza(boolean z12) {
        b();
        int i12 = this.f350836d;
        boolean[] zArr = this.f350835c;
        if (i12 == zArr.length) {
            boolean[] zArr2 = new boolean[e.e(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            this.f350835c = zArr2;
        }
        boolean[] zArr3 = this.f350835c;
        int i13 = this.f350836d;
        this.f350836d = i13 + 1;
        zArr3[i13] = z12;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
