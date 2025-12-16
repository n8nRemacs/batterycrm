package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public abstract class zzcj<MessageType extends zzck<MessageType, BuilderType>, BuilderType extends zzcj<MessageType, BuilderType>> implements zzfk {
    public abstract zzdw a(zzck zzckVar);

    @Override // 
    public abstract zzcj zze();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public final /* bridge */ /* synthetic */ zzfk zzg(zzfl zzflVar) {
        if (zzX().getClass().isInstance(zzflVar)) {
            return a((zzck) zzflVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
