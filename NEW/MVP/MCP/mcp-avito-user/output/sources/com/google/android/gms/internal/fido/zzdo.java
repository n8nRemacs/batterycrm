package com.google.android.gms.internal.fido;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzdo implements zzdn {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzdo[] f350319b;
    public static final zzdo zza;
    public static final zzdo zzb;
    public static final zzdo zzc;

    static {
        zzdo zzdoVar = new zzdo("DEFAULT", 0);
        zza = zzdoVar;
        zzdo zzdoVar2 = new zzdo("NO_OP", 1);
        zzb = zzdoVar2;
        zzdo zzdoVar3 = new zzdo("SIMPLE_CLASSNAME", 2);
        zzc = zzdoVar3;
        f350319b = new zzdo[]{zzdoVar, zzdoVar2, zzdoVar3};
    }

    public static zzdo[] values() {
        return (zzdo[]) f350319b.clone();
    }
}
