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
final class zzek extends zzdr implements RandomAccess, zzez, zzge {

    /* renamed from: c, reason: collision with root package name */
    public double[] f350091c;

    /* renamed from: d, reason: collision with root package name */
    public int f350092d;

    static {
        new zzek(new double[0], 0, false);
    }

    public zzek() {
        this(new double[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350092d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350092d, "Index:", ", Size:"));
        }
        double[] dArr = this.f350091c;
        if (i13 < dArr.length) {
            System.arraycopy(dArr, i12, dArr, i12 + 1, i13 - i12);
        } else {
            double[] dArr2 = new double[e.e(i13, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            System.arraycopy(this.f350091c, i12, dArr2, i12 + 1, this.f350092d - i12);
            this.f350091c = dArr2;
        }
        this.f350091c[i12] = dDoubleValue;
        this.f350092d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzfa.f350106a;
        collection.getClass();
        if (!(collection instanceof zzek)) {
            return super.addAll(collection);
        }
        zzek zzekVar = (zzek) collection;
        int i12 = zzekVar.f350092d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350092d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        double[] dArr = this.f350091c;
        if (i14 > dArr.length) {
            this.f350091c = Arrays.copyOf(dArr, i14);
        }
        System.arraycopy(zzekVar.f350091c, 0, this.f350091c, this.f350092d, zzekVar.f350092d);
        this.f350092d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350092d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350092d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzek)) {
            return super.equals(obj);
        }
        zzek zzekVar = (zzek) obj;
        if (this.f350092d != zzekVar.f350092d) {
            return false;
        }
        double[] dArr = zzekVar.f350091c;
        for (int i12 = 0; i12 < this.f350092d; i12++) {
            if (Double.doubleToLongBits(this.f350091c[i12]) != Double.doubleToLongBits(dArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Double.valueOf(this.f350091c[i12]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f350092d; i13++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f350091c[i13]);
            Charset charset = zzfa.f350106a;
            i12 = (i12 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i12 = this.f350092d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f350091c[i13] == dDoubleValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        double[] dArr = this.f350091c;
        double d12 = dArr[i12];
        if (i12 < this.f350092d - 1) {
            System.arraycopy(dArr, i12 + 1, dArr, i12, (r3 - i12) - 1);
        }
        this.f350092d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f350091c;
        System.arraycopy(dArr, i13, dArr, i12, this.f350092d - i13);
        this.f350092d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        d(i12);
        double[] dArr = this.f350091c;
        double d12 = dArr[i12];
        dArr[i12] = dDoubleValue;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350092d;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i12) {
        if (i12 >= this.f350092d) {
            return new zzek(Arrays.copyOf(this.f350091c, i12), this.f350092d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d12) {
        b();
        int i12 = this.f350092d;
        double[] dArr = this.f350091c;
        if (i12 == dArr.length) {
            double[] dArr2 = new double[e.e(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            this.f350091c = dArr2;
        }
        double[] dArr3 = this.f350091c;
        int i13 = this.f350092d;
        this.f350092d = i13 + 1;
        dArr3[i13] = d12;
    }

    public zzek(double[] dArr, int i12, boolean z12) {
        super(z12);
        this.f350091c = dArr;
        this.f350092d = i12;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
