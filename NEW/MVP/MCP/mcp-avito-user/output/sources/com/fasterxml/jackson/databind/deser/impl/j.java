package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.C36467f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: InnerClassProperty.java */
/* loaded from: classes4.dex */
public final class j extends v.a {
    private static final long serialVersionUID = 1;

    /* renamed from: p, reason: collision with root package name */
    public final transient Constructor<?> f341646p;

    /* renamed from: q, reason: collision with root package name */
    public final C36467f f341647q;

    public j(com.fasterxml.jackson.databind.deser.v vVar, Constructor<?> constructor) {
        super(vVar);
        this.f341646p = constructor;
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a
    public final com.fasterxml.jackson.databind.deser.v F(com.fasterxml.jackson.databind.deser.v vVar) {
        return vVar == this.f341906o ? this : new j(vVar, this.f341646p);
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IllegalAccessException, InvalidDefinitionException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objG;
        Constructor<?> constructor = this.f341646p;
        JsonToken jsonTokenF = jsonParser.f();
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341899g;
        if (jsonTokenF == jsonToken) {
            objG = iVar.d(fVar);
        } else {
            com.fasterxml.jackson.databind.jsontype.l lVar = this.f341900h;
            if (lVar != null) {
                objG = iVar.g(jsonParser, fVar, lVar);
            } else {
                try {
                    Object objNewInstance = constructor.newInstance(obj);
                    iVar.f(jsonParser, fVar, objNewInstance);
                    objG = objNewInstance;
                } catch (Exception e12) {
                    String strN = androidx.compose.ui.graphics.colorspace.e.n("Failed to instantiate class ", constructor.getDeclaringClass().getName(), ", problem: ", e12.getMessage());
                    Throwable thS = com.fasterxml.jackson.databind.util.g.s(e12);
                    com.fasterxml.jackson.databind.util.g.F(thS);
                    com.fasterxml.jackson.databind.util.g.D(thS);
                    throw new IllegalArgumentException(strN, thS);
                }
            }
        }
        z(obj, objG);
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        return this.f341906o.A(obj, g(jsonParser, fVar));
    }

    public Object readResolve() {
        return new j(this, this.f341647q);
    }

    public Object writeReplace() {
        return this.f341647q == null ? new j(this, new C36467f(null, this.f341646p, null, null)) : this;
    }

    public j(j jVar, C36467f c36467f) {
        super(jVar);
        this.f341647q = c36467f;
        Constructor<?> constructor = c36467f == null ? null : c36467f.f342035e;
        this.f341646p = constructor;
        if (constructor == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }
}
