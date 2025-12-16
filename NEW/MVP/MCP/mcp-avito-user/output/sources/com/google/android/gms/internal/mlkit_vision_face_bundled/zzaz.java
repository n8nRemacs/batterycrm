package com.google.android.gms.internal.mlkit_vision_face_bundled;

import AK.c;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzaz implements zzax {

    /* renamed from: b, reason: collision with root package name */
    public static final zzay f353487b = zzay.zza;

    /* renamed from: a, reason: collision with root package name */
    public volatile zzax f353488a;

    public final String toString() {
        Object obj = this.f353488a;
        if (obj == f353487b) {
            obj = "<supplier that returned null>";
        }
        return c.k("Suppliers.memoize(", String.valueOf(obj), ")");
    }
}
