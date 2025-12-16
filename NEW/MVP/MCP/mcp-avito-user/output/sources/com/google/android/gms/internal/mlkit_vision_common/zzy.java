package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzy extends zzp {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f352931d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f352932e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f352933f;

    public zzy(Object[] objArr, int i12, int i13) {
        this.f352931d = objArr;
        this.f352932e = i12;
        this.f352933f = i13;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzf.zza(i12, this.f352933f, "index");
        Object obj = this.f352931d[i12 + i12 + this.f352932e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352933f;
    }
}
