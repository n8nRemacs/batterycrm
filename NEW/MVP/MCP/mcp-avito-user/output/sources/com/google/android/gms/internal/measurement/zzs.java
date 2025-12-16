package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzs {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzs[] f351169b;
    public static final zzs zza;
    public static final zzs zzb;
    public static final zzs zzc;
    public static final zzs zzd;
    public static final zzs zze;

    static {
        zzs zzsVar = new zzs("DEBUG", 0);
        zza = zzsVar;
        zzs zzsVar2 = new zzs("ERROR", 1);
        zzb = zzsVar2;
        zzs zzsVar3 = new zzs("INFO", 2);
        zzc = zzsVar3;
        zzs zzsVar4 = new zzs("VERBOSE", 3);
        zzd = zzsVar4;
        zzs zzsVar5 = new zzs("WARN", 4);
        zze = zzsVar5;
        f351169b = new zzs[]{zzsVar, zzsVar2, zzsVar3, zzsVar4, zzsVar5};
    }

    public zzs() {
        throw null;
    }

    public static zzs[] values() {
        return (zzs[]) f351169b.clone();
    }

    public static zzs zza(int i12) {
        return i12 != 2 ? i12 != 3 ? i12 != 5 ? i12 != 6 ? zzc : zzb : zze : zza : zzd;
    }
}
