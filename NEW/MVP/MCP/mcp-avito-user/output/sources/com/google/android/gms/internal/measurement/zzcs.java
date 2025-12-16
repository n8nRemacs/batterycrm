package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzcs extends zzcy {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<Bundle> f350608a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f350609b;

    public final Bundle zza(long j12) {
        Bundle bundle;
        synchronized (this.f350608a) {
            if (!this.f350609b) {
                try {
                    this.f350608a.wait(j12);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f350608a.get();
        }
        return bundle;
    }

    public final Long zzb(long j12) {
        return (Long) zza(zza(j12), Long.class);
    }

    public final String zzc(long j12) {
        return (String) zza(zza(j12), String.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T zza(android.os.Bundle r2, java.lang.Class<T> r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L27
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L27
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String.format(r1, r2)
            throw r0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcs.zza(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void zza(Bundle bundle) {
        synchronized (this.f350608a) {
            try {
                try {
                    this.f350608a.set(bundle);
                    this.f350609b = true;
                } finally {
                    this.f350608a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
