package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Objects;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzbr extends zzbj {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f353513d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f353514e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f353515f;

    public zzbr(Object[] objArr, int i12, int i13) {
        this.f353513d = objArr;
        this.f353514e = i12;
        this.f353515f = i13;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzav.zza(i12, this.f353515f, "index");
        Object obj = this.f353513d[i12 + i12 + this.f353514e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f353515f;
    }
}
