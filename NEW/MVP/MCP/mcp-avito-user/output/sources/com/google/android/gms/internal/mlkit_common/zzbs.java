package com.google.android.gms.internal.mlkit_common;

import j.N;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzbs {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f351234a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f351235b;

    /* renamed from: c, reason: collision with root package name */
    public final zzbq f351236c;

    public zzbs(HashMap map, HashMap map2, zzbq zzbqVar) {
        this.f351234a = map;
        this.f351235b = map2;
        this.f351236c = zzbqVar;
    }

    @N
    public final byte[] zza(@N Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbp(byteArrayOutputStream, this.f351234a, this.f351235b, this.f351236c).f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
