package sX0;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.q;
import com.fasterxml.jackson.databind.deser.std.p;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* compiled from: CoreXMLDeserializers.java */
/* renamed from: sX0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48119a extends q.a {

    /* renamed from: b, reason: collision with root package name */
    public static final DatatypeFactory f437694b;

    /* compiled from: CoreXMLDeserializers.java */
    /* renamed from: sX0.a$a, reason: collision with other inner class name */
    public static class C12618a extends p<Object> {
        private static final long serialVersionUID = 1;

        /* renamed from: f, reason: collision with root package name */
        public final int f437695f;

        public C12618a(Class<?> cls, int i12) {
            super(cls);
            this.f437695f = i12;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p, com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            if (this.f437695f != 2 || !jsonParser.Y(JsonToken.VALUE_NUMBER_INT)) {
                return super.e(jsonParser, fVar);
            }
            Date dateR = R(jsonParser, fVar);
            if (dateR == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(dateR);
            TimeZone timeZoneH = fVar.f341921d.h();
            if (timeZoneH != null) {
                gregorianCalendar.setTimeZone(timeZoneH);
            }
            return C48119a.f437694b.newXMLGregorianCalendar(gregorianCalendar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p
        public final Object q0(com.fasterxml.jackson.databind.f fVar, String str) {
            int i12 = this.f437695f;
            if (i12 == 1) {
                return C48119a.f437694b.newDuration(str);
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    return QName.valueOf(str);
                }
                throw new IllegalStateException();
            }
            try {
                Date dateS = S(fVar, str);
                if (dateS == null) {
                    return null;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(dateS);
                TimeZone timeZoneH = fVar.f341921d.h();
                if (timeZoneH != null) {
                    gregorianCalendar.setTimeZone(timeZoneH);
                }
                return C48119a.f437694b.newXMLGregorianCalendar(gregorianCalendar);
            } catch (JsonMappingException unused) {
                return C48119a.f437694b.newXMLGregorianCalendar(str);
            }
        }
    }

    static {
        try {
            f437694b = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.q.a, com.fasterxml.jackson.databind.deser.q
    public final com.fasterxml.jackson.databind.i a(com.fasterxml.jackson.databind.h hVar) {
        Class<?> cls = hVar.f341930b;
        if (cls == QName.class) {
            return new C12618a(cls, 3);
        }
        if (cls == XMLGregorianCalendar.class) {
            return new C12618a(cls, 2);
        }
        if (cls == Duration.class) {
            return new C12618a(cls, 1);
        }
        return null;
    }
}
