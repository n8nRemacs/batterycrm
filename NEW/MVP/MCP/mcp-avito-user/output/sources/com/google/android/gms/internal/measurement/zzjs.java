package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public enum zzjs {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(zzhu.class, zzhu.zza),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f350901b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f350902c;

    zzjs(Class cls, Serializable serializable) {
        this.f350901b = cls;
        this.f350902c = serializable;
    }

    public final Class<?> zza() {
        return this.f350901b;
    }
}
