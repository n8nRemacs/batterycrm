package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzaj implements d {
    public static final /* synthetic */ zzaj zza = new zzaj();

    private /* synthetic */ zzaj() {
    }

    @Override // com.google.firebase.encoders.d
    public final void encode(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        e eVar = (e) obj2;
        Charset charset = zzak.f352585f;
        eVar.add(zzak.f352586g, entry.getKey());
        eVar.add(zzak.f352587h, entry.getValue());
    }
}
