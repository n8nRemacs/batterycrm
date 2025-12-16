package com.google.android.gms.internal.fido;

import I41.a;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzcu extends zzcf {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f350303i;

    /* renamed from: j, reason: collision with root package name */
    public static final zzcu f350304j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f350305d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f350306e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f350307f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f350308g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f350309h;

    static {
        Object[] objArr = new Object[0];
        f350303i = objArr;
        f350304j = new zzcu(objArr, 0, objArr, 0, 0);
    }

    public zzcu(Object[] objArr, int i12, Object[] objArr2, int i13, int i14) {
        this.f350305d = objArr;
        this.f350306e = i12;
        this.f350307f = objArr2;
        this.f350308g = i13;
        this.f350309h = i14;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f350305d;
        int i12 = this.f350309h;
        System.arraycopy(objArr2, 0, objArr, 0, i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int b() {
        return this.f350309h;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        if (obj != null) {
            Object[] objArr = this.f350307f;
            if (objArr.length != 0) {
                int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i12 = iRotateLeft & this.f350308g;
                    Object obj2 = objArr[i12];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iRotateLeft = i12 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] e() {
        return this.f350305d;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f350306e;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc l() {
        return zzcc.g(this.f350309h, this.f350305d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f350309h;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final zzdc iterator() {
        return zzi().listIterator(0);
    }
}
