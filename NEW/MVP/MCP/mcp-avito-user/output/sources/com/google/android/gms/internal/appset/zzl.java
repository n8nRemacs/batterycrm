package com.google.android.gms.internal.appset;

import NX0.a;
import NX0.b;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.k;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import j.B;
import j.P;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes6.dex */
public final class zzl implements a {

    /* renamed from: d, reason: collision with root package name */
    @B
    @P
    public static zzl f349953d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f349954a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f349955b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f349956c;

    public zzl(Context context) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f349955b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f349956c = Executors.newSingleThreadExecutor();
        this.f349954a = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new zzj(this, null), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final SharedPreferences a(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void b(Context context) throws zzk {
        SharedPreferences sharedPreferencesA = a(context);
        k.f349611a.getClass();
        if (sharedPreferencesA.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        if (strValueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(strValueOf);
        }
        throw new zzk("Failed to store the app set ID last used time.");
    }

    @Override // NX0.a
    public final Task<b> getAppSetIdInfo() {
        final C37028k c37028k = new C37028k();
        this.f349956c.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.zzh
            /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws com.google.android.gms.internal.appset.zzk {
                /*
                    r11 = this;
                    java.lang.String r0 = "app_set_id_storage"
                    com.google.android.gms.internal.appset.zzl r1 = r11.zza
                    com.google.android.gms.tasks.k r2 = r2
                    android.content.Context r3 = r1.f349954a
                    android.content.SharedPreferences r4 = com.google.android.gms.internal.appset.zzl.a(r3)
                    r5 = 0
                    java.lang.String r6 = "app_set_id"
                    java.lang.String r4 = r4.getString(r6, r5)
                    android.content.Context r1 = r1.f349954a
                    android.content.SharedPreferences r1 = com.google.android.gms.internal.appset.zzl.a(r1)
                    java.lang.String r5 = "app_set_id_last_used_time"
                    r7 = -1
                    long r9 = r1.getLong(r5, r7)
                    int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                    if (r1 == 0) goto L2b
                    r7 = 33696000000(0x7d8702800, double:1.66480360023E-313)
                    long r7 = r7 + r9
                L2b:
                    if (r4 == 0) goto L46
                    com.google.android.gms.common.util.k r1 = com.google.android.gms.common.util.k.f349611a
                    r1.getClass()
                    long r9 = java.lang.System.currentTimeMillis()
                    int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                    if (r1 <= 0) goto L3b
                    goto L46
                L3b:
                    com.google.android.gms.internal.appset.zzl.b(r3)     // Catch: com.google.android.gms.internal.appset.zzk -> L40
                    goto Lba
                L40:
                    r0 = move-exception
                    r2.a(r0)
                    goto Lc7
                L46:
                    java.util.UUID r1 = java.util.UUID.randomUUID()
                    java.lang.String r4 = r1.toString()
                    r1 = 0
                    android.content.SharedPreferences r5 = r3.getSharedPreferences(r0, r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    android.content.SharedPreferences$Editor r5 = r5.putString(r6, r4)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    boolean r5 = r5.commit()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    if (r5 != 0) goto L7f
                    java.lang.String r0 = "Failed to store app set ID generated for App "
                    java.lang.String r1 = r3.getPackageName()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    int r3 = r1.length()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    if (r3 == 0) goto L77
                    r0.concat(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    goto L77
                L75:
                    r0 = move-exception
                    goto Lc4
                L77:
                    com.google.android.gms.internal.appset.zzk r0 = new com.google.android.gms.internal.appset.zzk     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    java.lang.String r1 = "Failed to store the app set ID."
                    r0.<init>(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    throw r0     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                L7f:
                    com.google.android.gms.internal.appset.zzl.b(r3)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    com.google.android.gms.common.util.k r1 = com.google.android.gms.common.util.k.f349611a     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    r1.getClass()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    long r5 = java.lang.System.currentTimeMillis()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    java.lang.String r1 = "app_set_id_creation_time"
                    android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r5)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    boolean r0 = r0.commit()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    if (r0 != 0) goto Lba
                    java.lang.String r0 = "Failed to store app set ID creation time for App "
                    java.lang.String r1 = r3.getPackageName()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    int r3 = r1.length()     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    if (r3 == 0) goto Lb2
                    r0.concat(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                Lb2:
                    com.google.android.gms.internal.appset.zzk r0 = new com.google.android.gms.internal.appset.zzk     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    java.lang.String r1 = "Failed to store the app set ID creation time."
                    r0.<init>(r1)     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                    throw r0     // Catch: com.google.android.gms.internal.appset.zzk -> L75
                Lba:
                    NX0.b r0 = new NX0.b
                    r1 = 1
                    r0.<init>(r4, r1)
                    r2.b(r0)
                    goto Lc7
                Lc4:
                    r2.a(r0)
                Lc7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.appset.zzh.run():void");
            }
        });
        return c37028k.f355672a;
    }
}
