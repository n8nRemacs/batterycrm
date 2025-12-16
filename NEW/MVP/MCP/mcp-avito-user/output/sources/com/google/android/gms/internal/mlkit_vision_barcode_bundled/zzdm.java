package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import okhttp3.internal.http2.Settings;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdm {

    /* renamed from: a, reason: collision with root package name */
    public final zzfl f352417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f352418b;

    public zzdm(zzfl zzflVar, int i12) {
        this.f352417a = zzflVar;
        this.f352418b = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdmVar = (zzdm) obj;
        return this.f352417a == zzdmVar.f352417a && this.f352418b == zzdmVar.f352418b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f352417a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f352418b;
    }
}
