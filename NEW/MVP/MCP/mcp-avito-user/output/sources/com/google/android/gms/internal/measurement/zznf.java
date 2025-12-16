package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public enum zznf {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzhu.zza),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: b, reason: collision with root package name */
    public final Serializable f351010b;

    zznf(Serializable serializable) {
        this.f351010b = serializable;
    }
}
