package com.google.android.gms.internal.mlkit_vision_face_bundled;

import I41.a;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzbi extends zzbj {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f353496d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f353497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzbj f353498f;

    public zzbi(zzbj zzbjVar, int i12, int i13) {
        this.f353498f = zzbjVar;
        this.f353496d = i12;
        this.f353497e = i13;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    public final int b() {
        return this.f353498f.d() + this.f353496d + this.f353497e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    public final int d() {
        return this.f353498f.d() + this.f353496d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    @a
    public final Object[] e() {
        return this.f353498f.e();
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzav.zza(i12, this.f353497e, "index");
        return this.f353498f.get(i12 + this.f353496d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f353497e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbj, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbj subList(int i12, int i13) {
        zzav.zzc(i12, i13, this.f353497e);
        int i14 = this.f353496d;
        return this.f353498f.subList(i12 + i14, i13 + i14);
    }
}
