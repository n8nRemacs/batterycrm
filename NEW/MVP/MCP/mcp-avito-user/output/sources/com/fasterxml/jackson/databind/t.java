package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Closeable;
import java.io.Serializable;
import java.io.Writer;
import java.lang.annotation.Annotation;
import oX0.AbstractC44703c;
import oX0.C44711k;

/* compiled from: ObjectWriter.java */
/* loaded from: classes4.dex */
public class t implements com.fasterxml.jackson.core.r, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final com.fasterxml.jackson.core.util.m f342424g = new com.fasterxml.jackson.core.util.m();
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final z f342425b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.k f342426c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.g f342427d;

    /* renamed from: e, reason: collision with root package name */
    public final JsonFactory f342428e;

    /* renamed from: f, reason: collision with root package name */
    public final a f342429f = a.f342430c;

    /* compiled from: ObjectWriter.java */
    public static final class a implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final a f342430c = new a(null);
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.core.k f342431b;

        public a(com.fasterxml.jackson.core.k kVar) {
            this.f342431b = kVar;
        }
    }

    /* compiled from: ObjectWriter.java */
    public static final class b implements Serializable {
        private static final long serialVersionUID = 1;
    }

    public t(ObjectMapper objectMapper, z zVar) {
        this.f342425b = zVar;
        this.f342426c = objectMapper.f341417e;
        this.f342427d = objectMapper.f341418f;
        this.f342428e = objectMapper.f341414b;
    }

    public final void a(JsonGenerator jsonGenerator, Object obj) {
        SerializationFeature serializationFeature = SerializationFeature.CLOSE_CLOSEABLE;
        z zVar = this.f342425b;
        boolean zP2 = zVar.p(serializationFeature);
        com.fasterxml.jackson.databind.ser.k kVar = this.f342426c;
        com.fasterxml.jackson.databind.ser.g gVar = this.f342427d;
        if (zP2 && (obj instanceof Closeable)) {
            Closeable closeable = (Closeable) obj;
            try {
                kVar.J(zVar, gVar).K((C44711k) jsonGenerator, (com.fasterxml.jackson.databind.node.b) obj);
            } catch (Exception e12) {
                e = e12;
            }
            try {
                closeable.close();
                jsonGenerator.close();
                return;
            } catch (Exception e13) {
                e = e13;
                closeable = null;
                com.fasterxml.jackson.databind.util.g.g((AbstractC44703c) jsonGenerator, closeable, e);
                throw null;
            }
        }
        try {
            kVar.J(zVar, gVar).K((C44711k) jsonGenerator, (com.fasterxml.jackson.databind.node.b) obj);
            jsonGenerator.close();
        } catch (Exception e14) {
            AbstractC44703c abstractC44703c = (AbstractC44703c) jsonGenerator;
            Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
            abstractC44703c.p0(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                abstractC44703c.close();
            } catch (Exception e15) {
                e14.addSuppressed(e15);
            }
            com.fasterxml.jackson.databind.util.g.E(e14);
            com.fasterxml.jackson.databind.util.g.F(e14);
            throw new RuntimeException(e14);
        }
    }

    public final JsonGenerator b(Writer writer) {
        JsonFactory jsonFactory = this.f342428e;
        jsonFactory.getClass();
        C44711k c44711kA = jsonFactory.a(writer, new com.fasterxml.jackson.core.io.f(jsonFactory.b(), new com.fasterxml.jackson.core.io.d(-1, writer, true), false));
        this.f342425b.o(c44711kA);
        com.fasterxml.jackson.core.k kVarB = this.f342429f.f342431b;
        if (kVarB != null) {
            if (kVarB == f342424g) {
                c44711kA.f341039b = null;
            } else {
                if (kVarB instanceof com.fasterxml.jackson.core.util.f) {
                    kVarB = ((com.fasterxml.jackson.core.util.f) kVarB).b();
                }
                c44711kA.f341039b = kVarB;
            }
        }
        return c44711kA;
    }
}
