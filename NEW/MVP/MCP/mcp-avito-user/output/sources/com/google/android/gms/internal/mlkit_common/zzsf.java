package com.google.android.gms.internal.mlkit_common;

import AK.c;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzsf extends zzsm {

    /* renamed from: a, reason: collision with root package name */
    public final String f351707a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f351708b;

    /* renamed from: c, reason: collision with root package name */
    public final int f351709c;

    public /* synthetic */ zzsf(String str, boolean z12, int i12, zzse zzseVar) {
        this.f351707a = str;
        this.f351708b = z12;
        this.f351709c = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsm) {
            zzsm zzsmVar = (zzsm) obj;
            if (this.f351707a.equals(zzsmVar.zzb()) && this.f351708b == zzsmVar.zzc() && this.f351709c == zzsmVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f351707a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f351708b ? 1237 : 1231)) * 1000003) ^ this.f351709c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(this.f351707a);
        sb2.append(", enableFirelog=");
        sb2.append(this.f351708b);
        sb2.append(", firelogEventType=");
        return c.i(this.f351709c, "}", sb2);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsm
    public final int zza() {
        return this.f351709c;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsm
    public final String zzb() {
        return this.f351707a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsm
    public final boolean zzc() {
        return this.f351708b;
    }
}
