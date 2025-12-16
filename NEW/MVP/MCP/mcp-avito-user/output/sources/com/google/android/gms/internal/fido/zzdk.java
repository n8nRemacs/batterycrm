package com.google.android.gms.internal.fido;

import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public class zzdk {

    /* renamed from: a, reason: collision with root package name */
    public final String f350315a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f350316b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f350317c;

    public zzdk(String str, Class cls, boolean z12) {
        zzfk.zzb(str);
        this.f350315a = str;
        this.f350316b = cls;
        this.f350317c = z12;
        System.identityHashCode(this);
        for (int i12 = 0; i12 < 5; i12++) {
        }
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false);
    }

    public final String toString() {
        String name = getClass().getName();
        return G.h(r.z(name, "/"), this.f350315a, "[", this.f350316b.getName(), "]");
    }

    public final boolean zzb() {
        return this.f350317c;
    }
}
