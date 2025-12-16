package com.avito.android.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: Reflection.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.y4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35983y4 {
    @Y61.l
    public static final Type a(@Y61.k Type type) {
        Type type2;
        if (!(type instanceof ParameterizedType) || (type2 = ((ParameterizedType) type).getActualTypeArguments()[0]) == null) {
            return null;
        }
        return type2;
    }

    public static final boolean b(@Y61.k Class cls) {
        if (c(cls.getAnnotations(), com.avito.android.gson.d.class)) {
            return true;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && b(superclass)) {
            return true;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (b(cls2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(@Y61.k Annotation[] annotationArr, @Y61.k Class<?> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isAssignableFrom(annotation.getClass())) {
                return true;
            }
        }
        return false;
    }
}
