package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzln extends zzlo {
    @Override // com.google.android.gms.internal.measurement.zzlo
    public final void zza() {
        if (!zze()) {
            for (int i12 = 0; i12 < zzb(); i12++) {
                Map.Entry entryZzb = zzb(i12);
                if (((zzja) entryZzb.getKey()).zze()) {
                    entryZzb.setValue(Collections.unmodifiableList((List) entryZzb.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzja) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
