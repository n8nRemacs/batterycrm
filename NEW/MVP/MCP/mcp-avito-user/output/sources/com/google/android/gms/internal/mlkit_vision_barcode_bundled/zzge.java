package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzge extends zzgl {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl
    public final void zza() {
        if (!zzj()) {
            for (int i12 = 0; i12 < zzb(); i12++) {
                ((zzdr) zzg(i12).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzdr) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
