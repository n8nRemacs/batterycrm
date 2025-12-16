package com.google.android.gms.internal.mlkit_vision_common;

import AK.c;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzko extends zzkr {

    /* renamed from: a, reason: collision with root package name */
    public final String f352889a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f352890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f352891c;

    public /* synthetic */ zzko(String str, boolean z12, int i12, zzkn zzknVar) {
        this.f352889a = str;
        this.f352890b = z12;
        this.f352891c = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkr) {
            zzkr zzkrVar = (zzkr) obj;
            if (this.f352889a.equals(zzkrVar.zzb()) && this.f352890b == zzkrVar.zzc() && this.f352891c == zzkrVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f352889a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f352890b ? 1237 : 1231)) * 1000003) ^ this.f352891c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(this.f352889a);
        sb2.append(", enableFirelog=");
        sb2.append(this.f352890b);
        sb2.append(", firelogEventType=");
        return c.i(this.f352891c, "}", sb2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final int zza() {
        return this.f352891c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final String zzb() {
        return this.f352889a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final boolean zzc() {
        return this.f352890b;
    }
}
