package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public enum zzmx implements zzbl {
    UNKNOWN(0),
    TRANSLATE(1);


    /* renamed from: b, reason: collision with root package name */
    public final int f351626b;

    zzmx(int i12) {
        this.f351626b = i12;
    }

    public static zzmx zzb(int i12) {
        for (zzmx zzmxVar : values()) {
            if (zzmxVar.f351626b == i12) {
                return zzmxVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbl
    public final int zza() {
        return this.f351626b;
    }
}
