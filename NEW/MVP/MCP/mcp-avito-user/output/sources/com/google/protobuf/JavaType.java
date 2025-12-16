package com.google.protobuf;

import java.io.Serializable;

/* loaded from: classes7.dex */
public enum JavaType {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC37700t.class, AbstractC37700t.f362954c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: b, reason: collision with root package name */
    public final Serializable f362707b;

    JavaType(Class cls, Serializable serializable) {
        this.f362707b = serializable;
    }
}
