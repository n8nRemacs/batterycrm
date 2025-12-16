package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzu extends zzp {

    /* renamed from: f, reason: collision with root package name */
    public static final zzp f352922f = new zzu(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f352923d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f352924e;

    public zzu(Object[] objArr, int i12) {
        this.f352923d = objArr;
        this.f352924e = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f352923d;
        int i12 = this.f352924e;
        System.arraycopy(objArr2, 0, objArr, 0, i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int b() {
        return this.f352924e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final Object[] e() {
        return this.f352923d;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzf.zza(i12, this.f352924e, "index");
        Object obj = this.f352923d[i12];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352924e;
    }
}
