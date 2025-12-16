package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.Serializable;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public enum zzvw {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(zzul.class, zzul.zzb),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: b, reason: collision with root package name */
    public final Class f354071b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f354072c;

    zzvw(Class cls, Serializable serializable) {
        this.f354071b = cls;
        this.f354072c = serializable;
    }

    public final Class zza() {
        return this.f354071b;
    }
}
