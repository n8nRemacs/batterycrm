package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzbo implements d {
    public static final /* synthetic */ zzbo zza = new zzbo();

    private /* synthetic */ zzbo() {
    }

    @Override // com.google.firebase.encoders.d
    public final void encode(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        e eVar = (e) obj2;
        Charset charset = zzbp.f351221f;
        eVar.add(zzbp.f351222g, entry.getKey());
        eVar.add(zzbp.f351223h, entry.getValue());
    }
}
