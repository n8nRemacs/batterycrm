package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzjb {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzjb[] f350888b;
    public static final zzjb zza;
    public static final zzjb zzb;
    public static final zzjb zzc;
    public static final zzjb zzd;

    static {
        zzjb zzjbVar = new zzjb("SCALAR", 0);
        zza = zzjbVar;
        zzjb zzjbVar2 = new zzjb("VECTOR", 1);
        zzb = zzjbVar2;
        zzjb zzjbVar3 = new zzjb("PACKED_VECTOR", 2);
        zzc = zzjbVar3;
        zzjb zzjbVar4 = new zzjb("MAP", 3);
        zzd = zzjbVar4;
        f350888b = new zzjb[]{zzjbVar, zzjbVar2, zzjbVar3, zzjbVar4};
    }

    public zzjb() {
        throw null;
    }

    public static zzjb[] values() {
        return (zzjb[]) f350888b.clone();
    }
}
