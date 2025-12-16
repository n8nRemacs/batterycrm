package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes6.dex */
final class zzai extends zzag {

    /* renamed from: f, reason: collision with root package name */
    public static final zzag f350231f = new zzai(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f350232d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f350233e;

    public zzai(Object[] objArr, int i12) {
        this.f350232d = objArr;
        this.f350233e = i12;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final void a(Object[] objArr) {
        System.arraycopy(this.f350232d, 0, objArr, 0, this.f350233e);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int b() {
        return this.f350233e;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] g() {
        return this.f350232d;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzs.zza(i12, this.f350233e, "index");
        Object obj = this.f350232d[i12];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350233e;
    }
}
