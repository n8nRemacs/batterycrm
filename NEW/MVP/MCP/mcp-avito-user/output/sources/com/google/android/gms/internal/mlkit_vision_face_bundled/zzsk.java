package com.google.android.gms.internal.mlkit_vision_face_bundled;

import AK.c;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzsk extends zzso {

    /* renamed from: a, reason: collision with root package name */
    public final String f353971a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f353972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f353973c;

    public /* synthetic */ zzsk(String str, boolean z12, int i12, zzsj zzsjVar) {
        this.f353971a = str;
        this.f353972b = z12;
        this.f353973c = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzso) {
            zzso zzsoVar = (zzso) obj;
            if (this.f353971a.equals(zzsoVar.zzb()) && this.f353972b == zzsoVar.zzc() && this.f353973c == zzsoVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f353971a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f353972b ? 1237 : 1231)) * 1000003) ^ this.f353973c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(this.f353971a);
        sb2.append(", enableFirelog=");
        sb2.append(this.f353972b);
        sb2.append(", firelogEventType=");
        return c.i(this.f353973c, "}", sb2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzso
    public final int zza() {
        return this.f353973c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzso
    public final String zzb() {
        return this.f353971a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzso
    public final boolean zzc() {
        return this.f353972b;
    }
}
