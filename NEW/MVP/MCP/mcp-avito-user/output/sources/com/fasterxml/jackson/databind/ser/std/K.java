package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/* compiled from: StdKeySerializers.java */
/* loaded from: classes4.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final d f342348a;

    /* compiled from: StdKeySerializers.java */
    public static class a extends M<Object> {

        /* renamed from: d, reason: collision with root package name */
        public final int f342349d;

        public a(Class cls, int i12) {
            super(cls, 0);
            this.f342349d = i12;
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            String strValueOf;
            switch (this.f342349d) {
                case 1:
                    Date date = (Date) obj;
                    a12.getClass();
                    if (!a12.f341330b.p(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                        jsonGenerator.G(a12.m().format(date));
                        break;
                    } else {
                        jsonGenerator.G(String.valueOf(date.getTime()));
                        break;
                    }
                case 2:
                    long timeInMillis = ((Calendar) obj).getTimeInMillis();
                    a12.getClass();
                    if (!a12.f341330b.p(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                        jsonGenerator.G(a12.m().format(new Date(timeInMillis)));
                        break;
                    } else {
                        jsonGenerator.G(String.valueOf(timeInMillis));
                        break;
                    }
                case 3:
                    jsonGenerator.G(((Class) obj).getName());
                    break;
                case 4:
                    if (a12.f341330b.p(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        strValueOf = obj.toString();
                    } else {
                        Enum r42 = (Enum) obj;
                        strValueOf = a12.f341330b.p(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r42.ordinal()) : r42.name();
                    }
                    jsonGenerator.G(strValueOf);
                    break;
                case 5:
                case 6:
                    jsonGenerator.D(((Number) obj).longValue());
                    break;
                case 7:
                    jsonGenerator.G(a12.f341330b.f341506c.f341481i.e((byte[]) obj));
                    break;
                default:
                    jsonGenerator.G(obj.toString());
                    break;
            }
        }
    }

    /* compiled from: StdKeySerializers.java */
    public static class b extends M<Object> {

        /* renamed from: d, reason: collision with root package name */
        public transient com.fasterxml.jackson.databind.ser.impl.k f342350d;

        public b() {
            super(String.class, 0);
            this.f342350d = com.fasterxml.jackson.databind.ser.impl.k.a();
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            Class<?> cls = obj.getClass();
            com.fasterxml.jackson.databind.ser.impl.k kVar = this.f342350d;
            com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
            if (lVarD == null) {
                if (cls == Object.class) {
                    lVarD = new a(cls, 8);
                    this.f342350d = kVar.c(cls, lVarD);
                } else {
                    lVarD = a12.r(a12.f341330b.c(cls), null);
                    com.fasterxml.jackson.databind.ser.impl.k kVarC = kVar.c(cls, lVarD);
                    if (kVar != kVarC) {
                        this.f342350d = kVarC;
                    }
                }
            }
            lVarD.f(obj, jsonGenerator, a12);
        }

        public Object readResolve() {
            this.f342350d = com.fasterxml.jackson.databind.ser.impl.k.a();
            return this;
        }
    }

    /* compiled from: StdKeySerializers.java */
    public static class c extends M<Object> {

        /* renamed from: d, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.util.k f342351d;

        public c(Class<?> cls, com.fasterxml.jackson.databind.util.k kVar) {
            super(cls, 0);
            this.f342351d = kVar;
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            if (a12.f341330b.p(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.G(obj.toString());
                return;
            }
            Enum r32 = (Enum) obj;
            if (a12.f341330b.p(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.G(String.valueOf(r32.ordinal()));
            } else {
                jsonGenerator.F(this.f342351d.f342619c[r32.ordinal()]);
            }
        }
    }

    /* compiled from: StdKeySerializers.java */
    public static class d extends M<Object> {
        public d() {
            super(String.class, 0);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.G((String) obj);
        }
    }

    static {
        new J();
        f342348a = new d();
    }

    public static M a(Class cls) {
        if (cls == null || cls == Object.class) {
            return new b();
        }
        if (cls == String.class) {
            return f342348a;
        }
        if (cls.isPrimitive()) {
            cls = com.fasterxml.jackson.databind.util.g.H(cls);
        }
        if (cls == Integer.class) {
            return new a(cls, 5);
        }
        if (cls == Long.class) {
            return new a(cls, 6);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new a(cls, 8);
        }
        if (cls == Class.class) {
            return new a(cls, 3);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new a(cls, 1);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new a(cls, 2);
        }
        if (cls == UUID.class) {
            return new a(cls, 8);
        }
        if (cls == byte[].class) {
            return new a(cls, 7);
        }
        return null;
    }
}
