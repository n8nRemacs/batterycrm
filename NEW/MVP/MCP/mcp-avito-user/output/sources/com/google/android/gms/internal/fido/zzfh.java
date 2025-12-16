package com.google.android.gms.internal.fido;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzfh {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zzfh[] f350369b;
    public static final zzfh zza;
    public static final zzfh zzb;
    public static final zzfh zzc;
    public static final zzfh zzd;

    static {
        zzfh zzfhVar = new zzfh("BOOLEAN", 0);
        zza = zzfhVar;
        zzfh zzfhVar2 = new zzfh("STRING", 1);
        zzb = zzfhVar2;
        zzfh zzfhVar3 = new zzfh("LONG", 2);
        zzc = zzfhVar3;
        zzfh zzfhVar4 = new zzfh("DOUBLE", 3);
        zzd = zzfhVar4;
        f350369b = new zzfh[]{zzfhVar, zzfhVar2, zzfhVar3, zzfhVar4};
    }

    public static /* bridge */ /* synthetic */ zzfh a(Object obj) {
        if (obj instanceof String) {
            return zzb;
        }
        if (obj instanceof Boolean) {
            return zza;
        }
        if (obj instanceof Long) {
            return zzc;
        }
        if (obj instanceof Double) {
            return zzd;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    public static zzfh[] values() {
        return (zzfh[]) f350369b.clone();
    }
}
