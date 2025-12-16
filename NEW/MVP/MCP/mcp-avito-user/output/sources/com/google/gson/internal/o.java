package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes6.dex */
class o implements y<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Type f362151a;

    public o(Type type) {
        this.f362151a = type;
    }

    @Override // com.google.gson.internal.y
    public final Object a() {
        Type type = this.f362151a;
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }
}
