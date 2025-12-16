package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfc implements zzfj {

    /* renamed from: a, reason: collision with root package name */
    public final zzfj[] f352463a;

    public zzfc(zzfj... zzfjVarArr) {
        this.f352463a = zzfjVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final zzfi zzb(Class cls) {
        for (int i12 = 0; i12 < 2; i12++) {
            zzfj zzfjVar = this.f352463a[i12];
            if (zzfjVar.zzc(cls)) {
                return zzfjVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final boolean zzc(Class cls) {
        for (int i12 = 0; i12 < 2; i12++) {
            if (this.f352463a[i12].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
