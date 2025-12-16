package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzna extends zznd {

    /* renamed from: a, reason: collision with root package name */
    public String f352194a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f352195b;

    /* renamed from: c, reason: collision with root package name */
    public int f352196c;

    /* renamed from: d, reason: collision with root package name */
    public byte f352197d;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zznd
    public final zznd zza(boolean z12) {
        this.f352195b = true;
        this.f352197d = (byte) (1 | this.f352197d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zznd
    public final zznd zzb(int i12) {
        this.f352196c = 1;
        this.f352197d = (byte) (this.f352197d | 2);
        return this;
    }

    public final zznd zzc(String str) {
        this.f352194a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zznd
    public final zzne zzd() {
        String str;
        if (this.f352197d == 3 && (str = this.f352194a) != null) {
            return new zznc(str, this.f352195b, this.f352196c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f352194a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f352197d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f352197d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
