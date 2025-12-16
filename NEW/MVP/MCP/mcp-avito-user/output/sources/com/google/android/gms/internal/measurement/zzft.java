package com.google.android.gms.internal.measurement;

import j.B;
import j.P;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzft {

    /* renamed from: a, reason: collision with root package name */
    @B
    @P
    public static zzfv f350772a;

    public static synchronized zzfw zza() {
        try {
            if (f350772a == null) {
                zzfv zzfvVar = new zzfv();
                synchronized (zzft.class) {
                    if (f350772a != null) {
                        throw new IllegalStateException("init() already called");
                    }
                    f350772a = zzfvVar;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f350772a;
    }
}
