package sX0;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.jsontype.o;
import com.fasterxml.jackson.databind.ser.s;
import com.fasterxml.jackson.databind.ser.std.C36482h;
import com.fasterxml.jackson.databind.ser.std.M;
import com.fasterxml.jackson.databind.ser.std.Q;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* compiled from: CoreXMLSerializers.java */
/* renamed from: sX0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48120b extends s.a {

    /* compiled from: CoreXMLSerializers.java */
    /* renamed from: sX0.b$a */
    public static class a extends M<XMLGregorianCalendar> implements com.fasterxml.jackson.databind.ser.j {

        /* renamed from: e, reason: collision with root package name */
        public static final a f437696e = new a();

        /* renamed from: d, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.l<Object> f437697d;

        public a() {
            this(C36482h.f342378g);
        }

        @Override // com.fasterxml.jackson.databind.ser.j
        public final com.fasterxml.jackson.databind.l<?> a(A a12, com.fasterxml.jackson.databind.c cVar) {
            com.fasterxml.jackson.databind.l<?> lVar = this.f437697d;
            com.fasterxml.jackson.databind.l<?> lVarA = a12.A(lVar, cVar);
            return lVarA != lVar ? new a(lVarA) : this;
        }

        @Override // com.fasterxml.jackson.databind.l
        public final boolean d(A a12, Object obj) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            return this.f437697d.d(a12, xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar());
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, A a12) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            this.f437697d.f(xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar(), jsonGenerator, a12);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void g(Object obj, JsonGenerator jsonGenerator, A a12, o oVar) {
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            WritableTypeId writableTypeIdD = oVar.d(JsonToken.VALUE_STRING, xMLGregorianCalendar);
            writableTypeIdD.f341265b = XMLGregorianCalendar.class;
            WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, writableTypeIdD);
            this.f437697d.f(xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar(), jsonGenerator, a12);
            oVar.f(jsonGenerator, writableTypeIdE);
        }

        public a(com.fasterxml.jackson.databind.l<?> lVar) {
            super(XMLGregorianCalendar.class);
            this.f437697d = lVar;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.s.a, com.fasterxml.jackson.databind.ser.s
    public final com.fasterxml.jackson.databind.l b(com.fasterxml.jackson.databind.h hVar) {
        Class<?> cls = hVar.f341930b;
        if (Duration.class.isAssignableFrom(cls) || QName.class.isAssignableFrom(cls)) {
            return Q.f342354d;
        }
        if (XMLGregorianCalendar.class.isAssignableFrom(cls)) {
            return a.f437696e;
        }
        return null;
    }
}
