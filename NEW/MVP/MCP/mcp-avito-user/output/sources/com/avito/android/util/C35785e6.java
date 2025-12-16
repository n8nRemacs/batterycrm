package com.avito.android.util;

import androidx.compose.runtime.C22026a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.e6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35785e6 {
    @Y61.k
    public static final String a(@Y61.k Type type) {
        if (type instanceof Class) {
            return ((Class) type).getSimpleName();
        }
        if (!(type instanceof ParameterizedType)) {
            return type.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        ParameterizedType parameterizedType = (ParameterizedType) type;
        sb2.append(a(parameterizedType.getRawType()));
        sb2.append('<');
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type type2 = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
        return C22026a.c(sb2, type2 != null ? a(type2) : null, '>');
    }
}
