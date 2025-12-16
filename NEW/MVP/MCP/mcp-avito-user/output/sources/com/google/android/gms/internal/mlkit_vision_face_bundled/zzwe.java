package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzwe extends zzwg {
    public /* synthetic */ zzwe(zzwd zzwdVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwg
    public final void a(long j12, Object obj) {
        ((zzvs) zzyg.i(j12, obj)).zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwg
    public final void b(Object obj, long j12, Object obj2) {
        zzvs zzvsVarZzd = (zzvs) zzyg.i(j12, obj);
        zzvs zzvsVar = (zzvs) zzyg.i(j12, obj2);
        int size = zzvsVarZzd.size();
        int size2 = zzvsVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzvsVarZzd.zzc()) {
                zzvsVarZzd = zzvsVarZzd.zzd(size2 + size);
            }
            zzvsVarZzd.addAll(zzvsVar);
        }
        if (size > 0) {
            zzvsVar = zzvsVarZzd;
        }
        zzyg.p(obj, j12, zzvsVar);
    }

    public zzwe() {
        super(null);
    }
}
