package com.google.android.gms.internal.mlkit_common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzbm {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzbm[] f351220b;
    public static final zzbm zza;
    public static final zzbm zzb;
    public static final zzbm zzc;

    static {
        zzbm zzbmVar = new zzbm("DEFAULT", 0);
        zza = zzbmVar;
        zzbm zzbmVar2 = new zzbm("SIGNED", 1);
        zzb = zzbmVar2;
        zzbm zzbmVar3 = new zzbm("FIXED", 2);
        zzc = zzbmVar3;
        f351220b = new zzbm[]{zzbmVar, zzbmVar2, zzbmVar3};
    }

    public static zzbm[] values() {
        return (zzbm[]) f351220b.clone();
    }
}
