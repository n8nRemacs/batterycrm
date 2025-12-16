package com.google.android.gms.internal.mlkit_vision_common;

import j.N;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzan {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f352598a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f352599b;

    /* renamed from: c, reason: collision with root package name */
    public final zzal f352600c;

    public zzan(HashMap map, HashMap map2, zzal zzalVar) {
        this.f352598a = map;
        this.f352599b = map2;
        this.f352600c = zzalVar;
    }

    @N
    public final byte[] zza(@N Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzak(byteArrayOutputStream, this.f352598a, this.f352599b, this.f352600c).f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
