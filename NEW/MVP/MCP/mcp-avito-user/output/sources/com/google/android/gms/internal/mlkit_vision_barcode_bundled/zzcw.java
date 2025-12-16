package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzcw extends zzcz {

    /* renamed from: d, reason: collision with root package name */
    public final int f352400d;

    /* renamed from: e, reason: collision with root package name */
    public final int f352401e;

    public zzcw(byte[] bArr, int i12, int i13) {
        super(bArr);
        zzdb.s(i12, i12 + i13, bArr.length);
        this.f352400d = i12;
        this.f352401e = i13;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte a(int i12) {
        return this.f352402c[this.f352400d + i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void d(int i12, int i13, int i14, byte[] bArr) {
        System.arraycopy(this.f352402c, this.f352400d + i12, bArr, i13, i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz
    public final int w() {
        return this.f352400d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza(int i12) {
        zzdb.t(i12, this.f352401e);
        return this.f352402c[this.f352400d + i12];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzd() {
        return this.f352401e;
    }
}
