package com.google.android.gms.internal.measurement;

import XY0.e;
import androidx.camera.camera2.internal.G;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzl {

    /* renamed from: a, reason: collision with root package name */
    @e
    public final HashMap f350946a = new HashMap();

    public final zzaq zza(String str) {
        HashMap map = this.f350946a;
        if (!map.containsKey(str)) {
            return zzaq.zzc;
        }
        try {
            return (zzaq) ((Callable) map.get(str)).call();
        } catch (Exception unused) {
            throw new IllegalStateException(G.f("Failed to create API implementation: ", str));
        }
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.f350946a.put(str, callable);
    }
}
