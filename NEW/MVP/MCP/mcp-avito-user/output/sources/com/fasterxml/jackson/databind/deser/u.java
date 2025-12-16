package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36469h;
import com.fasterxml.jackson.databind.introspect.C36472k;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: SettableAnyProperty.java */
/* loaded from: classes4.dex */
public class u implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final c.b f341885b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC36471j f341886c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f341887d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341888e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<Object> f341889f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.l f341890g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.m f341891h;

    /* compiled from: SettableAnyProperty.java */
    public static class a extends z.a {

        /* renamed from: b, reason: collision with root package name */
        public final u f341892b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f341893c;

        /* renamed from: d, reason: collision with root package name */
        public final String f341894d;

        public a(u uVar, UnresolvedForwardReference unresolvedForwardReference, Object obj, String str) {
            super(unresolvedForwardReference);
            this.f341892b = uVar;
            this.f341893c = obj;
            this.f341894d = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.z.a
        public final void a(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
            if (obj.equals(this.f341700a.f341520f.f341697b.f340903d)) {
                this.f341892b.c(this.f341893c, this.f341894d, obj2);
            } else {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
            }
        }
    }

    public u(c.b bVar, AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.m mVar, com.fasterxml.jackson.databind.i iVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        this.f341885b = bVar;
        this.f341886c = abstractC36471j;
        this.f341888e = hVar;
        this.f341889f = iVar;
        this.f341890g = lVar;
        this.f341891h = mVar;
        this.f341887d = abstractC36471j instanceof C36469h;
    }

    public final Object a(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
        boolean zY2 = jsonParser.Y(JsonToken.VALUE_NULL);
        com.fasterxml.jackson.databind.i<Object> iVar = this.f341889f;
        if (zY2) {
            return iVar.d(fVar);
        }
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341890g;
        return lVar != null ? iVar.g(jsonParser, fVar, lVar) : iVar.e(jsonParser, fVar);
    }

    public final void b(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj, String str) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        try {
            com.fasterxml.jackson.databind.m mVar = this.f341891h;
            c(obj, mVar == null ? str : mVar.a(fVar, str), a(jsonParser, fVar));
        } catch (UnresolvedForwardReference e12) {
            if (this.f341889f.n() == null) {
                throw new JsonMappingException(jsonParser, "Unresolved forward reference but no identity info.", e12);
            }
            e12.f341520f.a(new a(this, e12, obj, str));
        }
    }

    public final void c(Object obj, Object obj2, Object obj3) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        AbstractC36471j abstractC36471j = this.f341886c;
        try {
            if (!this.f341887d) {
                ((C36472k) abstractC36471j).f342054e.invoke(obj, obj2, obj3);
            } else {
                Map map = (Map) ((C36469h) abstractC36471j).l(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                }
            }
        } catch (Exception e12) {
            if (!(e12 instanceof IllegalArgumentException)) {
                com.fasterxml.jackson.databind.util.g.E(e12);
                com.fasterxml.jackson.databind.util.g.F(e12);
                Throwable thS = com.fasterxml.jackson.databind.util.g.s(e12);
                throw new JsonMappingException((Closeable) null, com.fasterxml.jackson.databind.util.g.i(thS), thS);
            }
            String strF = com.fasterxml.jackson.databind.util.g.f(obj3);
            StringBuilder sb2 = new StringBuilder("Problem deserializing \"any\" property '");
            sb2.append(obj2);
            sb2.append("' of class " + abstractC36471j.h().getName() + " (expected type: ");
            sb2.append(this.f341888e);
            sb2.append("; actual type: ");
            sb2.append(strF);
            sb2.append(")");
            String strI = com.fasterxml.jackson.databind.util.g.i(e12);
            if (strI != null) {
                sb2.append(", problem: ");
                sb2.append(strI);
            } else {
                sb2.append(" (no error message provided)");
            }
            throw new JsonMappingException((Closeable) null, sb2.toString(), e12);
        }
    }

    public Object readResolve() {
        if (this.f341886c.b() != null) {
            return this;
        }
        throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
    }

    public final String toString() {
        return "[any property on class " + this.f341886c.h().getName() + "]";
    }
}
