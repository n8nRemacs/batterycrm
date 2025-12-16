package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.util.C;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import rX0.InterfaceC47610a;

/* compiled from: StdKeyDeserializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class D extends com.fasterxml.jackson.databind.m implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f341719b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f341720c;

    /* renamed from: d, reason: collision with root package name */
    public final p<?> f341721d;

    /* compiled from: StdKeyDeserializer.java */
    public static final class a extends com.fasterxml.jackson.databind.m implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f341722b;

        /* renamed from: c, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.i<?> f341723c;

        public a(Class<?> cls, com.fasterxml.jackson.databind.i<?> iVar) {
            this.f341722b = cls;
            this.f341723c = iVar;
        }

        @Override // com.fasterxml.jackson.databind.m
        public final Object a(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidFormatException {
            Class<?> cls = this.f341722b;
            if (str == null) {
                return null;
            }
            com.fasterxml.jackson.databind.util.C cK2 = fVar.k(fVar.f341924g);
            cK2.i0(str);
            try {
                C.b bVarX0 = cK2.x0(cK2.f342543c);
                bVarX0.g0();
                Object objE = this.f341723c.e(bVarX0, fVar);
                if (objE != null) {
                    return objE;
                }
                fVar.G(cls, str, "not a valid representation", new Object[0]);
                throw null;
            } catch (Exception e12) {
                fVar.G(cls, str, "not a valid representation: %s", e12.getMessage());
                throw null;
            }
        }
    }

    /* compiled from: StdKeyDeserializer.java */
    @InterfaceC47610a
    public static final class b extends D {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.util.j f341724e;

        /* renamed from: f, reason: collision with root package name */
        public final C36472k f341725f;

        /* renamed from: g, reason: collision with root package name */
        public com.fasterxml.jackson.databind.util.j f341726g;

        /* renamed from: h, reason: collision with root package name */
        public final Enum<?> f341727h;

        public b(com.fasterxml.jackson.databind.util.j jVar, C36472k c36472k) {
            super(-1, jVar.f342612b, null);
            this.f341724e = jVar;
            this.f341725f = c36472k;
            this.f341727h = jVar.f342615e;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.D
        public final Object b(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidFormatException {
            com.fasterxml.jackson.databind.util.j jVarC;
            C36472k c36472k = this.f341725f;
            if (c36472k != null) {
                try {
                    return c36472k.r(str);
                } catch (Exception e12) {
                    Throwable thS = com.fasterxml.jackson.databind.util.g.s(e12);
                    String message = thS.getMessage();
                    com.fasterxml.jackson.databind.util.g.F(thS);
                    com.fasterxml.jackson.databind.util.g.D(thS);
                    throw new IllegalArgumentException(message, thS);
                }
            }
            if (fVar.O(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
                jVarC = this.f341726g;
                if (jVarC == null) {
                    synchronized (this) {
                        jVarC = com.fasterxml.jackson.databind.util.j.c(fVar.f341921d, this.f341724e.f342612b);
                        this.f341726g = jVarC;
                    }
                }
            } else {
                jVarC = this.f341724e;
            }
            HashMap<String, Enum<?>> map = jVarC.f342614d;
            Enum<?> value = map.get(str);
            if (value == null && jVarC.f342616f) {
                Iterator<Map.Entry<String, Enum<?>>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        value = null;
                        break;
                    }
                    Map.Entry<String, Enum<?>> next = it.next();
                    if (str.equalsIgnoreCase(next.getKey())) {
                        value = next.getValue();
                        break;
                    }
                }
            }
            if (value != null) {
                return value;
            }
            if (this.f341727h != null && fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.f341727h;
            }
            if (fVar.O(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return value;
            }
            fVar.G(this.f341720c, str, "not one of the values accepted for Enum class: %s", jVarC.f342614d.keySet());
            throw null;
        }
    }

    /* compiled from: StdKeyDeserializer.java */
    public static final class c extends D {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final Constructor<?> f341728e;

        public c(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass(), null);
            this.f341728e = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.D
        public final Object b(com.fasterxml.jackson.databind.f fVar, String str) {
            return this.f341728e.newInstance(str);
        }
    }

    /* compiled from: StdKeyDeserializer.java */
    public static final class d extends D {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final Method f341729e;

        public d(Method method) {
            super(-1, method.getDeclaringClass(), null);
            this.f341729e = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.D
        public final Object b(com.fasterxml.jackson.databind.f fVar, String str) {
            return this.f341729e.invoke(null, str);
        }
    }

    public D() {
        throw null;
    }

    public D(int i12, Class<?> cls, p<?> pVar) {
        this.f341719b = i12;
        this.f341720c = cls;
        this.f341721d = pVar;
    }

    @Override // com.fasterxml.jackson.databind.m
    public Object a(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidFormatException {
        Class<?> cls = this.f341720c;
        if (str == null) {
            return null;
        }
        try {
            Object objB = b(fVar, str);
            if (objB != null) {
                return objB;
            }
            Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
            if (Enum.class.isAssignableFrom(cls) && fVar.f341921d.p(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            fVar.G(cls, str, "not a valid representation", new Object[0]);
            throw null;
        } catch (Exception e12) {
            fVar.G(cls, str, "not a valid representation, problem: (%s) %s", e12.getClass().getName(), com.fasterxml.jackson.databind.util.g.i(e12));
            throw null;
        }
    }

    public Object b(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidFormatException, NumberFormatException {
        int i12 = this.f341719b;
        p<?> pVar = this.f341721d;
        Class<?> cls = this.f341720c;
        switch (i12) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                fVar.G(cls, str, "value not 'true' or 'false'", new Object[0]);
                throw null;
            case 2:
                int i13 = Integer.parseInt(str);
                if (i13 >= -128 && i13 <= 255) {
                    return Byte.valueOf((byte) i13);
                }
                fVar.G(cls, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                throw null;
            case 3:
                int i14 = Integer.parseInt(str);
                if (i14 >= -32768 && i14 <= 32767) {
                    return Short.valueOf((short) i14);
                }
                fVar.G(cls, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                throw null;
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                fVar.G(cls, str, "can only convert 1-character Strings", new Object[0]);
                throw null;
            case 5:
                return Integer.valueOf(Integer.parseInt(str));
            case 6:
                return Long.valueOf(Long.parseLong(str));
            case 7:
                return Float.valueOf((float) com.fasterxml.jackson.core.io.j.a(str));
            case 8:
                return Double.valueOf(com.fasterxml.jackson.core.io.j.a(str));
            case 9:
                try {
                    return pVar.q0(fVar, str);
                } catch (IllegalArgumentException e12) {
                    c(fVar, str, e12);
                    throw null;
                }
            case 10:
                return fVar.R(str);
            case 11:
                Date dateR = fVar.R(str);
                Calendar calendar = Calendar.getInstance(fVar.f341921d.h());
                calendar.setTime(dateR);
                return calendar;
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e13) {
                    c(fVar, str, e13);
                    throw null;
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e14) {
                    c(fVar, str, e14);
                    throw null;
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e15) {
                    c(fVar, str, e15);
                    throw null;
                }
            case 15:
                try {
                    fVar.e().getClass();
                    return com.fasterxml.jackson.databind.type.n.m(str);
                } catch (Exception unused) {
                    fVar.G(cls, str, "unable to parse key as Class", new Object[0]);
                    throw null;
                }
            case 16:
                try {
                    return pVar.q0(fVar, str);
                } catch (IllegalArgumentException e16) {
                    c(fVar, str, e16);
                    throw null;
                }
            case 17:
                try {
                    Base64Variant base64Variant = fVar.f341921d.f341506c.f341481i;
                    base64Variant.getClass();
                    com.fasterxml.jackson.core.util.c cVar = new com.fasterxml.jackson.core.util.c();
                    base64Variant.b(str, cVar);
                    return cVar.g();
                } catch (IllegalArgumentException e17) {
                    c(fVar, str, e17);
                    throw null;
                }
            default:
                throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Internal error: unknown key type "));
        }
    }

    public final void c(com.fasterxml.jackson.databind.f fVar, String str, Exception exc) throws InvalidFormatException {
        fVar.G(this.f341720c, str, "problem: %s", com.fasterxml.jackson.databind.util.g.i(exc));
        throw null;
    }

    /* compiled from: StdKeyDeserializer.java */
    @InterfaceC47610a
    public static final class e extends D {

        /* renamed from: e, reason: collision with root package name */
        public static final e f341730e = new e(String.class);

        /* renamed from: f, reason: collision with root package name */
        public static final e f341731f = new e(Object.class);
        private static final long serialVersionUID = 1;

        public e(Class<?> cls) {
            super(-1, cls, null);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.D, com.fasterxml.jackson.databind.m
        public final Object a(com.fasterxml.jackson.databind.f fVar, String str) {
            return str;
        }
    }
}
