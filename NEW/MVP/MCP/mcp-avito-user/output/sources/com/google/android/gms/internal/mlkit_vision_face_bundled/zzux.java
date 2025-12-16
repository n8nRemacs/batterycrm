package com.google.android.gms.internal.mlkit_vision_face_bundled;

import okhttp3.internal.http2.Settings;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzux {

    /* renamed from: a, reason: collision with root package name */
    public final Object f354042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f354043b;

    public zzux(Object obj, int i12) {
        this.f354042a = obj;
        this.f354043b = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzux)) {
            return false;
        }
        zzux zzuxVar = (zzux) obj;
        return this.f354042a == zzuxVar.f354042a && this.f354043b == zzuxVar.f354043b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f354042a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f354043b;
    }
}
