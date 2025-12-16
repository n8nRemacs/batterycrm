package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.compose.ui.graphics.colorspace.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfv extends zzcm implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final zzfv f352493e;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f352494c;

    /* renamed from: d, reason: collision with root package name */
    public int f352495d;

    static {
        zzfv zzfvVar = new zzfv(new Object[0], 0);
        f352493e = zzfvVar;
        zzfvVar.zzb();
    }

    public zzfv() {
        this(new Object[10], 0);
    }

    public static zzfv zze() {
        return f352493e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        b();
        if (i12 < 0 || i12 > (i13 = this.f352495d)) {
            throw new IndexOutOfBoundsException(d(i12));
        }
        Object[] objArr = this.f352494c;
        if (i13 < objArr.length) {
            System.arraycopy(objArr, i12, objArr, i12 + 1, i13 - i12);
        } else {
            Object[] objArr2 = new Object[e.e(i13, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i12);
            System.arraycopy(this.f352494c, i12, objArr2, i12 + 1, this.f352495d - i12);
            this.f352494c = objArr2;
        }
        this.f352494c[i12] = obj;
        this.f352495d++;
        ((AbstractList) this).modCount++;
    }

    public final String d(int i12) {
        int i13 = this.f352495d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i12);
        sb2.append(", Size:");
        sb2.append(i13);
        return sb2.toString();
    }

    public final void e(int i12) {
        if (i12 < 0 || i12 >= this.f352495d) {
            throw new IndexOutOfBoundsException(d(i12));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        e(i12);
        return this.f352494c[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        e(i12);
        Object[] objArr = this.f352494c;
        Object obj = objArr[i12];
        if (i12 < this.f352495d - 1) {
            System.arraycopy(objArr, i12 + 1, objArr, i12, (r2 - i12) - 1);
        }
        this.f352495d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        e(i12);
        Object[] objArr = this.f352494c;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352495d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek
    public final /* bridge */ /* synthetic */ zzek zzd(int i12) {
        if (i12 >= this.f352495d) {
            return new zzfv(Arrays.copyOf(this.f352494c, i12), this.f352495d);
        }
        throw new IllegalArgumentException();
    }

    public zzfv(Object[] objArr, int i12) {
        this.f352494c = objArr;
        this.f352495d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i12 = this.f352495d;
        Object[] objArr = this.f352494c;
        if (i12 == objArr.length) {
            this.f352494c = Arrays.copyOf(objArr, ((i12 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f352494c;
        int i13 = this.f352495d;
        this.f352495d = i13 + 1;
        objArr2[i13] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
