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
final class zzwh extends zztw implements RandomAccess, zzvs, zzxa {

    /* renamed from: c, reason: collision with root package name */
    public long[] f354079c;

    /* renamed from: d, reason: collision with root package name */
    public int f354080d;

    static {
        new zzwh(new long[0], 0, false);
    }

    public zzwh() {
        this(new long[10], 0, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f354080d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354080d, "Index:", ", Size:"));
        }
        int i14 = i12 + 1;
        long[] jArr = this.f354079c;
        if (i13 < jArr.length) {
            System.arraycopy(jArr, i12, jArr, i14, i13 - i12);
        } else {
            long[] jArr2 = new long[e.e(i13, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            System.arraycopy(this.f354079c, i12, jArr2, i14, this.f354080d - i12);
            this.f354079c = jArr2;
        }
        this.f354079c[i12] = jLongValue;
        this.f354080d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzvt.f354067a;
        collection.getClass();
        if (!(collection instanceof zzwh)) {
            return super.addAll(collection);
        }
        zzwh zzwhVar = (zzwh) collection;
        int i12 = zzwhVar.f354080d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f354080d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        long[] jArr = this.f354079c;
        if (i14 > jArr.length) {
            this.f354079c = Arrays.copyOf(jArr, i14);
        }
        System.arraycopy(zzwhVar.f354079c, 0, this.f354079c, this.f354080d, zzwhVar.f354080d);
        this.f354080d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f354080d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354080d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwh)) {
            return super.equals(obj);
        }
        zzwh zzwhVar = (zzwh) obj;
        if (this.f354080d != zzwhVar.f354080d) {
            return false;
        }
        long[] jArr = zzwhVar.f354079c;
        for (int i12 = 0; i12 < this.f354080d; i12++) {
            if (this.f354079c[i12] != jArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Long.valueOf(this.f354079c[i12]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f354080d; i13++) {
            long j12 = this.f354079c[i13];
            Charset charset = zzvt.f354067a;
            i12 = (i12 * 31) + ((int) (j12 ^ (j12 >>> 32)));
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i12 = this.f354080d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f354079c[i13] == jLongValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        long[] jArr = this.f354079c;
        long j12 = jArr[i12];
        if (i12 < this.f354080d - 1) {
            System.arraycopy(jArr, i12 + 1, jArr, i12, (r3 - i12) - 1);
        }
        this.f354080d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f354079c;
        System.arraycopy(jArr, i13, jArr, i12, this.f354080d - i13);
        this.f354080d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        d(i12);
        long[] jArr = this.f354079c;
        long j12 = jArr[i12];
        jArr[i12] = jLongValue;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f354080d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvs
    public final /* bridge */ /* synthetic */ zzvs zzd(int i12) {
        if (i12 >= this.f354080d) {
            return new zzwh(Arrays.copyOf(this.f354079c, i12), this.f354080d, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i12) {
        d(i12);
        return this.f354079c[i12];
    }

    public final void zzf(long j12) {
        b();
        int i12 = this.f354080d;
        long[] jArr = this.f354079c;
        if (i12 == jArr.length) {
            long[] jArr2 = new long[e.e(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            this.f354079c = jArr2;
        }
        long[] jArr3 = this.f354079c;
        int i13 = this.f354080d;
        this.f354080d = i13 + 1;
        jArr3[i13] = j12;
    }

    public zzwh(long[] jArr, int i12, boolean z12) {
        super(z12);
        this.f354079c = jArr;
        this.f354080d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
