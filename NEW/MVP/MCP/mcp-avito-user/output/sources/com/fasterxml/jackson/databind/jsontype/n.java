package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.jsontype.impl.q;
import com.fasterxml.jackson.databind.jsontype.impl.t;
import com.fasterxml.jackson.databind.jsontype.n;
import com.fasterxml.jackson.databind.z;
import java.util.Collection;

/* compiled from: TypeResolverBuilder.java */
/* loaded from: classes4.dex */
public interface n<T extends n<T>> {
    t a(z zVar, com.fasterxml.jackson.databind.h hVar, Collection collection);

    Class<?> b();

    q c(com.fasterxml.jackson.databind.e eVar, com.fasterxml.jackson.databind.h hVar, Collection collection);

    com.fasterxml.jackson.databind.jsontype.impl.o d(JsonTypeInfo.Id id2, m mVar);

    com.fasterxml.jackson.databind.jsontype.impl.o e(Class cls);

    default T f(Class<?> cls) {
        return e(cls);
    }
}
