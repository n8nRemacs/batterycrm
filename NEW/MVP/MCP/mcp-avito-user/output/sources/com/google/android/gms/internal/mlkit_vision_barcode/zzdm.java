package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzdm implements d {
    public static final /* synthetic */ zzdm zza = new zzdm();

    private /* synthetic */ zzdm() {
    }

    @Override // com.google.firebase.encoders.d
    public final void encode(Object obj, Object obj2) {
        zzdm zzdmVar = zzdn.f351854d;
        String strValueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new EncodingException(strValueOf.length() != 0 ? "Couldn't find encoder for type ".concat(strValueOf) : new String("Couldn't find encoder for type "));
    }
}
