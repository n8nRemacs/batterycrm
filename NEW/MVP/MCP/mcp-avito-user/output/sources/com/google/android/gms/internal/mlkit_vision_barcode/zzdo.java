package com.google.android.gms.internal.mlkit_vision_barcode;

import j.N;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzdo {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f351858a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f351859b;

    /* renamed from: c, reason: collision with root package name */
    public final zzdm f351860c;

    public zzdo(HashMap map, HashMap map2, zzdm zzdmVar) {
        this.f351858a = map;
        this.f351859b = map2;
        this.f351860c = zzdmVar;
    }

    @N
    public final byte[] zza(@N Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzdl(byteArrayOutputStream, this.f351858a, this.f351859b, this.f351860c).f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
