package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Objects;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzbn extends zzbj {

    /* renamed from: f, reason: collision with root package name */
    public static final zzbj f353504f = new zzbn(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f353505d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f353506e;

    public zzbn(Object[] objArr, int i12) {
        this.f353505d = objArr;
        this.f353506e = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbj, com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f353505d;
        int i12 = this.f353506e;
        System.arraycopy(objArr2, 0, objArr, 0, i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    public final int b() {
        return this.f353506e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    public final Object[] e() {
        return this.f353505d;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzav.zza(i12, this.f353506e, "index");
        Object obj = this.f353505d[i12];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f353506e;
    }
}
