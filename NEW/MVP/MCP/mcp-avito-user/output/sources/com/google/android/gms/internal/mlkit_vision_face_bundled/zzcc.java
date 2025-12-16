package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzcc implements d {
    public static final /* synthetic */ zzcc zza = new zzcc();

    private /* synthetic */ zzcc() {
    }

    @Override // com.google.firebase.encoders.d
    public final void encode(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        e eVar = (e) obj2;
        Charset charset = zzcd.f353525f;
        eVar.add(zzcd.f353526g, entry.getKey());
        eVar.add(zzcd.f353527h, entry.getValue());
    }
}
