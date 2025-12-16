package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfw implements zzfi {

    /* renamed from: a, reason: collision with root package name */
    public final zzfl f352496a;

    /* renamed from: b, reason: collision with root package name */
    public final String f352497b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f352498c;

    /* renamed from: d, reason: collision with root package name */
    public final int f352499d;

    public zzfw(zzfl zzflVar, String str, Object[] objArr) {
        this.f352496a = zzflVar;
        this.f352497b = str;
        this.f352498c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f352499d = cCharAt;
            return;
        }
        int i12 = cCharAt & 8191;
        int i13 = 1;
        int i14 = 13;
        while (true) {
            int i15 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f352499d = i12 | (cCharAt2 << i14);
                return;
            } else {
                i12 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i13 = i15;
            }
        }
    }

    public final String a() {
        return this.f352497b;
    }

    public final Object[] b() {
        return this.f352498c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfi
    public final zzfl zza() {
        return this.f352496a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfi
    public final boolean zzb() {
        return (this.f352499d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfi
    public final int zzc() {
        return (this.f352499d & 1) == 1 ? 1 : 2;
    }
}
