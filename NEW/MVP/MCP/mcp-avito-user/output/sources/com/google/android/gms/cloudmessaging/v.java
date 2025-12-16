package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import j.P;
import j.k0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    @J41.a
    @P
    public static v f348843e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f348844a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f348845b;

    /* renamed from: c, reason: collision with root package name */
    @J41.a
    public q f348846c = new q(this, null);

    /* renamed from: d, reason: collision with root package name */
    @J41.a
    public int f348847d = 1;

    @k0
    public v(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f348845b = scheduledExecutorService;
        this.f348844a = context.getApplicationContext();
    }

    public static synchronized v a(Context context) {
        try {
            if (f348843e == null) {
                zze.zza();
                f348843e = new v(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.b("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f348843e;
    }

    public final synchronized <T> Task<T> b(t<T> tVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                new StringBuilder(String.valueOf(tVar).length() + 9);
            }
            if (!this.f348846c.d(tVar)) {
                q qVar = new q(this, null);
                this.f348846c = qVar;
                qVar.d(tVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return tVar.f348840b.f355672a;
    }
}
