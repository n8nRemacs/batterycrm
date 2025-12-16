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
final class zzua extends zztw implements RandomAccess, zzvs, zzxa {

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f354022c;

    /* renamed from: d, reason: collision with root package name */
    public int f354023d;

    static {
        new zzua(new boolean[0], 0, false);
    }

    public zzua() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f354023d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354023d, "Index:", ", Size:"));
        }
        int i14 = i12 + 1;
        boolean[] zArr = this.f354022c;
        if (i13 < zArr.length) {
            System.arraycopy(zArr, i12, zArr, i14, i13 - i12);
        } else {
            boolean[] zArr2 = new boolean[e.e(i13, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            System.arraycopy(this.f354022c, i12, zArr2, i14, this.f354023d - i12);
            this.f354022c = zArr2;
        }
        this.f354022c[i12] = zBooleanValue;
        this.f354023d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzvt.f354067a;
        collection.getClass();
        if (!(collection instanceof zzua)) {
            return super.addAll(collection);
        }
        zzua zzuaVar = (zzua) collection;
        int i12 = zzuaVar.f354023d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f354023d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        boolean[] zArr = this.f354022c;
        if (i14 > zArr.length) {
            this.f354022c = Arrays.copyOf(zArr, i14);
        }
        System.arraycopy(zzuaVar.f354022c, 0, this.f354022c, this.f354023d, zzuaVar.f354023d);
        this.f354023d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f354023d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354023d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzua)) {
            return super.equals(obj);
        }
        zzua zzuaVar = (zzua) obj;
        if (this.f354023d != zzuaVar.f354023d) {
            return false;
        }
        boolean[] zArr = zzuaVar.f354022c;
        for (int i12 = 0; i12 < this.f354023d; i12++) {
            if (this.f354022c[i12] != zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Boolean.valueOf(this.f354022c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i12 = 0; i12 < this.f354023d; i12++) {
            iZza = (iZza * 31) + zzvt.zza(this.f354022c[i12]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i12 = this.f354023d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f354022c[i13] == zBooleanValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        boolean[] zArr = this.f354022c;
        boolean z12 = zArr[i12];
        if (i12 < this.f354023d - 1) {
            System.arraycopy(zArr, i12 + 1, zArr, i12, (r2 - i12) - 1);
        }
        this.f354023d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f354022c;
        System.arraycopy(zArr, i13, zArr, i12, this.f354023d - i13);
        this.f354023d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i12);
        boolean[] zArr = this.f354022c;
        boolean z12 = zArr[i12];
        zArr[i12] = zBooleanValue;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f354023d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvs
    public final /* bridge */ /* synthetic */ zzvs zzd(int i12) {
        if (i12 >= this.f354023d) {
            return new zzua(Arrays.copyOf(this.f354022c, i12), this.f354023d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z12) {
        b();
        int i12 = this.f354023d;
        boolean[] zArr = this.f354022c;
        if (i12 == zArr.length) {
            boolean[] zArr2 = new boolean[e.e(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            this.f354022c = zArr2;
        }
        boolean[] zArr3 = this.f354022c;
        int i13 = this.f354023d;
        this.f354023d = i13 + 1;
        zArr3[i13] = z12;
    }

    public zzua(boolean[] zArr, int i12, boolean z12) {
        super(z12);
        this.f354022c = zArr;
        this.f354023d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
