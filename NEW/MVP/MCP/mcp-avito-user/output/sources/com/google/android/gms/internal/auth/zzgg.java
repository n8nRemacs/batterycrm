package com.google.android.gms.internal.auth;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzgg extends zzdr implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final zzgg f350140e = new zzgg(new Object[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public Object[] f350141c;

    /* renamed from: d, reason: collision with root package name */
    public int f350142d;

    public zzgg() {
        this(new Object[10], 0, true);
    }

    public static zzgg zze() {
        return f350140e;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        b();
        if (i12 < 0 || i12 > (i13 = this.f350142d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350142d, "Index:", ", Size:"));
        }
        Object[] objArr = this.f350141c;
        if (i13 < objArr.length) {
            System.arraycopy(objArr, i12, objArr, i12 + 1, i13 - i12);
        } else {
            Object[] objArr2 = new Object[e.e(i13, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i12);
            System.arraycopy(this.f350141c, i12, objArr2, i12 + 1, this.f350142d - i12);
            this.f350141c = objArr2;
        }
        this.f350141c[i12] = obj;
        this.f350142d++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350142d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350142d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        d(i12);
        return this.f350141c[i12];
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        Object[] objArr = this.f350141c;
        Object obj = objArr[i12];
        if (i12 < this.f350142d - 1) {
            System.arraycopy(objArr, i12 + 1, objArr, i12, (r2 - i12) - 1);
        }
        this.f350142d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        d(i12);
        Object[] objArr = this.f350141c;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350142d;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i12) {
        if (i12 >= this.f350142d) {
            return new zzgg(Arrays.copyOf(this.f350141c, i12), this.f350142d, true);
        }
        throw new IllegalArgumentException();
    }

    public zzgg(Object[] objArr, int i12, boolean z12) {
        super(z12);
        this.f350141c = objArr;
        this.f350142d = i12;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i12 = this.f350142d;
        Object[] objArr = this.f350141c;
        if (i12 == objArr.length) {
            this.f350141c = Arrays.copyOf(objArr, ((i12 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f350141c;
        int i13 = this.f350142d;
        this.f350142d = i13 + 1;
        objArr2[i13] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
