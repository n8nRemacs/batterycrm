package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzdk implements d {
    public static final /* synthetic */ zzdk zza = new zzdk();

    private /* synthetic */ zzdk() {
    }

    @Override // com.google.firebase.encoders.d
    public final void encode(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        e eVar = (e) obj2;
        Charset charset = zzdl.f351845f;
        eVar.add(zzdl.f351846g, entry.getKey());
        eVar.add(zzdl.f351847h, entry.getValue());
    }
}
