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
final class zzer extends zzdr implements RandomAccess, zzez, zzge {

    /* renamed from: c, reason: collision with root package name */
    public float[] f350099c;

    /* renamed from: d, reason: collision with root package name */
    public int f350100d;

    static {
        new zzer(new float[0], 0, false);
    }

    public zzer() {
        this(new float[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350100d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350100d, "Index:", ", Size:"));
        }
        float[] fArr = this.f350099c;
        if (i13 < fArr.length) {
            System.arraycopy(fArr, i12, fArr, i12 + 1, i13 - i12);
        } else {
            float[] fArr2 = new float[e.e(i13, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            System.arraycopy(this.f350099c, i12, fArr2, i12 + 1, this.f350100d - i12);
            this.f350099c = fArr2;
        }
        this.f350099c[i12] = fFloatValue;
        this.f350100d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzfa.f350106a;
        collection.getClass();
        if (!(collection instanceof zzer)) {
            return super.addAll(collection);
        }
        zzer zzerVar = (zzer) collection;
        int i12 = zzerVar.f350100d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350100d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        float[] fArr = this.f350099c;
        if (i14 > fArr.length) {
            this.f350099c = Arrays.copyOf(fArr, i14);
        }
        System.arraycopy(zzerVar.f350099c, 0, this.f350099c, this.f350100d, zzerVar.f350100d);
        this.f350100d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350100d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350100d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzer)) {
            return super.equals(obj);
        }
        zzer zzerVar = (zzer) obj;
        if (this.f350100d != zzerVar.f350100d) {
            return false;
        }
        float[] fArr = zzerVar.f350099c;
        for (int i12 = 0; i12 < this.f350100d; i12++) {
            if (Float.floatToIntBits(this.f350099c[i12]) != Float.floatToIntBits(fArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Float.valueOf(this.f350099c[i12]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i12 = 0; i12 < this.f350100d; i12++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f350099c[i12]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i12 = this.f350100d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f350099c[i13] == fFloatValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        float[] fArr = this.f350099c;
        float f12 = fArr[i12];
        if (i12 < this.f350100d - 1) {
            System.arraycopy(fArr, i12 + 1, fArr, i12, (r2 - i12) - 1);
        }
        this.f350100d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f350099c;
        System.arraycopy(fArr, i13, fArr, i12, this.f350100d - i13);
        this.f350100d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        d(i12);
        float[] fArr = this.f350099c;
        float f12 = fArr[i12];
        fArr[i12] = fFloatValue;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350100d;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i12) {
        if (i12 >= this.f350100d) {
            return new zzer(Arrays.copyOf(this.f350099c, i12), this.f350100d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f12) {
        b();
        int i12 = this.f350100d;
        float[] fArr = this.f350099c;
        if (i12 == fArr.length) {
            float[] fArr2 = new float[e.e(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            this.f350099c = fArr2;
        }
        float[] fArr3 = this.f350099c;
        int i13 = this.f350100d;
        this.f350100d = i13 + 1;
        fArr3[i13] = f12;
    }

    public zzer(float[] fArr, int i12, boolean z12) {
        super(z12);
        this.f350099c = fArr;
        this.f350100d = i12;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
