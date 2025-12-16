package com.google.android.gms.internal.mlkit_vision_face_bundled;

import I41.h;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzj {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f353817a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @h
    public static volatile zze f353818b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f353819c;
    public static final /* synthetic */ int zza = 0;

    static {
        new AtomicReference();
        new zzl(zzh.zza);
        f353819c = new AtomicInteger();
    }

    public static void zza(final Context context) {
        if (f353818b != null || context == null) {
            return;
        }
        Object obj = f353817a;
        synchronized (obj) {
            try {
                if (f353818b == null) {
                    synchronized (obj) {
                        zze zzeVar = f353818b;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzeVar == null || zzeVar.f353547a != context) {
                            zzf.a();
                            zzk.a();
                            f353818b = new zze(context, zzba.zza(new zzax() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzg
                            }));
                            f353819c.incrementAndGet();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
