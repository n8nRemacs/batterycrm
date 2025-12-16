package com.google.android.gms.internal.fido;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzdl {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzdl[] f350318b;
    public static final zzdl zza;
    public static final zzdl zzb;
    public static final zzdl zzc;
    public static final zzdl zzd;
    public static final zzdl zze;

    static {
        zzdl zzdlVar = new zzdl("SMALL", 0);
        zza = zzdlVar;
        zzdl zzdlVar2 = new zzdl("MEDIUM", 1);
        zzb = zzdlVar2;
        zzdl zzdlVar3 = new zzdl("LARGE", 2);
        zzc = zzdlVar3;
        zzdl zzdlVar4 = new zzdl("FULL", 3);
        zzd = zzdlVar4;
        zzdl zzdlVar5 = new zzdl("NONE", 4);
        zze = zzdlVar5;
        f350318b = new zzdl[]{zzdlVar, zzdlVar2, zzdlVar3, zzdlVar4, zzdlVar5};
    }

    public static zzdl[] values() {
        return (zzdl[]) f350318b.clone();
    }
}
