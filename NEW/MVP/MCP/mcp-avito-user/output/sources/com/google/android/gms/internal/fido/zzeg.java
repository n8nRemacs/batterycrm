package com.google.android.gms.internal.fido;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public abstract class zzeg {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f350332a = {"com.google.android.gms.internal.fido.zzel", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzfm.zza();
    }

    public static long zzb() {
        zzee.f350331a.getClass();
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public static zzdp zzd(String str) {
        return zzee.f350331a.a(str);
    }

    public static zzdr zzf() {
        return zzi().zza();
    }

    public static zzef zzg() {
        return zzee.f350331a.b();
    }

    public static zzev zzi() {
        return zzee.f350331a.c();
    }

    public static zzfi zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        zzee.f350331a.getClass();
        return "platform: Android";
    }

    public static boolean zzn(String str, Level level, boolean z12) {
        zzi().zzd(str, level, z12);
        return false;
    }

    public abstract zzdp a(String str);

    public abstract zzef b();

    public zzev c() {
        return zzev.zze();
    }
}
