package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes6.dex */
class p implements y<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Type f362152a;

    public p(Type type) {
        this.f362152a = type;
    }

    @Override // com.google.gson.internal.y
    public final Object a() {
        Type type = this.f362152a;
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }
}
