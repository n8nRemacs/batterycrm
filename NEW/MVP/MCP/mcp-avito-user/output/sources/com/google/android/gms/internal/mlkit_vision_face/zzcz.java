package com.google.android.gms.internal.mlkit_vision_face;

import j.N;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzcz {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f353044a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f353045b;

    /* renamed from: c, reason: collision with root package name */
    public final zzcx f353046c;

    public zzcz(HashMap map, HashMap map2, zzcx zzcxVar) {
        this.f353044a = map;
        this.f353045b = map2;
        this.f353046c = zzcxVar;
    }

    @N
    public final byte[] zza(@N Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzcw(byteArrayOutputStream, this.f353044a, this.f353045b, this.f353046c).f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
