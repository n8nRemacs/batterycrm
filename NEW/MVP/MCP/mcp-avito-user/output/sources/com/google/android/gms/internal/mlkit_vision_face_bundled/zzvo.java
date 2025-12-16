package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzvo extends zztw implements RandomAccess, zzvs, zzxa {

    /* renamed from: c, reason: collision with root package name */
    public int[] f354065c;

    /* renamed from: d, reason: collision with root package name */
    public int f354066d;

    static {
        new zzvo(0, new int[0], false);
    }

    public zzvo() {
        this(0, new int[10], true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f354066d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354066d, "Index:", ", Size:"));
        }
        int i14 = i12 + 1;
        int[] iArr = this.f354065c;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i12, iArr, i14, i13 - i12);
        } else {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            System.arraycopy(this.f354065c, i12, iArr2, i14, this.f354066d - i12);
            this.f354065c = iArr2;
        }
        this.f354065c[i12] = iIntValue;
        this.f354066d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzvt.f354067a;
        collection.getClass();
        if (!(collection instanceof zzvo)) {
            return super.addAll(collection);
        }
        zzvo zzvoVar = (zzvo) collection;
        int i12 = zzvoVar.f354066d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f354066d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        int[] iArr = this.f354065c;
        if (i14 > iArr.length) {
            this.f354065c = Arrays.copyOf(iArr, i14);
        }
        System.arraycopy(zzvoVar.f354065c, 0, this.f354065c, this.f354066d, zzvoVar.f354066d);
        this.f354066d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f354066d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354066d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvo)) {
            return super.equals(obj);
        }
        zzvo zzvoVar = (zzvo) obj;
        if (this.f354066d != zzvoVar.f354066d) {
            return false;
        }
        int[] iArr = zzvoVar.f354065c;
        for (int i12 = 0; i12 < this.f354066d; i12++) {
            if (this.f354065c[i12] != iArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Integer.valueOf(this.f354065c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f354066d; i13++) {
            i12 = (i12 * 31) + this.f354065c[i13];
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i12 = this.f354066d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f354065c[i13] == iIntValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        int[] iArr = this.f354065c;
        int i13 = iArr[i12];
        if (i12 < this.f354066d - 1) {
            System.arraycopy(iArr, i12 + 1, iArr, i12, (r2 - i12) - 1);
        }
        this.f354066d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f354065c;
        System.arraycopy(iArr, i13, iArr, i12, this.f354066d - i13);
        this.f354066d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        d(i12);
        int[] iArr = this.f354065c;
        int i13 = iArr[i12];
        iArr[i12] = iIntValue;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f354066d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvs
    public final /* bridge */ /* synthetic */ zzvs zzd(int i12) {
        if (i12 < this.f354066d) {
            throw new IllegalArgumentException();
        }
        return new zzvo(this.f354066d, Arrays.copyOf(this.f354065c, i12), true);
    }

    public final int zze(int i12) {
        d(i12);
        return this.f354065c[i12];
    }

    public final void zzf(int i12) {
        b();
        int i13 = this.f354066d;
        int[] iArr = this.f354065c;
        if (i13 == iArr.length) {
            int[] iArr2 = new int[e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.f354065c = iArr2;
        }
        int[] iArr3 = this.f354065c;
        int i14 = this.f354066d;
        this.f354066d = i14 + 1;
        iArr3[i14] = i12;
    }

    public zzvo(int i12, int[] iArr, boolean z12) {
        super(z12);
        this.f354065c = iArr;
        this.f354066d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Integer) obj).intValue());
        return true;
    }
}
