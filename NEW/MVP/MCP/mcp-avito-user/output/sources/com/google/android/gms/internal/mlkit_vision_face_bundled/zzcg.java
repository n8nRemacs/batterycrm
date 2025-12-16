package com.google.android.gms.internal.mlkit_vision_face_bundled;

import j.N;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzcg {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f353538a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f353539b;

    /* renamed from: c, reason: collision with root package name */
    public final zzce f353540c;

    public zzcg(HashMap map, HashMap map2, zzce zzceVar) {
        this.f353538a = map;
        this.f353539b = map2;
        this.f353540c = zzceVar;
    }

    @N
    public final byte[] zza(@N Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzcd(byteArrayOutputStream, this.f353538a, this.f353539b, this.f353540c).f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
