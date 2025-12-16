package com.google.android.gms.internal.fido;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzct extends zzcc {

    /* renamed from: f, reason: collision with root package name */
    public static final zzcc f350300f = new zzct(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f350301d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f350302e;

    public zzct(Object[] objArr, int i12) {
        this.f350301d = objArr;
        this.f350302e = i12;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f350301d;
        int i12 = this.f350302e;
        System.arraycopy(objArr2, 0, objArr, 0, i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int b() {
        return this.f350302e;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] e() {
        return this.f350301d;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzbm.zza(i12, this.f350302e, "index");
        Object obj = this.f350301d[i12];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350302e;
    }
}
