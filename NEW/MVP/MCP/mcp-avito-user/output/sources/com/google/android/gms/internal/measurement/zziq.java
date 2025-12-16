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
final class zziq extends zzho<Double> implements zzjn<Double>, zzld, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public double[] f350868c;

    /* renamed from: d, reason: collision with root package name */
    public int f350869d;

    static {
        new zziq(new double[0], 0, false);
    }

    public zziq() {
        this(new double[10], 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350869d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350869d, "Index:", ", Size:"));
        }
        double[] dArr = this.f350868c;
        if (i13 < dArr.length) {
            System.arraycopy(dArr, i12, dArr, i12 + 1, i13 - i12);
        } else {
            double[] dArr2 = new double[e.e(i13, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            System.arraycopy(this.f350868c, i12, dArr2, i12 + 1, this.f350869d - i12);
            this.f350868c = dArr2;
        }
        this.f350868c[i12] = dDoubleValue;
        this.f350869d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        Charset charset = zzjh.f350896a;
        collection.getClass();
        if (!(collection instanceof zziq)) {
            return super.addAll(collection);
        }
        zziq zziqVar = (zziq) collection;
        int i12 = zziqVar.f350869d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350869d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        double[] dArr = this.f350868c;
        if (i14 > dArr.length) {
            this.f350868c = Arrays.copyOf(dArr, i14);
        }
        System.arraycopy(zziqVar.f350868c, 0, this.f350868c, this.f350869d, zziqVar.f350869d);
        this.f350869d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350869d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350869d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziq)) {
            return super.equals(obj);
        }
        zziq zziqVar = (zziq) obj;
        if (this.f350869d != zziqVar.f350869d) {
            return false;
        }
        double[] dArr = zziqVar.f350868c;
        for (int i12 = 0; i12 < this.f350869d; i12++) {
            if (Double.doubleToLongBits(this.f350868c[i12]) != Double.doubleToLongBits(dArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Double.valueOf(this.f350868c[i12]);
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i12 = 0; i12 < this.f350869d; i12++) {
            iZza = (iZza * 31) + zzjh.zza(Double.doubleToLongBits(this.f350868c[i12]));
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f350868c[i12] == dDoubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        double[] dArr = this.f350868c;
        double d12 = dArr[i12];
        if (i12 < this.f350869d - 1) {
            System.arraycopy(dArr, i12 + 1, dArr, i12, (r3 - i12) - 1);
        }
        this.f350869d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f350868c;
        System.arraycopy(dArr, i13, dArr, i12, this.f350869d - i13);
        this.f350869d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i12, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        b();
        d(i12);
        double[] dArr = this.f350868c;
        double d12 = dArr[i12];
        dArr[i12] = dDoubleValue;
        return Double.valueOf(d12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350869d;
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final /* synthetic */ zzjn<Double> zza(int i12) {
        if (i12 >= this.f350869d) {
            return new zziq(Arrays.copyOf(this.f350868c, i12), this.f350869d, true);
        }
        throw new IllegalArgumentException();
    }

    public zziq(double[] dArr, int i12, boolean z12) {
        super(z12);
        this.f350868c = dArr;
        this.f350869d = i12;
    }

    public final void zza(double d12) {
        b();
        int i12 = this.f350869d;
        double[] dArr = this.f350868c;
        if (i12 == dArr.length) {
            double[] dArr2 = new double[e.e(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i12);
            this.f350868c = dArr2;
        }
        double[] dArr3 = this.f350868c;
        int i13 = this.f350869d;
        this.f350869d = i13 + 1;
        dArr3[i13] = d12;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
