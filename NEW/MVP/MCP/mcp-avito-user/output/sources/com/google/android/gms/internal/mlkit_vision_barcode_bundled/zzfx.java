package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfx extends zzcv {

    /* renamed from: b, reason: collision with root package name */
    public final zzfz f352500b;

    /* renamed from: c, reason: collision with root package name */
    public zzcx f352501c;

    public zzfx(zzga zzgaVar) {
        zzfz zzfzVar = new zzfz(zzgaVar, null);
        this.f352500b = zzfzVar;
        this.f352501c = zzfzVar.hasNext() ? zzfzVar.next().iterator() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f352501c != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcx
    public final byte zza() {
        zzcx zzcxVar = this.f352501c;
        if (zzcxVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzcxVar.zza();
        if (!this.f352501c.hasNext()) {
            zzfz zzfzVar = this.f352500b;
            this.f352501c = zzfzVar.hasNext() ? zzfzVar.next().iterator() : null;
        }
        return bZza;
    }
}
