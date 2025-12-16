package com.google.android.gms.internal.mlkit_vision_face;

import AK.c;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zznq extends zznt {

    /* renamed from: a, reason: collision with root package name */
    public final String f353425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f353426b;

    /* renamed from: c, reason: collision with root package name */
    public final int f353427c;

    public /* synthetic */ zznq(String str, boolean z12, int i12, zznp zznpVar) {
        this.f353425a = str;
        this.f353426b = z12;
        this.f353427c = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznt) {
            zznt zzntVar = (zznt) obj;
            if (this.f353425a.equals(zzntVar.zzb()) && this.f353426b == zzntVar.zzc() && this.f353427c == zzntVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f353425a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f353426b ? 1237 : 1231)) * 1000003) ^ this.f353427c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(this.f353425a);
        sb2.append(", enableFirelog=");
        sb2.append(this.f353426b);
        sb2.append(", firelogEventType=");
        return c.i(this.f353427c, "}", sb2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final int zza() {
        return this.f353427c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final String zzb() {
        return this.f353425a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final boolean zzc() {
        return this.f353426b;
    }
}
