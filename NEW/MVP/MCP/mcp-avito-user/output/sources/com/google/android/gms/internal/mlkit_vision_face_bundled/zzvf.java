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
final class zzvf extends zztw implements RandomAccess, zzvs, zzxa {

    /* renamed from: c, reason: collision with root package name */
    public float[] f354055c;

    /* renamed from: d, reason: collision with root package name */
    public int f354056d;

    static {
        new zzvf(new float[0], 0, false);
    }

    public zzvf() {
        this(new float[10], 0, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f354056d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354056d, "Index:", ", Size:"));
        }
        int i14 = i12 + 1;
        float[] fArr = this.f354055c;
        if (i13 < fArr.length) {
            System.arraycopy(fArr, i12, fArr, i14, i13 - i12);
        } else {
            float[] fArr2 = new float[e.e(i13, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            System.arraycopy(this.f354055c, i12, fArr2, i14, this.f354056d - i12);
            this.f354055c = fArr2;
        }
        this.f354055c[i12] = fFloatValue;
        this.f354056d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzvt.f354067a;
        collection.getClass();
        if (!(collection instanceof zzvf)) {
            return super.addAll(collection);
        }
        zzvf zzvfVar = (zzvf) collection;
        int i12 = zzvfVar.f354056d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f354056d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        float[] fArr = this.f354055c;
        if (i14 > fArr.length) {
            this.f354055c = Arrays.copyOf(fArr, i14);
        }
        System.arraycopy(zzvfVar.f354055c, 0, this.f354055c, this.f354056d, zzvfVar.f354056d);
        this.f354056d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f354056d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354056d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvf)) {
            return super.equals(obj);
        }
        zzvf zzvfVar = (zzvf) obj;
        if (this.f354056d != zzvfVar.f354056d) {
            return false;
        }
        float[] fArr = zzvfVar.f354055c;
        for (int i12 = 0; i12 < this.f354056d; i12++) {
            if (Float.floatToIntBits(this.f354055c[i12]) != Float.floatToIntBits(fArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Float.valueOf(this.f354055c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i12 = 0; i12 < this.f354056d; i12++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f354055c[i12]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i12 = this.f354056d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f354055c[i13] == fFloatValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        float[] fArr = this.f354055c;
        float f12 = fArr[i12];
        if (i12 < this.f354056d - 1) {
            System.arraycopy(fArr, i12 + 1, fArr, i12, (r2 - i12) - 1);
        }
        this.f354056d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f354055c;
        System.arraycopy(fArr, i13, fArr, i12, this.f354056d - i13);
        this.f354056d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        d(i12);
        float[] fArr = this.f354055c;
        float f12 = fArr[i12];
        fArr[i12] = fFloatValue;
        return Float.valueOf(f12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f354056d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvs
    public final /* bridge */ /* synthetic */ zzvs zzd(int i12) {
        if (i12 >= this.f354056d) {
            return new zzvf(Arrays.copyOf(this.f354055c, i12), this.f354056d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f12) {
        b();
        int i12 = this.f354056d;
        float[] fArr = this.f354055c;
        if (i12 == fArr.length) {
            float[] fArr2 = new float[e.e(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i12);
            this.f354055c = fArr2;
        }
        float[] fArr3 = this.f354055c;
        int i13 = this.f354056d;
        this.f354056d = i13 + 1;
        fArr3[i13] = f12;
    }

    public zzvf(float[] fArr, int i12, boolean z12) {
        super(z12);
        this.f354055c = fArr;
        this.f354056d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
