package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzey extends zzez {
    public /* synthetic */ zzey(zzew zzewVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez
    public final void a(long j12, Object obj) {
        ((zzek) zzgz.f352545c.zzm(obj, j12)).zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez
    public final void b(Object obj, long j12, Object obj2) {
        zzgy zzgyVar = zzgz.f352545c;
        zzek zzekVarZzd = (zzek) zzgyVar.zzm(obj, j12);
        zzek zzekVar = (zzek) zzgyVar.zzm(obj2, j12);
        int size = zzekVarZzd.size();
        int size2 = zzekVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzekVarZzd.zzc()) {
                zzekVarZzd = zzekVarZzd.zzd(size2 + size);
            }
            zzekVarZzd.addAll(zzekVar);
        }
        if (size > 0) {
            zzekVar = zzekVarZzd;
        }
        zzgz.o(obj, j12, zzekVar);
    }

    public zzey() {
        super(null);
    }
}
