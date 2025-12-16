package com.fasterxml.jackson.databind;

import com.akita.compose.theme.re23.style.C0;
import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.annotation.I;
import com.fasterxml.jackson.databind.introspect.D;
import com.fasterxml.jackson.databind.util.i;

/* compiled from: DatabindContext.java */
/* loaded from: classes4.dex */
public abstract class d {
    public static String a(String str, String str2) {
        return str2 == null ? str : androidx.appcompat.app.r.r(str, ": ", str2);
    }

    public static String b(String str) {
        if (str == null) {
            return "[N/A]";
        }
        if (str.length() > 500) {
            str = str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
        }
        return AK.c.k("\"", str, "\"");
    }

    public final com.fasterxml.jackson.databind.util.i c(Object obj) {
        if (obj instanceof com.fasterxml.jackson.databind.util.i) {
            return (com.fasterxml.jackson.databind.util.i) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == i.a.class || com.fasterxml.jackson.databind.util.g.v(cls)) {
            return null;
        }
        if (!com.fasterxml.jackson.databind.util.i.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(C0.f(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        com.fasterxml.jackson.databind.cfg.l<?> lVarD = d();
        lVarD.f341506c.getClass();
        return (com.fasterxml.jackson.databind.util.i) com.fasterxml.jackson.databind.util.g.h(lVarD.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), cls);
    }

    public abstract com.fasterxml.jackson.databind.cfg.l<?> d();

    public abstract com.fasterxml.jackson.databind.type.n e();

    public final G f(D d12) {
        com.fasterxml.jackson.databind.cfg.l<?> lVarD = d();
        lVarD.f341506c.getClass();
        return ((G) com.fasterxml.jackson.databind.util.g.h(lVarD.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), d12.f341941b)).b(d12.f341943d);
    }

    public final I g(D d12) {
        com.fasterxml.jackson.databind.cfg.l<?> lVarD = d();
        lVarD.f341506c.getClass();
        return (I) com.fasterxml.jackson.databind.util.g.h(lVarD.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), d12.f341942c);
    }

    public final <T> T h(Class<?> cls, String str) {
        if (cls != null) {
            e().l(cls);
        }
        i(str);
        throw null;
    }

    public abstract Object i(String str);
}
