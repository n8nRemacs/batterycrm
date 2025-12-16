package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzli<E> extends zzho<E> implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final zzli<Object> f350957e = new zzli<>(new Object[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public E[] f350958c;

    /* renamed from: d, reason: collision with root package name */
    public int f350959d;

    public zzli() {
        this(new Object[10], 0, true);
    }

    public static <E> zzli<E> zzd() {
        return (zzli<E>) f350957e;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final void add(int i12, E e12) {
        int i13;
        b();
        if (i12 < 0 || i12 > (i13 = this.f350959d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350959d, "Index:", ", Size:"));
        }
        E[] eArr = this.f350958c;
        if (i13 < eArr.length) {
            System.arraycopy(eArr, i12, eArr, i12 + 1, i13 - i12);
        } else {
            E[] eArr2 = (E[]) new Object[e.e(i13, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i12);
            System.arraycopy(this.f350958c, i12, eArr2, i12 + 1, this.f350959d - i12);
            this.f350958c = eArr2;
        }
        this.f350958c[i12] = e12;
        this.f350959d++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350959d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350959d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i12) {
        d(i12);
        return this.f350958c[i12];
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final E remove(int i12) {
        b();
        d(i12);
        E[] eArr = this.f350958c;
        E e12 = eArr[i12];
        if (i12 < this.f350959d - 1) {
            System.arraycopy(eArr, i12 + 1, eArr, i12, (r2 - i12) - 1);
        }
        this.f350959d--;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.List
    public final E set(int i12, E e12) {
        b();
        d(i12);
        E[] eArr = this.f350958c;
        E e13 = eArr[i12];
        eArr[i12] = e12;
        ((AbstractList) this).modCount++;
        return e13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350959d;
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final /* synthetic */ zzjn zza(int i12) {
        if (i12 >= this.f350959d) {
            return new zzli(Arrays.copyOf(this.f350958c, i12), this.f350959d, true);
        }
        throw new IllegalArgumentException();
    }

    public zzli(E[] eArr, int i12, boolean z12) {
        super(z12);
        this.f350958c = eArr;
        this.f350959d = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e12) {
        b();
        int i12 = this.f350959d;
        E[] eArr = this.f350958c;
        if (i12 == eArr.length) {
            this.f350958c = (E[]) Arrays.copyOf(eArr, ((i12 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f350958c;
        int i13 = this.f350959d;
        this.f350959d = i13 + 1;
        eArr2[i13] = e12;
        ((AbstractList) this).modCount++;
        return true;
    }
}
