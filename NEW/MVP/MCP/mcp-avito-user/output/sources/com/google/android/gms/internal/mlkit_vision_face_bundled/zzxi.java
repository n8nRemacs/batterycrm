package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxi extends zzxs {
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxs
    public final void zza() {
        if (!zzj()) {
            for (int i12 = 0; i12 < zzb(); i12++) {
                Map.Entry entryZzg = zzg(i12);
                ((zzvc) entryZzg.getKey()).zze();
                entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
            }
            for (Map.Entry entry : zzc()) {
                ((zzvc) entry.getKey()).zze();
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        super.zza();
    }
}
