package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public class zzkl implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f352879g = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f352880b;

    /* renamed from: c, reason: collision with root package name */
    public long f352881c;

    /* renamed from: d, reason: collision with root package name */
    public long f352882d;

    /* renamed from: e, reason: collision with root package name */
    public long f352883e;

    /* renamed from: f, reason: collision with root package name */
    public long f352884f;

    public zzkl(String str) {
        this.f352883e = 2147483647L;
        this.f352884f = -2147483648L;
    }

    public static zzkl zze(String str) {
        zzlk.zza();
        if (!zzlk.zzb()) {
            return zzkj.f352878h;
        }
        HashMap map = f352879g;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzkl("detectorTaskWithResource#run"));
        }
        return (zzkl) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j12 = this.f352881c;
        if (j12 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        zzd(j12);
    }

    public zzkl zzb() {
        this.f352881c = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j12) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j13 = this.f352882d;
        if (j13 != 0 && jElapsedRealtimeNanos - j13 >= 1000000) {
            this.f352880b = 0;
            this.f352881c = 0L;
            this.f352883e = 2147483647L;
            this.f352884f = -2147483648L;
        }
        this.f352882d = jElapsedRealtimeNanos;
        this.f352880b++;
        this.f352883e = Math.min(this.f352883e, j12);
        this.f352884f = Math.max(this.f352884f, j12);
        if (this.f352880b % 50 == 0) {
            Locale locale = Locale.US;
            zzlk.zza();
        }
        if (this.f352880b % 500 == 0) {
            this.f352880b = 0;
            this.f352881c = 0L;
            this.f352883e = 2147483647L;
            this.f352884f = -2147483648L;
        }
    }

    public void zzd(long j12) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j12);
    }
}
