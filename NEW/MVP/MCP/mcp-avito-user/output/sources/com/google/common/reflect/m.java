package com.google.common.reflect;

import com.google.common.base.M;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeCapture.java */
@InterfaceC37524c
/* loaded from: classes6.dex */
abstract class m<T> {
    public final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        M.f("%s isn't parameterized", genericSuperclass instanceof ParameterizedType, genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
