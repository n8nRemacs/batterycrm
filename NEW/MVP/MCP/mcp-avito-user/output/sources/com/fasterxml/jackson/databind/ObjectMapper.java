package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.m;
import com.fasterxml.jackson.databind.introspect.I;
import com.fasterxml.jackson.databind.introspect.y;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.util.B;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import oX0.AbstractC44703c;
import oX0.C44711k;

/* loaded from: classes4.dex */
public class ObjectMapper extends com.fasterxml.jackson.core.j implements com.fasterxml.jackson.core.r, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.cfg.a f341413j = new com.fasterxml.jackson.databind.cfg.a(null, new com.fasterxml.jackson.databind.introspect.z(), com.fasterxml.jackson.databind.type.n.f342486e, B.f342534n, Locale.getDefault(), com.fasterxml.jackson.core.a.f341119b, com.fasterxml.jackson.databind.jsontype.impl.l.f342149b, new y.c());
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final JsonFactory f341414b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.type.n f341415c;

    /* renamed from: d, reason: collision with root package name */
    public final z f341416d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.k f341417e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.g f341418f;

    /* renamed from: g, reason: collision with root package name */
    public final e f341419g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.m f341420h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap<h, i<Object>> f341421i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DefaultTyping {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ DefaultTyping[] f341422b = {new DefaultTyping("JAVA_LANG_OBJECT", 0), new DefaultTyping("OBJECT_AND_NON_CONCRETE", 1), new DefaultTyping("NON_CONCRETE_AND_ARRAYS", 2), new DefaultTyping("NON_FINAL", 3), new DefaultTyping("EVERYTHING", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        DefaultTyping EF5;

        public DefaultTyping() {
            throw null;
        }

        public static DefaultTyping valueOf(String str) {
            return (DefaultTyping) Enum.valueOf(DefaultTyping.class, str);
        }

        public static DefaultTyping[] values() {
            return (DefaultTyping[]) f341422b.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341423a;

        static {
            int[] iArr = new int[DefaultTyping.values().length];
            f341423a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341423a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341423a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f341423a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f341423a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class b extends com.fasterxml.jackson.databind.jsontype.impl.o implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.jsontype.impl.o, com.fasterxml.jackson.databind.jsontype.n
        public final com.fasterxml.jackson.databind.jsontype.impl.t a(z zVar, h hVar, Collection collection) {
            k(hVar);
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.o, com.fasterxml.jackson.databind.jsontype.n
        public final com.fasterxml.jackson.databind.jsontype.impl.q c(e eVar, h hVar, Collection collection) {
            k(hVar);
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.o, com.fasterxml.jackson.databind.jsontype.n
        public final com.fasterxml.jackson.databind.jsontype.n f(Class cls) {
            if (this.f342156f == cls) {
                return this;
            }
            com.fasterxml.jackson.databind.util.g.G(this, b.class, "withDefaultImpl");
            return new b(this, cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.o
        public final PolymorphicTypeValidator h(com.fasterxml.jackson.databind.cfg.m mVar) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.o
        /* renamed from: i */
        public final com.fasterxml.jackson.databind.jsontype.impl.o f(Class cls) {
            if (this.f342156f == cls) {
                return this;
            }
            com.fasterxml.jackson.databind.util.g.G(this, b.class, "withDefaultImpl");
            return new b(this, cls);
        }

        public final boolean k(h hVar) {
            if (hVar.f341930b.isPrimitive()) {
                return false;
            }
            throw null;
        }
    }

    public ObjectMapper() {
        this(null);
    }

    @Override // com.fasterxml.jackson.core.j
    public final void a(JsonGenerator jsonGenerator, Object obj) {
        z zVar = this.f341416d;
        if (zVar.p(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.h() == null) {
            com.fasterxml.jackson.core.util.e eVarB = zVar.f342661l;
            if (eVarB != null) {
                eVarB = eVarB.b();
            }
            jsonGenerator.m(eVarB);
        }
        if (!zVar.p(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            this.f341417e.J(zVar, this.f341418f).K(jsonGenerator, obj);
            if (zVar.p(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            this.f341417e.J(zVar, this.f341418f).K(jsonGenerator, obj);
            if (zVar.p(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e12) {
            com.fasterxml.jackson.databind.util.g.g(null, closeable, e12);
            throw null;
        }
    }

    public final void b(JsonGenerator jsonGenerator, Object obj) throws IOException {
        com.fasterxml.jackson.databind.ser.k kVar = this.f341417e;
        com.fasterxml.jackson.databind.ser.g gVar = this.f341418f;
        z zVar = this.f341416d;
        if (zVar.p(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            Closeable closeable = (Closeable) obj;
            try {
                kVar.J(zVar, gVar).K(jsonGenerator, obj);
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
            kVar.J(zVar, gVar).K(jsonGenerator, obj);
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

    public final String c(Object obj) throws JsonProcessingException {
        JsonFactory jsonFactory = this.f341414b;
        com.fasterxml.jackson.core.io.m mVar = new com.fasterxml.jackson.core.io.m(jsonFactory.b());
        try {
            C44711k c44711kA = jsonFactory.a(mVar, new com.fasterxml.jackson.core.io.f(jsonFactory.b(), new com.fasterxml.jackson.core.io.d(-1, mVar, true), false));
            this.f341416d.o(c44711kA);
            b(c44711kA, obj);
            com.fasterxml.jackson.core.util.p pVar = mVar.f341184b;
            String strG = pVar.g();
            pVar.o();
            return strG;
        } catch (JsonProcessingException e12) {
            throw e12;
        } catch (IOException e13) {
            throw JsonMappingException.g(e13);
        }
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this.f341421i = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this.f341414b = new o(this);
        } else {
            this.f341414b = jsonFactory;
            if (jsonFactory.d() == null) {
                jsonFactory.f341031g = this;
            }
        }
        com.fasterxml.jackson.databind.jsontype.impl.n nVar = new com.fasterxml.jackson.databind.jsontype.impl.n();
        com.fasterxml.jackson.databind.util.y yVar = new com.fasterxml.jackson.databind.util.y();
        this.f341415c = com.fasterxml.jackson.databind.type.n.f342486e;
        I i12 = new I();
        com.fasterxml.jackson.databind.introspect.t tVar = new com.fasterxml.jackson.databind.introspect.t();
        com.fasterxml.jackson.databind.cfg.a aVar = f341413j;
        com.fasterxml.jackson.databind.cfg.a aVar2 = aVar.f341475c == tVar ? aVar : new com.fasterxml.jackson.databind.cfg.a(tVar, aVar.f341476d, aVar.f341474b, aVar.f341479g, aVar.f341480h, aVar.f341481i, aVar.f341478f, aVar.f341477e);
        com.fasterxml.jackson.databind.cfg.f fVar = new com.fasterxml.jackson.databind.cfg.f();
        com.fasterxml.jackson.databind.cfg.c cVar = new com.fasterxml.jackson.databind.cfg.c();
        com.fasterxml.jackson.databind.cfg.a aVar3 = aVar2;
        this.f341416d = new z(aVar3, nVar, i12, yVar, fVar);
        this.f341419g = new e(aVar3, nVar, i12, yVar, fVar, cVar);
        this.f341414b.getClass();
        z zVar = this.f341416d;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (zVar.k(mapperFeature)) {
            z zVar2 = this.f341416d;
            zVar2.getClass();
            long j12 = ~new MapperFeature[]{mapperFeature}[0].f341412c;
            long j13 = zVar2.f341505b;
            long j14 = j12 & j13;
            this.f341416d = j14 != j13 ? new z(zVar2, j14, zVar2.f342662m) : zVar2;
            e eVar = this.f341419g;
            eVar.getClass();
            long j15 = ~new MapperFeature[]{mapperFeature}[0].f341412c;
            long j16 = eVar.f341505b;
            long j17 = j15 & j16;
            this.f341419g = j17 != j16 ? new e(eVar, j17, eVar.f341912n) : eVar;
        }
        this.f341417e = new k.a();
        this.f341420h = new m.a(com.fasterxml.jackson.databind.deser.f.f341585e);
        this.f341418f = com.fasterxml.jackson.databind.ser.g.f342263e;
    }
}
