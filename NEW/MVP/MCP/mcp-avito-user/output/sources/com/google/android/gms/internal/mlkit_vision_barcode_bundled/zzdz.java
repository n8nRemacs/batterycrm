package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdz implements zzdr {

    /* renamed from: b, reason: collision with root package name */
    public final int f352438b;

    /* renamed from: c, reason: collision with root package name */
    public final zzhf f352439c;

    public zzdz(int i12, zzhf zzhfVar) {
        this.f352438b = i12;
        this.f352439c = zzhfVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f352438b - ((zzdz) obj).f352438b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr
    public final int zza() {
        return this.f352438b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr
    public final zzfk zzb(zzfk zzfkVar, zzfl zzflVar) {
        ((zzdw) zzfkVar).zzi((zzec) zzflVar);
        return zzfkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr
    public final zzfq zzc(zzfq zzfqVar, zzfq zzfqVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr
    public final zzhf zzd() {
        return this.f352439c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr
    public final zzhg zze() {
        return this.f352439c.zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr
    public final boolean zzg() {
        return false;
    }
}
