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
final class zzew extends zzdr implements RandomAccess, zzez, zzge {

    /* renamed from: c, reason: collision with root package name */
    public int[] f350104c;

    /* renamed from: d, reason: collision with root package name */
    public int f350105d;

    static {
        new zzew(0, new int[0], false);
    }

    public zzew() {
        this(0, new int[10], true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350105d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350105d, "Index:", ", Size:"));
        }
        int[] iArr = this.f350104c;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i12, iArr, i12 + 1, i13 - i12);
        } else {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            System.arraycopy(this.f350104c, i12, iArr2, i12 + 1, this.f350105d - i12);
            this.f350104c = iArr2;
        }
        this.f350104c[i12] = iIntValue;
        this.f350105d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzfa.f350106a;
        collection.getClass();
        if (!(collection instanceof zzew)) {
            return super.addAll(collection);
        }
        zzew zzewVar = (zzew) collection;
        int i12 = zzewVar.f350105d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350105d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        int[] iArr = this.f350104c;
        if (i14 > iArr.length) {
            this.f350104c = Arrays.copyOf(iArr, i14);
        }
        System.arraycopy(zzewVar.f350104c, 0, this.f350104c, this.f350105d, zzewVar.f350105d);
        this.f350105d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350105d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350105d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzew)) {
            return super.equals(obj);
        }
        zzew zzewVar = (zzew) obj;
        if (this.f350105d != zzewVar.f350105d) {
            return false;
        }
        int[] iArr = zzewVar.f350104c;
        for (int i12 = 0; i12 < this.f350105d; i12++) {
            if (this.f350104c[i12] != iArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Integer.valueOf(this.f350104c[i12]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f350105d; i13++) {
            i12 = (i12 * 31) + this.f350104c[i13];
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i12 = this.f350105d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f350104c[i13] == iIntValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        int[] iArr = this.f350104c;
        int i13 = iArr[i12];
        if (i12 < this.f350105d - 1) {
            System.arraycopy(iArr, i12 + 1, iArr, i12, (r2 - i12) - 1);
        }
        this.f350105d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f350104c;
        System.arraycopy(iArr, i13, iArr, i12, this.f350105d - i13);
        this.f350105d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        d(i12);
        int[] iArr = this.f350104c;
        int i13 = iArr[i12];
        iArr[i12] = iIntValue;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350105d;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i12) {
        if (i12 < this.f350105d) {
            throw new IllegalArgumentException();
        }
        return new zzew(this.f350105d, Arrays.copyOf(this.f350104c, i12), true);
    }

    public final void zze(int i12) {
        b();
        int i13 = this.f350105d;
        int[] iArr = this.f350104c;
        if (i13 == iArr.length) {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.f350104c = iArr2;
        }
        int[] iArr3 = this.f350104c;
        int i14 = this.f350105d;
        this.f350105d = i14 + 1;
        iArr3[i14] = i12;
    }

    public zzew(int i12, int[] iArr, boolean z12) {
        super(z12);
        this.f350104c = iArr;
        this.f350105d = i12;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Integer) obj).intValue());
        return true;
    }
}
