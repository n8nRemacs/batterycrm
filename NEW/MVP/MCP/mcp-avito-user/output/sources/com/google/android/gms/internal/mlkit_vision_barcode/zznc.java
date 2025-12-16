package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zznc extends zzne {

    /* renamed from: a, reason: collision with root package name */
    public final String f352198a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f352199b;

    /* renamed from: c, reason: collision with root package name */
    public final int f352200c;

    public /* synthetic */ zznc(String str, boolean z12, int i12, zznb zznbVar) {
        this.f352198a = str;
        this.f352199b = z12;
        this.f352200c = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzne) {
            zzne zzneVar = (zzne) obj;
            if (this.f352198a.equals(zzneVar.zzb()) && this.f352199b == zzneVar.zzc() && this.f352200c == zzneVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f352198a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f352199b ? 1237 : 1231)) * 1000003) ^ this.f352200c;
    }

    public final String toString() {
        String str = this.f352198a;
        StringBuilder sb2 = new StringBuilder(str.length() + 84);
        sb2.append("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(this.f352199b);
        sb2.append(", firelogEventType=");
        sb2.append(this.f352200c);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzne
    public final int zza() {
        return this.f352200c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzne
    public final String zzb() {
        return this.f352198a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzne
    public final boolean zzc() {
        return this.f352199b;
    }
}
