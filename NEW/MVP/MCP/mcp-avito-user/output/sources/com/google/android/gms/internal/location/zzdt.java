package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzdt extends zzds {

    /* renamed from: f, reason: collision with root package name */
    public static final zzds f350529f = new zzdt(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f350530d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f350531e;

    public zzdt(Object[] objArr, int i12) {
        this.f350530d = objArr;
        this.f350531e = i12;
    }

    @Override // com.google.android.gms.internal.location.zzds, com.google.android.gms.internal.location.zzdp
    public final void a(Object[] objArr) {
        System.arraycopy(this.f350530d, 0, objArr, 0, this.f350531e);
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int b() {
        return this.f350531e;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final Object[] g() {
        return this.f350530d;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzdm.zza(i12, this.f350531e, "index");
        Object obj = this.f350530d[i12];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350531e;
    }
}
