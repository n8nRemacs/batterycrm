package com.google.android.gms.internal.auth;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzdv extends zzdr implements RandomAccess, zzez, zzge {

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f350080c;

    /* renamed from: d, reason: collision with root package name */
    public int f350081d;

    static {
        new zzdv(new boolean[0], 0, false);
    }

    public zzdv() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350081d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350081d, "Index:", ", Size:"));
        }
        boolean[] zArr = this.f350080c;
        if (i13 < zArr.length) {
            System.arraycopy(zArr, i12, zArr, i12 + 1, i13 - i12);
        } else {
            boolean[] zArr2 = new boolean[e.e(i13, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            System.arraycopy(this.f350080c, i12, zArr2, i12 + 1, this.f350081d - i12);
            this.f350080c = zArr2;
        }
        this.f350080c[i12] = zBooleanValue;
        this.f350081d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzfa.f350106a;
        collection.getClass();
        if (!(collection instanceof zzdv)) {
            return super.addAll(collection);
        }
        zzdv zzdvVar = (zzdv) collection;
        int i12 = zzdvVar.f350081d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350081d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        boolean[] zArr = this.f350080c;
        if (i14 > zArr.length) {
            this.f350080c = Arrays.copyOf(zArr, i14);
        }
        System.arraycopy(zzdvVar.f350080c, 0, this.f350080c, this.f350081d, zzdvVar.f350081d);
        this.f350081d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350081d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350081d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdv)) {
            return super.equals(obj);
        }
        zzdv zzdvVar = (zzdv) obj;
        if (this.f350081d != zzdvVar.f350081d) {
            return false;
        }
        boolean[] zArr = zzdvVar.f350080c;
        for (int i12 = 0; i12 < this.f350081d; i12++) {
            if (this.f350080c[i12] != zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Boolean.valueOf(this.f350080c[i12]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i12 = 0; i12 < this.f350081d; i12++) {
            iZza = (iZza * 31) + zzfa.zza(this.f350080c[i12]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i12 = this.f350081d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f350080c[i13] == zBooleanValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        boolean[] zArr = this.f350080c;
        boolean z12 = zArr[i12];
        if (i12 < this.f350081d - 1) {
            System.arraycopy(zArr, i12 + 1, zArr, i12, (r2 - i12) - 1);
        }
        this.f350081d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f350080c;
        System.arraycopy(zArr, i13, zArr, i12, this.f350081d - i13);
        this.f350081d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i12);
        boolean[] zArr = this.f350080c;
        boolean z12 = zArr[i12];
        zArr[i12] = zBooleanValue;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350081d;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i12) {
        if (i12 >= this.f350081d) {
            return new zzdv(Arrays.copyOf(this.f350080c, i12), this.f350081d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z12) {
        b();
        int i12 = this.f350081d;
        boolean[] zArr = this.f350080c;
        if (i12 == zArr.length) {
            boolean[] zArr2 = new boolean[e.e(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            this.f350080c = zArr2;
        }
        boolean[] zArr3 = this.f350080c;
        int i13 = this.f350081d;
        this.f350081d = i13 + 1;
        zArr3[i13] = z12;
    }

    public zzdv(boolean[] zArr, int i12, boolean z12) {
        super(z12);
        this.f350080c = zArr;
        this.f350081d = i12;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
