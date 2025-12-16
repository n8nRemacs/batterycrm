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
final class zzji extends zzho<Integer> implements zzjl, zzld, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final zzji f350897e = new zzji(0, new int[0], false);

    /* renamed from: c, reason: collision with root package name */
    public int[] f350898c;

    /* renamed from: d, reason: collision with root package name */
    public int f350899d;

    public zzji() {
        this(0, new int[10], true);
    }

    public static zzji zzd() {
        return f350897e;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350899d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350899d, "Index:", ", Size:"));
        }
        int[] iArr = this.f350898c;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i12, iArr, i12 + 1, i13 - i12);
        } else {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            System.arraycopy(this.f350898c, i12, iArr2, i12 + 1, this.f350899d - i12);
            this.f350898c = iArr2;
        }
        this.f350898c[i12] = iIntValue;
        this.f350899d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Charset charset = zzjh.f350896a;
        collection.getClass();
        if (!(collection instanceof zzji)) {
            return super.addAll(collection);
        }
        zzji zzjiVar = (zzji) collection;
        int i12 = zzjiVar.f350899d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350899d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        int[] iArr = this.f350898c;
        if (i14 > iArr.length) {
            this.f350898c = Arrays.copyOf(iArr, i14);
        }
        System.arraycopy(zzjiVar.f350898c, 0, this.f350898c, this.f350899d, zzjiVar.f350899d);
        this.f350899d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350899d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350899d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzji)) {
            return super.equals(obj);
        }
        zzji zzjiVar = (zzji) obj;
        if (this.f350899d != zzjiVar.f350899d) {
            return false;
        }
        int[] iArr = zzjiVar.f350898c;
        for (int i12 = 0; i12 < this.f350899d; i12++) {
            if (this.f350898c[i12] != iArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        return Integer.valueOf(zzb(i12));
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f350899d; i13++) {
            i12 = (i12 * 31) + this.f350898c[i13];
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f350898c[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        int[] iArr = this.f350898c;
        int i13 = iArr[i12];
        if (i12 < this.f350899d - 1) {
            System.arraycopy(iArr, i12 + 1, iArr, i12, (r2 - i12) - 1);
        }
        this.f350899d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f350898c;
        System.arraycopy(iArr, i13, iArr, i12, this.f350899d - i13);
        this.f350899d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i12, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        d(i12);
        int[] iArr = this.f350898c;
        int i13 = iArr[i12];
        iArr[i12] = iIntValue;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350899d;
    }

    public final int zzb(int i12) {
        d(i12);
        return this.f350898c[i12];
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzjl zza(int i12) {
        if (i12 < this.f350899d) {
            throw new IllegalArgumentException();
        }
        return new zzji(this.f350899d, Arrays.copyOf(this.f350898c, i12), true);
    }

    public zzji(int i12, int[] iArr, boolean z12) {
        super(z12);
        this.f350898c = iArr;
        this.f350899d = i12;
    }

    public final void zzd(int i12) {
        b();
        int i13 = this.f350899d;
        int[] iArr = this.f350898c;
        if (i13 == iArr.length) {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.f350898c = iArr2;
        }
        int[] iArr3 = this.f350898c;
        int i14 = this.f350899d;
        this.f350899d = i14 + 1;
        iArr3[i14] = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzd(((Integer) obj).intValue());
        return true;
    }
}
