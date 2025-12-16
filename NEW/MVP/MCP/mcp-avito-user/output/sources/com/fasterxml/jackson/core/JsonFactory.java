package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import oX0.C44709i;
import oX0.C44711k;

/* loaded from: classes3.dex */
public class JsonFactory extends n implements r, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final int f341022j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f341023k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f341024l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.fasterxml.jackson.core.io.n f341025m;
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final transient com.fasterxml.jackson.core.sym.b f341026b;

    /* renamed from: c, reason: collision with root package name */
    public final transient com.fasterxml.jackson.core.sym.a f341027c;

    /* renamed from: d, reason: collision with root package name */
    public final int f341028d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341029e;

    /* renamed from: f, reason: collision with root package name */
    public final int f341030f;

    /* renamed from: g, reason: collision with root package name */
    public ObjectMapper f341031g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.core.io.n f341032h;

    /* renamed from: i, reason: collision with root package name */
    public final char f341033i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Feature implements com.fasterxml.jackson.core.util.h {

        /* renamed from: b, reason: collision with root package name */
        public static final Feature f341034b;

        /* renamed from: c, reason: collision with root package name */
        public static final Feature f341035c;

        /* renamed from: d, reason: collision with root package name */
        public static final Feature f341036d;

        /* renamed from: e, reason: collision with root package name */
        public static final Feature f341037e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Feature[] f341038f;

        static {
            Feature feature = new Feature("INTERN_FIELD_NAMES", 0);
            f341034b = feature;
            Feature feature2 = new Feature("CANONICALIZE_FIELD_NAMES", 1);
            f341035c = feature2;
            Feature feature3 = new Feature("FAIL_ON_SYMBOL_HASH_OVERFLOW", 2);
            f341036d = feature3;
            Feature feature4 = new Feature("USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING", 3);
            f341037e = feature4;
            f341038f = new Feature[]{feature, feature2, feature3, feature4};
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) f341038f.clone();
        }

        @Override // com.fasterxml.jackson.core.util.h
        public final int a() {
            return 1 << ordinal();
        }

        @Override // com.fasterxml.jackson.core.util.h
        public final boolean b() {
            return true;
        }

        public final boolean c(int i12) {
            return (i12 & a()) != 0;
        }
    }

    static {
        int iA2 = 0;
        for (Feature feature : Feature.values()) {
            feature.getClass();
            iA2 |= feature.a();
        }
        f341022j = iA2;
        int i12 = 0;
        for (JsonParser.Feature feature2 : JsonParser.Feature.values()) {
            if (feature2.f341072b) {
                i12 |= feature2.f341073c;
            }
        }
        f341023k = i12;
        f341024l = JsonGenerator.Feature.a();
        f341025m = com.fasterxml.jackson.core.util.e.f341294i;
    }

    public JsonFactory() {
        this(null);
    }

    public final C44711k a(Writer writer, com.fasterxml.jackson.core.io.f fVar) {
        C44711k c44711k = new C44711k(fVar, this.f341030f, this.f341031g, writer, this.f341033i);
        com.fasterxml.jackson.core.io.n nVar = this.f341032h;
        if (nVar != f341025m) {
            c44711k.f419824k = nVar;
        }
        return c44711k;
    }

    public final com.fasterxml.jackson.core.util.a b() {
        return Feature.f341037e.c(this.f341028d) ? com.fasterxml.jackson.core.util.b.a() : new com.fasterxml.jackson.core.util.a();
    }

    public final JsonGenerator c(OutputStream outputStream) {
        JsonEncoding jsonEncoding = JsonEncoding.f341013e;
        com.fasterxml.jackson.core.io.f fVar = new com.fasterxml.jackson.core.io.f(b(), new com.fasterxml.jackson.core.io.d(-1, outputStream, true), false);
        fVar.f341162c = jsonEncoding;
        C44709i c44709i = new C44709i(fVar, this.f341030f, this.f341031g, outputStream, this.f341033i);
        com.fasterxml.jackson.core.io.n nVar = this.f341032h;
        if (nVar != f341025m) {
            c44709i.f419824k = nVar;
        }
        return c44709i;
    }

    public j d() {
        return this.f341031g;
    }

    public Object readResolve() {
        return new JsonFactory(this, this.f341031g);
    }

    public JsonFactory(ObjectMapper objectMapper) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f341026b = new com.fasterxml.jackson.core.sym.b((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.f341027c = new com.fasterxml.jackson.core.sym.a((((int) jCurrentTimeMillis2) + ((int) (jCurrentTimeMillis2 >>> 32))) | 1);
        this.f341028d = f341022j;
        this.f341029e = f341023k;
        this.f341030f = f341024l;
        this.f341032h = f341025m;
        this.f341031g = objectMapper;
        this.f341033i = '\"';
    }

    public JsonFactory(JsonFactory jsonFactory, ObjectMapper objectMapper) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f341026b = new com.fasterxml.jackson.core.sym.b((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.f341027c = new com.fasterxml.jackson.core.sym.a((((int) jCurrentTimeMillis2) + ((int) (jCurrentTimeMillis2 >>> 32))) | 1);
        this.f341028d = f341022j;
        this.f341029e = f341023k;
        this.f341030f = f341024l;
        this.f341032h = f341025m;
        this.f341031g = objectMapper;
        this.f341028d = jsonFactory.f341028d;
        this.f341029e = jsonFactory.f341029e;
        this.f341030f = jsonFactory.f341030f;
        this.f341032h = jsonFactory.f341032h;
        this.f341033i = jsonFactory.f341033i;
    }
}
