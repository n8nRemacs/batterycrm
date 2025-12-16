package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.Serializable;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public enum zzeo {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(zzdb.class, zzdb.zzb),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: b, reason: collision with root package name */
    public final Class f352451b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f352452c;

    zzeo(Class cls, Serializable serializable) {
        this.f352451b = cls;
        this.f352452c = serializable;
    }

    public final Class zza() {
        return this.f352451b;
    }
}
