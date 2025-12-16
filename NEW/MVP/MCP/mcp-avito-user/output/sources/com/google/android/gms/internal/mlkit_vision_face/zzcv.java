package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzcv implements d {
    public static final /* synthetic */ zzcv zza = new zzcv();

    private /* synthetic */ zzcv() {
    }

    @Override // com.google.firebase.encoders.d
    public final void encode(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        e eVar = (e) obj2;
        Charset charset = zzcw.f353031f;
        eVar.add(zzcw.f353032g, entry.getKey());
        eVar.add(zzcw.f353033h, entry.getValue());
    }
}
