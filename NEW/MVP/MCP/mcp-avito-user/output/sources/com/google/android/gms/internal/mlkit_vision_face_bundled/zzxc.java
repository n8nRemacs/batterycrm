package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxc extends zztw implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final zzxc f354110e = new zzxc(new Object[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public Object[] f354111c;

    /* renamed from: d, reason: collision with root package name */
    public int f354112d;

    public zzxc() {
        this(new Object[10], 0, true);
    }

    public static zzxc zze() {
        return f354110e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        b();
        if (i12 < 0 || i12 > (i13 = this.f354112d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354112d, "Index:", ", Size:"));
        }
        int i14 = i12 + 1;
        Object[] objArr = this.f354111c;
        if (i13 < objArr.length) {
            System.arraycopy(objArr, i12, objArr, i14, i13 - i12);
        } else {
            Object[] objArr2 = new Object[e.e(i13, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i12);
            System.arraycopy(this.f354111c, i12, objArr2, i14, this.f354112d - i12);
            this.f354111c = objArr2;
        }
        this.f354111c[i12] = obj;
        this.f354112d++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f354112d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f354112d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        d(i12);
        return this.f354111c[i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        Object[] objArr = this.f354111c;
        Object obj = objArr[i12];
        if (i12 < this.f354112d - 1) {
            System.arraycopy(objArr, i12 + 1, objArr, i12, (r2 - i12) - 1);
        }
        this.f354112d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        b();
        d(i12);
        Object[] objArr = this.f354111c;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f354112d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvs
    public final /* bridge */ /* synthetic */ zzvs zzd(int i12) {
        if (i12 >= this.f354112d) {
            return new zzxc(Arrays.copyOf(this.f354111c, i12), this.f354112d, true);
        }
        throw new IllegalArgumentException();
    }

    public zzxc(Object[] objArr, int i12, boolean z12) {
        super(z12);
        this.f354111c = objArr;
        this.f354112d = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i12 = this.f354112d;
        Object[] objArr = this.f354111c;
        if (i12 == objArr.length) {
            this.f354111c = Arrays.copyOf(objArr, ((i12 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f354111c;
        int i13 = this.f354112d;
        this.f354112d = i13 + 1;
        objArr2[i13] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
